package jdbc2;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * UserDAO
 * 
 * 1. Singleton & DB Connection
 * 2. create - signUp
 * 3. retrieve - getUser, userInfo, findById
*/

public class UserDAO {
	private final String url;
	private final String dbUser;
	private final String dbPassword;
	
	
	// 1. 싱글톤 & DB connection
	// ======================================
	private static UserDAO instance;
	private UserDAO() {
		Properties props = new Properties();
		try(InputStream in = ClassLoader.getSystemResourceAsStream("jdbc2/db.properties");
				InputStreamReader reader = new InputStreamReader(in, StandardCharsets.UTF_8)) {
				props.load(reader);
				url = props.getProperty("db.url");
				dbUser = props.getProperty("db.user");
				dbPassword = props.getProperty("db.password");
		} catch (Exception e) {
			System.out.println("message : " + e.getMessage());
			throw new RuntimeException("접속정보가 없거나 잘못 됨");
		}
	}
	
	public static UserDAO getInstance() {
		
		if (instance == null) {
			instance = new UserDAO();
		}
		return instance;
	}
	
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, dbUser, dbPassword); 
	}


	// 2. 회원가입
	// ======================================
	public void signUp(User user) throws SQLException {
		
		String insertSQL = UserSQL.INSERT_USER;
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) { 
 
            pstmt.setString(1, user.getUsername()); 
            pstmt.setString(2, user.getPassword()); 
            pstmt.setString(3, user.getName()); 
            pstmt.setString(4, user.getEmail()); 
            pstmt.setInt(5, user.getBirthYear()); 
 
           pstmt.executeUpdate(); 

        }
	}
	

	// 3. retrieve
	// ======================================
	public User getUser(String username, String password) throws SQLException {
		
		String loginSQL = UserSQL.GET_USER;
		try (Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(loginSQL)) {

			pstmt.setString(1, username);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return new User(username, password, rs.getString("NAME"), rs.getString("EMAIL"), rs.getInt("BIRTH"));
			}
		}
		throw new RuntimeException(MessageUtil.get("error.login.invalid"));
	}

	
	// 4. 비밀번호 변경
	// ======================================
	public int updatePassword(String username, String newPassword) throws SQLException {
		String updateSQL = UserSQL.UPDATE_SQL;
		try (Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {

			pstmt.setString(1, newPassword);
			pstmt.setString(2, username);

			return pstmt.executeUpdate();
		}
	}

	
	// 5. 회원탈퇴
	// ======================================
	public int deleteUser(String username) throws SQLException {
		String deleteSQL = UserSQL.DELETE_SQL;
		try (Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {

			pstmt.setString(1, username);

			return pstmt.executeUpdate();
		}	
	}

	public User findUser(String username) throws SQLException {
		String searchSQL = UserSQL.FINDUSER_SQL; 
        try (Connection conn = getConnection(); 
             PreparedStatement pstmt = conn.prepareStatement(searchSQL)) { 
 
            pstmt.setString(1, username); 
            
            ResultSet rs = pstmt.executeQuery(); 
            if (rs.next()) { 
                return new User(username, rs.getString("NAME"), rs.getString("EMAIL"), rs.getInt("BIRTH"));
            }
        }
        throw new RuntimeException(MessageUtil.get("error.login.find"));
	}
	
	
}

package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class XCI6UpdateExample { 
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1"; 
    private static final String USER = "ace"; 
    private static final String PASSWORD = "ace"; 
 
    public static void main(String[] args) { 
        String updateSQL = 
        		"""
        		UPDATE XCI_MEMBERS SET 
        		NAME = ? 
        		WHERE USERNAME = ?
        		""";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); 
             PreparedStatement pstmt = conn.prepareStatement(updateSQL)) { 
            pstmt.setString(1, "장10"); 
            pstmt.setString(2, "z10"); 
            int rowsUpdated = pstmt.executeUpdate(); 
            if (rowsUpdated > 0) { 
                System.out.println("수정되었습니다!"); 
            } else { 
             System.out.println("수정된 행이 없습니다."); 
            } 
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
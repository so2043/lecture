package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class XCI1SelectExample2 {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER = "ace";
	private static final String PASSWORD = "ace";

	public static void main(String[] args) {
		String selectSQL = 
				"""
				SELECT
				    name,
				    korean,
				    english,
				    math,
				    philosophy
				FROM
				    grades
				""";
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);	// DB 접속
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(selectSQL)) {

			
			// 컬럼명은 while문 밖에서 딱 한 번 출력
			System.out.printf("%10s %10s %10s %10s %12s %10s%n", 
				    "NAME", "KOREAN", "ENGLISH", "MATH", "PHILOSOPHY", "총점");
			System.out.println("----------------------------------------------------------------------");


			
			while (rs.next()) {
				String name = rs.getString("NAME");
				int korean = rs.getInt("KOREAN");
				int english = rs.getInt("ENGLISH");
				int math = rs.getInt("MATH");
				int philosophy = rs.getInt("PHILOSOPHY");
				int sum = korean + english + math + philosophy;
				
				System.out.printf("%-10s %10d %10d %10d %10d %10d%n", name, korean, english, math, philosophy, sum);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
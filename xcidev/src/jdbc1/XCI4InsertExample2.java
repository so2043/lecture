package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class XCI4InsertExample2 {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER = "ace";
	private static final String PASSWORD = "ace";

	
	public static void main(String[] args) {
		
		
		// 부서코드 저장
		Set<Integer> departmentIds = new HashSet<>();
		
		// SELECT 
		String selectSQL = 
				"""
				SELECT
				    department_id,
				    department_name
				FROM
				    departments
				""";
				
		try (
			    Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			    Statement stmt = conn.createStatement();
			    Scanner sc = new Scanner(System.in);) {
		
			// INSERT
			//  last_name, salary, job_id, commission_pct, department_id
			
			
			System.out.println();
			System.out.println("[ 사용자 입력 ]");
			System.out.print("이름 입력해주세요 > ");
			String name = sc.nextLine();
			System.out.println();
			
			
			System.out.print("월급 입력해주세요 > ");
			int salary = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			System.out.print("직업 입력해주세요 > ");
			String job_id = sc.nextLine();
			System.out.println();
			
			
			System.out.print("수당 입력해주세요 > ");
			int commission_pct = Integer.parseInt(sc.nextLine());
			System.out.println();
	
//			System.out.print("부서코드 입력해주세요 > ");
//			int department_id = Integer.parseInt(sc.nextLine());
			
			System.out.println("===========================================================");
			try (ResultSet rs = stmt.executeQuery(selectSQL)) {
				System.out.printf("%-10s %-10s%n", "부서코드", "부서명");
				while (rs.next()) {
					int department_id = rs.getInt("DEPARTMENT_ID");
					String department_name = rs.getString("DEPARTMENT_NAME");
					
					System.out.printf("%-10d %-10s%n", department_id, department_name);
					departmentIds.add(department_id);
				}
			}
			System.out.println("===========================================================");
			System.out.println();
			
			// 부서코드 검증
			int department_id = 0;
			while (true) {
		        System.out.print("부서코드 입력해주세요 > ");
		        department_id = Integer.parseInt(sc.nextLine());

		        if (departmentIds.contains(department_id)) {
		            break; // 정상 입력
		        } else {
		            System.out.println("❌ 존재하지 않는 부서코드입니다. 다시 입력해주세요 ");
		            System.out.println();
		        }
		    }
			System.out.println();
			
			String insertSQL = "INSERT INTO EMP_TEMP (LAST_NAME, SALARY, JOB_ID, COMMISSION_PCT, DEPARTMENT_ID) VALUES (?, ?, ?, ?, ?)";
			
			try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
				
				pstmt.setString(1, name);
				pstmt.setInt(2, salary);
				pstmt.setString(3, job_id);
				pstmt.setInt(4, commission_pct);
				pstmt.setInt(5, department_id);
				
				int rowsInserted = pstmt.executeUpdate();
				if (rowsInserted > 0) {
					System.out.println("입력 되었습니다!");
				} else {
					System.out.println("입력된 행이 없습니다.");
				}
				
			} 
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class XCI5DeleteExample { 
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1"; 
    private static final String USER = "xciusername"; 
    private static final String PASSWORD = "xcipassword"; 
 
    public static void main(String[] args) { 
    	
 
    	
        String deleteSQL = "DELETE XCI_MEMBERS WHERE USERNAME = ?"; 
        try (
        		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        		Scanner sc = new Scanner(System.in);
        		PreparedStatement pstmt = conn.prepareStatement(deleteSQL)
        ) { 
        	
        	UserInput input = sc.nextLine();
 
            pstmt.setString(1, "iu"); 
 
            int rowsDeleted = pstmt.executeUpdate(); 
            if (rowsDeleted > 0) { 
                System.out.println("삭제 되었습니다!"); 
            } else { 
             System.out.println("삭제된 행이 없습니다."); 
            } 
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } 
    }
    
 // 사용자 입력 및 유효성 검증
    private static UserInput getUserInput(Scanner sc) {
        System.out.println("\n[ 사용자 입력 ]");

        System.out.print("이름 입력해주세요 > ");
        String name = sc.nextLine();

        int salary = readInt(sc, "월급 입력해주세요 > ");

        System.out.print("직업 입력해주세요 > ");
        String jobId = sc.nextLine();

        int commission = readInt(sc, "수당 입력해주세요 > ");

        int deptId;
        while (true) {
            deptId = readInt(sc, "부서코드 입력해주세요 > ");
            if (validDeptIds.contains(deptId)) break;
            System.out.println("❌ 존재하지 않는 부서코드입니다. 다시 입력해주세요.\n");
        }

        return new UserInput(name, salary, jobId, commission, deptId);
    }
} 
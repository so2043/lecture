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



// XCI4InsertExample2 수정 후



public class XCI4InsertExample3 {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
    private static final String USER = "ace";
    private static final String PASSWORD = "ace";

    public static void main(String[] args) {
        try (
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Scanner sc = new Scanner(System.in)
        ) {
            Set<Integer> departmentIds = loadDepartments(conn);
            UserInput input = getUserInput(sc, departmentIds);
            insertEmployee(conn, input);
        } catch (SQLException e) {
            System.out.println("❌ DB 오류: " + e.getMessage());
        }
    }

    // 부서 목록 출력 + 부서코드 Set 생성
    private static Set<Integer> loadDepartments(Connection conn) throws SQLException {
        String selectSQL = "SELECT department_id, department_name FROM departments";
        Set<Integer> deptIds = new HashSet<>();

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {

            System.out.println("===========================================================");
            System.out.printf("%-10s %-10s%n", "부서코드", "부서명");
            while (rs.next()) {
                int id = rs.getInt("DEPARTMENT_ID");
                String name = rs.getString("DEPARTMENT_NAME");
                deptIds.add(id);
                System.out.printf("%-10d %-10s%n", id, name);
            }
            System.out.println("===========================================================");
        }

        return deptIds;
    }

    // 사용자 입력 및 유효성 검증
    private static UserInput getUserInput(Scanner sc, Set<Integer> validDeptIds) {
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

    // 입력한 값 DB에 INSERT
    private static void insertEmployee(Connection conn, UserInput input) throws SQLException {
        String insertSQL = """
            INSERT INTO EMP_TEMP 
            (LAST_NAME, SALARY, JOB_ID, COMMISSION_PCT, DEPARTMENT_ID)
            VALUES (?, ?, ?, ?, ?)
        """;

        try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            pstmt.setString(1, input.name());
            pstmt.setInt(2, input.salary());
            pstmt.setString(3, input.jobId());
            pstmt.setInt(4, input.commission());
            pstmt.setInt(5, input.departmentId());

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ 직원 정보가 성공적으로 입력되었습니다.");
            } else {
                System.out.println("⚠️ 입력된 행이 없습니다.");
            }
        }
    }

    // 숫자 입력 받는 헬퍼
    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ 숫자로 입력해주세요.");
            }
        }
    }

    // 사용자 입력을 담는 record (Java 16+)
    private record UserInput(String name, int salary, String jobId, int commission, int departmentId) {}
}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//1. JDBC 드라이브 로딩
			Class.forName( "oracle.jdbc.driver.OracleDriver" );
			
			//2. Connection 가져오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webdb", "webdb");
			//System.out.println("연결 성공!");
			
			//3. Statement 준비
			String sql = 
					"INSERT INTO EMAILLIST" +
			        "		VALUES (SEQ_EMILLIST.NEXTVAL, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			//4. binding
			pstmt.setString(1, "김");;
			pstmt.setString(2, "철수");
			pstmt.setString(3, "abcd@gmail.com");
			
			//5. sql문 실행
			int count = pstmt.executeUpdate();
			
			
			//6. 성공 유무
			if (count == 1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브 로딩 실패!");
			
		} catch (SQLException e) {
			System.out.println("연결: " + e);
			
		} finally {
			//7. 자원 정리
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}

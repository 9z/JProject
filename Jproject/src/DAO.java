import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.Member;

public class DAO {
	
	private Connection con = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String user = "kang5064";
	private String pw = "kang5064";

	// DB 연동
	private void getConnection() throws ClassNotFoundException, SQLException { 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, user, pw);
	}
	
	
	public void update(String string, int num) {
		// 주문자, 결제자 결정해서 member테이블의 상태를 업데이트
		
		try {
			getConnection();
			
			String sql = "update member set userstate = ? where username = ?";
			psmt = con.prepareStatement(sql);
			psmt.setString(2, string);
			psmt.setInt(1, num);

			psmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally { 
			try {
				
				if(psmt!=null)psmt.close();
				if(con!=null)con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}	
	
	//회원가입시 유저정보 저장.
	public void userInsert(String userID,String password,String name,String phoneNum) {

		try {

			// try에서 예외발생시 catch로 넘어가며 finally를 제외한 모든 코드가 실행중지됨.

			// driver클래스 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DB연결
			con = DriverManager.getConnection(url, user, pw);

			// DB에 내용입력
			String sql = "insert into member values(?,?,?,?,null,null)";
			// String sql = "DELETE MEMBER WHERE name=?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, userID);
			psmt.setString(2, password);
			psmt.setString(3, name);
			psmt.setString(4, phoneNum);
			psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {// 프로그램 실행시 오류가 나도 무조건 실행할 코드를 입력
			try {// 프로그램을 닫다가 오류가 날수 있으므로 try/catch로 묶어줌
					// 닫을 때는 실행한 프로그램과 반대로 닫아주어야 한다.
					// ex> con열고 psmt열었으면 먼저 psmt닫고 con닫는다.

				// nullPointException 처리
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}




}

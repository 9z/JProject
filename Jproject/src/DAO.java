import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	
	private Connection con = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	
	private String url = null;
	private String user = null;
	private String pw = null;

	// DB 연동
	private void getConnection() throws ClassNotFoundException, SQLException { 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, user, pw);
	}
	
	// 생성자 기입 사항 
	// >> url, user, pw
	public DAO(String url, String user, String pw) {
		this.url = url;
		this.user = user;
		this.pw = pw;
	}
	
	
	public void update(String string, int num) {
		// 주문자, 결제자 결정해서 member테이블의 상태를 업데이트
		
		try {
			getConnection();
			
			String sql = "update member set userstate = ? where name = ?";
			psmt = con.prepareStatement(sql);
			psmt.setString(2, string);
			psmt.setInt(1, num);

			result = psmt.executeUpdate();
			
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

}

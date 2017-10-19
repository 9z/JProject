import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	
	private Connection con = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "kang5064";
	private String pw = "kang5064";

	// DB ����
	private void getConnection() throws ClassNotFoundException, SQLException { 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, user, pw);
	}
	
	
	public void update(String string, int num) {
		// �ֹ���, ������ �����ؼ� member���̺��� ���¸� ������Ʈ
		
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

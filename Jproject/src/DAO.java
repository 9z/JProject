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

	// DB ����
	private void getConnection() throws ClassNotFoundException, SQLException { 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, user, pw);
	}
	
	
	public void update(String string, int num) {
		// �ֹ���, ������ �����ؼ� member���̺��� ���¸� ������Ʈ
		
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
	
	//ȸ�����Խ� �������� ����.
	public void userInsert(String userID,String password,String name,String phoneNum) {

		try {

			// try���� ���ܹ߻��� catch�� �Ѿ�� finally�� ������ ��� �ڵ尡 ����������.

			// driverŬ���� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DB����
			con = DriverManager.getConnection(url, user, pw);

			// DB�� �����Է�
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
		} finally {// ���α׷� ����� ������ ���� ������ ������ �ڵ带 �Է�
			try {// ���α׷��� �ݴٰ� ������ ���� �����Ƿ� try/catch�� ������
					// ���� ���� ������ ���α׷��� �ݴ�� �ݾ��־�� �Ѵ�.
					// ex> con���� psmt�������� ���� psmt�ݰ� con�ݴ´�.

				// nullPointException ó��
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

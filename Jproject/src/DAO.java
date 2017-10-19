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
		} finally {
			try {

				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// ȸ�����Խ� �������� ����.
	public void userInsert(String userID,String password,String name,String phoneNum) {

		try {

			// try���� ���ܹ߻��� catch�� �Ѿ�� finally�� ������ ��� �ڵ尡 ����������.

			getConnection();

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

	public String getPhoneNum(int num) {
		// ���°� num�� ����� ��ȣ ���
		String phoneNum = "";
		try {
			getConnection();

			String sql = "select * from order where userstate= ?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			rs = psmt.executeQuery();

			phoneNum = rs.getString(1);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return phoneNum;
	}

	public void resetState(int hour) {

		if (hour == 12) {
			try {

				getConnection();

				String sql = "update member set userstate = 0";
				psmt = con.prepareStatement(sql);

				psmt.executeUpdate();

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {

					if (psmt != null)
						psmt.close();
					if (con != null)
						con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void insertOrder(ArrayList<OrderList> ol) {

		try {

			getConnection();
			
			String sql = "insert into order values(?,?,?,?,?,?)";
			psmt = con.prepareStatement(sql);
			
			for (int j = 0; j < ol.size(); j++) {
				
			
				psmt.setString(1, ol.get(j).getDate());
				psmt.setString(2, ol.get(j).getMartName());
				psmt.setString(3, ol.get(j).getFoodname());
				psmt.setInt(4, ol.get(j).getFoodprice());
				psmt.setString(5, ol.get(j).getName());
				psmt.setString(6, ol.get(j).getUserID());
				psmt.executeUpdate();
			}
			
			

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

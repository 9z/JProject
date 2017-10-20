import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

public class DAO {

	private Connection con = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	private ThreadTime tt =new ThreadTime();

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String user = "kang5064";
	private String pw = "kang5064";

	// DB ����
	private void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, user, pw);
	}

	public void update(String string, int num) { // �ֹ���, ������ �����ؼ� member���̺��� ���¸�
													// ������Ʈ <X>

		try {
			getConnection();

			String sql = "update member set userstate = ? where name = ?";
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

	public void userInsert(String userID, String password, String name, String phoneNum) {// ȸ�����Խ�
																							// ��������
																							// ����.

		try {

			getConnection();

			// DB�� �����Է�
			String sql = "insert into member values(?,?,?,?,null,0)";

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

	public String getPhoneNum(int num) {// ���°� num�� ����� ��ȣ ���

		String phoneNum = "";
		try {
			getConnection();

			String sql = "select userphonenum from member where userstate= ?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			rs = psmt.executeQuery();
			while (rs.next()) {
				phoneNum = rs.getString(1);
			}
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

	public void resetState(int hour) { // ���� 0 �ʱ�ȭ

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

	public void insertOrder(OrderList ol) { // �ֹ��� �ֹ����� ������ �޴������� DB�� ����

		try {

			getConnection();

			String sql = "insert into oder values(?,?,?,?,?,?)";
			psmt = con.prepareStatement(sql);

			psmt.setString(1, ol.getDate());
			psmt.setString(2, ol.getMartName());
			psmt.setString(3, ol.getFoodname());
			psmt.setInt(4, ol.getFoodprice());
			psmt.setString(5, ol.getName());
			psmt.setString(6, ol.getUserID());
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

	public LoginState start(String userID) {// �α��������� �̸��� ���̵� ������ ����

		LoginState ls = null;
		try {
			getConnection();

			String sql = "select username from member where userID= ?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, userID);
			psmt.executeQuery();

			String name = rs.getString(1);
			ls = new LoginState();
			ls.setName(name);
			ls.setUserID(userID);

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
		return ls;
	}

	public Vector todayOrderList(String martname, String dayTime) {// ������ �ֹ���
																	// �޴��̸��� �޴�
																	// ���� ��ȭ (X)
		Vector list = new Vector<>();
		Vector row1 = null;
		int totalPrice = 0;
		int count = 0;
		ArrayList<String> menuName = new ArrayList<String>();
		try {
			getConnection();

			String sql = "select distinct oderfoodname from oder where oderdate like ? and odermart = ?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, dayTime + "%");
			psmt.setString(2, martname);
			rs = psmt.executeQuery();

			while (rs.next()) {
				menuName.add(rs.getString(1));
			}

			for (int i = 0; i < menuName.size(); i++) {
				sql = "select oderfoodname from oder where oderfoodname = ?";
				psmt = con.prepareStatement(sql);
				psmt.setString(1, menuName.get(i));
				rs = psmt.executeQuery();
				while (rs.next()) {
					count++;
				}
				row1 = new Vector<>();
				row1.add(menuName.get(i));
				row1.addElement(count);
				list.add(row1);
				count = 0;
			}

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

		return list;
	}

	public Vector history(String userID, String monTime) { // ���� �����丮 ��ȸ >>
															// sql����
		Vector data = new Vector<>();
		Vector row = null;

		try {
			getConnection();

			String sql = "select oderdate, odermart, username, oderfoodname, oderfoodprice from oder where oderdate like ? and userid = ?";
			psmt = con.prepareStatement(sql);
			psmt.setString(2, userID);

			// java.sql.Date sqlMonTime = new java.sql.Date(monTime.getTime());

			psmt.setString(1, monTime + "%");

			rs = psmt.executeQuery();

			while (rs.next()) {

				row = new Vector<>();
				for (int i = 1; i <= 4; i++) {
					row.add(rs.getString(i));
				}
				row.add(rs.getInt(5));

				data.add(row);
			}

			psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return data;
	}

	public ArrayList listSaverMember() { // 11�� 5���� �Ǹ� member ���̺��� �ʿ��� ������ ��� �ҷ� ����
									// <X>
		if("11:05".equals(tt.hour+":"+tt.min)){
		try {
			getConnection();

			String sql = "select userid, username, userstate from member where userstate between 1 and 3";
			psmt = con.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
				
			}

			psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (rs != null)
					rs.close();
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

	public void listSaverOrder() {// 11�� 5���� �Ǹ� order ���̺��� �ʿ��� ������ ��� �ҷ� ����
									// <Xs>

		try {
			getConnection();

			String sql = "select oderdate, odermart, oderfoodname, oderfoodprice, userid from order where date = ?";
			psmt = con.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {

			}

			psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void allSave(){
		
		try {
			getConnection();

			String sql = "select userid, username, userstate from member where userstate between 1 and 3";
			psmt = con.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
				
			}

			psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (rs != null)
					rs.close();
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

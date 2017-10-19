import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

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

	public void update(String string, int num) {// 주문자, 결제자 결정해서 member테이블의 상태를
												// 업데이트

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

	// 회원가입시 유저정보 저장.
	public void userInsert(String userID, String password, String name, String phoneNum) {

		try {

			getConnection();

			// DB에 내용입력
			String sql = "insert into member values(?,?,?,?,null,null)";

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

	public String getPhoneNum(int num) {// 상태가 num인 사람의 번호 출력

		String phoneNum = "";
		try {
			getConnection();

			String sql = "select userphonenum from member where userstate= ?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			rs = psmt.executeQuery();
			while(rs.next()){
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

	public void resetState(int hour) { // 상태 0 초기화

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

	public void insertOrder(OrderList ol) { //주문시 주문자의 정보와 메뉴정보를 DB에 저장

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

	public LoginState start(String userID) {// 로그인했을때 이름과 아이디를 가지고 시작

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

	public Vector todayOrderList (String martname ,String dayTime){//오늘의 주문의 메뉴이름과 메뉴 개수 반화 (X)
		Vector list = new Vector<>();
		Vector row1 = new Vector<>();
		int totalPrice = 0;
		int count = 0;
		ArrayList<String> menuName = new ArrayList<String>();
		try {
			getConnection();

			String sql = "select distinct oderfoodname from oder where oderdate like ? and odermart = ?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, dayTime+"%");
			psmt.setString(2, martname);
			rs = psmt.executeQuery();
			
			while(rs.next()){
				menuName.add(rs.getString(1));
			}
			
			for (int i = 0; i < menuName.size(); i++) {
				sql = "select oderfoodname from oder where oderfoodname = ?";
				psmt = con.prepareStatement(sql);
				psmt.setString(1, menuName.get(i));
				rs = psmt.executeQuery();
				while(rs.next()){
					count++;
				}
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
	
	public Vector history(String userID, String dayTime) { // 개인 히스토리 조회 >> sql문제
	      Vector data = new Vector<>();
	      Vector row = null;
	      String dayTime2 = (Integer.parseInt(dayTime.replace(".", ""))-7)+"";
	      try {
	         getConnection();

	         String sql = "select oderdate, odermart, username, oderfoodname, oderfoodprice from oder where userID = ? and oderdate = ?";
	         psmt = con.prepareStatement(sql);
	         psmt.setString(1, userID);
	         
	         
	         
//	         psmt.setString(3, dayTime2);
	         psmt.setString(2, dayTime);

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
}

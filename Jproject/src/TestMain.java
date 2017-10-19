import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		DAO dao = new DAO();
//		Control control = new Control();
//		String[] name = {"이도건","강준희","방준영","안영만","조지영"};
//		control.randomSelect(name);
//		System.out.println(dao.getPhoneNum(2));
		
		for (int i = 0; i < dao.todayOrderList("한솥", "2017").size(); i++) {
			dao.todayOrderList("한솥", "2017").get(i)
		}
		
	}

}

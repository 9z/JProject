import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		DAO dao = new DAO();
//		Control control = new Control();
//		String[] name = {"�̵���","������","���ؿ�","�ȿ���","������"};
//		control.randomSelect(name);
//		System.out.println(dao.getPhoneNum(2));
		
		for (int i = 0; i < dao.todayOrderList("�Ѽ�", "2017").size(); i++) {
			dao.todayOrderList("�Ѽ�", "2017").get(i)
		}
		
	}

}

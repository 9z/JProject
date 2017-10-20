import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ThreadTime extends Thread {

	private Control cont = new Control();
	private DAO dao = new DAO();

	int year, mon, day, hour, min, sec;
	private String now = "";
	private String mt = "";



	
	

	
	
	Calendar cal = null;
	int state = 0;

	public void run() {
		// 10�� ������ �� �ð��� üũ
		while (true) {
			cal = Calendar.getInstance();

			year = cal.get(Calendar.YEAR);
			mon = cal.get(Calendar.MONTH)+1;
			day = cal.get(Calendar.DAY_OF_MONTH);
			hour = cal.get(Calendar.HOUR_OF_DAY);
			min = cal.get(Calendar.MINUTE);
			sec = cal.get(Calendar.SECOND);
			
			now = year + "/" + mon + "/" + day + " " + hour + ":" + min + ":" + sec;
			mt = year + "/" + mon;
			

			try {
				nowTimeDate = transFormat.parse(now);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			transFormat = new SimpleDateFormat("yyyy/MM");
			
			try {
				monTimeDate = transFormat.parse(mt);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}


			
			
			if (hour == 11 && state == 0) {
				// 11�ð� �ǰ� �ٲ� ����� ���ٸ� ����Ǵ� ����
//				cont.randomSelect(dao.getMartUserName());
				state = 1;
			}

			// �ٲ� ����� �ְ� 11�ð� �ƴϸ� �ٲ۱���� �ʱ�ȭ
			if (state == 1 && hour != 11)
				state = 0;

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				return;
			}
		}

	}

	public Date getNowTime() {
		// üũ�� �ð��� ��ȯ
		return now;
	}
	
	public String getMT(){
		return mt;
	}

}

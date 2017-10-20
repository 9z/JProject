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
		// 10초 단위로 현 시각을 체크
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
				// 11시가 되고 바꾼 기록이 없다면 실행되는 조건
//				cont.randomSelect(dao.getMartUserName());
				state = 1;
			}

			// 바꾼 기록이 있고 11시가 아니면 바꾼기록을 초기화
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
		// 체크한 시각을 반환
		return now;
	}
	
	public String getMT(){
		return mt;
	}

}

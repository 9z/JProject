import java.util.Calendar;

public class ThreadTime extends Thread {

	private Control cont = new Control();
	private DAO dao = new DAO();

	int year, mon, day, hour, min, sec;
	private String nowTime = "";
	Calendar cal = null;
	int state = 0;

	public void run() {
		// 10�� ������ �� �ð��� üũ
		while (true) {
			cal = Calendar.getInstance();

			year = cal.get(Calendar.YEAR);
			mon = cal.get(Calendar.MONTH);
			day = cal.get(Calendar.DAY_OF_MONTH);
			hour = cal.get(Calendar.HOUR_OF_DAY);
			min = cal.get(Calendar.MINUTE);
			sec = cal.get(Calendar.SECOND);

			this.nowTime = year + "." + mon + "." + day + "." + hour + "." + min + "." + sec;

			if (hour == 11 && state == 0) {
				// 11�ð� �ǰ� �ٲ� ����� ���ٸ� ����Ǵ� ����
				cont.randomSelect(dao.getMartUserName());
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

	public String getNowTime() {
		// üũ�� �ð��� ��ȯ
		return nowTime;
	}

}

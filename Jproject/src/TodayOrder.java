
public class TodayOrder {
	
	private String date;		//���ó�¥
	private String martCode;	//��ü��
	private int total_price;	//�Ѱ���
	private String name;		//�ֹ��� �̸�
	private String userID;		//�����ID
	
	public TodayOrder(String date, String martCode, int total_price, String name, String userID) {
		this.date = date;
		this.martCode = martCode;
		this.total_price = total_price;
		this.name = name;
		this.userID = userID;
	}

	public String getDate() {
		return date;
	}

	public String getMartCode() {
		return martCode;
	}

	public int getTotal_price() {
		return total_price;
	}

	public String getName() {
		return name;
	}
	
	public String getID() {
		return userID;
	}
		
}

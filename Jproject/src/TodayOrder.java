
public class TodayOrder {
	
	private String date;		//오늘날짜
	private String martCode;	//업체명
	private int total_price;	//총가격
	private String name;		//주문자 이름
	private String userID;		//사용자ID
	
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

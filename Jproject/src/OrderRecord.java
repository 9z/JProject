
public class OrderRecord {
	private String date;	//주문 날짜
	private String foodName;//주문메뉴 이름
	private String foodPrice;//주문메뉴 가격
	private String name;	//사용자 이름
	private String userID;	//사용자 ID
	
	public OrderRecord(String date, String foodName, String foodPrice, String name, String userID) {
		super();
		this.date = date;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.name = name;
		this.userID = userID;
	}

	public String getDate() {
		return date;
	}

	public String getFoodName() {
		return foodName;
	}

	public String getFoodPrice() {
		return foodPrice;
	}

	public String getName() {
		return name;
	}

	public String getID() {
		return userID;
	}
}

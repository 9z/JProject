
public class NormalUser {

	private String casherName; // 결제자 이름
	private String foodName; // 주문 메뉴 이름
	private String foodPrice; // 주문 메뉴 가격
	private String userID; // 주문자 아이디
	private String martCode; // 업체명

	public NormalUser(String casherName, String foodName, String foodPrice, String userID, String martCode) {
		this.casherName = casherName;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.userID = userID;
		this.martCode = martCode;
	}

	public String getCasherName() {
		return casherName;
	}
	
	public String getFoodName() {
		return foodName;
	}
	
	public String getFoodPrice() {
		return foodPrice;
	}
	
}

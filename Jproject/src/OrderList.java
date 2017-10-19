
public class OrderList {
	private String date;
	private String martName;
	private String foodName;
	private int foodPrice;
	private String name;
	private String userID;
	
	public OrderList(String date, String martname, String foodname, int foodprice, String name, String userID) {
		this.date = date;
		this.martName = martname;
		this.foodName = foodname;
		this.foodPrice = foodprice;
		this.name = name;
		this.userID = userID;
	}

	public String getDate() {
		return date;
	}

	public String getMartName() {
		return martName;
	}

	public String getFoodname() {
		return foodName;
	}

	public int getFoodprice() {
		return foodPrice;
	}

	public String getName() {
		return name;
	}

	public String getUserID() {
		return userID;
	}
	
	
	
	
}

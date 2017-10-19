
public class OrderRecord {
	private String date;	//�ֹ� ��¥
	private String foodName;//�ֹ��޴� �̸�
	private String foodPrice;//�ֹ��޴� ����
	private String name;	//����� �̸�
	private String userID;	//����� ID
	
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

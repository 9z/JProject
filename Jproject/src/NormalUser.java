
public class NormalUser {

	private String casherName; // ������ �̸�
	private String foodName; // �ֹ� �޴� �̸�
	private String foodPrice; // �ֹ� �޴� ����
	private String userID; // �ֹ��� ���̵�
	private String martCode; // ��ü��

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

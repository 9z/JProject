
public class OrdererUser extends NormalUser {

	
	public OrdererUser(String casherName, String foodName, String foodPrice, String userID, String martCode) {
		super(casherName, foodName, foodPrice, userID, martCode);
		// TODO Auto-generated constructor stub
	}
	
	private String[] total_foodName = null;		//��ü �ֹ��޴� �̸�
	private int[] total_foodCount = null;		//��ü �ֹ��޴� ����
	private int total_foodPrice = 0;			//��ü �ֹ��޴� �ѱݾ�
	
	public String[] getTotal_foodName() {
		return total_foodName;
	}
	
	public void setTotal_foodName(String[] total_foodName) {
		this.total_foodName = total_foodName;
	}
	
	public int[] getTotal_foodCount() {
		return total_foodCount;
	}
	
	public void setTotal_foodCount(int[] total_foodCount) {
		this.total_foodCount = total_foodCount;
	}
	
	public int getTotal_foodPrice() {
		return total_foodPrice;
	}
	
	public void setTotal_foodPrice(int total_foodPrice) {
		this.total_foodPrice = total_foodPrice;
	}
	
	
	
}

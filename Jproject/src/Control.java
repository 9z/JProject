import java.util.Random;

public class Control {
	private DAO dao = new DAO();
	private Random ran = new Random();
	private int num1 = 0, num2 = 0; // 랜덤수 저장

	public void randomSelect(String[] src) {
		/*
		 * String 배열 src(당일 하나의 업체에 주문한 사람들의 이름 배열) 
		 * 랜덤으로 한 사람을 뽑아 주문자로 업데이트 
		 * 랜덤으로 한 사람을 뽑아 결제자로 업데이트
		 * 
		 */

		if (src.length >= 2) {

			while (num1 == num2){ // 중복되지 않게 랜덤수 2개 반환
				num1 = ran.nextInt(src.length);
				num2 = ran.nextInt(src.length);
			}
			
			dao.update(src[num1], 2); // num1 >> 주문자
			dao.update(src[num2], 3); // num2 >> 결제자

		}

	}

}

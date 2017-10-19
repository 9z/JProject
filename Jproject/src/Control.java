import java.util.Random;

public class Control {
	private DAO dao = new DAO();
	private Random ran = new Random();
	private int num1 = 0, num2 = 0; // ������ ����

	public void randomSelect(String[] src) {
		/*
		 * String �迭 src(���� �ϳ��� ��ü�� �ֹ��� ������� �̸� �迭) 
		 * �������� �� ����� �̾� �ֹ��ڷ� ������Ʈ 
		 * �������� �� ����� �̾� �����ڷ� ������Ʈ
		 * 
		 */

		if (src.length >= 2) {

			while (num1 == num2){ // �ߺ����� �ʰ� ������ 2�� ��ȯ
				num1 = ran.nextInt(src.length);
				num2 = ran.nextInt(src.length);
			}
			
			dao.update(src[num1], 2); // num1 >> �ֹ���
			dao.update(src[num2], 3); // num2 >> ������

		}

	}

}

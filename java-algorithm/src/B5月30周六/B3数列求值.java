package B5��30����;

public class B3������ֵ {

	public static void main(String[] args) {
		int a = 1, b = 1, c = 1;
		// Ҫ����������i < 4, ͬ���Ƶ���20190324����i < 20190324��
		for (int i = 3; i < 20190324; i++) {
			int temp = (a + b + c) % 10000;
			a = b;
			b = c;
			c = temp;
		}
		System.out.println(c);
	}
}

package Java��ϰ;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B�ֶκ��� {

	public static void main(String[] args) {
		double y;
		System.out.println("������X��ֵ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		if (0 <= x && x < 20) {
			if (0 <= x && x < 5) {
				y = -x + 2.5;
			} else if (5 <= x && x < 10) {
				y = 2 - 1.5 * (x - 3) * (x - 3); 
			} else {
				y = x / 2 - 1.5;
			}System.out.println(y);
			}
		
				
	}
}

class test2{
	
	
}
package ��ϰ��;
import java.util.Arrays; 
public class ������ż���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {5, 7, 2, 4, 9};
		System.out.println("ԭʼ���飺 "+Arrays.toString(array_nums)); 
		int ctr = 0;
		for(int i = 0; i < array_nums.length; i++)
		{
			if(array_nums[i] % 2 == 0)
				ctr++;
		}
		System.out.println("ż�������� "+ctr);
		System.out.println("���������� "+(array_nums.length-ctr));
	}

}

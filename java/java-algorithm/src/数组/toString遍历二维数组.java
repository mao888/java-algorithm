package ����;

import java.util.Arrays;

public class toString������ά���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��һ�ַ�ʽ:
		int Arr[][]={{5,7,15},{8,4,11},{3,6,13}};
	    System.out.println("Arr:"+Arrays.toString(Arr));
	    int b[][]={{5,7,15},{8,4,11},{3,6,13}};
	    System.out.println("b:"+Arrays.deepToString(b));
	  //�ڶ��ַ�ʽ��
	    //int[][] ints = new int[4][2];        
	    //ints[i][j] =__; //�ֱ�ֵ
	    
	    //�����ַ�ʽ���ڶ�ά�ĳ��ȿ��Զ�̬����
	    int[][] arr3 = new int[5][];       //���еĳ���
	    for(int i=0; i<arr3.length; ++i){      	
	        arr3[i]=new int[i+1];         //�еĳ���ÿ�ζ��仯��ÿ�ζ�Ҫ��������ռ�(����)
	        for(int j=0; j<arr3[i].length; ++j){
	            arr3[i][j]= i+j;  
	            System.out.println( "arr3[i][j]:"+ arr3[i][j]);
	        }
	        
	        System.out.println( "arr3[i][j]:"+ Arrays.toString(arr3[i]) );
	    }
	}

}

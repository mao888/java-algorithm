package ��ѡ˼ά15��;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class ������step2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int mi = 123456;
		BigInteger a = new BigInteger("2");
		BigInteger b = new BigInteger("3");
		BigInteger bigA;
		BigInteger bigB;
		
		for (int i = 0; i < mi-1; i++) {
			bigA =a.multiply(BigInteger.valueOf(2)).subtract(b.multiply(BigInteger.valueOf(3)));
			bigB =a.multiply(BigInteger.valueOf(3)).add(b.multiply(BigInteger.valueOf(2)));
			a = bigA;
			b = bigB;
		}
		 
		FileWriter writer = new FileWriter("��ʮһ������/��ѡ˼ά15��/bi.text");	
		writer.write(b.compareTo(BigInteger.ZERO) == 1 ? a + "+" + b + "i" : a + "" + b + "i");
		writer.flush();
	}
}

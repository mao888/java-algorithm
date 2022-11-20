package ��ɽ��2023��У��Golang����;

import java.util.Scanner;

/**
 * 4
 * 5 2      9.00
 * 3 10     1.8*10 + 0.3*3 = 18.90
 * 15 20    15*0.3 + 20*1.8 = 4.5 + 36
 * 50 70
 *
 * 9.00
 * 18.90
 * 40.50
 * 176.00
 * */

public class �򳵷� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   // ��������
        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();       // ������
            int s = sc.nextInt();       // ���
            System.out.println();
            System.out.printf("%.2f",sum(t,s));
        }
    }
//System.out.print("�ַ���"+ String.format("%.2f",�������� + "���Ի��� ���� �ַ���");

    public static float sum(int t, int s) {
        float sum = 0;
        float time = 0;
        float ss = 0;

        time += t*0.3;
        ss += s*1.8;

        if (s>20){
            ss+= (s-20)*0.7;
        }
        sum = time + ss;
        if (sum < 9){
            return 9.00F;
        }
        return sum;
    }
}

package �ε�6��25��;

import java.util.Scanner;

public class ��Ϸ���� {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] num = new int[2][n];
        for (int i = 0; i < n; i++) {
            num[0][i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            num[1][i] = sc.nextInt();
        }
        double count = 0;
        for (int i = 0; i < n; i++) {
            count += num[0][i];
        }
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += num[0][i] * num[1][i];
        }
        double x = sum/count;
        System.out.printf("%.4f",x);


    }
}

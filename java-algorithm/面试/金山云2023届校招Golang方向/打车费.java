package 金山云2023届校招Golang方向;

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

public class 打车费 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   // 测试组数
        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();       // 分钟数
            int s = sc.nextInt();       // 里程
            System.out.println();
            System.out.printf("%.2f",sum(t,s));
        }
    }
//System.out.print("字符串"+ String.format("%.2f",变量名） + "可以换行 或者 字符串");

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

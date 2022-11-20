package Leetcode;
// �±Ƶ�ʱ��:
// ������ ���������
// ������ظ������� 
// if else ;
// for while , recursion

//1:1
//2:2
//3:f(1)+f(2)
//4:f(2)+f(3)
//
//f(n)=f(n-1)+f(n-2)	; fibonacci: 쳲���������



//����   ��������
//package Leetcoad;
//
//class Solution(object):
//
//	def climbStairs(self,n):
//		if(n<=2): return n
//		f1,f2,f3 = 1,2,3
//		for i in range(3,n+1):
//			f3 = f1 + f2
//			f1 = f2 
//			f2 = f3
//		return f3
// 


// ������: �����ƽ�   ����ʱ�����ƣ��޷��ύ
//public class L70palouti{
//	public int climbStairs(int n) {
//		return climb_Stairs(0,n);
//	}
//	public int climb_Stairs(int i,int n) {
//		if (i>n) {
//			return 0;
//		}
//	if (i == n) {
//		return 1;
//	}
//	return climb_Stairs(i + 1, n)+climb_Stairs(i + 2, n);
//	}
//}

//�����������仯�ݹ�
//�㷨
//����һ�ַ����У����Ǽ���ÿһ���Ľ��ʱ���������ࡣ��һ��˼·�ǣ����ǿ��԰�ÿһ���Ľ���洢�� memo ����֮�У�ÿ�������ٴα����ã����Ǿ�ֱ�Ӵ� memo ���鷵�ؽ����
//�� memo ����İ����£����ǵõ���һ���޸��ĵݹ��������С���ٵ� n��
public class L70palouti {
    public int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return climb_Stairs(0, n, memo);
    }
    public int climb_Stairs(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
        return memo[i];
    }
}
package ��ָOfferIIר��ͻ����;

public class OfferII072��ƽ����֮���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(8));
	}
	
    public static int mySqrt(int x){
        int left = 0, right = x;
        while (left < right){
            // Ϊ�˷�ֹ mid Ϊ 0 , �ں����1
            int mid = left + (right - left) / 2 + 1;
            // ͨ������ x/mid ���жϱ��ó˷���, �˷��������
            if(x/mid >= mid){
                // ���� x ��ƽ����������ȡ����, ���Ե� x/mid >= mid, Ҳ���� mid^2 <= x, 
                // �п��� mid ����ƽ����, ���� left = mid, ������ mid + 1
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }


}

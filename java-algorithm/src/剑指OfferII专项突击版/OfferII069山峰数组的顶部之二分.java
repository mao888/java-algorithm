package ��ָOfferIIר��ͻ����;

public class OfferII069ɽ������Ķ���֮���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,4,2};
		System.out.println(peakIndexInMountainArray(arr));
	}
	
    public static int peakIndexInMountainArray(int[] arr) {
    	return binarySearch(arr, 0, arr.length-1);
  
    }
    

    
	public static int binarySearch(int[] arr, int left, int right) {
		
		int ans = 0;
		// �� left > right ʱ��˵���ݹ��������飬����û���ҵ�
		while (left <= right ) {
			
		int mid = (left + right)/2;
		
		if (arr[mid] > arr[mid+1]) {	        // ����ݹ�
			ans = mid;
			right = mid -1;
		}else if (arr[mid] < arr[mid+1]) { 	// ���ҵݹ�
			left = mid + 1;
		}else {
			return mid;
		}	
	}
		return ans;
		
	}
}

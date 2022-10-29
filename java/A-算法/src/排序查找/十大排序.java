package �������;

import javax.swing.SortingFocusTraversalPolicy;

public class ʮ������ {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {5,1,1,2,0,0};
		
	}
	
	public int[] sortArray(int[] nums) {
	    if(nums.length <=1)return nums;
	     //qSort(nums,0,nums.length-1);
	        //selectSort(nums);
	        // insertSort(nums);
	        // shellSort(nums);
	        // bucketSort(nums);
	        // countSort(nums);
	        // mergeSort(nums,0,nums.length-1);
	        heapSort(nums);
	    return nums;
	    }

	    /**
	    ��������
	    **/
	    void qSort(int[] arr,int s,int e){
	        int l = s, r = e;
	        if(l < r){
	            int temp = arr[l];
	            while(l < r){
	                while(l < r && arr[r] >= temp) r--;
	                if(l < r) arr[l] = arr[r];
	                while(l < r && arr[l] < temp) l++;
	                if(l < r) arr[r] = arr[l];
	            }
	            arr[l] = temp;
	            qSort(arr,s,l);
	            qSort(arr,l + 1, e);
	        }
	    }
	    /**
	    ѡ������
	    **/
	    void selectSort(int[] arr){
	        int min;
	        for(int i = 0;i<arr.length;i++){
	            min = i;
	            for(int j = i;j<arr.length;j++){
	                if(arr[j] < arr[min]){
	                    min = j;
	                }
	            }
	            if(min != i) {
	                int temp = arr[i];
	                arr[i] = arr[min];
	                arr[min] = temp;
	            }
	        }
	    }
	    /**
	     *
	     * ������������ǰ�沿�ֿ�Ϊ�������ν��������������Ԫ�ز��뵽ǰ������������У���ʼ״̬�������н���һ��Ԫ�أ�����Ԫ�ء��ڽ���������Ԫ�ز����������еĹ����У���������������������У������˳����������Է������������б����ѽ�����״̬Ч�ʻ���ߡ�
	     *
	     * ʱ�临�Ӷȣ�O(N2) �����ȶ��ԣ��ȶ�
	     * @param arr
	     */
	    public void insertSort(int arr[]){
	        for(int i = 1; i < arr.length; i++){
	            int rt = arr[i];
	            for(int j = i - 1; j >= 0; j--){
	                if(rt < arr[j]){
	                    arr[j + 1] = arr[j];
	                    arr[j] = rt;
	                }else{
	                    break;
	                }
	            }
	        }
	    }
	    /**
	     * ϣ������ - ��������ĸĽ��档Ϊ�˼������ݵ��ƶ��������ڳ�ʼ���нϴ�ʱȡ�ϴ�Ĳ�����ͨ��ȡ���г��ȵ�һ�룬��ʱֻ������Ԫ�رȽϣ�����һ�Σ�֮�󲽳����μ���ֱ������Ϊ1����Ϊ�����������ڴ�ʱ�����ѽӽ����򣬹ʲ���Ԫ��ʱ�����ƶ��Ĵ�������Խ��٣�Ч�ʵõ�����ߡ�
	     *
	     * ʱ�临�Ӷȣ�ͨ����Ϊ��O(N3/2) ��δ��֤�����ȶ��ԣ����ȶ�
	     * @param arr
	     */
	    void shellSort(int arr[]){
	        int d = arr.length >> 1;
	        while(d >= 1){
	            for(int i = d; i < arr.length; i++){
	                int rt = arr[i];
	                for(int j = i - d; j >= 0; j -= d){
	                    if(rt < arr[j]){
	                        arr[j + d] = arr[j];
	                        arr[j] = rt;
	                    }else break;
	                }
	            }
	            d >>= 1;
	        }
	    }
	    /**
	     * Ͱ���� - ʵ���������򣬵���Ԫ�ؼ�ֵ�ô�С�нϴ���ʱ������ڴ�ռ�Ľϴ��˷ѡ����ȣ��ҳ����������е����Ԫ��max�������ڴ��СΪmax + 1��Ͱ�����飩����ʼ��Ϊ0��Ȼ�󣬱����������У������ν�ÿ��Ԫ����Ϊ�±��ͰԪ��ֵ����1��
	     * ��󣬱���ͰԪ�أ������ν�ֵ��0��Ԫ���±�ֵ�����������У�ͰԪ��>1������ֵ��С��ȵ�Ԫ�أ���ʱ���ν����������������У���������ɣ��������б�Ϊ�������С�
	     *
	     * ʱ�临�Ӷȣ�O(x*N) �����ȶ��ԣ��ȶ�
	     * @param arr
	     */
	     void bucketSort(int[] arr){
	        int[] bk = new int[50000 * 2 + 1];
	        for(int i = 0; i < arr.length; i++){
	            bk[arr[i] + 50000] += 1;
	        }
	        int ar = 0;
	        for(int i = 0; i < bk.length; i++){
	            for(int j = bk[i]; j > 0; j--){
	                arr[ar++] = i - 50000;
	            }
	        }
	    }
	        /**
	     * �������� - Ͱ����ĸĽ��棬Ͱ�Ĵ�С�̶�Ϊ10���������ڴ�ռ�Ŀ��������ȣ��ҳ����������е����Ԫ��max�������ΰ�max�ĵ�λ����λ������Ԫ������
	     * ͰԪ��10��Ԫ�صĴ�С��Ϊ����������Ԫ�ض�Ӧ��ֵΪ���Ԫ�صĸ�������ÿ�α������������У�Ͱ���䰴��Ӧ��ֵλ��С��Ϊ��10���㼶��Ͱ��Ԫ��ֵ�ú�Ϊ����������Ԫ�ظ�����
	     * @param arr
	     */
	     void countSort(int[] arr){
	        int[] bk = new int[19];
	        Integer max = Integer.MIN_VALUE;
	        for(int i = 0; i < arr.length; i++){
	            if(max < Math.abs(arr[i])) max = arr[i];
	        }
	        if(max < 0) max = -max;
	        max = max.toString().length();
	        int [][] bd = new int[19][arr.length];
	        for(int k = 0; k < max; k++) {
	            for (int i = 0; i < arr.length; i++) {
	                int value = (int)(arr[i] / (Math.pow(10,k)) % 10);
	                bd[value+9][bk[value+9]++] = arr[i];
	            }
	            int fl = 0;
	            for(int l = 0; l < 19; l++){
	                if(bk[l] != 0){
	                    for(int s = 0; s < bk[l]; s++){
	                        arr[fl++] = bd[l][s];
	                    }
	                }
	            }
	            bk = new int[19];
	            fl = 0;
	        }
	    }
	    
	    /**
	     * �鲢���� - �����˷��κ͵ݹ��˼�룬�ݹ�&����-��������������ͬ���������������У�����ִ���������ֱ������ĩ�˵�����Ԫ�أ����������ϲ���������õ��������н�������ֱ����������������ȶ�������˼�룬from down to up����
	     *
	     * ʱ�临�Ӷȣ�O(NlogN) �����ȶ��ԣ��ȶ�
	     * @param arr
	     */
	     void mergeSortInOrder(int[] arr,int bgn,int mid, int end){
	        int l = bgn, m = mid +1, e = end;
	        int[] arrs = new int[end - bgn + 1];
	        int k = 0;
	        while(l <= mid && m <= e){
	            if(arr[l] < arr[m]){
	                arrs[k++] = arr[l++];
	            }else{
	                arrs[k++] = arr[m++];
	            }
	        }
	        while(l <= mid){
	            arrs[k++] = arr[l++];
	        }
	        while(m <= e){
	            arrs[k++] = arr[m++];
	        }
	        for(int i = 0; i < arrs.length; i++){
	            arr[i + bgn] = arrs[i];
	        }
	    }
	     void mergeSort(int[] arr, int bgn, int end)
	    {
	        if(bgn >= end){
	            return;
	        }
	        int mid = (bgn + end) >> 1;
	        mergeSort(arr,bgn,mid);
	        mergeSort(arr,mid + 1, end);
	        mergeSortInOrder(arr,bgn,mid,end);
	    }
	    
	    /**
	     * ������ - �������˼������ڶ�����е����ѵ���ʵ�֡����ȣ������������г���Ϊ������������������ѣ�Ȼ�����ν����Ԫ�أ������ڵ�Ԫ�أ�����������е����һ��Ԫ�ؽ���������������������ұߵ�Ҷ�ӽ��Ԫ�أ���
	     * ÿ�α�����ˢ�����һ��Ԫ�ص�λ�ã��Լ�1����ֱ��������Ԫ���ཻ�����������
	     *
	     * ʱ�临�Ӷȣ�O(NlogN) �����ȶ��ԣ����ȶ�
	     *
	     * @param arr
	     */
	     void heapSort(int[] nums) {
	        int size = nums.length;
	        for (int i = size/2-1; i >=0; i--) {
	            adjust(nums, size, i);
	        }
	        for (int i = size - 1; i >= 1; i--) {
	            int temp = nums[0];
	            nums[0] = nums[i];
	            nums[i] = temp;
	            adjust(nums, i, 0);
	        }
	    }
	    void adjust(int []nums, int len, int index) {
	        int l = 2 * index + 1;
	        int r = 2 * index + 2;
	        int maxIndex = index;
	        if (l<len&&nums[l]>nums[maxIndex])maxIndex = l;
	        if (r<len&&nums[r]>nums[maxIndex])maxIndex = r;
	        if (maxIndex != index) {
	            int temp = nums[maxIndex];
	            nums[maxIndex] = nums[index];
	            nums[index] = temp;
	            adjust(nums, len, maxIndex);
	        }
	    }
}

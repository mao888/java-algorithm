package Leetcode;

import java.util.Iterator;

public class L566���ܾ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1,2},{3,4}};
		System.out.println(new L566���ܾ���().matrixReshape(mat, 1, 4));
	}
	
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    	int m = mat.length;
    	int n = mat[0].length;
    	if (m*n!=r*c) {
			return mat;
		}
    	int arr [] = new int [m*n];
    	int index =0;
    	// ת��Ϊһά����
    	for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[index] = mat[i][j];
				index++;
			}
		}
    	// �ٽ�һά����ת��ΪĿ������
    	int temp[][]=new int[r][c];
    	for (int i = 0; i < r;i++) {
			for (int j = 0; j < c; j++) {
				temp[i][j] = arr[i*c+j];
			}
		}
    	return temp;
    }

}

package ��������˲���;

import java.util.Scanner;

public class �����ַ����ݹ� {

    public static void main(String[] args) {
             String s = "";
             System.out.println(isStr2(s, 0));
             
         }
    

    public static boolean isStr2(String str,int index){
    	// һ��һ���ַ���β�Ƚϣ��Ƚ����һ�������һ���ַ��󣬰��ַ����ĵ�һ�������һ���ַ��޳��������ݹ����
    	if (str.length()==0) {	// ���ַ�
			return false;
		}
        if(str.charAt(0) == str.charAt(str.length() - 1)){
            if(str.length() > 2){
                return isStr2(str.substring(index+1,str.length()-1),0);
            }else return true;
 
        }else {
        	return false;
        }
 
    }

}

package B5��30����;

import java.util.Scanner;


public class B8H��������Է��� {
	  public static void main(String[] args)  {
	        Scanner reader=new Scanner(System.in);
	        int res=0;    //save result
	        int K=reader.nextInt();
	        reader.nextLine();    //nextLine��ȡ�س���
	        String str=reader.nextLine();
	        String words[]=str.split("\\s+|\\.");    //�Կո��.�ָ������ע��.�ո����ϴ��Ϊ���ַ���
	        
	        //    Alice------>Bob
	        for(int i=0;i<words.length;i++){
	            if(words[i].equals("Alice")){
	                for(int j=i+1;j<words.length;j++){
	                    if(words[j].equals("Bob")){
	                        int sum=1;    //����Ҫ����1
	                        for(int k=i+1;k<j;k++){
	                            sum+=words[k].length()+1;
	                        }
	                        if(sum<=K){
	                            res++;
	                        }
	                    }
	                }
	            }
	        }
	        
	        //Bob--------->Alice
	        for(int i=0;i<words.length;i++){
	            if(words[i].equals("Bob")){
	                for(int j=i+1;j<words.length;j++){
	                    if(words[j].equals("Alice")){
	                        int sum=1;    //����Ҫ����1
	                        for(int k=i+1;k<j;k++){
	                            sum+=words[k].length()+1;
	                        }
	                        if(sum<=K){
	                            res++;
	                        }
	                    }
	                }
	            }
	        }
	        System.out.println(res);
	    }

}


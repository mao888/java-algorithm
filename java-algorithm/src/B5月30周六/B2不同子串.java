package B5��30����;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class B2��ͬ�Ӵ�
{


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        
        List<String>list = new ArrayList<>();
        for(int i=0;i<string.length();i++)//��ȡ�Ŀ�ʼλ��
        {
            for(int j=1;j<=string.length();j++)//��ȡ�ĳ���
            {
                if(i+j<=string.length())//���ᳬ���ַ����ĳ���
                {
                    int end = i+j;
                    String str1 = string.substring(i,end);//��ȡ�ַ���
                    
                    if(list.indexOf(str1) == -1) //�жϸ��Ӵ��Ƿ���list�У��Ƿ����±꣬���Ƿ���-1,����list��
                    {
                        list.add(str1);
                    }
                    
                }
                else                     //��������
                {
                    break;
                }
                
            }
        }
        
        for(String str2 : list)
        {
            System.out.println(str2);
        }
        System.out.println();
        int count = list.size();//��ȡlist�ĳ���
        System.out.println(count);
        
    }

}
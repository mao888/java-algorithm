package �������;
//Java����ͨ����飬�������飬��̬��������𼰴���ʾ��
//ִ��˳�򣺣����ȼ��Ӹߵ��͡�����̬�����>main����>��������>���췽����
//���о�̬�����ִֻ��һ�Ρ�����������ÿ�δ��������Ƕ���ִ�С�
class Code{
    {
      System.out.println("Code�Ĺ����");
    }

    static{
        System.out.println("Code�ľ�̬�����");
        }

    public Code(){
        System.out.println("Code�Ĺ��췽��");
        }
    }
public class CodeBlock03 {
	 {
	      System.out.println("CodeBlock03�Ĺ����");    
	     }

	     static{
	        System.out.println("CodeBlock03�ľ�̬�����");
	        }

	        public CodeBlock03(){
	             System.out.println("CodeBlock03�Ĺ��췽��");
	            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("CodeBlock03��������");
         new Code();
         System.out.println("------------");
         new Code();
         System.out.println("------------");
         new CodeBlock03();
         System.out.println("------------");
         new CodeBlock03();
         System.out.println("------------");
	}

}

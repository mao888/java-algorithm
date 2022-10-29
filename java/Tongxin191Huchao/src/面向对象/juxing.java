package �������;
/**
 * @author Hasee
 *
 */
class Rectangle{
	private double width;
	private double length;
//	���췽��һ
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
//	���췽����
	public Rectangle() {
		this(10,10);
	}
	//��ͨ����
	//1.1��
	public double  getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if (width>=20.0||width<=0.0) {
			throw new IllegalArgumentException("width��ֵӦ�ô���0.0С��20.0");
		}
		this.width = width;
	}
	//1.2��
	public double  getLength() {
		return length;
	}
	public void setLength(int length) {
		if (length>20.0||length<0.0) {
			throw new IllegalArgumentException("length��ֵӦ�ô���0.0С��20.0");
		}
		this.length = length;
	}
	//2.���ε����
	public double area() {
		return width*length;
	}
	//3.���ε��ܳ�
	public double perimeter() {
		return 2*(width+length);
	}
	//4.�жϾ����Ƿ�Ϊ������
	public void isSquare() {
		if (this.length==this.width)System.out.println("��������");
		else System.out.println("����������");
	}	
	//5.�Ƚ����������Ƿ����
	public void campare(Rectangle rect) {
		if (this.width==rect.width&&this.length==rect.length)System.out.println("�����������");
			else System.out.println("�����������");
	}
	/*
	//��д��ϣ��ַ
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	//��д�����ַ��ʹ�����
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	*/
	//����ַת�����ַ���
	@Override
	public String toString() {
		return "App2 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
public class juxing {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(10,10);
		Rectangle rect2 = new Rectangle(10,5);
		System.out.print("rect1�����Ϊ:"+rect1.area()+"   ,�ܳ�Ϊ:"+rect1.perimeter()+"   rect1");
		rect1.isSquare();
		System.out.print("rect2�����Ϊ:"+rect2.area()+"     ,�ܳ�Ϊ:"+rect2.perimeter()+"   rect2");
		rect2.isSquare();
		rect1.campare(rect2);
	}
}

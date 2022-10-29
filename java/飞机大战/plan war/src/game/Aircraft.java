package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
/**
 * �ҵķɻ���
 * @author ������
 *
 */
class Aircraft extends FlyingObject{

	int life=20;
	final int Life = life;
	boolean dir_up, dir_down , dir_left , dir_right;
	ImageIcon aircraft  = new ImageIcon("image/aircraft.png");
	ImageIcon myblood  = new ImageIcon("image/myblood.png");     //����ҵķɻ�Ѫ��ͼƬ
	ImageIcon mybloodRim  = new ImageIcon("image/bloodRim.png");   //����ҵķɻ�Ѫ������
	ImageIcon bullet6icon  = new ImageIcon("image/bullet6icon.png");
	/**
	 * 
	 * @param aircraft_x �ҵķɻ���ʼx����
	 * @param aircraft_y �ҵķɻ���ʼy����
	 */
	public Aircraft(int aircraft_x,int aircraft_y) {
		super.x = aircraft_x;
		super.y = aircraft_y;
		setSpeed(5);
		setWidth(65);
		setHeight(45);
	}
	/**
	 * ���ҵķɻ����ҵķɻ���Ѫ�������ҵķɻ���Ѫ�����߿���Ϸ�������Ͻǵĳ�������ͼ��
	 * @param g
	 */
	void drawaircraft(Graphics g) {
		g.drawImage(aircraft.getImage(), x,y , width, height, null);
		g.drawImage(myblood.getImage(), 95,30,(int)(80*((float)life/Life)),12, null);   //Ѫ���������Ѫ����С����С
		g.drawImage(mybloodRim.getImage(), 95,30,80,12, null);         //Ѫ����������
		g.drawImage(bullet6icon.getImage(), 22,51,18,18, null); 
		aircraftmove();
	}
	/**
	 * ����ҵķɻ����ڵľ���
	 * @return �����ҵķɻ����ڵľ���
	 */
	Rectangle aircraftSize() {
		return new Rectangle(x,y+7 ,60, 45);      //�õ��ҵķɻ����ڵľ��Σ�Ϊ��ʵ����ײ
	}
	/**
	 * �ɻ����ƶ�
	 */
	void aircraftmove() {
		//�ɻ��ƶ�    ���÷ɻ��ƶ��ı߽�//

		if(dir_up) {
			if(this.y>0) {      
				this.y -= speed;   
			}
		}
		if(dir_down) {
			if(this.y<564) {    
				this.y += speed;
			}
		}
		if(dir_left) {
			if(this.x>0) {         
				this.x -= speed;
			}
		}
		if(dir_right) {
			if(this.x<520) {             
				this.x += speed;
			}
		}
	}

}




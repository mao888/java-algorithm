package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
/**
 * �ҵ��ӵ���
 * @author ������
 *
 */
class MyBullet extends FlyingObject{
	int aircraft_y;       //��ʼ���ӵ�����ʱ �ɻ����ڵ�Y����
	int bulletType;
	int bigBulTim;
	int time;
	ImageIcon daodan  = new ImageIcon("image/bullet8.png");
	ImageIcon bullet1  = new ImageIcon("image/bullet7.png");
	ImageIcon paidan  = new ImageIcon("image/paidan.png");
	ImageIcon bullet2  = new ImageIcon("image/bullet1.png");
	/**
	 * ��ʼ���ҵ��ӵ�ʱ�����ҵķɻ���������ӵ���������
	 * @param bullets_x    �ӵ���x������
	 * @param bullets_y     �ӵ���y������
	 * @param bulletType      �ӵ�������
	 */
	MyBullet(int bullets_x,int bullets_y,int bulletType) { 
		this.x=bullets_x;
		this.y=bullets_y;
		this.aircraft_y = bullets_y;
		this.bulletType = bulletType;
	}
	/**
	 * ���ʷ���
	 * ���ݴ�����ӵ�����������Ӧ���ӵ�ͼƬ
	 * @param g
	 */
	void drawbullet(Graphics g) {
		//���ݲ�ͬ���ӵ�������ѡ�񻭲�ͬ���ӵ�
		switch(bulletType) {
		case 1:
		case 2:
			g.drawImage(bullet1.getImage(), x+27, y+4, 7,14, null);
			break;
		case 3:
		case 4:
			g.drawImage(bullet2.getImage(), x+27, y+4, 10,25, null);
			break;
		case 5:
			g.drawImage(daodan.getImage(), x-30, y+4, 8,24, null);
			break;
		case 6:
			g.drawImage(daodan.getImage(), x+80, y+4, 8,24, null);
			break;
		case 7:
			g.drawImage(paidan.getImage(), 0, y-10, 600,5, null);
			break;
		}
		aircraftbulletmove()	;   //�����ӵ��ƶ�����
		time++;
	}
	/**
	 * ��ͬ���ӵ����ͻ�ò�ͬ���ӵ��߽�
	 * @return
	 */
	Rectangle bulletSize() {
		switch(bulletType)
		{
		case 1:
		case 2:
			return new Rectangle(x+27, y+4,7,14);
		case 3:
		case 4:
			return new Rectangle(x+27, y+4,10,25);
		case 5:
			return new Rectangle(x-30,  y+4,8,24);
		case 6:
			return new Rectangle(x+80,  y+4,8,24);
		case 7:
			return new Rectangle(0, y, 600,5);
		}
		return null;
	}
	/**
	 * �ӵ��ƶ���������ͬ�ӵ��ƶ��켣��ͬ
	 */
	void aircraftbulletmove() {     
		switch (bulletType)
		{
		case 1:
			y-=6;
			if(time%3==0) x--;
			break;
		case 2:
			y-=6;
			if(time%3==0) x++;
			break;
		case 3:
			x++;
			y-=6;
			break;
		case 4:
			x--;
			y-=6;
			break;
		case 5:
		case 6:
			y-=10;	
			break;
		case 7:
			y-=3;
		}
	}
}






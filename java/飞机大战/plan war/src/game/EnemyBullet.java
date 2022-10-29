package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
/**
 * �ӵ���
 * @author ������
 *
 */
class EnemyBullet extends FlyingObject{
	int enemybulletType;
	/**���Ƶ����ӵ���x����ٶ�*/
	int a;
	ImageIcon enemybullet1 = new ImageIcon("image/bullet6.png");
	ImageIcon enemybullet2 = new ImageIcon("image/bullet3.png");
	ImageIcon enemybullet3 = new ImageIcon("image/bullet4.png");

	public EnemyBullet(int enemybullet_x,int enemybullet_y,int enemybulletType) {           //��ʼ�������ӵ�����ʱ�����������
		this.x = enemybullet_x;
		this.y = enemybullet_y;
		this.enemybulletType = enemybulletType;
	}
	/**
	 * ���ݴ�����ӵ����ͻ��л��ӵ�
	 * @param g
	 */
	void drawenemy_bullet(Graphics g) {     
		switch(enemybulletType)
		{
		case 1: 
			g.drawImage(enemybullet1.getImage(), x+18, y+28,10,10, null);
			break;
		case 2:
			g.drawImage(enemybullet2.getImage(), x+18, y+28,10,25, null);
			break;
		case 3:
			g.drawImage(enemybullet3.getImage(), x+18, y+28,12,12, null);
			break;
		case 4:
			g.drawImage(enemybullet3.getImage(), x+18, y+28,12,12, null);
		}
		enemy_bulletmove();         //���õл��ƶ�����
	}
	/**
	 * ��ȡ�����ӵ����ڵľ���
	 * @return  ���ص����ӵ����ڵľ���
	 */
	Rectangle enemyBulletSize() {   
		switch(enemybulletType)
		{
		case 1: 
			return new Rectangle(x+18, y+28,10,10);
		case 2:
			return new Rectangle(x+18, y+28,10,25);
		case 3: 
			return new Rectangle(x+18, y+28,12,12);
		case 4:
			return new Rectangle(x+18, y+28,12,12);
		}
		return null;
	}
	void enemy_bulletmove() {   //�л��ƶ�����
		switch(enemybulletType)
		{
		case 1:  
			y+=3;  
			
			break;
		case 2:
			if(y<100)  y+=3;
			else y+=15;
			break;
		case 3:
			y+=3;
			a++;
			if(a%3==0)   x-=1;
			break;
		case 4:
			y+=3;
			a++;
			if(a%3==0)   x+=1;
			break;
		}

	}
}







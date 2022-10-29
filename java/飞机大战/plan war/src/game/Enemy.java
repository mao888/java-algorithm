package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
/**
 * ������
 * @author ������
 *
 */
 class Enemy extends FlyingObject {
	int xSpeed;
	int life;
	int bulletNum;
    int time =20;
    int Time = time;
    int enemy_type;
	ImageIcon enemy1  = new ImageIcon("image/enemy1.png");
	ImageIcon enemy2  = new ImageIcon("image/enemy2.png");
	ImageIcon enemy3  = new ImageIcon("image/enemy3.png");
	ImageIcon enemy4  = new ImageIcon("image/enemy4.png");
	ImageIcon boom1  = new ImageIcon("image/boom1.png");
/**
 * 
 * @param enemy_x ��ʼ�����˵ĺ�����
 * @param enemy_y ��ʼ�����˵�������
 * @param life ����Ѫ��
 * @param enemy_type ��������
 */
	 Enemy(int enemy_x,int enemy_y,int life,int enemy_type) { 
		this.x=enemy_x;
		this.y=enemy_y;
		this.life = life;
		this.enemy_type = enemy_type;
	}
	 /**
	  * ���л��ķ��������Ͳ�ͬ�����ĵл���ͬ
	  * @param g  ���ʶ���
	  */
	 void drawenemy(Graphics g) {  
		 if(time==Time) {
			 switch(enemy_type)
			 {
			 case 1:    g.drawImage(enemy1.getImage(), x,y,50,35,null);   break;
			 case 2:    g.drawImage(enemy2.getImage(), x,y,50,35,null);   break;
			 case 3:    g.drawImage(enemy3.getImage(), x,y,50,35,null);   break;
			 case 4:    g.drawImage(enemy4.getImage(), x,y,50,35,null);   break;
			 }
		 }
		 else  		g.drawImage(boom1.getImage(), x,y,35,35,null);
	    enemy_move();
	}
	 /**
	  * ��õл����ڵľ���
	  * @return  ���صл����ڵľ��α߿�
	  */
	 Rectangle enemySize() {       
			return new Rectangle(x, y,50,35);
	}
	 /**
	  * �л��ƶ�����
	  */
	 void enemy_move() {   
		y+=2;
		x+=xSpeed;
		if(x<20) {
			xSpeed=3;
		}
		if(x>550) {
			xSpeed=-3;
		}
	}
	
}


//�ڵл��������һ����ըͼƬ�����һ������ըͼƬ�ķ������ҵ��ӵ���л�ʱ���ô˷������������������




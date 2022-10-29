package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
/**
 * boss�ӵ���
 * @author ������
 *
 */
class BossBullet extends FlyingObject{
	int bulletType;     //boss�ӵ�����
	int xSpeed=7;
	ImageIcon bossbullet= new ImageIcon("image/bullet2.png");    
	ImageIcon bossbullet2= new ImageIcon("image/bullet6.png");   


	BossBullet(int bossbullet_x,int bossbullet_y,int bulletType) {
		this.x = bossbullet_x;
		this.y = bossbullet_y;
		this.bulletType =  bulletType;      //��ʼ��ʱ����boss�ӵ�����
	}
	void drawenemy_bullet(Graphics g) {
		//���ݴ����boss�ӵ��������жϻ������ӵ�
		if(bulletType==1||bulletType==2||bulletType==3) {
			g.drawImage(bossbullet.getImage(), x+17, y+48,15,30, null);
		}else if(bulletType==4||bulletType==5) {
			g.drawImage(bossbullet2.getImage(), x+17, y+48,10,10, null);

		}
		enemy_bulletmove();
	}

	Rectangle bossBulletSize() {
		//���ݴ����boss�ӵ����������ò�ͬ���ӵ��߽�
		if(bulletType==1||bulletType==2||bulletType==3) {
			return new Rectangle(x+17, y+48,15,30);
		}else  {
			return new Rectangle(x+17, y+48,10,10);
		}
	}
	void enemy_bulletmove() {
		//���ݴ����boss�ӵ�������ִ�в�ͬ���ƶ�����
		if(bulletType==1||bulletType==2||bulletType==3) {
			if(y<50) {
				y+=2;
			}else if(y>=50&&y<100){
				y+=2;
			}else {
				y+=12;
			}
		}else if(bulletType==4||bulletType==5) {
			y+=3;
		}
		if(bulletType==1) {
			x-=3;
		}else if(bulletType==3) {
			x+=3;
		}else if(bulletType==4) {
			x+=xSpeed;
			if(x>550) {
				xSpeed=-7;
			}else if(x<50){
				xSpeed=7;
			}
		}else if(bulletType==5) {

			x+=-xSpeed;
			if(x>550) {
				xSpeed=7;
			}else if(x<1){
				xSpeed=-7;
			}
		}
	}
}

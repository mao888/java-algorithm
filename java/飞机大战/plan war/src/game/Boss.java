package game;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
/**
 * boss��
 * @author ������
 *
 */
class Boss extends FlyingObject{
	/** boss��ˮƽ������ٶ�*/ 
	int xSpeed=1;
	/**boss����ֵ*/
	int life=300;
	/**boss��ʼ����ֵ���ڻ�Ѫ������ʱ���õ�*/
	final int Life = life;
	/**ʵ����boss�����ȴ�һ��ʱ�䣨time�������boss*/
	int time;       
	/**
	 * ��ʼ��bossλ��
	 */
	Boss(){
		setX(250);
		setY(-200);
		setWidth(80);
		setHeight(40);
	}
	ImageIcon boss  = new ImageIcon("image/boss.png");
	ImageIcon blood = new ImageIcon("image/bossblood.png");
	ImageIcon bloodRim = new ImageIcon("image/bloodRim.png");
	/**
	 * ��boss����bossѪ������bossѪ���߽硢��boss���ƶ�����
	 * @param g
	 */
	void drawboss1(Graphics g) {
		if(life>0) {
			if(time>100) { 
				g.drawImage(boss.getImage(), x-15,y,width,height,null);            
				g.drawImage(blood.getImage(), x-80,y-20,(int)(200*((float)life/Life)),10,null);  
				g.drawImage(bloodRim.getImage(), x-80,y-20,200,10,null);       
			}
			boss1_move();
			time++;
			if(time>900) time=200;
		}
	}
	/**
	 * ���boss���ڵľ��Σ�Ϊ��ʵ����ײ���
	 * @return ����boss���ڵľ���
	 */
	Rectangle bossSize() {         //���boss���ڵľ��Σ�Ϊ��ʵ����ײ���
		return new Rectangle(x, y,50,40);
	}
	/**
	 * boss���ƶ�����
	 */
	void boss1_move() {                        //boss�ƶ�
		if(y<30) y++;
		else if(y==30&&time>200&&time<600) {
			if(x>=500) xSpeed=-2;
			if(x<=10) xSpeed=2;
			x+=xSpeed;
		}else if(y==30&&time>=600&&time<900) {
		}

	}
}

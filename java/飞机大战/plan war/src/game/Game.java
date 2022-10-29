package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
class Game extends JPanel {      
	/** ����*/
	int score;    
	/**������y���꣬����ʵ�ֱ�������*/
	int background_y;     //������y����
	/**����bossѭ�������ӵ�*/
	int time;   
	/**��ֹ�ɻ�����*/
	int time3;  
	/**boss���ֵķ���*/
	int bossBurnScore=600;      /////////////////////////////        
	/**�����ӵ�����*/
	int myBulletNum;                     
	/**��������*/
	int myDaodanNum;  
	/**���ٵ����������ٵ�ʱ��*/
	int speedUptime;                     
	/**boss�����͵���ʤ���Ի����ʱ����   */
	int overTime=20;                   
	/**ʹ�߳�һ�и����������ٶȲ�ͬ*/
	int time2;       
	/**��������ӵ��߳��е�������ٶ�*/
	int addmyDaoDanTime;     
	/**�������߳�ʼ����*/
	int paidanNum=5; /////////////////////////////////////////����      
	/**����*/
	JFrame Game_jfrm;
	/**�ҵķɻ�����*/
	Aircraft aircraft;
	/**boss����*/
	Boss boss;
	/**ʵ����ͣ����*/
	boolean pause = true;               //���ʿ��أ��ɻ��������عر�,��ͣʱ���عر�
	ImageIcon background  = new ImageIcon("image/background.png");        //����ͼƬ�����
	Image im = (new ImageIcon("image/aircraftIcon.png")).getImage();
	/**�ҵ��ӵ�����*/
	ArrayList<MyBullet> mybullets ;       
	/**�л�����*/
	ArrayList<Enemy> enemys ;                
	/**�л��ӵ�����*/
	ArrayList<EnemyBullet> enemybullets;    
	/**boss�ӵ�����*/
	ArrayList<BossBullet> bossbullets;    
	/**��������*/
	ArrayList<Buff> buffs;  

	/**
	 * ������Ϸ����
	 * �����߳�
	 */
	Game() {
		enemybullets = new ArrayList<EnemyBullet>();      
		//����new�����µĵл��ӵ��������󣬲���enemybulletsָ����
		mybullets =new ArrayList<MyBullet>();                    
		aircraft = new Aircraft(250, 480);
		enemys = new ArrayList<Enemy>();
		bossbullets = new ArrayList<BossBullet>();
		buffs = new ArrayList<Buff>();
		boss = new Boss();     
		Game_jfrm = new JFrame("�ɻ���ս");
		Game_jfrm.setIconImage(im);
		Game_jfrm.setLayout(null);
		Game_jfrm.setSize(600,650);
		ListenerAircraft listeneraircraft = new ListenerAircraft(this);  
		Game_jfrm.addKeyListener(listeneraircraft);      //�Ѽ�����listeneraircraft���¼�ԴGame_jfrm��ʵ�����ǣ�ע��
		this.setSize(600,700);
		this.setLayout(null);
		Game_jfrm.add(this);
		Game_jfrm.setLocationRelativeTo(null);//���ھ���
		Game_jfrm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);   //�������ڵĹرհ�ť��������
		Game_jfrm.setResizable(false);        //���ڴ�С�̶�
		Game_jfrm.addWindowListener(new WindowAdapter(){         
			public void windowClosing(WindowEvent e) {
				pause=false;
				int n=JOptionPane.showConfirmDialog(null, "�Ƿ������Ϸ", "��ѡ��",JOptionPane.YES_NO_OPTION);

				if(n==JOptionPane.YES_OPTION) {
					Game_jfrm.dispose();
					new StartJframe();
				}else {
					pause=true;
				}
			}
		});
		new Thread1().start();
		new Thread2().start();
		new Thread3().start();
		Game_jfrm.setVisible(true);          //���ڿ��ӻ�
		
	}
	/**
	 * ����
	 */
	
	public  void paint(Graphics g) {
		if(pause==true&&overTime>1) {
			//			super.paint(g);
			drawbackground(g);
			drawString(g);
			aircraft.drawaircraft(g);  //��ս��
			if(score>=bossBurnScore) {
				boss.drawboss1(g);
			}
			for(int i=0;i<mybullets.size();i++) {     //�ҵķɻ������ӵ�
				MyBullet bullet=mybullets.get(i);
				bullet.drawbullet(g);
				if(mybullets.get(i).bulletSize().intersects(boss.bossSize())&&boss.life>0) {     //�ҵ��ӵ���boss
					switch(mybullets.get(i).bulletType)
					{
					case 1:
					case 2:
					case 3:  boss.life--;  break;
					case 4:
					case 5:
					case 6:  boss.life-=5;  break;
					}
					if(boss.life<=0) score+=400;     
					mybullets.remove(mybullets.get(i));     //����boss���Ƴ��ҵ��ӵ�
				}
				for(int j=0;j<enemys.size()&&i<mybullets.size();j++) {     //�ҵ��ӵ���л�
					if(mybullets.get(i).bulletSize().intersects(enemys.get(j).enemySize())  //�ҵ��ӵ����л�
							) {
						switch(mybullets.get(i).bulletType)
						{
						case 1:
						case 2:
						case 3:  
						case 4:  enemys.get(j).life--;  break;
						case 5:
						case 6:  enemys.get(j).life-=7;  break;
						case 7:  enemys.get(j).life-=7;  break;
						}
						if(mybullets.get(i).bulletType!=7) {
							mybullets.remove(mybullets.get(i));        //�ҵ��ӵ����ел����ҵ��ӵ����Ƴ�
						}
					}
					if(enemys.get(j).life<=0) {   		
						enemys.get(j).time--;      //��������ֵΪ��� ���˶����е�time�𽥼����㣬�˹����б�ըͼƬһֵ���ػ�
					}
					if(enemys.get(j).time<=0) {     //���˶����е�timeΪ����Ƴ�
						switch(enemys.get(j).enemy_type)
						{
						case 1:   score+=5;   break;
						case 2:   score+=10;  break;
						case 3:   score+=15;  break;
						case 4:   score+=15;
						}
						enemys.remove(enemys.get(j));	    //�л��������Ƴ�

					}
				}	
			}
			for(int i =0 ; i<mybullets.size();i++) {     //�ҵ��ӵ�Խ���Ƴ�
				if(mybullets.get(i).y<-50) {
					mybullets.remove(mybullets.get(i));
				}
			}
			for(int i=0;i<buffs.size();i++) {    //���buff
				Buff buff=buffs.get(i);
				buff.drawBuff(g);
				if(buffs.get(i).buffSize().intersects(aircraft.aircraftSize())) {
					switch(buffs.get(i).buffType)
					{
					case 1:    myBulletNum=50;   break;
					case 2:    myDaodanNum=25;   break;
					case 3:    aircraft.life++;  break;
					case 4:    
						if(aircraft.life>aircraft.Life) {} 
						else aircraft.life=aircraft.Life;
						break;
					case 5:    speedUptime=100;  break;
					case 6:    paidanNum+=1; 
					}
					buffs.remove(buffs.get(i));
				}
			}
			time3++;
			if(boss.bossSize().intersects(aircraft.aircraftSize())&&time3%15==0)  
				aircraft.life--;
			for(int i=0;i<enemys.size();i++) {     //���ӵл�
				Enemy enemy=enemys.get(i);
				enemy.drawenemy(g);
				boolean rem = true;
				if(enemys.get(i).enemySize().intersects(aircraft.aircraftSize())) {
					aircraft.life--;
					score+=5;
					enemys.remove(enemys.get(i));
					rem = false;
				}
				if(rem) {
					if(enemys.get(i).y>600) {
						enemys.remove(enemys.get(i));
					}
				}
			}
			for(int i = 0;i<enemybullets.size();i++) {      //���˷����ӵ�
				EnemyBullet enemybullet = enemybullets.get(i);
				enemybullet.drawenemy_bullet(g);
				boolean hit=false;
				if(	enemybullets.get(i).enemyBulletSize().intersects(aircraft.aircraftSize())) {
					aircraft.life-=1;
					hit=true;
				}
				for(int j = 0;j<mybullets.size();j++) {
					if(mybullets.get(j).bulletSize().intersects(enemybullets.get(i).enemyBulletSize())) {
						if(mybullets.get(j).bulletType==7) hit=true;
					}
				}
				if(enemybullets.get(i).y>600||hit) {   //�����ӵ������Һ͵����ӵ�Խ�����Ƴ�
					enemybullets.remove(enemybullets.get(i));
				}
			}
			if(score>=bossBurnScore) {        //boss�����ӵ�
				for(int i = 0;i<bossbullets.size();i++) {
					BossBullet bossbullet = bossbullets.get(i);
					bossbullet.drawenemy_bullet(g);
					boolean bossHit=false;
					if(	bossbullets.get(i).bossBulletSize().intersects(aircraft.aircraftSize())) {
						aircraft.life-=1;
						bossHit=true;
					}
					for(int j = 0;j<mybullets.size();j++) {
						if(mybullets.get(j).bulletSize().intersects(bossbullets.get(i).bossBulletSize())) {
							if(mybullets.get(j).bulletType==7) bossHit=true;
						}
					}
					if(bossbullets.get(i).y>600||bossHit) {   //�����ӵ������Һ͵����ӵ�Խ�����Ƴ�
						bossbullets.remove(bossbullets.get(i));
					}
				}
			}

			if(boss.life<=0) overTime--;
			if(overTime==1) {
//				overTime-=100;
				// boss�����󵯳�ʤ���Ի���   
				int n = JOptionPane.showConfirmDialog(null, "��ʤ����\n�Ƿ�����һ�֣�","", JOptionPane.YES_NO_OPTION);
				if(n==JOptionPane.YES_OPTION) {
					Game_jfrm.dispose();    //�ر���Ϸ����
					new Game();             //���µ���Ϸ����
				}else  {
					//					System.exit(0);
					Game_jfrm.dispose();
					new StartJframe();  //�򿪿�ʼ���洰��
				}
			}
		}

		if(aircraft.life<0) {          // ������󵯳�ʧ�ܶԻ���
			int n = JOptionPane.showConfirmDialog(null, "���ź�  ��������\n�Ƿ����¿�ʼ��","", JOptionPane.YES_NO_OPTION);
			if(n==JOptionPane.YES_OPTION) {
				Game_jfrm.dispose();//�ر���Ϸ����
				new Game();        //���µ���Ϸ����
			} else {
				Game_jfrm.dispose();//�ر���Ϸ����
				//								System.exit(0);
				new StartJframe();   //�򿪿�ʼ���洰��
			}
		}

	}
	/**
	 * ��ӵ���
	 * ��ӵл� 
	 * ��ӵл��ӵ�
	 * ���boss�ӵ�
	 * @author ������
	 *
	 */
	class Thread1 extends Thread{

		public void run() {
			while(true) {
				try {                                        
					if(pause==true&&aircraft.life>=0&&boss.life>=0) {
						time2++;
						//���buff
						if(score<100) {
							if(time2%170==0) addbuff();
						}else if(score<300) {
							if(time2%150==0) addbuff();
						}else if(score<500) {
							if(time2%130==0) addbuff();
						}else {
							if(time2%100==0) addbuff();
						}

						//��ӵл�
						if(score<bossBurnScore) {
							
						}
						
						if(boss.life>0&&score<bossBurnScore) {
							if(score<100) {
								if(time2%12==0) addenemy();
							}else if(score<300) {
								if(time2%10==0) addenemy();
							}else if(score<500) {
								if(time2%9==0) addenemy();
							}else if(score<800){
								if(time2%8==0) addenemy();  
							}
						}else if(boss.life>0&&score>bossBurnScore){
							if(time2%40==0) addenemy();
						}

						//��ӵл��ӵ�
						if(time2%9==0) addenemybullets();
						//boss�ڲ�ͬ��ʱ�䷢�䲻ͬ���͵��ӵ���ѭ��
						
						if(boss.life>0&&score>=bossBurnScore&&boss.time>200&&time2%2==0)	{
							time++;
							if(time<=17) {    
								addbossbullets(1);
								addbossbullets(2);	
								addbossbullets(3);
							}else if(time>50&&time<65) {
								addbossbullets(4);
								addbossbullets(5);	
							}else if(time>105&&time<120) {
								addbossbullets(1);
								addbossbullets(2);	
								addbossbullets(3);
							}else if(time==130){
								time = 0;
							}
						}
					}
					sleep(100);
				}catch (Exception e) {
				}
			}
		}

	}
	/**
	 * ����ҵĸ����ӵ��߳�
	 * @author ������
	 *
	 */
	class Thread2 extends Thread{
		//����ҵ��ӵ��߳�
		public void run() {
			while(true) {
				try {				
					if(pause==true&&aircraft.life>=0) {  
						addmybullets(1);
						addmybullets(2);
						if(myBulletNum>0) {           //���ɢ���ӵ�
							addmybullets(3);
							addmybullets(4);
							myBulletNum--;
						}
						if(myDaodanNum>0) {           //��ӵ���
							addmyDaoDanTime++;
							if(addmyDaoDanTime%3==0) {
								addmybullets(5);
								addmybullets(6);
								myDaodanNum--;
							}
						}
					}
					if(speedUptime>0)  { speedUptime--; sleep(150);}   //����ҵ��ӵ���ʱ����
					else if(speedUptime<=0) sleep(300);
				}catch (Exception e) {
				}
			}
		}
	}
	/**
	 * ʹ�����ػ�
	 * @author ������
	 *
	 */
	class Thread3 extends Thread{
		//����ҵ��ӵ��߳�
		public void run() {
			while(true) {
				try {	
					if(aircraft.life>=0&&pause==true&&overTime>1)
						repaint();
					sleep(13);
				}catch (Exception e) {
				}
			}
		}
	}
	/**
	 * ����Ϸ���������Ͻǵ�����
	 * @param g
	 */
	public void drawString(Graphics g) {
		g.setFont(new Font("����",Font.ITALIC,15));     
		g.setColor(Color.GREEN);                     
		g.drawString("��ķ���: "+score, 20, 20);
		g.drawString("�������: ", 20, 40);
		g.drawString("*"+paidanNum, 45, 65);
	}
	/**
	 * ��������
	 * @param g  ���ʶ���
	 */
	public void drawbackground(Graphics g) {                 
		if(background_y>=650) 		background_y=0;
		g.drawImage(background.getImage(), 0, background_y     ,600,650, null);
		g.drawImage(background.getImage(), 0, background_y-650 ,600,650, null);
		background_y++;
	}
	/**
	 * ʵ����һ���ӵ�������ӵ�mybullets��������
	 * @param i �����ӵ�����
	 */
	public void addmybullets(int i) {       
		MyBullet aircraft_bullet=new MyBullet( aircraft.x, aircraft.y,i);
		mybullets.add(aircraft_bullet);
	}
	/**
	 * �����Ӧ�ĵл�
	 * ��ͬ�����β�ͬ�л����ֵĸ��ʲ�ͬ
	 */
	public void addenemy() {    
		int random =(int) (100*Math.random());
		if(score<=100) {
			if(random<70) {
				addEnemy(3,1);
			}else if(random<85) {
				addEnemy(3,2);
			}else if(random<93) {
				addEnemy(5,3);
			}else {
				addEnemy(5,4);
			}
		}else if(score<=550) {
			if(random<45) {
				addEnemy(4,1);
			}else if(random<70) {
				addEnemy(4,2);
			}else if(random<85) {
				addEnemy(5,3);
			}else {
				addEnemy(5,4);
			}
		}else if(score<=800) {
			if(random<30) {
				addEnemy(5,1);
			}else if(random<60) {
				addEnemy(5,2);
			}else if(random<75) {
				addEnemy(7,3);
			}else {
				addEnemy(7,4);
			}
		}else {
			if(random<15) {
				addEnemy(6,1);
			}else if(random<50) {
				addEnemy(6,2);
			}else if(random<70) {
				addEnemy(8,3);
			}else {
				addEnemy(8,3);
			}
		}
	}
	/**
	 * ʵ����һ���л����󣬲���ӵ�enemys����
	 * @param enemyLife ����Ѫ��
	 * @param enemyType ��������
	 */
	public void addEnemy(int enemyLife,int enemyType) {   //��ӵл�
		int random_x=(int)(600*Math.random());
		Enemy enemy = new Enemy(random_x,-10,enemyLife,enemyType);  
		enemys.add(enemy);
	}
	/**
	 * ��ͬ�ĵ�����Ӳ�ͬ���͵��ӵ�
	 */
	public void addenemybullets() {     //��ӵл��ӵ�
		for(int i=0;i<enemys.size();i++) {
			switch(enemys.get(i).enemy_type) {

			case 1:    break;
			case 2:
				EnemyBullet enemybullet = new EnemyBullet(enemys.get(i).x,enemys.get(i).y, 1);
				if(enemys.get(i).bulletNum<2)   enemybullets.add(enemybullet);
				enemys.get(i).bulletNum++;
				break;
			case 3:
				EnemyBullet enemybullet1 = new EnemyBullet(enemys.get(i).x,enemys.get(i).y, 2);
				if(enemys.get(i).bulletNum<3)   enemybullets.add(enemybullet1);
				enemys.get(i).bulletNum++;
				break;
			case 4:
				EnemyBullet enemybullet2 = new EnemyBullet(enemys.get(i).x,enemys.get(i).y, 3);
				if(enemys.get(i).bulletNum<6)   enemybullets.add(enemybullet2);
				enemys.get(i).bulletNum++;
				EnemyBullet enemybullet3 = new EnemyBullet(enemys.get(i).x,enemys.get(i).y, 4);
				if(enemys.get(i).bulletNum<6)   enemybullets.add(enemybullet3);
				enemys.get(i).bulletNum++;
			}
		}
	}
	/**
	 * ʵ����һ��boss�ӵ����󣬲���ӵ�����bossbullets����
	 * @param i boss�ӵ�����
	 */
	public void addbossbullets(int i) {   //���boss�ӵ�
		BossBullet  bossbullet = new BossBullet(boss.x, boss.y,i);	
		bossbullets.add(bossbullet);
	}
	/**
	 * ʵ����һ�������ӵ����󣬲���ӵ�����buffs����
	 * @param i ��������
	 */
	public void addBuff(int i) {      //���buff
		int buff_x=(int)(550*Math.random());
		Buff buff = new Buff(buff_x, -10,i);
		buffs.add(buff);
	}
	/**
	 * �߳�����������������
	 * ������������棬������ӵ��߷�������Ӳ�ͬ���ߵĸ��ʲ�ͬ
	 */
	public void addbuff() {    
		int buffType=(int)(100*Math.random());         //����жϳ��ֵ�buff����
		if(buffType<25)   addBuff(1);
		else if(buffType<50) addBuff(2);
		else if(buffType<65) addBuff(3);
		else if(buffType<75) addBuff(4);
		else if(buffType<90) addBuff(5);
		else addBuff(6);

	}
}


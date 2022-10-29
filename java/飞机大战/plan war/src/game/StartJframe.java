package game;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * ��Ϸ�Ŀ�ʼ����
 * @author ������
 *
 */
class StartJframe {
	JFrame start_jfrm;
	JPanel jpan ;
	JLabel lab;
	JButton bt1;
	JButton bt2;
	JButton bt3;
	ButtonListener buttonListener;
	ImageIcon start_background  = new ImageIcon("image/start_background.png");
	Image im = (new ImageIcon("image/aircraftIcon.png")).getImage();
	/**
	 * ����һ�����ڣ���Ϸ���棩��������������ť
	 */
	StartJframe(){	
		buttonListener = new ButtonListener();
		start_jfrm = new JFrame("�ɻ���ս");//������ܶ���game_jfrm
		jpan = new JPanel();
		lab = new JLabel (start_background);
		bt1 = new JButton("��ʼ��Ϸ");//��Ӱ�ť����ʼ��Ϸ��
		bt2 = new JButton("��Ϸ˵��");//��Ӱ�ť����Ϸ˵����
		bt3 = new JButton("�˳���Ϸ");//��Ӱ�ť���˳���Ϸ��
		start_jfrm.setIconImage(im);
		start_jfrm.setLayout(null);       //ȡ��Ĭ�ϵı߽粼�ֹ�����
		start_jfrm.setSize(600,500);  
		start_jfrm.setLocationRelativeTo(null);//���ھ���
		start_jfrm.setResizable(false); 
		jpan.setBounds(0,0,600,500);  
		jpan.add(lab);
		bt1.setBounds(250, 280, 90, 30);
		bt2.setBounds(250, 320, 90, 30);
		bt3.setBounds(250, 360, 90, 30);
		bt1.addActionListener(buttonListener);
		bt2.addActionListener(buttonListener);
		bt3.addActionListener(buttonListener);
		start_jfrm.add(bt1);
		start_jfrm.add(bt2);
		start_jfrm.add(bt3);
		start_jfrm.add(jpan);
		start_jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //���õ��������Ϲرհ�ť�Ĵ���ʽΪEXIT_ON_CLOSE������������
		start_jfrm.setVisible(true);       //��������ʾ����
	}
	/**
	 * ʵ��ActionListener�ӿڵ��ڲ���
	 * @author ������
	 *
	 */
	class ButtonListener implements ActionListener{         //������ť�ļ���
		public void actionPerformed(ActionEvent e) {
			JButton batton = (JButton)e.getSource();
			if(batton==bt1) {
				start_jfrm.dispose();
				new Game();
			}else if(batton==bt2) {
				JOptionPane.showMessageDialog(null, "�� �� �� ���ֱ����ս�����������ƶ�\n�ո����ͣ\nB��ʹ�ó�������  �����������������ƣ���Ϸ�л�������ӳ������������ĵ���\n��Ϸ�л��и����������\n�������ս�������������߰�","��Ϸ˵��",JOptionPane.PLAIN_MESSAGE);
			}else if(batton==bt3) {
				int n = JOptionPane.showConfirmDialog(null, "�Ƿ�Ҫ�˳���Ϸ��","", JOptionPane.YES_NO_OPTION);  //�Ի���ĵ���
				if(n==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		}
	}
}



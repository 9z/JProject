
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import img.a;

import java.awt.Font;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class LoginGUI {

	private BufferedImage icon;
	private JFrame frame;
	private JTextField id;
	private JPasswordField pw;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 419, 306);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel(){
	         public void paintComponent(Graphics g) {
	             try {
	         		String path = a.class.getResource("").getPath(); // ���� Ŭ������ ���� ��θ� �����´�.
	        		//System.out.println(path); // --> ���� ��ΰ� ��µ�
	         		
	                File fileInSamePackage = new File(path + "bgLogin.png");
	                icon = ImageIO.read(fileInSamePackage);
	                Dimension d = getSize();// ��üȭ��
	                g.drawImage(icon, 0, 0, d.width, d.height, null);
	              //  setOpaque(false);
	               // super.paintComponent(g);
	             } catch (IOException e) {
	                e.printStackTrace();
	             }
	          }
	       };
		panel.setBounds(0, 0, 403, 268);
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblId = new JLabel("\uC544\uC774\uB514");
		panel.add(lblId);
		lblId.setFont(new Font("�޸ո���T", Font.PLAIN, 15));
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblPw = new JLabel("\uBE44\uBC00\uBC88\uD638");
		panel.add(lblPw);
		lblPw.setFont(new Font("�޸ո���T", Font.PLAIN, 15));
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		
		id = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, id, 118, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, id, -83, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblId, 13, SpringLayout.NORTH, id);
		sl_panel.putConstraint(SpringLayout.EAST, lblId, -27, SpringLayout.WEST, id);
		sl_panel.putConstraint(SpringLayout.NORTH, id, 99, SpringLayout.NORTH, panel);
		panel.add(id);
		id.setFont(new Font("�޸ո���T", Font.PLAIN, 20));
		id.setColumns(10);
		
		pw = new JPasswordField();
		sl_panel.putConstraint(SpringLayout.NORTH, pw, 141, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, pw, -86, SpringLayout.SOUTH, panel);
		pw.setFont(new Font("����", Font.PLAIN, 20));
		sl_panel.putConstraint(SpringLayout.SOUTH, id, -1, SpringLayout.NORTH, pw);
		sl_panel.putConstraint(SpringLayout.WEST, pw, 118, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, pw, -83, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblPw, 11, SpringLayout.NORTH, pw);
		sl_panel.putConstraint(SpringLayout.EAST, lblPw, -28, SpringLayout.WEST, pw);
		panel.add(pw);
		
		JLabel lblTitle = new JLabel("\uC790\uBC25(JABAB)\uBA39\uC790!");
		sl_panel.putConstraint(SpringLayout.SOUTH, lblTitle, -29, SpringLayout.NORTH, id);
		sl_panel.putConstraint(SpringLayout.EAST, lblTitle, -67, SpringLayout.EAST, panel);
		panel.add(lblTitle);
		lblTitle.setFont(new Font("�޸ո���T", Font.PLAIN, 30));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnLogin = new JButton("\uB85C\uADF8\uC778");
		sl_panel.putConstraint(SpringLayout.NORTH, btnLogin, 6, SpringLayout.SOUTH, pw);
		sl_panel.putConstraint(SpringLayout.WEST, btnLogin, 222, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnLogin, -44, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnLogin, -83, SpringLayout.EAST, panel);
		panel.add(btnLogin);
		btnLogin.setBackground(new Color(255, 153, 0));
		btnLogin.addActionListener(new ActionListener() {
			/*
			 * ȸ�����Խ� StringŸ������ ���̵� inputID 
			 * �н����带 inputPwChange�� ������.
			 */

			String inputID = inputId.getText();
			char[] inputPW = inputPw.getPassword();//

			// ȸ����Ͻ� ��ĭ Ȯ��
			if (inputId.getText().equals("") || isPasswordCorrect(inputPW, passwordField.getPassword())
					|| isPasswordCorrect(inputPW, passwordField.getPassword()) || inputName.getText().equals("")
					|| inputPhonenum.getText().equals("")) {
				JOptionPane.showMessageDialog(frame, "��ĭ�� �Է����ּ���");

			}

			// ù��°, �ι�° �н����� ��ġ�ϴ��� Ȯ��
			else if (!(isPasswordCorrect(inputPw.getPassword(), inputPwCheck.getPassword()))) {
				JOptionPane.showMessageDialog(frame, "�н����尡 ��ġ���� �ʽ��ϴ�");
			} else {
				
				JOptionPane.showMessageDialog(frame, "ȸ������ ����!");
				// ���⼭ char[]�� String���� �н����� ����.
				String inputPwChange = "";
				inputPwChange = new String(inputPW, 0, inputPW.length);
				frame.dispose();
				Login login = new Login();
				login.main(null);
			}

		}

		});
		btnLogin.setFont(new Font("�޸ո���T", Font.PLAIN, 12));
		
		JButton btnJoin = new JButton("\uD68C\uC6D0\uAC00\uC785");
		sl_panel.putConstraint(SpringLayout.NORTH, btnJoin, 6, SpringLayout.SOUTH, pw);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnJoin, -44, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnJoin, -187, SpringLayout.EAST, panel);
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JoinGUI join = new JoinGUI();
				join.main(null);
				frame.dispose();
			}
		});
		sl_panel.putConstraint(SpringLayout.WEST, btnJoin, 118, SpringLayout.WEST, panel);
		panel.add(btnJoin);
		btnJoin.setBackground(new Color(51, 153, 204));
		btnJoin.setFont(new Font("�޸ո���T", Font.PLAIN, 12));
	}

	// �н����带 �˻�
	private static boolean isPasswordCorrect(char[] input) {
		boolean isCorrect = true;

		char[] correctPassword = { 'p', 'w' };

		if (input.length != correctPassword.length) {
			isCorrect = false;
		} else {
			isCorrect = Arrays.equals(input, correctPassword);
		}

		// Zero out the password.
		Arrays.fill(correctPassword, '0');

		return isCorrect;
	}
}

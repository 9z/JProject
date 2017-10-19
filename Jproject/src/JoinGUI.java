
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class JoinGUI {

	private JFrame frame;
	private BufferedImage icon;
	private JTextField inputId;
	private JTextField inputName;
	private JTextField inputPhonenum;
	private JPasswordField inputPw;
	private JPasswordField inputPwCheck;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinGUI window = new JoinGUI();
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
	public JoinGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel() {
			public void paintComponent(Graphics g) {
				try {
					File fileInSamePackage = new File("C:\\Users\\pc-11\\Desktop\\bgLogin.png");
					icon = ImageIO.read(fileInSamePackage);
					Dimension d = getSize();// 전체화면
					g.drawImage(icon, 0, 0, d.width, d.height, null);
					// setOpaque(false);
					// super.paintComponent(g);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		JLabel label = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		sl_panel.putConstraint(SpringLayout.WEST, label, 61, SpringLayout.WEST, panel);
		label.setFont(new Font("휴먼모음T", Font.PLAIN, 35));
		panel.add(label);

		JLabel lblNewLabel = new JLabel("Sign up");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 58, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 190, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, label, -20, SpringLayout.NORTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, label, -6, SpringLayout.WEST, lblNewLabel);
		lblNewLabel.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
		panel.add(lblNewLabel);

		JLabel lblId = new JLabel("\uC544\uC774\uB514");
		sl_panel.putConstraint(SpringLayout.WEST, lblId, 63, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblId, -338, SpringLayout.EAST, panel);
		lblId.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		panel.add(lblId);

		inputId = new JTextField();
		inputId.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		sl_panel.putConstraint(SpringLayout.SOUTH, lblId, -4, SpringLayout.NORTH, inputId);
		sl_panel.putConstraint(SpringLayout.NORTH, inputId, 135, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, inputId, -369, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, inputId, 63, SpringLayout.WEST, panel);
		panel.add(inputId);
		inputId.setColumns(10);

		JButton idCheck = new JButton("\uC911\uBCF5\uAC80\uC0AC");
		idCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// id중복검사
				if (inputId.getText().equals("")) {
					JOptionPane.showMessageDialog(frame, "아이디를 입력해주세요");
				} else if (inputId.getText().equals("id")) {
					JOptionPane.showMessageDialog(frame, "이미 사용중인 아이디 입니다.");
				} else {
					JOptionPane.showMessageDialog(frame, "아이디로 사용가능합니다");

				}
			}
		});
		idCheck.setBackground(new Color(192, 192, 192));
		idCheck.setFont(new Font("휴먼모음T", Font.PLAIN, 10));
		sl_panel.putConstraint(SpringLayout.EAST, inputId, -17, SpringLayout.WEST, idCheck);
		sl_panel.putConstraint(SpringLayout.NORTH, idCheck, 134, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, idCheck, 290, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, idCheck, -370, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, idCheck, -63, SpringLayout.EAST, panel);
		panel.add(idCheck);

		JLabel pw = new JLabel("\uBE44\uBC00\uBC88\uD638");
		sl_panel.putConstraint(SpringLayout.NORTH, pw, 6, SpringLayout.SOUTH, inputId);
		sl_panel.putConstraint(SpringLayout.WEST, pw, 0, SpringLayout.WEST, lblId);
		pw.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		panel.add(pw);

		JLabel PwCheck = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		sl_panel.putConstraint(SpringLayout.NORTH, PwCheck, 45, SpringLayout.SOUTH, pw);
		sl_panel.putConstraint(SpringLayout.WEST, PwCheck, 0, SpringLayout.WEST, lblId);
		PwCheck.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		panel.add(PwCheck);

		JLabel checkMessage = new JLabel(
				"\uBE44\uBC00\uBC88\uD638 \uD655\uC778\uC744 \uC704\uD574 \uB2E4\uC2DC\uD55C\uBC88 \uC785\uB825\uD574\uC8FC\uC138\uC694");
		sl_panel.putConstraint(SpringLayout.EAST, checkMessage, 0, SpringLayout.EAST, idCheck);
		checkMessage.setFont(new Font("함초롬돋움", Font.PLAIN, 11));
		panel.add(checkMessage);

		JLabel label_4 = new JLabel("\uC774\uB984");
		sl_panel.putConstraint(SpringLayout.NORTH, label_4, 66, SpringLayout.SOUTH, PwCheck);
		sl_panel.putConstraint(SpringLayout.WEST, label_4, 0, SpringLayout.WEST, lblId);
		label_4.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		panel.add(label_4);

		inputName = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, inputName, 6, SpringLayout.SOUTH, label_4);
		sl_panel.putConstraint(SpringLayout.WEST, inputName, 0, SpringLayout.WEST, lblId);
		sl_panel.putConstraint(SpringLayout.SOUTH, inputName, 39, SpringLayout.SOUTH, label_4);
		sl_panel.putConstraint(SpringLayout.EAST, inputName, 0, SpringLayout.EAST, idCheck);
		inputName.setColumns(10);
		panel.add(inputName);

		JLabel label_5 = new JLabel("\uC804\uD654\uBC88\uD638");
		sl_panel.putConstraint(SpringLayout.NORTH, label_5, 6, SpringLayout.SOUTH, inputName);
		sl_panel.putConstraint(SpringLayout.EAST, label_5, 0, SpringLayout.EAST, pw);
		label_5.setFont(new Font("휴먼모음T", Font.PLAIN, 13));
		panel.add(label_5);

		inputPhonenum = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, inputPhonenum, 6, SpringLayout.SOUTH, label_5);
		sl_panel.putConstraint(SpringLayout.WEST, inputPhonenum, 0, SpringLayout.WEST, lblId);
		sl_panel.putConstraint(SpringLayout.SOUTH, inputPhonenum, -102, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, inputPhonenum, 0, SpringLayout.EAST, idCheck);
		inputPhonenum.setColumns(10);
		panel.add(inputPhonenum);

		JButton button = new JButton("\uD68C\uC6D0\uAC00\uC785");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 회원등록시 빈칸 확인
				if (inputId.getText().equals("")
						|| isPasswordCorrect(inputPw.getPassword(), passwordField.getPassword())
						|| isPasswordCorrect(inputPw.getPassword(), passwordField.getPassword())
						|| inputName.getText().equals("") || inputPhonenum.getText().equals("")) {
					JOptionPane.showMessageDialog(frame, "빈칸을 입력해주세요");

				}

				// 첫번째, 두번째 패스워드 일치하는지 확인
				else if (!(isPasswordCorrect(inputPw.getPassword(), inputPwCheck.getPassword()))) {
					JOptionPane.showMessageDialog(frame, "패스워드가 일치하지 않습니다");
				} else {

					JOptionPane.showMessageDialog(frame, "회원가입 성공!");
					frame.dispose();
					LoginGUI login = new LoginGUI();
					login.main(null);
				}

			}

		});
		button.setBackground(new Color(0, 191, 255));
		sl_panel.putConstraint(SpringLayout.NORTH, button, 30, SpringLayout.SOUTH, inputPhonenum);
		sl_panel.putConstraint(SpringLayout.WEST, button, 126, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, button, 63, SpringLayout.SOUTH, inputPhonenum);
		sl_panel.putConstraint(SpringLayout.EAST, button, -219, SpringLayout.EAST, panel);
		button.setFont(new Font("휴먼모음T", Font.PLAIN, 10));
		panel.add(button);

		JButton button_1 = new JButton("\uAC00\uC785\uCDE8\uC18C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				LoginGUI login = new LoginGUI();
				login.main(null);

			}
		});
		button_1.setBackground(new Color(205, 92, 92));
		sl_panel.putConstraint(SpringLayout.NORTH, button_1, 30, SpringLayout.SOUTH, inputPhonenum);
		sl_panel.putConstraint(SpringLayout.WEST, button_1, 19, SpringLayout.EAST, button);
		sl_panel.putConstraint(SpringLayout.SOUTH, button_1, -39, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, button_1, -111, SpringLayout.EAST, panel);
		button_1.setFont(new Font("휴먼모음T", Font.PLAIN, 10));
		panel.add(button_1);

		inputPw = new JPasswordField();
		sl_panel.putConstraint(SpringLayout.NORTH, checkMessage, 67, SpringLayout.SOUTH, inputPw);
		sl_panel.putConstraint(SpringLayout.NORTH, inputPw, 6, SpringLayout.SOUTH, pw);
		sl_panel.putConstraint(SpringLayout.WEST, inputPw, 63, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, inputPw, -6, SpringLayout.NORTH, PwCheck);
		sl_panel.putConstraint(SpringLayout.EAST, inputPw, 0, SpringLayout.EAST, idCheck);
		panel.add(inputPw);

		inputPwCheck = new JPasswordField();
		inputPwCheck.addKeyListener(new KeyAdapter() {

		});
		inputPwCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, inputPwCheck, 6, SpringLayout.SOUTH, PwCheck);
		sl_panel.putConstraint(SpringLayout.WEST, inputPwCheck, 61, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, inputPwCheck, -6, SpringLayout.NORTH, checkMessage);
		sl_panel.putConstraint(SpringLayout.EAST, inputPwCheck, 0, SpringLayout.EAST, idCheck);
		panel.add(inputPwCheck);

		JLabel label_1 = new JLabel("( - )\uB97C \uC81C\uC678\uD558\uACE0 \uC785\uB825\uD574\uC8FC\uC138\uC694");
		sl_panel.putConstraint(SpringLayout.NORTH, label_1, 0, SpringLayout.NORTH, label_5);
		sl_panel.putConstraint(SpringLayout.WEST, label_1, 6, SpringLayout.EAST, label_5);
		label_1.setFont(new Font("함초롬돋움", Font.PLAIN, 11));
		panel.add(label_1);

		passwordField = new JPasswordField();
		sl_panel.putConstraint(SpringLayout.NORTH, passwordField, 30, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, passwordField, -1, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, passwordField, -10, SpringLayout.EAST, panel);
		panel.add(passwordField);
	}

	// 패스워드 검사하는 메소드
	private static boolean isPasswordCorrect(char[] input, char[] inputCheck) {
		boolean isCorrect = true;
		char[] correctPassword = inputCheck;

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

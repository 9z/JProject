import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;

import img.a;

public class MainGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
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
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 601, 355);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 585, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);

		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.NORTH, panel_1);
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 235, SpringLayout.NORTH, frame.getContentPane());
		panel_1.setBackground(UIManager.getColor("info"));
		panel.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("");
		String path = a.class.getResource("").getPath(); // 현재 클래스의 절대 경로를 가져온다.
		//System.out.println(path); // --> 절대 경로가 출력됨
		
		lblNewLabel_1.setIcon(new ImageIcon(
				((new ImageIcon(path+"food.jpg")).getImage()).getScaledInstance(600, 240, java.awt.Image.SCALE_SMOOTH)));
		
		panel.add(lblNewLabel_1, "name_6161457944664");
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));

		JButton button = new JButton("\uC8FC\uBB38\uD604\uD669");
		button.setForeground(Color.BLACK);
		button.setBackground(new Color(240, 255, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				OrderStateGUI order = new OrderStateGUI();
				order.main(null);

			}
		});

		JButton button_1 = new JButton("\uBA54 \uB274");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MenuGUI menu = new MenuGUI();
				menu.main(null);

			}
		});
		button_1.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD, 25));
		button_1.setBackground(new Color(240, 255, 255));
		panel_1.add(button_1);
		button.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD, 25));
		panel_1.add(button);

		JButton btnNewButton_2 = new JButton("\uC0AC\uC6A9\uC790\uC815\uBCF4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnNewButton_2.setBackground(new Color(240, 255, 255));
		btnNewButton_2.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD, 25));
		panel_1.add(btnNewButton_2);

		JButton button_2 = new JButton("\uC885 \uB8CC");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();

			}
		});
		button_2.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD, 25));
		button_2.setBackground(new Color(240, 255, 255));
		panel_1.add(button_2);
	}
}

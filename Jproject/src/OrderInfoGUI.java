import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import img.a;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class OrderInfoGUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderInfoGUI window = new OrderInfoGUI();
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
	public OrderInfoGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 240));
		frame.setBounds(100, 100, 463, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 33, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 447, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -134, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 447, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 6, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -51, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_3, 0, SpringLayout.EAST, panel);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 192, 203));
		panel_3.add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\uC5C5\uCCB4 \uBC88\uD638");
		lblNewLabel_2.setFont(new Font("휴먼모음T", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_2, "name_16589301644650");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("-");
		lblNewLabel_1.setFont(new Font("휴먼모음T", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_1, "name_16594803385774");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 192, 203));
		panel_3.add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\uCD1D \uAE08 \uC561");
		lblNewLabel.setFont(new Font("휴먼모음T", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel, "name_16592649832679");
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_7);
		panel_7.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("-");
		lblNewLabel_3.setFont(new Font("휴먼모음T", Font.BOLD, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_3, "name_16596710160764");
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, panel_1);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, "name_23050452314687");
		
		table = new JTable();
		scrollPane.setViewportView(table);
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -378, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 122, SpringLayout.WEST, frame.getContentPane());
		panel_1.setBackground(new Color(255, 255, 255));
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 192, 203));
		panel.add(panel_8);
		
		JLabel lblNewLabel_5 = new JLabel("\uD68C \uC6D0 \uBA85");
		panel_8.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 255));
		panel.add(panel_9);
		
		JLabel lblNewLabel_6 = new JLabel("-");
		panel_9.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("휴먼모음T", Font.BOLD, 13));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 192, 203));
		panel.add(panel_10);
		
		JLabel lblNewLabel_7 = new JLabel("\uBC88 \uD638");
		panel_10.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 255));
		panel.add(panel_11);
		
		JLabel lblNewLabel_8 = new JLabel("-");
		panel_11.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("휴먼모음T", Font.BOLD, 13));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("\uC5C5 \uCCB4 \uBA85");
		lblNewLabel_4.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_4, "name_16634335525938");
		
		JPanel panel_12 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_12, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_12, 72, SpringLayout.EAST, panel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_12, -378, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_12, 0, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_12);
		panel_12.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(255, 182, 193));
		panel_12.add(panel_13);
		panel_13.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("\uACB0 \uC81C \uC790");
		lblNewLabel_9.setFont(new Font("휴먼모음T", Font.BOLD, 13));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_9, "name_17493958361230");
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(255, 255, 255));
		panel_12.add(panel_14);
		panel_14.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("\uACB0\uC81C\uC790\uC774\uB984");
		lblNewLabel_10.setFont(new Font("휴먼모음T", Font.BOLD, 13));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_10, "name_17496141961698");
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_15, 6, SpringLayout.SOUTH, panel_3);
		springLayout.putConstraint(SpringLayout.WEST, panel_15, -58, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_15, 41, SpringLayout.SOUTH, panel_3);
		springLayout.putConstraint(SpringLayout.EAST, panel_15, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_15);
		panel_15.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
			}
		});
		String path = a.class.getResource("").getPath(); // 현재 클래스의 절대 경로를 가져온다.
		//System.out.println(path); // --> 절대 경로가 출력됨
		
		btnNewButton.setIcon(new ImageIcon(((new ImageIcon(path + "end.jpg")).getImage()).getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH)));
		panel_15.add(btnNewButton, "name_19972328595551");
	}

}

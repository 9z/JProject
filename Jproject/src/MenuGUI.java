import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Label;

public class MenuGUI {

	
	private JFrame frame;
	private JTable table;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuGUI window = new MenuGUI();
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
	public MenuGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1036, 627);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		// JPanel pan_bell = new JPanel();
		// tabp.addTab("Coffee & Latte", null, pan_bell, null);
		// pan_bell.setLayout(new GridLayout(4, 5, 0, 0));

		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		panel.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(panel);

		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, panel, -6, SpringLayout.WEST, panel_1);
		panel_1.setBackground(new Color(245, 245, 245));
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 798, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_1);

		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 338, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 6, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, -10, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -6, SpringLayout.NORTH, panel_2);
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 9, SpringLayout.SOUTH, panel_3);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -504, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 10, SpringLayout.NORTH, frame.getContentPane());
		panel_3.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 6, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_3, -10, SpringLayout.EAST, frame.getContentPane());
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		sl_panel.putConstraint(SpringLayout.NORTH, tabbedPane, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, tabbedPane, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, tabbedPane, 569, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, tabbedPane, 782, SpringLayout.WEST, panel);
		tabbedPane.setBackground(Color.WHITE);
		panel.add(tabbedPane);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(new GridLayout(4, 5, 0, 0));

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_4.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_24 = new JButton("New button");

		btnNewButton_24.setIcon(new ImageIcon(((new ImageIcon("D://abc.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ol = new OrderList(LoginGUI.this.tt.getNowTime(), "ÇÑ¼Ü", "°í±â°í±âµµ½Ã¶ô", 3600, LoginGUI.this.userName, LoginGUI.this.userID);
			}
		});
		panel_8.add(btnNewButton_24);

		JLabel lblNewLabel_5 = new JLabel(
				"<html>\uACE0\uAE30\uACE0\uAE30\uB3C4\uC2DC\uB77D<br>     3,600\uC6D0<br></html>");
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_5, BorderLayout.SOUTH);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_4.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon(((new ImageIcon("D://two.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_9.add(btnNewButton);

		JLabel lblNewLabel_6 = new JLabel(
				"<html>\uCE60\uB9AC\uD3EC\uD06C\uB3C4\uC2DC\uB77D<br>     3,600\uC6D0<br></html>");
		lblNewLabel_6.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_6, BorderLayout.SOUTH);

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_4.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon(((new ImageIcon("D://c.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_10.add(btnNewButton_1);

		JLabel lblNewLabel_7 = new JLabel("<html>\uB3C8\uAE4C\uC2A4\uB3C4\uB828\uB2D8<br>     3,600\uC6D0<br></html>");
		lblNewLabel_7.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_7, BorderLayout.SOUTH);

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_4.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon(((new ImageIcon("D://d.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_11.add(btnNewButton_2);

		JLabel lblNewLabel_8 = new JLabel(
				"<html>\uB514\uB7ED\uC2A4\uC81C\uC721\uBCF6\uC74C<br>     3,500\uC6D0<br></html>");
		lblNewLabel_8.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_8, BorderLayout.SOUTH);

		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_4.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(new ImageIcon(((new ImageIcon("D://e.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_14.add(btnNewButton_3);

		JLabel lblNewLabel_9 = new JLabel("<html>\uAE50\uD48D\uAE30\uB3C4\uC2DC\uB77D<br>     4,300\uC6D0<br></html>");
		lblNewLabel_9.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_9, BorderLayout.SOUTH);

		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		panel_4.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setIcon(new ImageIcon(((new ImageIcon("D://f.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_12.add(btnNewButton_4);

		JLabel lblNewLabel_10 = new JLabel(
				"<html>\uCE58\uD0A8\uC81C\uC721\uB3C4\uC2DC\uB77D<br>     4,300\uC6D0<br></html>");
		lblNewLabel_10.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_10, BorderLayout.SOUTH);

		JPanel panel_26 = new JPanel();
		panel_26.setBackground(Color.WHITE);
		panel_4.add(panel_26);
		panel_26.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setIcon(new ImageIcon(((new ImageIcon("D://g.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_26.add(btnNewButton_5);

		JLabel lblNewLabel_11 = new JLabel(
				"<html>\uBD88\uACE0\uAE30\uAE40\uCE58\uBCF6\uC74C\uBC25<br>     3,700\uC6D0<br></html>");
		lblNewLabel_11.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_26.add(lblNewLabel_11, BorderLayout.SOUTH);

		JPanel panel_20 = new JPanel();
		panel_20.setBackground(Color.WHITE);
		panel_4.add(panel_20);
		panel_20.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setIcon(new ImageIcon(((new ImageIcon("D://h.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_20.add(btnNewButton_6);

		JLabel lblNewLabel_12 = new JLabel("<html>\uAC15\uB41C\uC7A5\uBE44\uBE54\uBC25<br>     4,500\uC6D0<br></html>");
		lblNewLabel_12.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_20.add(lblNewLabel_12, BorderLayout.SOUTH);

		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_4.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setIcon(new ImageIcon(((new ImageIcon("D://i.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_13.add(btnNewButton_7);
		
		JPanel panel_35 = new JPanel();
		panel_13.add(panel_35, BorderLayout.NORTH);

		JLabel lblNewLabel_13 = new JLabel("<html>\uC9C4\uB2EC\uB798\uB3C4\uC2DC\uB77D<br>     7,000\uC6D0<br></html>");
		lblNewLabel_13.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_13, BorderLayout.SOUTH);

		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_4.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setIcon(new ImageIcon(((new ImageIcon("D://j.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_15.add(btnNewButton_8);

		JLabel lblNewLabel_14 = new JLabel("<html>\uB9E4\uD654\uB3C4\uC2DC\uB77D<br>     10,000\uC6D0<br></html>");
		lblNewLabel_14.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_15.add(lblNewLabel_14, BorderLayout.SOUTH);

		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.WHITE);
		panel_4.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setIcon(new ImageIcon(((new ImageIcon("D://k.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_16.add(btnNewButton_9);

		JLabel lblNewLabel_15 = new JLabel("<html>\uB3C8\uAE4C\uC2A4\uB36E\uBC25<br>     3,400\uC6D0<br></html>");
		lblNewLabel_15.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel_16.add(lblNewLabel_15, BorderLayout.SOUTH);

		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_4.add(panel_17);
		panel_17.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setIcon(new ImageIcon(((new ImageIcon("D://l.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_17.add(btnNewButton_10);

		JLabel lblNewLabel_16 = new JLabel("<html>\uB3C8\uAE4C\uC2A4\uCE74\uB808<br>     3,800\uC6D0<br></html>");
		lblNewLabel_16.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		panel_17.add(lblNewLabel_16, BorderLayout.SOUTH);

		JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.WHITE);
		panel_4.add(panel_18);
		panel_18.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.setIcon(new ImageIcon(((new ImageIcon("D://m.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_18.add(btnNewButton_11);

		JLabel lblNewLabel_17 = new JLabel("<html>\uCC38\uCE58\uB9C8\uC694<br>     2,700\uC6D0<br></html>");
		lblNewLabel_17.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		panel_18.add(lblNewLabel_17, BorderLayout.SOUTH);

		JPanel panel_19 = new JPanel();
		panel_19.setBackground(Color.WHITE);
		panel_4.add(panel_19);
		panel_19.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_12 = new JButton("New button");
		btnNewButton_12.setIcon(new ImageIcon(((new ImageIcon("D://n.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_19.add(btnNewButton_12);

		JLabel lblNewLabel_18 = new JLabel("<html>\uBE45\uCE58\uD0A8\uB9C8\uC694<br>     3,300\uC6D0<br></html>");
		lblNewLabel_18.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		panel_19.add(lblNewLabel_18, BorderLayout.SOUTH);

		JPanel panel_21 = new JPanel();
		panel_21.setBackground(Color.WHITE);
		panel_4.add(panel_21);
		panel_21.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_13 = new JButton("New button");
		btnNewButton_13.setIcon(new ImageIcon(((new ImageIcon("D://o.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_21.add(btnNewButton_13);

		JLabel lblNewLabel_19 = new JLabel("<html>\uB3C8\uCE58\uB9C8\uC694<br>     3,300\uC6D0<br></html>");
		lblNewLabel_19.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		panel_21.add(lblNewLabel_19, BorderLayout.SOUTH);

		JPanel panel_22 = new JPanel();
		panel_22.setBackground(Color.WHITE);
		panel_4.add(panel_22);
		panel_22.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_14 = new JButton("New button");
		btnNewButton_14.setIcon(new ImageIcon(((new ImageIcon("D://p.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_22.add(btnNewButton_14);

		JLabel lblNewLabel_20 = new JLabel("<html>\uAE40\uCE58\uCC0C\uAC1C<br>     3,000\uC6D0<br></html>");
		lblNewLabel_20.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		panel_22.add(lblNewLabel_20, BorderLayout.SOUTH);

		JPanel panel_23 = new JPanel();
		panel_23.setBackground(Color.WHITE);
		panel_4.add(panel_23);
		panel_23.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_15 = new JButton("New button");
		btnNewButton_15.setIcon(new ImageIcon(((new ImageIcon("D://q.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_23.add(btnNewButton_15);

		JLabel lblNewLabel_21 = new JLabel("<html>\uC721\uAC1C\uC7A5<br>     3,500\uC6D0<br></html>");
		lblNewLabel_21.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		panel_23.add(lblNewLabel_21, BorderLayout.SOUTH);

		JPanel panel_24 = new JPanel();
		panel_24.setBackground(Color.WHITE);
		panel_4.add(panel_24);
		panel_24.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_16 = new JButton("New button");
		btnNewButton_16.setIcon(new ImageIcon(((new ImageIcon("D://r.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_24.add(btnNewButton_16);

		JLabel lblNewLabel_22 = new JLabel("<html>\uCE58\uD0A8\uC0D0\uB7EC\uB4DC<br>     3,600\uC6D0<br></html>");
		lblNewLabel_22.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		panel_24.add(lblNewLabel_22, BorderLayout.SOUTH);

		JPanel panel_25 = new JPanel();
		panel_25.setBackground(Color.WHITE);
		panel_4.add(panel_25);
		panel_25.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_17 = new JButton("New button");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_17.setIcon(new ImageIcon(((new ImageIcon("D://s.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_25.add(btnNewButton_17);

		JLabel lblNewLabel_23 = new JLabel("<html>\uB2ED\uAC15\uC815(\uC18C)<br>     2,500\uC6D0<br></html>");
		lblNewLabel_23.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		panel_25.add(lblNewLabel_23, BorderLayout.SOUTH);

		JPanel panel_27 = new JPanel();
		panel_27.setBackground(Color.WHITE);
		panel_4.add(panel_27);
		panel_27.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_18 = new JButton("New button");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_18.setIcon(new ImageIcon(((new ImageIcon("D://t.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_27.add(btnNewButton_18);

		JLabel lblNewLabel_24 = new JLabel("<html>\uBC18\uB2EC\uAC10\uC790\uD280\uAE40<br>     1,200\uC6D0<br></html>");
		lblNewLabel_24.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		panel_27.add(lblNewLabel_24, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_5, null);
		panel_5.setLayout(new GridLayout(4, 5, 0, 0));
		
		JPanel panel_37 = new JPanel();
		panel_5.add(panel_37);
		
		JPanel panel_38 = new JPanel();
		panel_5.add(panel_38);
		
		JPanel panel_39 = new JPanel();
		panel_5.add(panel_39);
		
		JPanel panel_40 = new JPanel();
		panel_5.add(panel_40);
		
		JPanel panel_41 = new JPanel();
		panel_5.add(panel_41);
		
		JPanel panel_42 = new JPanel();
		panel_5.add(panel_42);
		
		JPanel panel_43 = new JPanel();
		panel_5.add(panel_43);
		
		JPanel panel_44 = new JPanel();
		panel_5.add(panel_44);
		
		JPanel panel_45 = new JPanel();
		panel_5.add(panel_45);
		
		JPanel panel_46 = new JPanel();
		panel_5.add(panel_46);
		
		JPanel panel_47 = new JPanel();
		panel_5.add(panel_47);
		
		JPanel panel_48 = new JPanel();
		panel_5.add(panel_48);
		
		JPanel panel_49 = new JPanel();
		panel_5.add(panel_49);
		
		JPanel panel_50 = new JPanel();
		panel_5.add(panel_50);
		
		JPanel panel_51 = new JPanel();
		panel_5.add(panel_51);
		
		JPanel panel_52 = new JPanel();
		panel_5.add(panel_52);
		
		JPanel panel_53 = new JPanel();
		panel_5.add(panel_53);
		
		JPanel panel_54 = new JPanel();
		panel_5.add(panel_54);
		
		JPanel panel_55 = new JPanel();
		panel_5.add(panel_55);
		
		JPanel panel_56 = new JPanel();
		panel_5.add(panel_56);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_6, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_7, null);
		
		JPanel panel_34 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_34, null);
		
		JPanel panel_36 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_36, null);
		frame.getContentPane().add(panel_3);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pc-23\\Desktop\\\uD55C\uC1A5\uB3C4\uC2DC\uB77D10.18.jpg"));
		panel_3.add(lblNewLabel);
		
		JPanel panel_28 = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -7, SpringLayout.NORTH, panel_28);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(new Color(255, 215, 0));
		panel_2.add(panel_30);
				panel_30.setLayout(new CardLayout(0, 0));
		
				JLabel lblNewLabel_1 = new JLabel("\uAE08\uC561");
				panel_30.add(lblNewLabel_1, "name_22714984690603");
				lblNewLabel_1.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 17));
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_31 = new JPanel();
		panel_2.add(panel_31);
				panel_31.setLayout(new CardLayout(0, 0));
		
				JLabel lblNewLabel_2 = new JLabel("-");
				panel_31.add(lblNewLabel_2, "name_22718929763686");
				lblNewLabel_2.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 17));
				lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(new Color(255, 215, 0));
		panel_2.add(panel_32);
				panel_32.setLayout(new CardLayout(0, 0));
		
				JLabel lblNewLabel_3 = new JLabel("\uCD1D \uAE08 \uC561");
				panel_32.add(lblNewLabel_3, "name_22717258219175");
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 17));
		
		JPanel panel_33 = new JPanel();
		panel_2.add(panel_33);
				panel_33.setLayout(new CardLayout(0, 0));
		
				JLabel lblNewLabel_4 = new JLabel("-");
				panel_33.add(lblNewLabel_4, "name_22720521911662");
				lblNewLabel_4.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 17));
				lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.NORTH, panel_28, 470, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_28, -51, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_28, 6, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_28, 218, SpringLayout.EAST, panel);
		frame.getContentPane().add(panel_28);
		panel_28.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton_19 = new JButton("\uC8FC\uBB38\uD558\uAE30");
		btnNewButton_19.setBackground(Color.ORANGE);
		btnNewButton_19.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 25));
		panel_28.add(btnNewButton_19, "name_7319682871478");
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_29, 6, SpringLayout.SOUTH, panel_28);
		springLayout.putConstraint(SpringLayout.WEST, panel_29, -66, SpringLayout.EAST, panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, "name_22985429477222");
		
		table = new JTable();
		table.setBackground(new Color(245, 245, 245));
		scrollPane.setViewportView(table);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_29, 41, SpringLayout.SOUTH, panel_28);
		springLayout.putConstraint(SpringLayout.EAST, panel_29, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_29);
		panel_29.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton_20 = new JButton("");
		btnNewButton_20.setBackground(new Color(255, 255, 255));
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
			}
		});
		btnNewButton_20.setIcon(new ImageIcon(((new ImageIcon("D://end.jpg")).getImage()).getScaledInstance(50, 30, java.awt.Image.SCALE_SMOOTH)));
		panel_29.add(btnNewButton_20, "name_19255370222850");

	}
}

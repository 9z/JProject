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
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import img.a;

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
	String path;
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
		tabbedPane.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		sl_panel.putConstraint(SpringLayout.NORTH, tabbedPane, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, tabbedPane, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, tabbedPane, 569, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, tabbedPane, 782, SpringLayout.WEST, panel);
		tabbedPane.setBackground(Color.WHITE);
		panel.add(tabbedPane);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		tabbedPane.addTab("ÇÑ ¼Ü", null, panel_4, null);
		panel_4.setLayout(new GridLayout(4, 5, 0, 0));

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_4.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_24 = new JButton("New button");
		path = a.class.getResource("").getPath(); // ÇöÀç Å¬·¡½ºÀÇ Àý´ë °æ·Î¸¦ °¡Á®¿Â´Ù.
		// System.out.println(path); // --> Àý´ë °æ·Î°¡ Ãâ·ÂµÊ

		btnNewButton_24.setIcon(new ImageIcon(((new ImageIcon(path + "abc.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

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
		path = a.class.getResource("").getPath(); // ÇöÀç Å¬·¡½ºÀÇ Àý´ë °æ·Î¸¦ °¡Á®¿Â´Ù.
		// System.out.println(path); // --> Àý´ë °æ·Î°¡ Ãâ·ÂµÊ

		btnNewButton.setIcon(new ImageIcon(((new ImageIcon(path + "two.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
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
		path = a.class.getResource("").getPath(); // ÇöÀç Å¬·¡½ºÀÇ Àý´ë °æ·Î¸¦ °¡Á®¿Â´Ù.
		// System.out.println(path); // --> Àý´ë °æ·Î°¡ Ãâ·ÂµÊ

		btnNewButton_1.setIcon(new ImageIcon(
				((new ImageIcon(path + "c.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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

		btnNewButton_2.setIcon(new ImageIcon(
				((new ImageIcon(path + "d.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_3.setIcon(new ImageIcon(
				((new ImageIcon(path + "e.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_4.setIcon(new ImageIcon(
				((new ImageIcon(path + "f.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_5.setIcon(new ImageIcon(
				((new ImageIcon(path + "g.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_6.setIcon(new ImageIcon(
				((new ImageIcon(path + "h.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setIcon(new ImageIcon(
				((new ImageIcon(path + "i.jpg")).getImage()).getScaledInstance(180, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_13.add(btnNewButton_7);

		JLabel lblNewLabel_13 = new JLabel("<html>\uC9C4\uB2EC\uB798\uB3C4\uC2DC\uB77D<br>     7,000\uC6D0<br></html>");
		lblNewLabel_13.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_13, BorderLayout.SOUTH);

		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_4.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setIcon(new ImageIcon(
				((new ImageIcon(path + "j.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_9.setIcon(new ImageIcon(
				((new ImageIcon(path + "k.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_10.setIcon(new ImageIcon(
				((new ImageIcon(path + "l.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_11.setIcon(new ImageIcon(
				((new ImageIcon(path + "m.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_12.setIcon(new ImageIcon(
				((new ImageIcon(path + "n.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_13.setIcon(new ImageIcon(
				((new ImageIcon(path + "o.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_14.setIcon(new ImageIcon(
				((new ImageIcon(path + "p.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_15.setIcon(new ImageIcon(
				((new ImageIcon(path + "q.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_16.setIcon(new ImageIcon(
				((new ImageIcon(path + "r.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_17.setIcon(new ImageIcon(
				((new ImageIcon(path + "s.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_18.setIcon(new ImageIcon(
				((new ImageIcon(path + "t.jpg")).getImage()).getScaledInstance(170, 180, java.awt.Image.SCALE_SMOOTH)));
		panel_27.add(btnNewButton_18);

		JLabel lblNewLabel_24 = new JLabel("<html>\uBC18\uB2EC\uAC10\uC790\uD280\uAE40<br>     1,200\uC6D0<br></html>");
		lblNewLabel_24.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		panel_27.add(lblNewLabel_24, BorderLayout.SOUTH);

		JPanel panel_5 = new JPanel();
		// JLabel lblNewLabel = new JLabel("");
		// lblNewLabel.setIcon(new ImageIcon(((new ImageIcon(path +
		// "sinjun.jpg")).getImage()).getScaledInstance(180, 70,
		// java.awt.Image.SCALE_SMOOTH)));
		// panel_3.add(lblNewLabel);
		tabbedPane.addTab("½ÅÀü¶±ººÀÌ", null, panel_5, null);

		panel_5.setLayout(new GridLayout(4, 05, 0, 0));

		JPanel panel_37 = new JPanel();
		panel_37.setBackground(Color.WHITE);
		panel_5.add(panel_37);
		panel_37.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_21 = new JButton("");
		btnNewButton_21.setBackground(Color.WHITE);
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnNewButton_21.setIcon(new ImageIcon(((new ImageIcon(path + "da.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_37.add(btnNewButton_21, BorderLayout.CENTER);

		JLabel lblNewLabel_25 = new JLabel("<html>\uC2E0\uC804\uB5A1\uBCF6\uC774<br>     2,500\uC6D0<br></html>");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_37.add(lblNewLabel_25, BorderLayout.SOUTH);

		JPanel panel_38 = new JPanel();
		panel_38.setBackground(Color.WHITE);
		panel_5.add(panel_38);
		panel_38.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_22 = new JButton("New button");
		btnNewButton_22.setBackground(Color.WHITE);
		btnNewButton_22.setIcon(new ImageIcon(((new ImageIcon(path + "db.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_38.add(btnNewButton_22, BorderLayout.CENTER);

		JLabel lblNewLabel_26 = new JLabel("<html>\uCE58\uC988\uB5A1\uBCF6\uC774<br>     3,500\uC6D0<br></html>");
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_38.add(lblNewLabel_26, BorderLayout.SOUTH);

		JPanel panel_39 = new JPanel();
		panel_39.setBackground(Color.WHITE);
		panel_5.add(panel_39);
		panel_39.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_23 = new JButton("New button");
		btnNewButton_23.setBackground(Color.WHITE);
		btnNewButton_23.setIcon(new ImageIcon(((new ImageIcon(path + "dc.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_39.add(btnNewButton_23, BorderLayout.CENTER);

		JLabel lblNewLabel_27 = new JLabel("<html>\uC624\uB385\uD280\uAE40<br>     1,500\uC6D0<br></html>");
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_27.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_39.add(lblNewLabel_27, BorderLayout.SOUTH);

		JPanel panel_40 = new JPanel();
		panel_40.setBackground(Color.WHITE);
		panel_5.add(panel_40);
		panel_40.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_25 = new JButton("New button");
		btnNewButton_25.setBackground(Color.WHITE);
		btnNewButton_25.setIcon(new ImageIcon(((new ImageIcon(path + "dd.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_40.add(btnNewButton_25, BorderLayout.CENTER);

		JLabel lblNewLabel_28 = new JLabel("<html>\uB9CC\uB450\uD280\uAE40<br>     1,500\uC6D0<br></html>");
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_28.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_40.add(lblNewLabel_28, BorderLayout.SOUTH);

		JPanel panel_41 = new JPanel();
		panel_41.setBackground(Color.WHITE);
		panel_5.add(panel_41);
		panel_41.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_26 = new JButton("New button");
		btnNewButton_26.setBackground(Color.WHITE);
		btnNewButton_26.setIcon(new ImageIcon(((new ImageIcon(path + "de.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_41.add(btnNewButton_26, BorderLayout.CENTER);

		JLabel lblNewLabel_29 = new JLabel("<html>\uAE40\uB9D0\uC774\uD280\uAE40<br>     1,500\uC6D0<br></html>");
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_29.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_41.add(lblNewLabel_29, BorderLayout.SOUTH);

		JPanel panel_42 = new JPanel();
		panel_42.setBackground(Color.WHITE);
		panel_5.add(panel_42);
		panel_42.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_27 = new JButton("New button");
		btnNewButton_27.setBackground(Color.WHITE);
		btnNewButton_27.setIcon(new ImageIcon(((new ImageIcon(path + "df.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_42.add(btnNewButton_27, BorderLayout.CENTER);

		JLabel lblNewLabel_30 = new JLabel("<html>\uC7A1\uCC44\uB9D0\uC774\uD280\uAE40<br>     1,500\uC6D0<br></html>");
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_30.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_42.add(lblNewLabel_30, BorderLayout.SOUTH);

		JPanel panel_43 = new JPanel();
		panel_43.setBackground(Color.WHITE);
		panel_5.add(panel_43);
		panel_43.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_28 = new JButton("New button");
		btnNewButton_28.setBackground(Color.WHITE);
		btnNewButton_28.setIcon(new ImageIcon(((new ImageIcon(path + "dg.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_43.add(btnNewButton_28, BorderLayout.CENTER);

		JLabel lblNewLabel_31 = new JLabel("<html>\uCE58\uC988\uC2A4\uD2F1<br>     1,500\uC6D0<br></html>");
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_31.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_43.add(lblNewLabel_31, BorderLayout.SOUTH);

		JPanel panel_44 = new JPanel();
		panel_44.setBackground(Color.WHITE);
		panel_5.add(panel_44);
		panel_44.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_29 = new JButton("New button");
		btnNewButton_29.setBackground(Color.WHITE);
		btnNewButton_29.setIcon(new ImageIcon(((new ImageIcon(path + "dh.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_44.add(btnNewButton_29, BorderLayout.CENTER);

		JLabel lblNewLabel_32 = new JLabel("<html>\uC2E0\uC804\uAE40\uBC25<br>     2,000\uC6D0<br></html>");
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_44.add(lblNewLabel_32, BorderLayout.SOUTH);

		JPanel panel_45 = new JPanel();
		panel_45.setBackground(Color.WHITE);
		panel_5.add(panel_45);
		panel_45.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_30 = new JButton("New button");
		btnNewButton_30.setBackground(Color.WHITE);
		btnNewButton_30.setIcon(new ImageIcon(((new ImageIcon(path + "di.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_45.add(btnNewButton_30, BorderLayout.CENTER);

		JLabel lblNewLabel_33 = new JLabel("<html>\uC2A4\uD338\uB9C8\uC694\uCEF5\uBC25<br>     3,000\uC6D0<br></html>");
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_33.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_45.add(lblNewLabel_33, BorderLayout.SOUTH);

		JPanel panel_46 = new JPanel();
		panel_46.setBackground(Color.WHITE);
		panel_5.add(panel_46);
		panel_46.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_31 = new JButton("New button");
		btnNewButton_31.setBackground(Color.WHITE);
		btnNewButton_31.setIcon(new ImageIcon(((new ImageIcon(path + "dj.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_46.add(btnNewButton_31, BorderLayout.CENTER);

		JLabel lblNewLabel_34 = new JLabel("<html>\uCC38\uCE58\uB9C8\uC694\uCEF5\uBC25<br>     3,000\uC6D0<br></html>");
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_34.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_46.add(lblNewLabel_34, BorderLayout.SOUTH);

		JPanel panel_47 = new JPanel();
		panel_47.setBackground(Color.WHITE);
		panel_5.add(panel_47);
		panel_47.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_32 = new JButton("New button");
		btnNewButton_32.setBackground(Color.WHITE);
		btnNewButton_32.setIcon(new ImageIcon(((new ImageIcon(path + "dk.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_47.add(btnNewButton_32, BorderLayout.CENTER);

		JLabel lblNewLabel_35 = new JLabel("<html>\uACC4\uB780\uCC1C<br>     2,000\uC6D0<br></html>");
		lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_35.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_47.add(lblNewLabel_35, BorderLayout.SOUTH);

		JPanel panel_48 = new JPanel();
		panel_48.setBackground(Color.WHITE);
		panel_5.add(panel_48);
		panel_48.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_33 = new JButton("New button");
		btnNewButton_33.setBackground(Color.WHITE);
		btnNewButton_33.setIcon(new ImageIcon(((new ImageIcon(path + "dl.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_48.add(btnNewButton_33, BorderLayout.CENTER);

		JLabel lblNewLabel_36 = new JLabel("<html>\uC624\uB385\uD0D5<br>     3,000\uC6D0<br></html>");
		lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_36.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_48.add(lblNewLabel_36, BorderLayout.SOUTH);

		JPanel panel_49 = new JPanel();
		panel_49.setBackground(Color.WHITE);
		panel_5.add(panel_49);
		panel_49.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_34 = new JButton("New button");
		btnNewButton_34.setBackground(Color.WHITE);
		btnNewButton_34.setIcon(new ImageIcon(((new ImageIcon(path + "dm.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_49.add(btnNewButton_34, BorderLayout.CENTER);

		JLabel lblNewLabel_37 = new JLabel("<html>\uD1A0\uC2A4\uD2B8<br>     2,500\uC6D0<br></html>");
		lblNewLabel_37.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_37.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_49.add(lblNewLabel_37, BorderLayout.SOUTH);

		JPanel panel_50 = new JPanel();
		panel_50.setBackground(Color.WHITE);
		panel_5.add(panel_50);
		panel_50.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_35 = new JButton("New button");
		btnNewButton_35.setBackground(Color.WHITE);
		btnNewButton_35.setIcon(new ImageIcon(((new ImageIcon(path + "dn.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_50.add(btnNewButton_35, BorderLayout.CENTER);

		JLabel lblNewLabel_38 = new JLabel("<html>\uD325\uBE59\uC218<br>     3,000\uC6D0<br></html>");
		lblNewLabel_38.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_38.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_50.add(lblNewLabel_38, BorderLayout.SOUTH);

		JPanel panel_51 = new JPanel();
		panel_51.setBackground(Color.WHITE);
		panel_5.add(panel_51);
		panel_51.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_36 = new JButton("New button");
		btnNewButton_36.setBackground(Color.WHITE);
		btnNewButton_36.setIcon(new ImageIcon(((new ImageIcon(path + "do.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_51.add(btnNewButton_36, BorderLayout.CENTER);

		JLabel lblNewLabel_39 = new JLabel("<html>\uCFE8\uD53C\uC2A4<br>     1,500\uC6D0<br></html>");
		lblNewLabel_39.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_39.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_51.add(lblNewLabel_39, BorderLayout.SOUTH);

		JPanel panel_52 = new JPanel();
		panel_52.setBackground(Color.WHITE);
		panel_5.add(panel_52);
		panel_52.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_37 = new JButton("New button");
		btnNewButton_37.setBackground(Color.WHITE);
		btnNewButton_37.setIcon(new ImageIcon(((new ImageIcon(path + "dp.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_52.add(btnNewButton_37, BorderLayout.CENTER);

		JLabel lblNewLabel_40 = new JLabel("<html>\uCF5C\uB77C<br>     1,500\uC6D0<br></html>");
		lblNewLabel_40.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_40.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_52.add(lblNewLabel_40, BorderLayout.SOUTH);

		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Áß±¹Áý", null, panel_6, null);
		panel_6.setLayout(new GridLayout(4, 5, 0, 0));

		JPanel panel_54 = new JPanel();
		panel_54.setBackground(Color.WHITE);
		panel_6.add(panel_54);
		panel_54.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_38 = new JButton("");
		btnNewButton_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_38.setBackground(Color.WHITE);
		btnNewButton_38.setIcon(new ImageIcon(((new ImageIcon(path + "ja.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_54.add(btnNewButton_38, BorderLayout.CENTER);

		JLabel lblNewLabel_41 = new JLabel("<html>\uC9DC\uC7A5\uBA74<br>     3,500\uC6D0<br></html>");
		lblNewLabel_41.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_41.setHorizontalAlignment(SwingConstants.CENTER);
		panel_54.add(lblNewLabel_41, BorderLayout.SOUTH);

		JPanel panel_55 = new JPanel();
		panel_55.setBackground(Color.WHITE);
		panel_6.add(panel_55);
		panel_55.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_39 = new JButton("");
		btnNewButton_39.setBackground(Color.WHITE);
		btnNewButton_39.setIcon(new ImageIcon(((new ImageIcon(path + "jb.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_55.add(btnNewButton_39, BorderLayout.CENTER);

		JLabel lblNewLabel_42 = new JLabel("<html>\uC6B0\uB3D9<br>     6,000\uC6D0<br></html>");
		lblNewLabel_42.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_42.setHorizontalAlignment(SwingConstants.CENTER);
		panel_55.add(lblNewLabel_42, BorderLayout.SOUTH);

		JPanel panel_56 = new JPanel();
		panel_56.setBackground(Color.WHITE);
		panel_6.add(panel_56);
		panel_56.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_40 = new JButton("");
		btnNewButton_40.setBackground(Color.WHITE);
		btnNewButton_40.setIcon(new ImageIcon(((new ImageIcon(path + "jc.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_56.add(btnNewButton_40, BorderLayout.CENTER);

		JLabel lblNewLabel_43 = new JLabel("<html>\uC9EC\uBF55<br>     6,000\uC6D0<br></html>");
		lblNewLabel_43.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_43.setHorizontalAlignment(SwingConstants.CENTER);
		panel_56.add(lblNewLabel_43, BorderLayout.SOUTH);

		JPanel panel_57 = new JPanel();
		panel_57.setBackground(Color.WHITE);
		panel_6.add(panel_57);
		panel_57.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_41 = new JButton("");
		btnNewButton_41.setBackground(Color.WHITE);
		btnNewButton_41.setIcon(new ImageIcon(((new ImageIcon(path + "jd.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_57.add(btnNewButton_41, BorderLayout.CENTER);

		JLabel lblNewLabel_44 = new JLabel("<html>\uAC04\uC9DC\uC7A5<br>     6,000\uC6D0<br></html>");
		lblNewLabel_44.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_44.setHorizontalAlignment(SwingConstants.CENTER);
		panel_57.add(lblNewLabel_44, BorderLayout.SOUTH);

		JPanel panel_58 = new JPanel();
		panel_58.setBackground(Color.WHITE);
		panel_6.add(panel_58);
		panel_58.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_42 = new JButton("");
		btnNewButton_42.setBackground(Color.WHITE);
		btnNewButton_42.setIcon(new ImageIcon(((new ImageIcon(path + "je.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_58.add(btnNewButton_42, BorderLayout.CENTER);

		JLabel lblNewLabel_45 = new JLabel("<html>\uC6B8 \uBA74<br>     6,500\uC6D0<br></html>");
		lblNewLabel_45.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_45.setHorizontalAlignment(SwingConstants.CENTER);
		panel_58.add(lblNewLabel_45, BorderLayout.SOUTH);

		JPanel panel_59 = new JPanel();
		panel_59.setBackground(Color.WHITE);
		panel_6.add(panel_59);
		panel_59.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_43 = new JButton("");
		btnNewButton_43.setBackground(Color.WHITE);
		btnNewButton_43.setIcon(new ImageIcon(((new ImageIcon(path + "jf.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_59.add(btnNewButton_43, BorderLayout.CENTER);

		JLabel lblNewLabel_46 = new JLabel("<html>\uACE0\uCD94\uC9EC\uBF55<br>     8,000\uC6D0<br></html>");
		lblNewLabel_46.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_46.setHorizontalAlignment(SwingConstants.CENTER);
		panel_59.add(lblNewLabel_46, BorderLayout.SOUTH);

		JPanel panel_60 = new JPanel();
		panel_60.setBackground(Color.WHITE);
		panel_6.add(panel_60);
		panel_60.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_44 = new JButton("");
		btnNewButton_44.setBackground(Color.WHITE);
		btnNewButton_44.setIcon(new ImageIcon(((new ImageIcon(path + "jg.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_60.add(btnNewButton_44, BorderLayout.CENTER);

		JLabel lblNewLabel_47 = new JLabel("<html>\uC0BC\uC120\uC9DC\uC7A5\uBA74<br>     8,000\uC6D0<br></html>");
		lblNewLabel_47.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_47.setHorizontalAlignment(SwingConstants.CENTER);
		panel_60.add(lblNewLabel_47, BorderLayout.SOUTH);

		JPanel panel_61 = new JPanel();
		panel_61.setBackground(Color.WHITE);
		panel_6.add(panel_61);
		panel_61.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_45 = new JButton("");
		btnNewButton_45.setBackground(Color.WHITE);
		btnNewButton_45.setIcon(new ImageIcon(((new ImageIcon(path + "jh.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_61.add(btnNewButton_45, BorderLayout.CENTER);

		JLabel lblNewLabel_48 = new JLabel("<html>\uAE30\uC2A4\uBA74<br>     8,000\uC6D0<br></html>");
		lblNewLabel_48.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_48.setHorizontalAlignment(SwingConstants.CENTER);
		panel_61.add(lblNewLabel_48, BorderLayout.SOUTH);

		JPanel panel_62 = new JPanel();
		panel_62.setBackground(Color.WHITE);
		panel_6.add(panel_62);
		panel_62.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_46 = new JButton("");
		btnNewButton_46.setBackground(Color.WHITE);
		btnNewButton_46.setIcon(new ImageIcon(((new ImageIcon(path + "ji.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_62.add(btnNewButton_46, BorderLayout.CENTER);

		JLabel lblNewLabel_49 = new JLabel("<html>\uC7C1\uBC18\uC9DC\uC7A5<br>     13,000\uC6D0<br></html>");
		lblNewLabel_49.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_49.setHorizontalAlignment(SwingConstants.CENTER);
		panel_62.add(lblNewLabel_49, BorderLayout.SOUTH);

		JPanel panel_63 = new JPanel();
		panel_63.setBackground(Color.WHITE);
		panel_6.add(panel_63);
		panel_63.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_47 = new JButton("");
		btnNewButton_47.setBackground(Color.WHITE);
		btnNewButton_47.setIcon(new ImageIcon(((new ImageIcon(path + "jj.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_63.add(btnNewButton_47, BorderLayout.CENTER);

		JLabel lblNewLabel_50 = new JLabel("<html>\uC7C1\uBC18\uC9EC\uBF55<br>     13,000\uC6D0<br></html>");
		lblNewLabel_50.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_50.setHorizontalAlignment(SwingConstants.CENTER);
		panel_63.add(lblNewLabel_50, BorderLayout.SOUTH);

		JPanel panel_64 = new JPanel();
		panel_64.setBackground(Color.WHITE);
		panel_6.add(panel_64);
		panel_64.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_48 = new JButton("");
		btnNewButton_48.setBackground(Color.WHITE);
		btnNewButton_48.setIcon(new ImageIcon(((new ImageIcon(path + "jk.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_64.add(btnNewButton_48, BorderLayout.CENTER);

		JLabel lblNewLabel_51 = new JLabel("<html>\uD0D5\uC218\uC721<br>     25,000\uC6D0<br></html>");
		lblNewLabel_51.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_51.setHorizontalAlignment(SwingConstants.CENTER);
		panel_64.add(lblNewLabel_51, BorderLayout.SOUTH);

		JPanel panel_65 = new JPanel();
		panel_65.setBackground(Color.WHITE);
		panel_6.add(panel_65);
		panel_65.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_49 = new JButton("");
		btnNewButton_49.setBackground(Color.WHITE);
		btnNewButton_49.setIcon(new ImageIcon(((new ImageIcon(path + "jl.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_65.add(btnNewButton_49, BorderLayout.CENTER);

		JLabel lblNewLabel_52 = new JLabel("<html>\uD314\uBCF4\uCC44<br>     30,000\uC6D0<br></html>");
		lblNewLabel_52.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_52.setHorizontalAlignment(SwingConstants.CENTER);
		panel_65.add(lblNewLabel_52, BorderLayout.SOUTH);

		JPanel panel_66 = new JPanel();
		panel_66.setBackground(Color.WHITE);
		panel_6.add(panel_66);
		panel_66.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_50 = new JButton("");
		btnNewButton_50.setBackground(Color.WHITE);
		btnNewButton_50.setIcon(new ImageIcon(((new ImageIcon(path + "jm.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_66.add(btnNewButton_50, BorderLayout.CENTER);

		JLabel lblNewLabel_53 = new JLabel("<html>\uB09C\uC790\uC644\uC2A4<br>     30,000\uC6D0<br></html>");
		lblNewLabel_53.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_53.setHorizontalAlignment(SwingConstants.CENTER);
		panel_66.add(lblNewLabel_53, BorderLayout.SOUTH);

		JPanel panel_67 = new JPanel();
		panel_67.setBackground(Color.WHITE);
		panel_6.add(panel_67);
		panel_67.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_51 = new JButton("");
		btnNewButton_51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_51.setBackground(Color.WHITE);
		btnNewButton_51.setIcon(new ImageIcon(((new ImageIcon(path + "jn.png")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_67.add(btnNewButton_51, BorderLayout.CENTER);

		JLabel lblNewLabel_54 = new JLabel("<html>\uAE50\uD48D\uAE30<br>     30,000\uC6D0<br></html>");
		lblNewLabel_54.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_54.setHorizontalAlignment(SwingConstants.CENTER);
		panel_67.add(lblNewLabel_54, BorderLayout.SOUTH);

		JPanel panel_68 = new JPanel();
		panel_68.setBackground(Color.WHITE);
		panel_6.add(panel_68);
		panel_68.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_52 = new JButton("");
		btnNewButton_52.setBackground(Color.WHITE);
		btnNewButton_52.setIcon(new ImageIcon(((new ImageIcon(path + "jo.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_68.add(btnNewButton_52, BorderLayout.CENTER);

		JLabel lblNewLabel_55 = new JLabel("<html>\uC591\uC7A5\uD53C<br>     25,000\uC6D0<br></html>");
		lblNewLabel_55.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_55.setHorizontalAlignment(SwingConstants.CENTER);
		panel_68.add(lblNewLabel_55, BorderLayout.SOUTH);

		JPanel panel_69 = new JPanel();
		panel_69.setBackground(Color.WHITE);
		panel_6.add(panel_69);
		panel_69.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_53 = new JButton("");
		btnNewButton_53.setBackground(Color.WHITE);
		btnNewButton_53.setIcon(new ImageIcon(((new ImageIcon(path + "jp.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_69.add(btnNewButton_53, BorderLayout.CENTER);

		JLabel lblNewLabel_56 = new JLabel("<html>\uC624\uBBC0\uB77C\uC774\uC2A4<br>     7,000\uC6D0<br></html>");
		lblNewLabel_56.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_56.setHorizontalAlignment(SwingConstants.CENTER);
		panel_69.add(lblNewLabel_56, BorderLayout.SOUTH);

		JPanel panel_70 = new JPanel();
		panel_70.setBackground(Color.WHITE);
		panel_6.add(panel_70);
		panel_70.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_54 = new JButton("");
		btnNewButton_54.setBackground(Color.WHITE);
		btnNewButton_54.setIcon(new ImageIcon(((new ImageIcon(path + "jq.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_70.add(btnNewButton_54, BorderLayout.CENTER);

		JLabel lblNewLabel_57 = new JLabel("<html>\uC7A1\uCC44\uBC25<br>     7,000\uC6D0<br></html>");
		lblNewLabel_57.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_57.setHorizontalAlignment(SwingConstants.CENTER);
		panel_70.add(lblNewLabel_57, BorderLayout.SOUTH);

		JPanel panel_71 = new JPanel();
		panel_71.setBackground(Color.WHITE);
		panel_6.add(panel_71);
		panel_71.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_55 = new JButton("");
		btnNewButton_55.setBackground(Color.WHITE);
		btnNewButton_55.setIcon(new ImageIcon(((new ImageIcon(path + "jr.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_71.add(btnNewButton_55, BorderLayout.CENTER);

		JLabel lblNewLabel_58 = new JLabel("<html>\uBCF6\uC74C\uBC25<br>     6,000\uC6D0<br></html>");
		lblNewLabel_58.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_58.setHorizontalAlignment(SwingConstants.CENTER);
		panel_71.add(lblNewLabel_58, BorderLayout.SOUTH);

		JPanel panel_72 = new JPanel();
		panel_72.setBackground(Color.WHITE);
		panel_6.add(panel_72);
		panel_72.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_56 = new JButton("");
		btnNewButton_56.setBackground(Color.WHITE);
		btnNewButton_56.setIcon(new ImageIcon(((new ImageIcon(path + "js.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_72.add(btnNewButton_56, BorderLayout.CENTER);

		JLabel lblNewLabel_59 = new JLabel("<html>\uC9DC\uC7A5\uBC25<br>     6,500\uC6D0<br></html>");
		lblNewLabel_59.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_59.setHorizontalAlignment(SwingConstants.CENTER);
		panel_72.add(lblNewLabel_59, BorderLayout.SOUTH);

		JPanel panel_53 = new JPanel();
		panel_53.setBackground(Color.WHITE);
		panel_6.add(panel_53);
		panel_53.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_57 = new JButton("");
		btnNewButton_57.setBackground(Color.WHITE);
		btnNewButton_57.setIcon(new ImageIcon(((new ImageIcon(path + "jt.jpg")).getImage()).getScaledInstance(170, 180,
				java.awt.Image.SCALE_SMOOTH)));
		panel_53.add(btnNewButton_57, BorderLayout.CENTER);

		JLabel lblNewLabel_60 = new JLabel("<html>\uAD6D\uBC25<br>     6,000\uC6D0<br></html>");
		lblNewLabel_60.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_60.setHorizontalAlignment(SwingConstants.CENTER);
		panel_53.add(lblNewLabel_60, BorderLayout.SOUTH);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		tabbedPane.addTab("¸¾½ºÅÍÄ¡", null, panel_7, null);
		panel_7.setLayout(new GridLayout(4, 5, 0, 0));

		JPanel panel_35 = new JPanel();
		panel_35.setBackground(Color.WHITE);
		panel_7.add(panel_35);
		panel_35.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_58 = new JButton("");
		btnNewButton_58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_58.setIcon(new ImageIcon(((new ImageIcon(path + "ma.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_58.setBackground(Color.WHITE);
		panel_35.add(btnNewButton_58, BorderLayout.CENTER);

		JLabel lblNewLabel_61 = new JLabel("<html>\uB525\uCE58\uC988\uBC84\uAC70<br>     5,900\uC6D0<br></html>");
		lblNewLabel_61.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_61.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_35.add(lblNewLabel_61, BorderLayout.SOUTH);

		JPanel panel_73 = new JPanel();
		panel_73.setBackground(Color.WHITE);
		panel_7.add(panel_73);
		panel_73.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_59 = new JButton("");
		btnNewButton_59.setIcon(new ImageIcon(((new ImageIcon(path + "mb.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_59.setBackground(Color.WHITE);
		panel_73.add(btnNewButton_59, BorderLayout.CENTER);

		JLabel lblNewLabel_62 = new JLabel("<html>\uBD88\uC2F8\uC774\uBC84\uAC70<br>     5,500\uC6D0<br></html>");
		lblNewLabel_62.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_62.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_73.add(lblNewLabel_62, BorderLayout.SOUTH);

		JPanel panel_74 = new JPanel();
		panel_74.setBackground(Color.WHITE);
		panel_7.add(panel_74);
		panel_74.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_60 = new JButton("");
		btnNewButton_60.setIcon(new ImageIcon(((new ImageIcon(path + "mc.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_60.setBackground(Color.WHITE);
		panel_74.add(btnNewButton_60, BorderLayout.CENTER);

		JLabel lblNewLabel_63 = new JLabel(
				"<html>\uBD88\uAC08\uBE44\uCE58\uD0A8\uBC84\uAC70<br>     4,900\uC6D0<br></html>");
		lblNewLabel_63.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_63.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_74.add(lblNewLabel_63, BorderLayout.SOUTH);

		JPanel panel_75 = new JPanel();
		panel_75.setBackground(Color.WHITE);
		panel_7.add(panel_75);
		panel_75.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_61 = new JButton("");
		btnNewButton_61.setIcon(new ImageIcon(((new ImageIcon(path + "md.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_61.setBackground(Color.WHITE);
		panel_75.add(btnNewButton_61, BorderLayout.CENTER);

		JLabel lblNewLabel_64 = new JLabel("<html>\uB9AC\uC0D0\uBC84\uAC70<br>     5,900\uC6D0<br></html>");
		lblNewLabel_64.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_64.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_75.add(lblNewLabel_64, BorderLayout.SOUTH);

		JPanel panel_76 = new JPanel();
		panel_76.setBackground(Color.WHITE);
		panel_7.add(panel_76);
		panel_76.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_62 = new JButton("");
		btnNewButton_62.setIcon(new ImageIcon(((new ImageIcon(path + "me.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_62.setBackground(Color.WHITE);
		panel_76.add(btnNewButton_62, BorderLayout.CENTER);

		JLabel lblNewLabel_65 = new JLabel(
				"<html>\uD654\uC774\uD2B8\uAC08\uB9AD\uBC84\uAC70<br>     5,900\uC6D0<br></html>");
		lblNewLabel_65.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_65.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_76.add(lblNewLabel_65, BorderLayout.SOUTH);

		JPanel panel_77 = new JPanel();
		panel_77.setBackground(Color.WHITE);
		panel_7.add(panel_77);
		panel_77.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_63 = new JButton("New button");
		btnNewButton_63.setIcon(new ImageIcon(((new ImageIcon(path + "mf.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_63.setBackground(Color.WHITE);
		panel_77.add(btnNewButton_63, BorderLayout.CENTER);

		JLabel lblNewLabel_66 = new JLabel(
				"<html>\uCE7C\uC298\uD50C\uB7EC\uC2A4\uBC84\uAC70<br>     5,600\uC6D0<br></html>");
		lblNewLabel_66.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_66.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_77.add(lblNewLabel_66, BorderLayout.SOUTH);

		JPanel panel_78 = new JPanel();
		panel_78.setBackground(Color.WHITE);
		panel_7.add(panel_78);
		panel_78.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_64 = new JButton("");
		btnNewButton_64.setIcon(new ImageIcon(((new ImageIcon(path + "mg.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_64.setBackground(Color.WHITE);
		panel_78.add(btnNewButton_64, BorderLayout.CENTER);

		JLabel lblNewLabel_67 = new JLabel(
				"<html>\uC2A4\uD30C\uC774\uC2A4\uBD88\uACE0\uAE30\uBC84\uAC70<br>     5,200\uC6D0<br></html>");
		lblNewLabel_67.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_67.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_78.add(lblNewLabel_67, BorderLayout.SOUTH);

		JPanel panel_79 = new JPanel();
		panel_79.setBackground(Color.WHITE);
		panel_7.add(panel_79);
		panel_79.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_65 = new JButton("");
		btnNewButton_65.setIcon(new ImageIcon(((new ImageIcon(path + "mh.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_65.setBackground(Color.WHITE);
		panel_79.add(btnNewButton_65, BorderLayout.CENTER);

		JLabel lblNewLabel_68 = new JLabel(
				"<html>\uC2A4\uD30C\uC774\uC2DC\uB514\uB7ED\uC2A4\uBD88\uACE0\uAE30<br>     6,200\uC6D0<br></html>");
		lblNewLabel_68.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_68.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_79.add(lblNewLabel_68, BorderLayout.SOUTH);

		JPanel panel_80 = new JPanel();
		panel_80.setBackground(Color.WHITE);
		panel_7.add(panel_80);
		panel_80.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_66 = new JButton("");
		btnNewButton_66.setIcon(new ImageIcon(((new ImageIcon(path + "mi.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_66.setBackground(Color.WHITE);
		panel_80.add(btnNewButton_66, BorderLayout.CENTER);

		JLabel lblNewLabel_69 = new JLabel(
				"<html>\uB514\uB7ED\uC2A4\uBD88\uACE0\uAE30\uBC84\uAC70<br>     6,000\uC6D0<br></html>");
		lblNewLabel_69.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_69.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_80.add(lblNewLabel_69, BorderLayout.SOUTH);

		JPanel panel_81 = new JPanel();
		panel_81.setBackground(Color.WHITE);
		panel_7.add(panel_81);
		panel_81.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_67 = new JButton("");
		btnNewButton_67.setIcon(new ImageIcon(((new ImageIcon(path + "mj.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_67.setBackground(Color.WHITE);
		panel_81.add(btnNewButton_67, BorderLayout.CENTER);

		JLabel lblNewLabel_70 = new JLabel("<html>\uC2F8\uC774\uBC84\uAC70<br>     5,400\uC6D0<br></html>");
		lblNewLabel_70.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_70.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_81.add(lblNewLabel_70, BorderLayout.SOUTH);

		JPanel panel_82 = new JPanel();
		panel_82.setBackground(Color.WHITE);
		panel_7.add(panel_82);
		panel_82.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_68 = new JButton("");
		btnNewButton_68.setIcon(new ImageIcon(((new ImageIcon(path + "mk.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_68.setBackground(Color.WHITE);
		panel_82.add(btnNewButton_68, BorderLayout.CENTER);

		JLabel lblNewLabel_71 = new JLabel("<html>\uD720\uB81B\uBC84\uAC70<br>     5,600\uC6D0<br></html>");
		lblNewLabel_71.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_71.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_82.add(lblNewLabel_71, BorderLayout.SOUTH);

		JPanel panel_83 = new JPanel();
		panel_83.setBackground(Color.WHITE);
		panel_7.add(panel_83);
		panel_83.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_69 = new JButton("");
		btnNewButton_69.setIcon(new ImageIcon(((new ImageIcon(path + "ml.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_69.setBackground(Color.WHITE);
		panel_83.add(btnNewButton_69, BorderLayout.CENTER);

		JLabel lblNewLabel_72 = new JLabel(
				"<html>\uD584\uCE58\uC988\uD720\uB81B\uBC84\uAC70<br>     5,900\uC6D0<br></html>");
		lblNewLabel_72.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_72.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_83.add(lblNewLabel_72, BorderLayout.SOUTH);

		JPanel panel_84 = new JPanel();
		panel_84.setBackground(Color.WHITE);
		panel_7.add(panel_84);
		panel_84.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_70 = new JButton("");
		btnNewButton_70.setIcon(new ImageIcon(((new ImageIcon(path + "mm.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_70.setBackground(Color.WHITE);
		panel_84.add(btnNewButton_70, BorderLayout.CENTER);

		JLabel lblNewLabel_73 = new JLabel(
				"<html>\uD560\uB77C\uD53C\uB1E8\uD1B5\uC0B4\uBC84\uAC70<br>     5,900\uC6D0<br></html>");
		lblNewLabel_73.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_73.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_84.add(lblNewLabel_73, BorderLayout.SOUTH);

		JPanel panel_85 = new JPanel();
		panel_85.setBackground(Color.WHITE);
		panel_7.add(panel_85);
		panel_85.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_71 = new JButton("");
		btnNewButton_71.setIcon(new ImageIcon(((new ImageIcon(path + "mn.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_71.setBackground(Color.WHITE);
		panel_85.add(btnNewButton_71, BorderLayout.CENTER);

		JLabel lblNewLabel_74 = new JLabel(
				"<html>\uD560\uB77C\uD53C\uB1E8\uD1B5\uAC00\uC2B4\uC0B4\uBC84\uAC70<br>     5,900\uC6D0<br></html>");
		lblNewLabel_74.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_74.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_85.add(lblNewLabel_74, BorderLayout.SOUTH);

		JPanel panel_86 = new JPanel();
		panel_86.setBackground(Color.WHITE);
		panel_7.add(panel_86);
		panel_86.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_72 = new JButton("");
		btnNewButton_72.setIcon(new ImageIcon(((new ImageIcon(path + "mo.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_72.setBackground(Color.WHITE);
		panel_86.add(btnNewButton_72, BorderLayout.CENTER);

		JLabel lblNewLabel_75 = new JLabel(
				"<html>\uD56B\uD50C\uB7EC\uC2A4\uD1B5\uC0B4\uBC84\uAC70<br>     6,200\uC6D0<br></html>");
		lblNewLabel_75.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_75.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_86.add(lblNewLabel_75, BorderLayout.SOUTH);

		JPanel panel_87 = new JPanel();
		panel_87.setBackground(Color.WHITE);
		panel_7.add(panel_87);
		panel_87.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_73 = new JButton("");
		btnNewButton_73.setIcon(new ImageIcon(((new ImageIcon(path + "mp.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_73.setBackground(Color.WHITE);
		panel_87.add(btnNewButton_73, BorderLayout.CENTER);

		JLabel lblNewLabel_76 = new JLabel(
				"<html>\uD56B\uD50C\uB7EC\uC2A4\uD1B5\uAC00\uC2B4\uC0B4<br>     6,200\uC6D0<br></html>");
		lblNewLabel_76.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_76.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_76.setBackground(Color.WHITE);
		panel_87.add(lblNewLabel_76, BorderLayout.SOUTH);

		JPanel panel_88 = new JPanel();
		panel_88.setBackground(Color.WHITE);
		panel_7.add(panel_88);
		panel_88.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_74 = new JButton("");
		btnNewButton_74.setIcon(new ImageIcon(((new ImageIcon(path + "mq.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_74.setBackground(Color.WHITE);
		panel_88.add(btnNewButton_74, BorderLayout.CENTER);

		JLabel lblNewLabel_77 = new JLabel("<html>\uD1B5\uC0C8\uC6B0\uBC84\uAC70<br>     4,900\uC6D0<br></html>");
		lblNewLabel_77.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_77.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_77.setBackground(Color.WHITE);
		panel_88.add(lblNewLabel_77, BorderLayout.SOUTH);

		JPanel panel_89 = new JPanel();
		panel_89.setBackground(Color.WHITE);
		panel_7.add(panel_89);
		panel_89.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_75 = new JButton("");
		btnNewButton_75.setIcon(new ImageIcon(((new ImageIcon(path + "mr.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_75.setBackground(Color.WHITE);
		panel_89.add(btnNewButton_75, BorderLayout.CENTER);

		JLabel lblNewLabel_78 = new JLabel("<html>\uD1B5\uC0C8\uC6B0\uBC84\uAC70<br>     5,000\uC6D0<br></html>");
		lblNewLabel_78.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_78.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_78.setBackground(Color.WHITE);
		panel_89.add(lblNewLabel_78, BorderLayout.SOUTH);

		JPanel panel_34 = new JPanel();
		panel_34.setBackground(Color.WHITE);
		tabbedPane.addTab("±Á³×Ä¡Å²", null, panel_34, null);
		panel_34.setLayout(new GridLayout(4, 5, 0, 0));

		JPanel panel_90 = new JPanel();
		panel_90.setBackground(Color.WHITE);
		panel_34.add(panel_90);
		panel_90.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_76 = new JButton("");
		btnNewButton_76.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_76.setIcon(new ImageIcon(((new ImageIcon(path + "ca.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_76.setBackground(Color.WHITE);
		panel_90.add(btnNewButton_76, BorderLayout.CENTER);

		JLabel lblNewLabel_79 = new JLabel("<html>\uD56B\uAC08\uBE44\uCC9C\uC655<br>     17,000\uC6D0<br></html>");
		lblNewLabel_79.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_79.setHorizontalAlignment(SwingConstants.CENTER);
		panel_90.add(lblNewLabel_79, BorderLayout.SOUTH);

		JPanel panel_91 = new JPanel();
		panel_91.setBackground(Color.WHITE);
		panel_34.add(panel_91);
		panel_91.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_77 = new JButton("");
		btnNewButton_77.setIcon(new ImageIcon(((new ImageIcon(path + "cb.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_77.setBackground(Color.WHITE);
		panel_91.add(btnNewButton_77, BorderLayout.CENTER);

		JLabel lblNewLabel_80 = new JLabel(
				"<html>\uAC08\uBE44\uCC9C\uC655\uC2DC\uB9AC\uC988<br>     17,000\uC6D0<br></html>");
		lblNewLabel_80.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_80.setHorizontalAlignment(SwingConstants.CENTER);
		panel_91.add(lblNewLabel_80, BorderLayout.SOUTH);

		JPanel panel_92 = new JPanel();
		panel_92.setBackground(Color.WHITE);
		panel_34.add(panel_92);
		panel_92.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_84 = new JButton("");
		btnNewButton_84.setIcon(new ImageIcon(((new ImageIcon(path + "cc.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_84.setBackground(Color.WHITE);
		panel_92.add(btnNewButton_84, BorderLayout.CENTER);

		JLabel lblNewLabel_81 = new JLabel("<html>\uC624\uB9AC\uC9C0\uB110<br>     15,000\uC6D0<br></html>");
		lblNewLabel_81.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_81.setHorizontalAlignment(SwingConstants.CENTER);
		panel_92.add(lblNewLabel_81, BorderLayout.SOUTH);

		JPanel panel_93 = new JPanel();
		panel_93.setBackground(Color.WHITE);
		panel_34.add(panel_93);
		panel_93.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_88 = new JButton("");
		btnNewButton_88.setIcon(new ImageIcon(((new ImageIcon(path + "cd.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_88.setBackground(Color.WHITE);
		panel_93.add(btnNewButton_88, BorderLayout.CENTER);

		JLabel lblNewLabel_82 = new JLabel("<html>\uBCFC\uCF00\uC774\uB178<br>     17,000\uC6D0<br></html>");
		lblNewLabel_82.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_82.setHorizontalAlignment(SwingConstants.CENTER);
		panel_93.add(lblNewLabel_82, BorderLayout.SOUTH);

		JPanel panel_94 = new JPanel();
		panel_94.setBackground(Color.WHITE);
		panel_34.add(panel_94);
		panel_94.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_92 = new JButton("");
		btnNewButton_92.setIcon(new ImageIcon(((new ImageIcon(path + "ce.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_92.setBackground(Color.WHITE);
		panel_94.add(btnNewButton_92, BorderLayout.CENTER);

		JLabel lblNewLabel_83 = new JLabel(
				"<html>\uBCFC\uCF00\uC774\uB178\uBAA8\uC9DC\uB810\uB77C<br>     19,000\uC6D0<br></html>");
		lblNewLabel_83.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_83.setHorizontalAlignment(SwingConstants.CENTER);
		panel_94.add(lblNewLabel_83, BorderLayout.SOUTH);

		JPanel panel_95 = new JPanel();
		panel_95.setBackground(Color.WHITE);
		panel_34.add(panel_95);
		panel_95.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_78 = new JButton("     17,000\uC6D0<br></html>");
		btnNewButton_78.setIcon(new ImageIcon(((new ImageIcon(path + "cf.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_78.setBackground(Color.WHITE);
		panel_95.add(btnNewButton_78, BorderLayout.CENTER);

		JLabel lblNewLabel_84 = new JLabel(
				"<html>\uBCFC\uCF00\uC774\uB178\uC300\uB5A1\uBCF6\uC774<br>     18,500\uC6D0<br></html>");
		lblNewLabel_84.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_84.setHorizontalAlignment(SwingConstants.CENTER);
		panel_95.add(lblNewLabel_84, BorderLayout.SOUTH);

		JPanel panel_96 = new JPanel();
		panel_96.setBackground(Color.WHITE);
		panel_34.add(panel_96);
		panel_96.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_81 = new JButton("");
		btnNewButton_81.setIcon(new ImageIcon(((new ImageIcon(path + "cg.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_81.setBackground(Color.WHITE);
		panel_96.add(btnNewButton_81, BorderLayout.CENTER);

		JLabel lblNewLabel_85 = new JLabel("<html>\uAD7D\uB124 \uBC18\uBC18<br>     17,000\uC6D0<br></html>");
		lblNewLabel_85.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_85.setHorizontalAlignment(SwingConstants.CENTER);
		panel_96.add(lblNewLabel_85, BorderLayout.SOUTH);

		JPanel panel_97 = new JPanel();
		panel_97.setBackground(Color.WHITE);
		panel_34.add(panel_97);
		panel_97.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_85 = new JButton("");
		btnNewButton_85.setIcon(new ImageIcon(((new ImageIcon(path + "ch.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_85.setBackground(Color.WHITE);
		panel_97.add(btnNewButton_85, BorderLayout.CENTER);

		JLabel lblNewLabel_86 = new JLabel("<html>\uAD7D\uB124 \uBC18\uBC18 B<br>     17,000\uC6D0<br></html>");
		lblNewLabel_86.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_86.setHorizontalAlignment(SwingConstants.CENTER);
		panel_97.add(lblNewLabel_86, BorderLayout.SOUTH);

		JPanel panel_98 = new JPanel();
		panel_98.setBackground(Color.WHITE);
		panel_34.add(panel_98);
		panel_98.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_89 = new JButton("");
		btnNewButton_89.setIcon(new ImageIcon(((new ImageIcon(path + "ci.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_89.setBackground(Color.WHITE);
		panel_98.add(btnNewButton_89, BorderLayout.CENTER);

		JLabel lblNewLabel_87 = new JLabel("<html>\uACE0\uCD94\uBC14\uC0AC\uC0AD<br>     16,000\uC6D0<br></html>");
		lblNewLabel_87.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_87.setHorizontalAlignment(SwingConstants.CENTER);
		panel_98.add(lblNewLabel_87, BorderLayout.SOUTH);

		JPanel panel_99 = new JPanel();
		panel_99.setBackground(Color.WHITE);
		panel_34.add(panel_99);
		panel_99.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_93 = new JButton("");
		btnNewButton_93.setIcon(new ImageIcon(((new ImageIcon(path + "cj.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_93.setBackground(Color.WHITE);
		panel_99.add(btnNewButton_93, BorderLayout.CENTER);

		JLabel lblNewLabel_88 = new JLabel(
				"<html>\uD6C4\uB974\uCE04\uC18C\uC774\uAC08\uB9AD<br>     17,000\uC6D0<br></html>");
		lblNewLabel_88.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_88.setHorizontalAlignment(SwingConstants.CENTER);
		panel_99.add(lblNewLabel_88, BorderLayout.SOUTH);

		JPanel panel_100 = new JPanel();
		panel_100.setBackground(Color.WHITE);
		panel_34.add(panel_100);
		panel_100.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_79 = new JButton("");
		btnNewButton_79.setIcon(new ImageIcon(((new ImageIcon(path + "ck.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_79.setBackground(Color.WHITE);
		panel_100.add(btnNewButton_79, BorderLayout.CENTER);

		JLabel lblNewLabel_89 = new JLabel("<html>\uC591\uB150\uCE58\uD0A8<br>     17,000\uC6D0<br></html>");
		lblNewLabel_89.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_89.setHorizontalAlignment(SwingConstants.CENTER);
		panel_100.add(lblNewLabel_89, BorderLayout.SOUTH);

		JPanel panel_101 = new JPanel();
		panel_101.setBackground(Color.WHITE);
		panel_34.add(panel_101);
		panel_101.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_82 = new JButton("");
		btnNewButton_82.setIcon(new ImageIcon(((new ImageIcon(path + "cl.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_82.setBackground(Color.WHITE);
		panel_101.add(btnNewButton_82, BorderLayout.CENTER);

		JLabel lblNewLabel_90 = new JLabel(
				"<html>\uB525\uCE58\uC988\uC2DC\uB9AC\uC988<br>     17,000\uC6D0<br></html>");
		lblNewLabel_90.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_90.setHorizontalAlignment(SwingConstants.CENTER);
		panel_101.add(lblNewLabel_90, BorderLayout.SOUTH);

		JPanel panel_102 = new JPanel();
		panel_102.setBackground(Color.WHITE);
		panel_34.add(panel_102);
		panel_102.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_86 = new JButton("");
		btnNewButton_86.setIcon(new ImageIcon(((new ImageIcon(path + "cm.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_86.setBackground(Color.WHITE);
		panel_102.add(btnNewButton_86, BorderLayout.CENTER);

		JLabel lblNewLabel_93 = new JLabel(
				"<html>\uC624\uB9AC\uC9C0\uB110\uCF64\uBCF4<br>     17,000\uC6D0<br></html>");
		lblNewLabel_93.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_93.setHorizontalAlignment(SwingConstants.CENTER);
		panel_102.add(lblNewLabel_93, BorderLayout.SOUTH);

		JPanel panel_103 = new JPanel();
		panel_103.setBackground(Color.WHITE);
		panel_34.add(panel_103);
		panel_103.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_90 = new JButton("");
		btnNewButton_90.setIcon(new ImageIcon(((new ImageIcon(path + "cn.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_90.setBackground(Color.WHITE);
		panel_103.add(btnNewButton_90, BorderLayout.CENTER);

		JLabel lblNewLabel_95 = new JLabel("<html>\uD3ED\uB9BD \uC138\uD2B8<br>     30,000\uC6D0<br></html>");
		lblNewLabel_95.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_95.setHorizontalAlignment(SwingConstants.CENTER);
		panel_103.add(lblNewLabel_95, BorderLayout.SOUTH);

		JPanel panel_104 = new JPanel();
		panel_104.setBackground(Color.WHITE);
		panel_34.add(panel_104);
		panel_104.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_94 = new JButton("");
		btnNewButton_94.setIcon(new ImageIcon(((new ImageIcon(path + "co.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_94.setBackground(Color.WHITE);
		panel_104.add(btnNewButton_94, BorderLayout.CENTER);

		JLabel lblNewLabel_96 = new JLabel("<html>\uB450\uB9C8\uB9AC\uC138\uD2B8<br>     26,000\uC6D0<br></html>");
		lblNewLabel_96.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_96.setHorizontalAlignment(SwingConstants.CENTER);
		panel_104.add(lblNewLabel_96, BorderLayout.SOUTH);

		JPanel panel_105 = new JPanel();
		panel_105.setBackground(Color.WHITE);
		panel_34.add(panel_105);
		panel_105.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_80 = new JButton("");
		btnNewButton_80.setIcon(new ImageIcon(((new ImageIcon(path + "cp.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_80.setBackground(Color.WHITE);
		panel_105.add(btnNewButton_80, BorderLayout.CENTER);

		JLabel lblNewLabel_91 = new JLabel("<html>\uAD7D\uB124 \uD3ED\uB9BD<br>     18,000\uC6D0<br></html>");
		lblNewLabel_91.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_91.setHorizontalAlignment(SwingConstants.CENTER);
		panel_105.add(lblNewLabel_91, BorderLayout.SOUTH);

		JPanel panel_106 = new JPanel();
		panel_106.setBackground(Color.WHITE);
		panel_34.add(panel_106);
		panel_106.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_83 = new JButton("");
		btnNewButton_83.setIcon(new ImageIcon(((new ImageIcon(path + "cr.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_83.setBackground(Color.WHITE);
		panel_106.add(btnNewButton_83, BorderLayout.CENTER);

		JLabel lblNewLabel_92 = new JLabel("<html>\uCF00\uC774\uC900\uAC10\uC790<br>     3,000\uC6D0<br></html>");
		lblNewLabel_92.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_92.setHorizontalAlignment(SwingConstants.CENTER);
		panel_106.add(lblNewLabel_92, BorderLayout.SOUTH);

		JPanel panel_107 = new JPanel();
		panel_107.setBackground(Color.WHITE);
		panel_34.add(panel_107);
		panel_107.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_87 = new JButton("");
		btnNewButton_87.setIcon(new ImageIcon(((new ImageIcon(path + "cs.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_87.setBackground(Color.WHITE);
		panel_107.add(btnNewButton_87, BorderLayout.CENTER);

		JLabel lblNewLabel_94 = new JLabel("<html>\uC6E8\uC9C0\uAC10\uC790<br>     3,000\uC6D0<br></html>");
		lblNewLabel_94.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_94.setHorizontalAlignment(SwingConstants.CENTER);
		panel_107.add(lblNewLabel_94, BorderLayout.SOUTH);

		JPanel panel_36 = new JPanel();
		tabbedPane.addTab("³­Å¸5000", null, panel_36, null);
		panel_36.setLayout(new GridLayout(4, 5, 0, 0));

		JPanel panel_108 = new JPanel();
		panel_108.setBackground(Color.WHITE);
		panel_36.add(panel_108);
		panel_108.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_103 = new JButton("");
		btnNewButton_103.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_103.setIcon(new ImageIcon(((new ImageIcon(path + "za.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_103.setBackground(Color.WHITE);
		panel_108.add(btnNewButton_103, BorderLayout.CENTER);

		JLabel lblNewLabel_110 = new JLabel(
				"<html>\uACE8\uB4DC\uACE0\uAD6C\uB9C8\uD53C\uC790<br>     15,000\uC6D0<br></html>");
		lblNewLabel_110.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_110.setHorizontalAlignment(SwingConstants.CENTER);
		panel_108.add(lblNewLabel_110, BorderLayout.SOUTH);

		JPanel panel_109 = new JPanel();
		panel_109.setBackground(Color.WHITE);
		panel_36.add(panel_109);
		panel_109.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_104 = new JButton("");
		btnNewButton_104.setIcon(new ImageIcon(((new ImageIcon(path + "zb.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_104.setBackground(Color.WHITE);
		panel_109.add(btnNewButton_104, BorderLayout.CENTER);

		JLabel lblNewLabel_111 = new JLabel(
				"<html>\uD56B\uACE8\uB4DC\uBC14\uBCA0\uD050\uD544\uB808\uD53C\uC790<br>     15,900\uC6D0<br></html>");
		lblNewLabel_111.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_111.setHorizontalAlignment(SwingConstants.CENTER);
		panel_109.add(lblNewLabel_111, BorderLayout.SOUTH);

		JPanel panel_110 = new JPanel();
		panel_110.setBackground(Color.WHITE);
		panel_36.add(panel_110);
		panel_110.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_107 = new JButton("");
		btnNewButton_107.setIcon(new ImageIcon(((new ImageIcon(path + "zc.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_107.setBackground(Color.WHITE);
		panel_110.add(btnNewButton_107, BorderLayout.CENTER);

		JLabel lblNewLabel_112 = new JLabel(
				"<html>\uD56B\uACE8\uB4DC\uBCA0\uC2A4\uD2B8\uD53C\uC790<br>     15,900\uC6D0<br></html>");
		lblNewLabel_112.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_112.setHorizontalAlignment(SwingConstants.CENTER);
		panel_110.add(lblNewLabel_112, BorderLayout.SOUTH);

		JPanel panel_111 = new JPanel();
		panel_111.setBackground(Color.WHITE);
		panel_36.add(panel_111);
		panel_111.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_108 = new JButton("");
		btnNewButton_108.setIcon(new ImageIcon(((new ImageIcon(path + "zd.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_108.setBackground(Color.WHITE);
		panel_111.add(btnNewButton_108, BorderLayout.CENTER);

		JLabel lblNewLabel_113 = new JLabel(
				"<html>\uD56B\uACE8\uB4DC\uBCA0\uC774\uCEE8\uD53C\uC790<br>     15,000\uC6D0<br></html>");
		lblNewLabel_113.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_113.setHorizontalAlignment(SwingConstants.CENTER);
		panel_111.add(lblNewLabel_113, BorderLayout.SOUTH);

		JPanel panel_112 = new JPanel();
		panel_112.setBackground(Color.WHITE);
		panel_36.add(panel_112);
		panel_112.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_110 = new JButton("");
		btnNewButton_110.setIcon(new ImageIcon(((new ImageIcon(path + "ze.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_110.setBackground(Color.WHITE);
		panel_112.add(btnNewButton_110, BorderLayout.CENTER);

		JLabel lblNewLabel_114 = new JLabel(
				"<html>\uD56B\uACE8\uB4DC\uC0C8\uC6B0\uD53C\uC790<br>     15,500\uC6D0<br></html>");
		lblNewLabel_114.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_114.setHorizontalAlignment(SwingConstants.CENTER);
		panel_112.add(lblNewLabel_114, BorderLayout.SOUTH);

		JPanel panel_113 = new JPanel();
		panel_113.setBackground(Color.WHITE);
		panel_36.add(panel_113);
		panel_113.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_102 = new JButton("");
		btnNewButton_102.setIcon(new ImageIcon(((new ImageIcon(path + "zf.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_102.setBackground(Color.WHITE);
		panel_113.add(btnNewButton_102, BorderLayout.CENTER);

		JLabel lblNewLabel_105 = new JLabel(
				"<html>\uD56B\uACE8\uB4DC\uD3EC\uD14C\uC774\uD1A0\uD53C\uC790<br>     15,000\uC6D0<br></html>");
		lblNewLabel_105.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_105.setHorizontalAlignment(SwingConstants.CENTER);
		panel_113.add(lblNewLabel_105, BorderLayout.SOUTH);

		JPanel panel_114 = new JPanel();
		panel_114.setBackground(Color.WHITE);
		panel_36.add(panel_114);
		panel_114.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_105 = new JButton("");
		btnNewButton_105.setIcon(new ImageIcon(((new ImageIcon(path + "zg.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_105.setBackground(Color.WHITE);
		panel_114.add(btnNewButton_105, BorderLayout.CENTER);

		JLabel lblNewLabel_106 = new JLabel(
				"<html>\uD56B\uACE8\uB4DC\uD56B\uCE58\uD0A8\uD53C\uC790<br>     15,000\uC6D0<br></html>");
		lblNewLabel_106.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_106.setHorizontalAlignment(SwingConstants.CENTER);
		panel_114.add(lblNewLabel_106, BorderLayout.SOUTH);

		JPanel panel_115 = new JPanel();
		panel_115.setBackground(Color.WHITE);
		panel_36.add(panel_115);
		panel_115.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_106 = new JButton("");
		btnNewButton_106.setIcon(new ImageIcon(((new ImageIcon(path + "zh.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_106.setBackground(Color.WHITE);
		panel_115.add(btnNewButton_106, BorderLayout.CENTER);

		JLabel lblNewLabel_107 = new JLabel(
				"<html>\uD56B\uB9AC\uCE58\uACE8\uB4DC\uD53C\uC790<br>     11,500\uC6D0<br></html>");
		lblNewLabel_107.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_107.setHorizontalAlignment(SwingConstants.CENTER);
		panel_115.add(lblNewLabel_107, BorderLayout.SOUTH);

		JPanel panel_116 = new JPanel();
		panel_116.setBackground(Color.WHITE);
		panel_36.add(panel_116);
		panel_116.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_109 = new JButton("");
		btnNewButton_109.setIcon(new ImageIcon(((new ImageIcon(path + "zi.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_109.setBackground(Color.WHITE);
		panel_116.add(btnNewButton_109, BorderLayout.CENTER);

		JLabel lblNewLabel_108 = new JLabel("<html>\uACE0\uAD6C\uB9C8\uD53C\uC790<br>     7,500\uC6D0<br></html>");
		lblNewLabel_108.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_108.setHorizontalAlignment(SwingConstants.CENTER);
		panel_116.add(lblNewLabel_108, BorderLayout.SOUTH);

		JPanel panel_117 = new JPanel();
		panel_117.setBackground(Color.WHITE);
		panel_36.add(panel_117);
		panel_117.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_111 = new JButton("");
		btnNewButton_111.setIcon(new ImageIcon(((new ImageIcon(path + "zj.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_111.setBackground(Color.WHITE);
		panel_117.add(btnNewButton_111, BorderLayout.CENTER);

		JLabel lblNewLabel_109 = new JLabel("<html>\uBCA0\uC774\uCEE8\uD53C\uC790<br>     9,000\uC6D0<br></html>");
		lblNewLabel_109.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_109.setHorizontalAlignment(SwingConstants.CENTER);
		panel_117.add(lblNewLabel_109, BorderLayout.SOUTH);

		JPanel panel_118 = new JPanel();
		panel_118.setBackground(Color.WHITE);
		panel_36.add(panel_118);
		panel_118.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_97 = new JButton("");
		btnNewButton_97.setIcon(new ImageIcon(((new ImageIcon(path + "zk.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_97.setBackground(Color.WHITE);
		panel_118.add(btnNewButton_97, BorderLayout.CENTER);

		JLabel lblNewLabel_100 = new JLabel("<html>\uBD88\uACE0\uAE30\uD53C\uC790<br>     7,500\uC6D0<br></html>");
		lblNewLabel_100.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_100.setHorizontalAlignment(SwingConstants.CENTER);
		panel_118.add(lblNewLabel_100, BorderLayout.SOUTH);

		JPanel panel_119 = new JPanel();
		panel_119.setBackground(Color.WHITE);
		panel_36.add(panel_119);
		panel_119.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_98 = new JButton("");
		btnNewButton_98.setIcon(new ImageIcon(((new ImageIcon(path + "zl.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_98.setBackground(Color.WHITE);
		panel_119.add(btnNewButton_98, BorderLayout.CENTER);

		JLabel lblNewLabel_101 = new JLabel("<html>\uC57C\uCC44\uD53C\uC790<br>     6,500\uC6D0<br></html>");
		lblNewLabel_101.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_101.setHorizontalAlignment(SwingConstants.CENTER);
		panel_119.add(lblNewLabel_101, BorderLayout.SOUTH);

		JPanel panel_120 = new JPanel();
		panel_120.setBackground(Color.WHITE);
		panel_36.add(panel_120);
		panel_120.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_99 = new JButton("");
		btnNewButton_99.setIcon(new ImageIcon(((new ImageIcon(path + "zm.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_99.setBackground(Color.WHITE);
		panel_120.add(btnNewButton_99, BorderLayout.CENTER);

		JLabel lblNewLabel_102 = new JLabel(
				"<html>\uCE58\uC988\uBC14\uC774\uD2B8\uD53C\uC790<br>     7,500\uC6D0<br></html>");
		lblNewLabel_102.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_102.setHorizontalAlignment(SwingConstants.CENTER);
		panel_120.add(lblNewLabel_102, BorderLayout.SOUTH);

		JPanel panel_121 = new JPanel();
		panel_121.setBackground(Color.WHITE);
		panel_36.add(panel_121);
		panel_121.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_100 = new JButton("");
		btnNewButton_100.setIcon(new ImageIcon(((new ImageIcon(path + "zn.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_100.setBackground(Color.WHITE);
		panel_121.add(btnNewButton_100, BorderLayout.CENTER);

		JLabel lblNewLabel_103 = new JLabel("<html>\uCE58\uC988\uD53C\uC790<br>     5,900\uC6D0<br></html>");
		lblNewLabel_103.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_103.setHorizontalAlignment(SwingConstants.CENTER);
		panel_121.add(lblNewLabel_103, BorderLayout.SOUTH);

		JPanel panel_122 = new JPanel();
		panel_122.setBackground(Color.WHITE);
		panel_36.add(panel_122);
		panel_122.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_101 = new JButton("");
		btnNewButton_101.setIcon(new ImageIcon(((new ImageIcon(path + "zo.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_101.setBackground(Color.WHITE);
		panel_122.add(btnNewButton_101, BorderLayout.CENTER);

		JLabel lblNewLabel_104 = new JLabel(
				"<html>\uCF64\uBE44\uB124\uC774\uC158\uD53C\uC790<br>     7,500\uC6D0<br></html>");
		lblNewLabel_104.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_104.setHorizontalAlignment(SwingConstants.CENTER);
		panel_122.add(lblNewLabel_104, BorderLayout.SOUTH);

		JPanel panel_123 = new JPanel();
		panel_123.setBackground(Color.WHITE);
		panel_36.add(panel_123);
		panel_123.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_91 = new JButton("");
		btnNewButton_91.setIcon(new ImageIcon(((new ImageIcon(path + "zp.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_91.setBackground(Color.WHITE);
		panel_123.add(btnNewButton_91, BorderLayout.CENTER);

		JLabel lblNewLabel_97 = new JLabel("<html>\uD398\uD30C\uB85C\uB2C8\uD53C\uC790<br>     7,500\uC6D0<br></html>");
		lblNewLabel_97.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_97.setHorizontalAlignment(SwingConstants.CENTER);
		panel_123.add(lblNewLabel_97, BorderLayout.SOUTH);

		JPanel panel_124 = new JPanel();
		panel_124.setBackground(Color.WHITE);
		panel_36.add(panel_124);
		panel_124.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_95 = new JButton("");
		btnNewButton_95.setIcon(new ImageIcon(((new ImageIcon(path + "zq.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_95.setBackground(Color.WHITE);
		panel_124.add(btnNewButton_95, BorderLayout.CENTER);

		JLabel lblNewLabel_98 = new JLabel("<html>\uD3EC\uD14C\uC774\uD1A0\uD53C\uC790<br>     7,500\uC6D0<br></html>");
		lblNewLabel_98.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_98.setHorizontalAlignment(SwingConstants.CENTER);
		panel_124.add(lblNewLabel_98, BorderLayout.SOUTH);

		JPanel panel_125 = new JPanel();
		panel_125.setBackground(Color.WHITE);
		panel_36.add(panel_125);
		panel_125.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton_96 = new JButton("");
		btnNewButton_96.setIcon(new ImageIcon(((new ImageIcon(path + "zr.jpg")).getImage()).getScaledInstance(150, 180,
				java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_96.setBackground(Color.WHITE);
		panel_125.add(btnNewButton_96, BorderLayout.CENTER);

		JLabel lblNewLabel_99 = new JLabel("<html>\uD56B\uCE58\uD0A8\uD53C\uC790<br>     8,500\uC6D0<br></html>");
		lblNewLabel_99.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_99.setHorizontalAlignment(SwingConstants.CENTER);
		panel_125.add(lblNewLabel_99, BorderLayout.SOUTH);
		frame.getContentPane().add(panel_3);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(((new ImageIcon(path + "hans.jpg")).getImage()).getScaledInstance(180, 70,
				java.awt.Image.SCALE_SMOOTH)));
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
		btnNewButton_20.setIcon(new ImageIcon(
				((new ImageIcon(path + "end.jpg")).getImage()).getScaledInstance(50, 30, java.awt.Image.SCALE_SMOOTH)));
		panel_29.add(btnNewButton_20, "name_19255370222850");

		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int check = tabbedPane.getSelectedIndex();
				switch (check) {
				case 0:
					lblNewLabel.setIcon(new ImageIcon(((new ImageIcon(path + "hans.jpg")).getImage()).getScaledInstance(180, 70,
							java.awt.Image.SCALE_SMOOTH)));
					break;
				case 1:
					lblNewLabel.setIcon(new ImageIcon(((new ImageIcon(path + "sinjun.jpg")).getImage()).getScaledInstance(180, 70,
							java.awt.Image.SCALE_SMOOTH)));
					break;
				case 2:
					lblNewLabel.setIcon(new ImageIcon(((new ImageIcon(path + "china.jpg")).getImage()).getScaledInstance(180, 70,
							java.awt.Image.SCALE_SMOOTH)));
					break;
				case 3:
					lblNewLabel.setIcon(new ImageIcon(((new ImageIcon(path + "Moms.jpg")).getImage()).getScaledInstance(180, 70,
							java.awt.Image.SCALE_SMOOTH)));
					break;
				case 4:
					lblNewLabel.setIcon(new ImageIcon(((new ImageIcon(path + "gubne.jpg")).getImage()).getScaledInstance(180, 70,
							java.awt.Image.SCALE_SMOOTH)));
					break;
				case 5:
					lblNewLabel.setIcon(new ImageIcon(((new ImageIcon(path + "nanta.jpg")).getImage()).getScaledInstance(180, 70,
							java.awt.Image.SCALE_SMOOTH)));
					break;
				default:
					break;
				}
			}
		});
	}
}

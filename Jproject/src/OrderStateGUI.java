import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.Font;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderStateGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderStateGUI window = new OrderStateGUI();
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
	public OrderStateGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		Border border1 = BorderFactory.createLineBorder(Color.red);
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 245, 220));
		frame.setBounds(100, 100, 693, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -281, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -463, SpringLayout.EAST, frame.getContentPane());
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 0, SpringLayout.NORTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 6, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, panel);
		panel_1.setBackground(new Color(255, 255, 255));
		panel.setLayout(new GridLayout(4, 2, 0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(255, 255, 255));
		panel.add(panel_15);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 255));
		panel.add(panel_10);
		panel_10.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("\u3000\u3000\u3000%");
		panel_10.add(lblNewLabel_3, "name_9613707946022");
		lblNewLabel_3.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 215, 0));
		panel.add(panel_11);
		panel_11.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("\uCD1D \uAE08 \uC561");
		panel_11.add(lblNewLabel_5, "name_9616378507378");
		lblNewLabel_5.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(panel_1);
		
		
		//lblNewLabel_5.setBorder(border1);
		
		
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -281, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -6, SpringLayout.WEST, panel_2);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 445, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 0, SpringLayout.EAST, frame.getContentPane());
		panel_2.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -44, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_3, 0, SpringLayout.EAST, panel);
		panel_3.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel_4, 6, SpringLayout.EAST, panel_3);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_4, -44, SpringLayout.SOUTH, frame.getContentPane());
		panel_4.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, panel_4, -6, SpringLayout.WEST, panel_5);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_5, -44, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, panel_5, 0, SpringLayout.NORTH, panel_3);
		springLayout.putConstraint(SpringLayout.WEST, panel_5, 445, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_5, 0, SpringLayout.EAST, panel_2);
		panel_4.setLayout(new GridLayout(4, 2, 0, 0));
		
		JPanel panel_44 = new JPanel();
		panel_44.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_44);
		panel_44.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_38 = new JLabel("New label");
		panel_44.add(lblNewLabel_38, "name_12840659225332");
		lblNewLabel_38.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_38.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		
		JPanel panel_45 = new JPanel();
		panel_45.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_45);
		panel_45.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_37 = new JLabel("\u3000\u3000\u3000%");
		panel_45.add(lblNewLabel_37, "name_12846091143388");
		lblNewLabel_37.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_37.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		
		JPanel panel_46 = new JPanel();
		panel_46.setBackground(new Color(160, 82, 45));
		panel_4.add(panel_46);
		panel_46.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_41 = new JLabel("\uCD1D \uAE08 \uC561");
		panel_46.add(lblNewLabel_41, "name_12841913567427");
		lblNewLabel_41.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_41.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		
		JPanel panel_47 = new JPanel();
		panel_47.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_47);
		panel_47.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_40 = new JLabel("-");
		panel_47.add(lblNewLabel_40, "name_12847645751542");
		lblNewLabel_40.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_40.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		
		JPanel panel_48 = new JPanel();
		panel_48.setBackground(new Color(160, 82, 45));
		panel_4.add(panel_48);
		panel_48.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_39 = new JLabel("\uC778 \uC6D0 \uC218");
		panel_48.add(lblNewLabel_39, "name_12843265363882");
		lblNewLabel_39.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_39.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		
		JPanel panel_49 = new JPanel();
		panel_49.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_49);
		panel_49.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_43 = new JLabel("-");
		panel_49.add(lblNewLabel_43, "name_12849953110991");
		lblNewLabel_43.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_43.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		
		JPanel panel_50 = new JPanel();
		panel_50.setBackground(new Color(160, 82, 45));
		panel_4.add(panel_50);
		panel_50.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_42 = new JLabel("\uC8FC\uBB38\uCD5C\uC18C\uAE08\uC561");
		panel_50.add(lblNewLabel_42, "name_12844734198723");
		lblNewLabel_42.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_42.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		
		JPanel panel_51 = new JPanel();
		panel_51.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_51);
		panel_51.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_44 = new JLabel("-");
		panel_51.add(lblNewLabel_44, "name_12851683337851");
		lblNewLabel_44.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_44.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_5.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new GridLayout(4, 2, 0, 0));
		
		JPanel panel_52 = new JPanel();
		panel_52.setBackground(new Color(255, 255, 255));
		panel_5.add(panel_52);
		panel_52.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_46 = new JLabel("");
		panel_52.add(lblNewLabel_46, "name_12910308970472");
		lblNewLabel_46.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_46.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_53 = new JPanel();
		panel_53.setBackground(new Color(255, 255, 255));
		panel_5.add(panel_53);
		panel_53.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_49 = new JLabel("\u3000\u3000\u3000%");
		panel_53.add(lblNewLabel_49, "name_12916994507972");
		lblNewLabel_49.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_49.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_54 = new JPanel();
		panel_54.setBackground(new Color(255, 0, 51));
		panel_5.add(panel_54);
		panel_54.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_47 = new JLabel("\uCD1D \uAE08 \uC561");
		panel_54.add(lblNewLabel_47, "name_12912059140872");
		lblNewLabel_47.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_47.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_55 = new JPanel();
		panel_55.setBackground(new Color(255, 255, 255));
		panel_5.add(panel_55);
		panel_55.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_50 = new JLabel("-");
		panel_55.add(lblNewLabel_50, "name_12918569187050");
		lblNewLabel_50.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_50.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_56 = new JPanel();
		panel_56.setBackground(new Color(255, 0, 51));
		panel_5.add(panel_56);
		panel_56.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_51 = new JLabel("\uC778 \uC6D0 \uC218");
		panel_56.add(lblNewLabel_51, "name_12913886687160");
		lblNewLabel_51.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_51.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_57 = new JPanel();
		panel_57.setBackground(new Color(255, 255, 255));
		panel_5.add(panel_57);
		panel_57.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_48 = new JLabel("-");
		panel_57.add(lblNewLabel_48, "name_12920434187434");
		lblNewLabel_48.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_48.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_58 = new JPanel();
		panel_58.setBackground(new Color(255, 0, 51));
		panel_5.add(panel_58);
		panel_58.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_45 = new JLabel("\uC8FC\uBB38\uCD5C\uC18C\uAE08\uC561");
		panel_58.add(lblNewLabel_45, "name_12915356100364");
		lblNewLabel_45.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_45.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_59 = new JPanel();
		panel_59.setBackground(new Color(255, 255, 255));
		panel_5.add(panel_59);
		panel_59.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_52 = new JLabel("-");
		panel_59.add(lblNewLabel_52, "name_12922034457235");
		lblNewLabel_52.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_52.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_6 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.SOUTH, panel_6);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_6, 46, SpringLayout.NORTH, frame.getContentPane());
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(255, 255, 255));
		panel.add(panel_12);
		panel_12.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("-");
		panel_12.add(lblNewLabel_1, "name_9623204039360");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 215, 0));
		panel.add(panel_9);
		panel_9.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\uC778 \uC6D0 \uC218");
		panel_9.add(lblNewLabel_2, "name_9617524517915");
		lblNewLabel_2.setBackground(new Color(255, 248, 220));
		lblNewLabel_2.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(255, 255, 255));
		panel.add(panel_14);
		panel_14.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("-");
		panel_14.add(lblNewLabel_6, "name_9621260413088");
		lblNewLabel_6.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(255, 215, 0));
		panel.add(panel_13);
		panel_13.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("\uC8FC\uBB38\uCD5C\uC18C\uAE08\uC561");
		panel_13.add(lblNewLabel_4, "name_9618653080987");
		lblNewLabel_4.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(255, 255, 255));
		panel.add(panel_16);
		panel_16.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("-");
		lblNewLabel_7.setBackground(new Color(255, 255, 255));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_16.add(lblNewLabel_7, "name_9560472088280");
		panel_6.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_6, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_6, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_6, 214, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("D:\\\uD55C\uC1A5 \uAC04\uD310.JPG"));
		panel_6.add(lblNewLabel, "name_8678929989175");
		
		JPanel panel_7 = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel_7, 6, SpringLayout.EAST, panel_6);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_7, 0, SpringLayout.SOUTH, panel_6);
		springLayout.putConstraint(SpringLayout.NORTH, panel_7, 0, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().add(panel_7);
		
		JPanel panel_8 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 0, SpringLayout.SOUTH, panel_8);
		springLayout.putConstraint(SpringLayout.WEST, panel_8, 445, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_8, 0, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_7, -6, SpringLayout.WEST, panel_8);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_8, 0, SpringLayout.SOUTH, panel_6);
		springLayout.putConstraint(SpringLayout.NORTH, panel_8, 0, SpringLayout.NORTH, frame.getContentPane());
		panel_7.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(((new ImageIcon("D://Moms.jpg")).getImage()).getScaledInstance(220, 40, java.awt.Image.SCALE_SMOOTH)));
		panel_7.add(lblNewLabel_8, "name_9780837296343");
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(((new ImageIcon("D://china.jpg")).getImage()).getScaledInstance(220, 60, java.awt.Image.SCALE_SMOOTH)));
		panel_8.add(lblNewLabel_9, "name_10011210361500");
		
		JPanel panel_17 = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel_17, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 0, SpringLayout.SOUTH, panel_17);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_17, -223, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, panel_17, 6, SpringLayout.SOUTH, panel);
		panel_3.setLayout(new GridLayout(4, 2, 0, 0));
		
		JPanel panel_36 = new JPanel();
		panel_36.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_36);
		panel_36.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_33 = new JLabel("");
		lblNewLabel_33.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		panel_36.add(lblNewLabel_33, "name_12772165737644");
		
		JPanel panel_37 = new JPanel();
		panel_37.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_37);
		panel_37.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_30 = new JLabel("\u3000\u3000\u3000%");
		lblNewLabel_30.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		panel_37.add(lblNewLabel_30, "name_12788156285525");
		
		JPanel panel_38 = new JPanel();
		panel_38.setBackground(new Color(245, 222, 179));
		panel_3.add(panel_38);
		panel_38.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_31 = new JLabel("\uCD1D \uAE08 \uC561");
		lblNewLabel_31.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		panel_38.add(lblNewLabel_31, "name_12774015798106");
		
		JPanel panel_39 = new JPanel();
		panel_39.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_39);
		panel_39.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_32 = new JLabel("-");
		lblNewLabel_32.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		panel_39.add(lblNewLabel_32, "name_12786624484650");
		
		JPanel panel_40 = new JPanel();
		panel_40.setBackground(new Color(245, 222, 179));
		panel_3.add(panel_40);
		panel_40.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_35 = new JLabel("\uC778 \uC6D0 \uC218");
		lblNewLabel_35.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
		panel_40.add(lblNewLabel_35, "name_12775815676578");
		
		JPanel panel_41 = new JPanel();
		panel_41.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_41);
		panel_41.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_29 = new JLabel("-");
		lblNewLabel_29.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		panel_41.add(lblNewLabel_29, "name_12781890886023");
		
		JPanel panel_42 = new JPanel();
		panel_42.setBackground(new Color(245, 222, 179));
		panel_3.add(panel_42);
		panel_42.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_34 = new JLabel("\uC8FC\uBB38\uCD5C\uC18C\uAE08\uC561");
		lblNewLabel_34.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		panel_42.add(lblNewLabel_34, "name_12777295312548");
		
		JPanel panel_43 = new JPanel();
		panel_43.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_43);
		panel_43.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_36 = new JLabel("-");
		lblNewLabel_36.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
		panel_43.add(lblNewLabel_36, "name_12779121787840");
		frame.getContentPane().add(panel_17);
		
		JPanel panel_18 = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel_18, 220, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_17, -6, SpringLayout.WEST, panel_18);
		springLayout.putConstraint(SpringLayout.NORTH, panel_4, 0, SpringLayout.SOUTH, panel_18);
		springLayout.putConstraint(SpringLayout.NORTH, panel_18, 6, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_18, 0, SpringLayout.SOUTH, panel_17);
		panel_1.setLayout(new GridLayout(4, 2, 0, 0));
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_20);
		panel_20.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_20.add(lblNewLabel_14, "name_12110899978930");
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_21);
		panel_21.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_17 = new JLabel("\u3000\u3000\u3000%");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_21.add(lblNewLabel_17, "name_12112952787096");
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(255, 99, 71));
		panel_1.add(panel_22);
		panel_22.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_15 = new JLabel("\uCD1D \uAE08 \uC561");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_22.add(lblNewLabel_15, "name_12114474427689");
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_23);
		panel_23.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_13 = new JLabel("-");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_23.add(lblNewLabel_13, "name_12122353320240");
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(255, 99, 71));
		panel_1.add(panel_24);
		panel_24.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_16 = new JLabel("\uC778 \uC6D0 \uC218");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_24.add(lblNewLabel_16, "name_12115978868341");
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_25);
		panel_25.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_19 = new JLabel("-");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_25.add(lblNewLabel_19, "name_12119811600572");
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(new Color(255, 99, 71));
		panel_1.add(panel_26);
		panel_26.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_18 = new JLabel("\uC8FC\uBB38\uCD5C\uC18C\uAE08\uC561");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_26.add(lblNewLabel_18, "name_12117174054471");
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_27);
		panel_27.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_20 = new JLabel("-");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_27.add(lblNewLabel_20, "name_12118470301273");
		frame.getContentPane().add(panel_18);
		panel_18.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setIcon(new ImageIcon(((new ImageIcon("D://gubne.jpg")).getImage()).getScaledInstance(220, 60, java.awt.Image.SCALE_SMOOTH)));
		panel_18.add(lblNewLabel_11, "name_11722219312231");
		
		JPanel panel_19 = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, panel_18, -6, SpringLayout.WEST, panel_19);
		springLayout.putConstraint(SpringLayout.NORTH, panel_19, 6, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_19, 0, SpringLayout.SOUTH, panel_17);
		springLayout.putConstraint(SpringLayout.WEST, panel_19, 0, SpringLayout.WEST, panel_2);
		springLayout.putConstraint(SpringLayout.EAST, panel_19, 0, SpringLayout.EAST, frame.getContentPane());
		panel_2.setLayout(new GridLayout(4, 2, 0, 0));
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(new Color(255, 255, 255));
		panel_2.add(panel_28);
		panel_28.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_28.add(lblNewLabel_22, "name_12394762455770");
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(new Color(255, 255, 255));
		panel_2.add(panel_29);
		panel_29.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_23 = new JLabel("\u3000\u3000\u3000%");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_29.add(lblNewLabel_23, "name_12409104992088");
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(new Color(205, 92, 92));
		panel_2.add(panel_30);
		panel_30.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_24 = new JLabel("\uCD1D \uAE08 \uC561");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_30.add(lblNewLabel_24, "name_12397091342313");
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(new Color(255, 255, 255));
		panel_2.add(panel_31);
		panel_31.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_21 = new JLabel("-");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_31.add(lblNewLabel_21, "name_12407059967966");
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(new Color(205, 92, 92));
		panel_2.add(panel_32);
		panel_32.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_25 = new JLabel("\uC778 \uC6D0 \uC218");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_32.add(lblNewLabel_25, "name_12399183210164");
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(new Color(255, 255, 255));
		panel_2.add(panel_33);
		panel_33.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_27 = new JLabel("-");
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_27.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_33.add(lblNewLabel_27, "name_12405589777777");
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(new Color(205, 92, 92));
		panel_2.add(panel_34);
		panel_34.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_26 = new JLabel("\uC8FC\uBB38\uCD5C\uC18C\uAE08\uC561");
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_34.add(lblNewLabel_26, "name_12401407877078");
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(new Color(255, 255, 255));
		panel_2.add(panel_35);
		panel_35.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_28 = new JLabel("-");
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_28.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_35.add(lblNewLabel_28, "name_12403615759106");
		panel_17.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setIcon(new ImageIcon(((new ImageIcon("D://nanta.jpg")).getImage()).getScaledInstance(220, 60, java.awt.Image.SCALE_SMOOTH)));
		panel_17.add(lblNewLabel_10, "name_11645540798997");
		frame.getContentPane().add(panel_19);
		panel_19.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(((new ImageIcon("D://sinjun.jpg")).getImage()).getScaledInstance(250, 60, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_19.add(lblNewLabel_12, "name_12520306036400");
		
		JPanel panel_60 = new JPanel();
		panel_60.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_60, 6, SpringLayout.SOUTH, panel_5);
		springLayout.putConstraint(SpringLayout.WEST, panel_60, -50, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_60, 34, SpringLayout.SOUTH, panel_5);
		springLayout.putConstraint(SpringLayout.EAST, panel_60, -6, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_60);
		panel_60.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(((new ImageIcon("D://end.jpg")).getImage()).getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH)));
		panel_60.add(btnNewButton, "name_20720373053083");
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class PayInfoGUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayInfoGUI window = new PayInfoGUI();
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
	public PayInfoGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 240));
		frame.setBounds(100, 100, 460, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -421, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 444, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -385, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 123, SpringLayout.WEST, frame.getContentPane());
		panel_1.setBackground(new Color(255, 255, 255));
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -124, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 0, SpringLayout.EAST, panel);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("\uC5C5 \uCCB4 \uBA85");
		lblNewLabel_8.setBackground(new Color(255, 255, 255));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 15));
		panel_1.add(lblNewLabel_8, "name_17883587979903");
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 6, SpringLayout.SOUTH, panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, "name_23063891528681");
		
		table = new JTable();
		scrollPane.setViewportView(table);
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -48, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_3, 0, SpringLayout.EAST, panel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(233, 150, 122));
		panel.add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\uD68C \uC6D0 \uBA85");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 15));
		panel_4.add(lblNewLabel, "name_17798108049017");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel.add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("-");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_5.add(lblNewLabel_1, "name_17799964267408");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(233, 150, 122));
		panel.add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\uBC88 \uD638");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 15));
		panel_6.add(lblNewLabel_2, "name_17801676883798");
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel.add(panel_7);
		panel_7.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("-");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		panel_7.add(lblNewLabel_3, "name_17803353902829");
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(2, 4, 0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(233, 150, 122));
		panel_3.add(panel_8);
		panel_8.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("\uC5C5\uCCB4 \uBC88\uD638");
		lblNewLabel_6.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_6, "name_17772816645546");
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_9);
		panel_9.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("-");
		lblNewLabel_5.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_5, "name_17776933761208");
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(233, 150, 122));
		panel_3.add(panel_10);
		panel_10.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("\uCD1D \uAE08 \uC561");
		lblNewLabel_4.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_4, "name_17774110126412");
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_11);
		panel_11.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("-");
		lblNewLabel_7.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 13));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_7, "name_17778293989800");
		
		JPanel panel_12 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_12, 6, SpringLayout.SOUTH, panel_3);
		springLayout.putConstraint(SpringLayout.WEST, panel_12, -56, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_12, 38, SpringLayout.SOUTH, panel_3);
		springLayout.putConstraint(SpringLayout.EAST, panel_12, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_12);
		panel_12.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(((new ImageIcon("D://end.jpg")).getImage()).getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH)));
		panel_12.add(btnNewButton, "name_20146336207838");
	}

}

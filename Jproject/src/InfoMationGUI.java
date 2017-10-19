import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class InfoMationGUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoMationGUI window = new InfoMationGUI();
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
	public InfoMationGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 240));
		frame.setBounds(100, 100, 456, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 88, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 440, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 283, SpringLayout.SOUTH, panel);
		panel.setLayout(new GridLayout(2, 4, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(218, 165, 32));
		panel.add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C \uC6D0 \uBA85");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_2.add(lblNewLabel_1, "name_18151280863752");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel.add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("-");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_3.add(lblNewLabel_2, "name_18153915367414");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(218, 165, 32));
		panel.add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\uBC88 \uD638");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_4.add(lblNewLabel, "name_18149691113142");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel.add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("-");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 16));
		panel_5.add(lblNewLabel_3, "name_18152682064608");
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 440, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		
		JPanel panel_6 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_6, 6, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_6, -54, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_6, 42, SpringLayout.SOUTH, panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, "name_23080632617946");
		
		table = new JTable();
		scrollPane.setViewportView(table);
		springLayout.putConstraint(SpringLayout.EAST, panel_6, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(((new ImageIcon("D://end.jpg")).getImage()).getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH)));
		panel_6.add(btnNewButton, "name_20218644746954");
	}
}

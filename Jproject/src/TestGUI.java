import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;

public class TestGUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGUI window = new TestGUI();
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
	public TestGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		DAO dao = new DAO();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Vector columnNames = new Vector<>();
		columnNames.add("¸Þ´º");
		columnNames.add("Count");
		
		table = new JTable(dao.todayOrderList("ÇÑ¼Ü", "2017.10.19"), columnNames);
		frame.getContentPane().add(table, BorderLayout.NORTH);
	}

}

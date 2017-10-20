import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;

public class TestGUI {

	private JFrame frame;
	private JTable table;
	private ThreadTime tt = new ThreadTime();

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
		
		tt.start();
		DAO dao = new DAO();
		Vector columnName = new Vector<>();
		Vector data = new Vector<>();
		columnName.add("1");
		columnName.add("2");
		columnName.add("3");
		columnName.add("4");
		columnName.add("5");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		data = dao.history("a", tt.getMT());
		table = new JTable(data,columnName);
		frame.getContentPane().add(table, BorderLayout.CENTER);
		
	}

}

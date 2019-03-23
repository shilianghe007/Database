package socket_test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JButton;

public class adminClient extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminClient frame = new adminClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public adminClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Label label = new Label("\u7BA1\u7406\u5458\uFF0C\u4F60\u597D\uFF01");
		label.setFont(new Font("Dialog", Font.PLAIN, 22));
		label.setBounds(144, 54, 148, 37);
		panel.add(label);
		
		JButton btnNewButton = new JButton("\u6BD4\u8D5B\u7C7B\u578B\u8BBE\u7F6E");
		btnNewButton.setBounds(149, 124, 140, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u4EE3\u8868\u961F\u62A5\u9053");
		btnNewButton_1.setBounds(150, 181, 139, 29);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u8FDC\u52A8\u5458\u5B89\u6392");
		btnNewButton_2.setBounds(150, 233, 138, 29);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u88C1\u5224\u5458\u5B89\u6392");
		btnNewButton_3.setBounds(150, 285, 138, 29);
		panel.add(btnNewButton_3);
		
		JButton button = new JButton("\u767B\u51FA");
		button.setBounds(151, 336, 137, 29);
		panel.add(button);
	}
}

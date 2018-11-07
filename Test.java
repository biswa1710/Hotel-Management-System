import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class Test {

	private JFrame frame;
	private JTextField txtDfvdv;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
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
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 121, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLoginPage = new JLabel("Login Page");
		lblLoginPage.setForeground(new Color(0, 0, 0));
		lblLoginPage.setVerticalAlignment(SwingConstants.TOP);
		lblLoginPage.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblLoginPage.setBounds(10, 95, 111, 97);
		panel.add(lblLoginPage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBounds(120, 0, 314, 261);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(25, 60, 94, 28);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(25, 99, 94, 51);
		panel_1.add(lblPassword);
		
		txtDfvdv = new JTextField();
		txtDfvdv.setBounds(129, 66, 86, 20);
		panel_1.add(txtDfvdv);
		txtDfvdv.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(129, 116, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New User?");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				Reg rg = new Reg();
				rg.setVisible(true);
			}
		});
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(89, 208, 76, 20);
		panel_1.add(lblNewLabel);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Detail dt1 = new Detail();
				dt1.setVisible(true);
			}
		});
		btnLogin.setBackground(UIManager.getColor("Button.background"));
		btnLogin.setBounds(76, 161, 89, 23);
		panel_1.add(btnLogin);
		
		
	}
}

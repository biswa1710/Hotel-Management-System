import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class Reg extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reg frame = new Reg();
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
	public Reg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setForeground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 121, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRegistrationPage = new JLabel("Registration \r\nPage");
		lblRegistrationPage.setForeground(new Color(0, 0, 0));
		lblRegistrationPage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistrationPage.setBounds(5, 119, 131, 33);
		panel.add(lblRegistrationPage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBounds(119, 0, 315, 261);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(37, 25, 78, 19);
		panel_1.add(lblNewLabel);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setForeground(Color.WHITE);
		lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDateOfBirth.setBounds(37, 57, 95, 19);
		panel_1.add(lblDateOfBirth);
		
		JLabel lblResAddress = new JLabel("Res. Address");
		lblResAddress.setForeground(Color.WHITE);
		lblResAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResAddress.setBounds(37, 90, 95, 19);
		panel_1.add(lblResAddress);
		
		JLabel lblEnmailId = new JLabel("Email Id.");
		lblEnmailId.setForeground(Color.WHITE);
		lblEnmailId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnmailId.setBounds(37, 123, 78, 19);
		panel_1.add(lblEnmailId);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(180, 25, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(180, 57, 86, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(180, 90, 86, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(180, 123, 86, 20);
		panel_1.add(textField_3);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Reg rg = new Reg();
				rg.dispose();
				Detail dt = new Detail();
				dt.setVisible(true);
			}
		});
		btnSubmit.setBackground(UIManager.getColor("Button.background"));
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSubmit.setBounds(99, 227, 89, 23);
		panel_1.add(btnSubmit);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(37, 154, 78, 19);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(37, 185, 78, 19);
		panel_1.add(lblPassword);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(180, 154, 86, 20);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_5.setColumns(10);
		textField_5.setBounds(180, 186, 86, 20);
		panel_1.add(textField_5);
	}
}

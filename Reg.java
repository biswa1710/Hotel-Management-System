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
	private JTextField name;
	private JTextField dob;
	private JTextField address;
	private JTextField email;
	private JTextField username;
	private JTextField pass;

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
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 13));
		name.setBounds(180, 25, 86, 20);
		panel_1.add(name);
		name.setColumns(10);
		
		dob = new JTextField();
		dob.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dob.setColumns(10);
		dob.setBounds(180, 57, 86, 20);
		panel_1.add(dob);
		
		address = new JTextField();
		address.setFont(new Font("Tahoma", Font.PLAIN, 13));
		address.setColumns(10);
		address.setBounds(180, 90, 86, 20);
		panel_1.add(address);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 13));
		email.setColumns(10);
		email.setBounds(180, 123, 86, 20);
		panel_1.add(email);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					User nuser = new User();
					nuser.setName(name.getText());
					nuser.setDob(dob.getText());
					nuser.setAddress(address.getText());
					nuser.setEmail(email.getText());
					nuser.setUsername(username.getText());
					nuser.setPass(pass.getText());
					DBConnect connect = new DBConnect();
					connect.setNuserData(nuser);
					Reg rg = new Reg();
					rg.dispose();
					Detail dt = new Detail();
					dt.setVisible(true);
				}catch(NullPointerException e) {
					System.out.println("Please fill all the fields"+e);
					//TODO front-end: display an error with above message
					// Then redirect to registration page.
				}
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
		
		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.PLAIN, 13));
		username.setColumns(10);
		username.setBounds(180, 154, 86, 20);
		panel_1.add(username);
		
		pass = new JTextField();
		pass.setFont(new Font("Tahoma", Font.PLAIN, 13));
		pass.setColumns(10);
		pass.setBounds(180, 186, 86, 20);
		panel_1.add(pass);
	}
}

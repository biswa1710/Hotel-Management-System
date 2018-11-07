import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class Detail extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Detail frame = new Detail();
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
	public Detail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 121, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDetails = new JLabel("Details");
		lblDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDetails.setBounds(31, 95, 90, 60);
		panel.add(lblDetails);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBounds(121, 0, 313, 261);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Location");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(37, 37, 60, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblCheckin = new JLabel("Check-in");
		lblCheckin.setForeground(new Color(255, 255, 255));
		lblCheckin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCheckin.setBounds(37, 71, 60, 14);
		panel_1.add(lblCheckin);
		
		JLabel lblCheckout = new JLabel("Check-out");
		lblCheckout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCheckout.setForeground(new Color(255, 255, 255));
		lblCheckout.setBounds(37, 107, 70, 14);
		panel_1.add(lblCheckout);
		
		JLabel lblNoOfRooms = new JLabel("No. of rooms");
		lblNoOfRooms.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNoOfRooms.setForeground(new Color(255, 255, 255));
		lblNoOfRooms.setBounds(37, 143, 81, 14);
		panel_1.add(lblNoOfRooms);
		
		JLabel lblNoOfPeople = new JLabel("No. of people");
		lblNoOfPeople.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNoOfPeople.setForeground(new Color(255, 255, 255));
		lblNoOfPeople.setBounds(37, 168, 81, 33);
		panel_1.add(lblNoOfPeople);
		
		textField = new JTextField();
		textField.setBounds(128, 34, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 68, 86, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(128, 107, 86, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(128, 140, 86, 20);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(128, 178, 86, 20);
		panel_1.add(textField_4);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Detail dt3 = new Detail();
				dt3.dispose();
				Hotel h1 = new Hotel();
				h1.setVisible(true);
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(91, 212, 89, 23);
		panel_1.add(btnNewButton);
	}
}

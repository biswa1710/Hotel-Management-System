import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Cancel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Cancel() {
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
		
		JLabel lblBookings = new JLabel("Bookings");
		lblBookings.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBookings.setBounds(10, 88, 84, 69);
		panel.add(lblBookings);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBounds(121, 0, 313, 261);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel modify = new JLabel("Modify Booking");
		modify.setForeground(Color.WHITE);
		modify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		modify.setBounds(10, 140, 109, 19);
		panel_1.add(modify);
		
		JLabel cancel = new JLabel("Cancel Booking");
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cancel.setBounds(167, 140, 109, 19);
		panel_1.add(cancel);
		
		JLabel hotel = new JLabel("Hotel");
		hotel.setForeground(new Color(255, 255, 255));
		hotel.setBounds(10, 27, 46, 14);
		panel_1.add(hotel);
		
		JLabel Cin = new JLabel("Check-in");
		Cin.setForeground(new Color(255, 255, 255));
		Cin.setBounds(89, 27, 46, 14);
		panel_1.add(Cin);
		
		JLabel cout = new JLabel("Check-out");
		cout.setForeground(new Color(255, 255, 255));
		cout.setBounds(167, 27, 59, 14);
		panel_1.add(cout);
		
		JLabel rooms = new JLabel("Rooms");
		rooms.setForeground(new Color(255, 255, 255));
		rooms.setBounds(257, 27, 46, 14);
		panel_1.add(rooms);
		
		JLabel lblNewLabel = new JLabel("H1");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 52, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblCq = new JLabel("C1");
		lblCq.setForeground(new Color(255, 255, 255));
		lblCq.setBounds(89, 52, 46, 14);
		panel_1.add(lblCq);
		
		JLabel lblC = new JLabel("C2");
		lblC.setForeground(new Color(255, 255, 255));
		lblC.setBounds(167, 52, 46, 14);
		panel_1.add(lblC);
		
		JLabel lblR = new JLabel("R1");
		lblR.setForeground(new Color(255, 255, 255));
		lblR.setBounds(257, 52, 46, 14);
		panel_1.add(lblR);
		
	}
}

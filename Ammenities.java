import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Ammenities extends JFrame {

	private JPanel contentPane;
	private JTextField Wifi;
	private JTextField Room_Service;
	private JTextField Parking;
	private JTextField Breakfast;
	private JTextField Laundry;
	private JTextField Wifi_1;
	private JTextField Room_Service_1;
	private JTextField Parking_1;
	private JTextField Breakfast_1;
	private JTextField Laundry_1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Ammenities(User nuser) {
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
		
		JLabel lblHotelDetails = new JLabel("Hotel Details");
		lblHotelDetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHotelDetails.setBounds(10, 88, 101, 68);
		panel.add(lblHotelDetails);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBounds(121, 0, 313, 261);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnClassicRoom = new JRadioButton("Classic Room");
		rdbtnClassicRoom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnClassicRoom.setForeground(new Color(255, 255, 255));
		rdbtnClassicRoom.setBackground(new Color(72, 61, 139));
		rdbtnClassicRoom.setBounds(6, 7, 109, 23);
		panel_1.add(rdbtnClassicRoom);
		
		JRadioButton rdbtnDeluxeRoom = new JRadioButton("Deluxe Room");
		rdbtnDeluxeRoom.setForeground(Color.WHITE);
		rdbtnDeluxeRoom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnDeluxeRoom.setBackground(new Color(72, 61, 139));
		rdbtnDeluxeRoom.setBounds(173, 9, 109, 23);
		panel_1.add(rdbtnDeluxeRoom);
		
		JButton btnProceed = new JButton("Proceed");
		btnProceed.setBounds(107, 214, 89, 23);
		panel_1.add(btnProceed);
		
		JLabel lblWifi = new JLabel("Wifi");
		lblWifi.setForeground(new Color(255, 255, 255));
		lblWifi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblWifi.setBounds(20, 47, 46, 14);
		panel_1.add(lblWifi);
		
		JLabel lblRoomService = new JLabel("Room Service");
		lblRoomService.setForeground(Color.WHITE);
		lblRoomService.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRoomService.setBounds(20, 72, 89, 14);
		panel_1.add(lblRoomService);
		
		JLabel lblParking = new JLabel("Parking");
		lblParking.setForeground(Color.WHITE);
		lblParking.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblParking.setBounds(20, 97, 46, 14);
		panel_1.add(lblParking);
		
		JLabel lblComplementaryBreakfast = new JLabel("Breakfast");
		lblComplementaryBreakfast.setForeground(Color.WHITE);
		lblComplementaryBreakfast.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblComplementaryBreakfast.setBounds(20, 120, 76, 14);
		panel_1.add(lblComplementaryBreakfast);
		
		JLabel lblLaundary = new JLabel("Laundary");
		lblLaundary.setForeground(new Color(255, 255, 255));
		lblLaundary.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLaundary.setBounds(20, 145, 64, 14);
		panel_1.add(lblLaundary);
		
		Wifi = new JTextField();
		Wifi.setBounds(107, 45, 17, 20);
		panel_1.add(Wifi);
		Wifi.setColumns(10);
		
		Room_Service = new JTextField();
		Room_Service.setColumns(10);
		Room_Service.setBounds(107, 70, 17, 20);
		panel_1.add(Room_Service);
		
		Parking = new JTextField();
		Parking.setColumns(10);
		Parking.setBounds(107, 95, 17, 20);
		panel_1.add(Parking);
		
		Breakfast = new JTextField();
		Breakfast.setColumns(10);
		Breakfast.setBounds(107, 118, 17, 20);
		panel_1.add(Breakfast);
		
		Laundry = new JTextField();
		Laundry.setColumns(10);
		Laundry.setBounds(107, 143, 17, 20);
		panel_1.add(Laundry);
		
		JLabel label = new JLabel("Wifi");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(190, 48, 46, 14);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Room Service");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(190, 73, 89, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Parking");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setBounds(190, 98, 46, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Breakfast");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3.setBounds(190, 120, 76, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Laundary");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_4.setBounds(190, 145, 64, 14);
		panel_1.add(label_4);
		
		Wifi_1 = new JTextField();
		Wifi_1.setColumns(10);
		Wifi_1.setBounds(286, 45, 17, 20);
		panel_1.add(Wifi_1);
		
		Room_Service_1 = new JTextField();
		Room_Service_1.setColumns(10);
		Room_Service_1.setBounds(286, 70, 17, 20);
		panel_1.add(Room_Service_1);
		
		Parking_1 = new JTextField();
		Parking_1.setColumns(10);
		Parking_1.setBounds(286, 95, 17, 20);
		panel_1.add(Parking_1);
		
		Breakfast_1 = new JTextField();
		Breakfast_1.setColumns(10);
		Breakfast_1.setBounds(286, 118, 17, 20);
		panel_1.add(Breakfast_1);
		
		Laundry_1 = new JTextField();
		Laundry_1.setColumns(10);
		Laundry_1.setBounds(286, 143, 17, 20);
		panel_1.add(Laundry_1);
	}
}

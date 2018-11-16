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
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Detail extends JFrame {

	private JPanel contentPane;
	private JTextField Check_in;
	private JTextField Check_out;
	private JTextField No_of_rooms;
	private JTextField No_of_people;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Detail(User nuser) {
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
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerListModel(new String[] {"Hyderabad", "Bengaluru"}));
		spinner_2.setBounds(128, 36, 86, 20);
		panel_1.add(spinner_2);
		
		Check_in = new JTextField();
		Check_in.setText("DD/MM/YYYY");
		Check_in.setBounds(128, 70, 86, 20);
		panel_1.add(Check_in);
		Check_in.setColumns(10);
		
		Check_out = new JTextField();
		Check_out.setText("DD/MM/YYYY");
		Check_out.setBounds(128, 106, 86, 20);
		panel_1.add(Check_out);
		Check_out.setColumns(10);
		
		No_of_rooms = new JTextField();
		No_of_rooms.setBounds(128, 142, 86, 20);
		panel_1.add(No_of_rooms);
		No_of_rooms.setColumns(10);
		
		No_of_people = new JTextField();
		No_of_people.setBounds(128, 176, 86, 20);
		panel_1.add(No_of_people);
		No_of_people.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//booking object
				nuser.setLocation(spinner_2.getValue().toString());
				nuser.setCheck_in(Check_in.getText());
				nuser.setCheck_out(Check_out.getText());
				nuser.setNo_of_rooms(No_of_rooms.getText());
				nuser.setNo_of_people(No_of_people.getText());
				//System.out.println(nuser.getName());
				//Detail dt3 = new Detail();
				//dt3.dispose();
				Hotel h1 = new Hotel(nuser);
				h1.setVisible(true);
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(91, 212, 89, 23);
		panel_1.add(btnNewButton);
		
	}
}

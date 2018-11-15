import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class Hotel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Hotel(User nuser) {
		setBackground(new Color(255, 140, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 122, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHotels = new JLabel("Hotels");
		lblHotels.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHotels.setBounds(34, 98, 78, 52);
		panel.add(lblHotels);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBounds(121, 0, 313, 261);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnGoBack = new JButton("GO BACK");
		btnGoBack.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnGoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//Hotel h2 = new Hotel();
				//h2.dispose();
				//Detail d4 = new Detail();
				//d4.setVisible(true);
				Detail dt1 = new Detail(nuser);
				dt1.setVisible(true);
			}
		});
		btnGoBack.setBackground(UIManager.getColor("Button.background"));
		btnGoBack.setBounds(10, 11, 83, 23);
		panel_1.add(btnGoBack);
		
		JLabel lblNewLabel = new JLabel("");
		//ImageIcon icon =  new ImageIcon ("/mint.png"); 
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADRM-LAPTOP\\Desktop\\OOP\\Hulala\\bin\\mint.jpg")); 
		//ImageIcon img = new ImageIcon(this.getClass().getResource("/mint.jpg")).getImage();
		//lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(10, 45, 45, 43);
		panel_1.add(lblNewLabel);
		
		JLabel lblHotelMint = new JLabel("Hotel Mint");
		lblHotelMint.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHotelMint.setForeground(new Color(255, 255, 255));
		lblHotelMint.setBounds(81, 45, 61, 23);
		panel_1.add(lblHotelMint);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ADRM-LAPTOP\\Desktop\\OOP\\Hulala\\bin\\mercure.jpg"));
		lblNewLabel_1.setBounds(10, 109, 61, 43);
		panel_1.add(lblNewLabel_1);
		
		JButton btnBookNow = new JButton("Book now");
		btnBookNow.setBounds(206, 70, 97, 18);
		panel_1.add(btnBookNow);
		
		JLabel lblHotelMercure = new JLabel("Hotel Mercure");
		lblHotelMercure.setForeground(Color.WHITE);
		lblHotelMercure.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHotelMercure.setBounds(81, 109, 105, 23);
		panel_1.add(lblHotelMercure);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\ADRM-LAPTOP\\Desktop\\OOP\\Hulala\\bin\\trident.jpg"));
		label.setBounds(10, 173, 45, 40);
		panel_1.add(label);
		
		JLabel lblHotelTrident = new JLabel("Hotel Trident");
		lblHotelTrident.setForeground(Color.WHITE);
		lblHotelTrident.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHotelTrident.setBounds(81, 171, 105, 23);
		panel_1.add(lblHotelTrident);
		
		JButton button = new JButton("Book now");
		button.setBounds(206, 134, 97, 18);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Book now");
		button_1.setBounds(206, 195, 97, 18);
		panel_1.add(button_1);
		
		JLabel lblRsnight = new JLabel("Rs. 2499/night");
		lblRsnight.setForeground(new Color(255, 255, 255));
		lblRsnight.setBounds(206, 51, 97, 14);
		panel_1.add(lblRsnight);
		
		JLabel lblRsnight_1 = new JLabel("Rs. 4499/night");
		lblRsnight_1.setForeground(Color.WHITE);
		lblRsnight_1.setBounds(206, 115, 97, 14);
		panel_1.add(lblRsnight_1);
		
		JLabel lblRsnight_2 = new JLabel("Rs. 7999/night");
		lblRsnight_2.setForeground(Color.WHITE);
		lblRsnight_2.setBounds(206, 177, 97, 14);
		panel_1.add(lblRsnight_2);
	}

}

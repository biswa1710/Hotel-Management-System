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
import javax.swing.JOptionPane;

public class Final extends JFrame {

	private JPanel contentPane;
	private JTextField aadhar;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Final() {
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
		
		JLabel lblDetails = new JLabel("Booking");
		lblDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDetails.setBounds(31, 90, 90, 60);
		panel.add(lblDetails);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBounds(121, 0, 313, 261);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aadhar number");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(30, 50, 100, 20);
		panel_1.add(lblNewLabel);
		
		JLabel lblCheckin = new JLabel("Amount Payable");
		lblCheckin.setForeground(new Color(255, 255, 255));
		lblCheckin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCheckin.setBounds(30, 140, 100, 20);
		panel_1.add(lblCheckin);
		
		JLabel lblCheckout = new JLabel("Paisa");
		lblCheckout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCheckout.setForeground(new Color(255, 255, 255));
		lblCheckout.setBounds(200, 140, 70, 20);
		panel_1.add(lblCheckout);
		
		aadhar = new JTextField();
		aadhar.setBounds(148, 50, 100, 20);
		panel_1.add(aadhar);
		aadhar.setColumns(10);
        		
        JButton btnNewButton = new JButton("Verify");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
                if (aadhar.getText().length() == 12)
                {
                    JOptionPane.showMessageDialog(null, "Verified");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, " Invalid Number");
                }
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(91,100, 80, 20);
		panel_1.add(btnNewButton);
        
        
        JButton btnNewButton2 = new JButton("Booking Confirmed");
		btnNewButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
                if (aadhar.getText().length() == 12)
                {
                    JOptionPane.showMessageDialog(null, " Booking Complete");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, " Please verify aadhar first");
                }

			}
		});
		btnNewButton2.setBackground(UIManager.getColor("Button.background"));
		btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton2.setBounds(65, 212, 180, 23);
		panel_1.add(btnNewButton2);
	}
}

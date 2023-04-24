package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

public class RegisterForm extends JFrame {

	private JPanel contentPane;
	private JTextField fnametxt;
	private JTextField lnametxt;
	private JTextField usernametxt;
	private JTextField passwordtxt;
	private JTextField typetxt;
	private JTextField addressbtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
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
	public RegisterForm() {
		setTitle("RegisterForm");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 937, 622);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\Pictures\\viber_image_2023-03-12_18-36-20-160.png"));
		lblNewLabel_6.setBounds(766, 21, 45, 31);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("Register Form");
		lblNewLabel.setBackground(new Color(255, 128, 0));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(76, 21, 735, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(233, 96, 110, 19);
		contentPane.add(lblNewLabel_1);
		
		fnametxt = new JTextField();
		fnametxt.setBounds(409, 87, 218, 28);
		contentPane.add(fnametxt);
		fnametxt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(233, 139, 110, 28);
		contentPane.add(lblNewLabel_2);
		
		lnametxt = new JTextField();
		lnametxt.setBounds(409, 142, 218, 28);
		contentPane.add(lnametxt);
		lnametxt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Username  :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(233, 198, 110, 19);
		contentPane.add(lblNewLabel_3);
		
		usernametxt = new JTextField();
		usernametxt.setBounds(409, 196, 218, 28);
		contentPane.add(usernametxt);
		usernametxt.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Password  :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(233, 249, 110, 19);
		contentPane.add(lblNewLabel_4);
		
		passwordtxt = new JTextField();
		passwordtxt.setBounds(409, 247, 218, 28);
		contentPane.add(passwordtxt);
		passwordtxt.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Retype Pass :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(219, 289, 136, 36);
		contentPane.add(lblNewLabel_5);
		
		typetxt = new JTextField();
		typetxt.setBounds(409, 296, 218, 28);
		contentPane.add(typetxt);
		typetxt.setColumns(10);
		
		JLabel datetxt = new JLabel("BirthDate  :");
		datetxt.setFont(new Font("Tahoma", Font.BOLD, 15));
		datetxt.setBounds(233, 348, 97, 28);
		contentPane.add(datetxt);
		
		JLabel addresstxt = new JLabel("Address  :");
		addresstxt.setFont(new Font("Tahoma", Font.BOLD, 15));
		addresstxt.setBounds(245, 409, 98, 28);
		contentPane.add(addresstxt);
		
		addressbtn = new JTextField();
		addressbtn.setBounds(409, 397, 218, 57);
		contentPane.add(addressbtn);
		addressbtn.setColumns(10);
		
		JButton cancelbtn = new JButton("Cancel");
		cancelbtn.setBackground(new Color(255, 0, 0));
		cancelbtn.setForeground(new Color(255, 255, 255));
		cancelbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		cancelbtn.setBounds(312, 483, 136, 45);
		contentPane.add(cancelbtn);
		
		JButton registerbtn = new JButton("Register");
		registerbtn.setBackground(new Color(0, 0, 255));
		registerbtn.setForeground(new Color(255, 255, 255));
		registerbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		registerbtn.setBounds(540, 483, 159, 45);
		contentPane.add(registerbtn);
		
		JLabel lblNewLabel_8 = new JLabel("click here to login");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(428, 550, 240, 25);
		contentPane.add(lblNewLabel_8);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(409, 344, 218, 32);
		contentPane.add(dateChooser);
	}
}

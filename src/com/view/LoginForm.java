package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField usernametxt;
	private JTextField passwordtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setType(Type.UTILITY);
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\Pictures\\viber_image_2023-03-12_18-36-20-160.png"));
		lblNewLabel_4.setBounds(721, 42, 32, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("Login Form");
		lblNewLabel.setBackground(new Color(255, 128, 64));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(110, 31, 656, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(193, 122, 115, 31);
		contentPane.add(lblNewLabel_1);
		
		usernametxt = new JTextField();
		usernametxt.setBounds(343, 121, 209, 40);
		contentPane.add(usernametxt);
		usernametxt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password   :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(193, 208, 104, 38);
		contentPane.add(lblNewLabel_2);
		
		passwordtxt = new JTextField();
		passwordtxt.setBounds(343, 210, 209, 40);
		contentPane.add(passwordtxt);
		passwordtxt.setColumns(10);
		
		JButton cancelbtn = new JButton("Cancel");
		cancelbtn.setBackground(new Color(255, 0, 0));
		cancelbtn.setForeground(new Color(255, 255, 255));
		cancelbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		cancelbtn.setBounds(238, 320, 133, 57);
		contentPane.add(cancelbtn);
		
		JButton registerbtn = new JButton("Login");
		registerbtn.setBackground(new Color(0, 0, 255));
		registerbtn.setForeground(new Color(255, 255, 255));
		registerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		registerbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		registerbtn.setBounds(423, 320, 160, 57);
		contentPane.add(registerbtn);
		
		JLabel lblNewLabel_3 = new JLabel("click here to create a new account ");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				new RegisterForm().setVisible(true);
			}
		});
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(269, 414, 314, 24);
		contentPane.add(lblNewLabel_3);
	}
}

package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Color;

public class Welcomepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcomepage frame = new Welcomepage();
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
	public Welcomepage() {
		setType(Type.UTILITY);
		setTitle("WelcomePage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\Pictures\\Quick bill.jpeg"));
		lblNewLabel.setBounds(147, 129, 221, 216);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome To Super Market Billing System");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(137, 29, 745, 37);
		contentPane.add(lblNewLabel_1);
		
		JButton adminbtn = new JButton("Admin Login");
		adminbtn.setBackground(new Color(255, 128, 0));
		adminbtn.setForeground(new Color(255, 255, 255));
		adminbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		adminbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		adminbtn.setBounds(564, 129, 192, 53);
		contentPane.add(adminbtn);
		
		JButton btnNewButton = new JButton("Cashier Login");
		btnNewButton.setBackground(new Color(128, 0, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(564, 292, 192, 53);
		contentPane.add(btnNewButton);
	}
}

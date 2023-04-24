package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Quickbill extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quickbill frame = new Quickbill();
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
	public Quickbill() {
		setTitle("Quickbill");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 584);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\Pictures\\viber_image_2023-03-12_20-43-51-988.png"));
		lblNewLabel.setBounds(18, 19, 117, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Create Bill");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\Pictures\\create icon.png"));
		lblNewLabel_1.setBounds(145, 19, 117, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Search Bill");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\Pictures\\search icon.png"));
		lblNewLabel_2.setBounds(272, 19, 106, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Production Information");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\Pictures\\production icon.png"));
		lblNewLabel_3.setBounds(407, 14, 199, 41);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sales");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\Pictures\\sale icon.png"));
		lblNewLabel_4.setBounds(616, 19, 79, 31);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Exit");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\Pictures\\viber_image_2023-03-12_18-36-20-160.png"));
		lblNewLabel_5.setBounds(825, 23, 61, 23);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBackground(new Color(255, 255, 0));
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBounds(0, 10, 886, 58);
		contentPane.add(lblNewLabel_6);
	}
}

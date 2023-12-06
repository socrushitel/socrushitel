package dfsf;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class dhshds extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dhshds frame = new dhshds();
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
	public dhshds() {
		setForeground(Color.GREEN);
		getContentPane().setForeground(Color.YELLOW);
		setTitle("Memo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setBounds(0, 5, 88, 51);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(85, 5, 88, 51);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(162, 5, 88, 51);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(246, 5, 88, 50);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBounds(329, 5, 95, 51);
		getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBounds(0, 67, 88, 52);
		getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_6.setBounds(85, 68, 88, 51);
		getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_5.setBounds(173, 67, 77, 52);
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_11.setBounds(246, 67, 88, 52);
		getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.setBounds(191, 203, 45, 23);
		getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.setBounds(171, 130, 79, 44);
		getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setBounds(246, 130, 88, 44);
		getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setBounds(329, 130, 95, 44);
		getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setBounds(329, 66, 95, 53);
		getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBounds(0, 130, 88, 45);
		getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(85, 130, 88, 44);
		getContentPane().add(btnNewButton);
	}

}

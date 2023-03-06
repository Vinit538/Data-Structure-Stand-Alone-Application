package miniproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();  
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	  Create the frame.
	 							*/
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(64, 224, 208));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 28));
		lblNewLabel.setBounds(10, 11, 387, 38);
		contentPane.add(lblNewLabel);
		JButton array = new JButton("ARRAY");
		array.setForeground(UIManager.getColor("Button.foreground"));
		array.setBackground(Color.CYAN);
		array.setFont(new Font("Constantia", Font.BOLD, 14));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Array().setVisible(true);
			}
		});
		array.setBounds(153, 60, 130, 29);
		contentPane.add(array);
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//stack
				new Stack().setVisible(true);
			}
		});
		stack.setFont(new Font("Constantia", Font.BOLD, 14));
		stack.setBackground(Color.CYAN);
		stack.setBounds(10, 98, 107, 29);
		contentPane.add(stack);
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//queue
				new Queue().setVisible(true);
			}
		});
		queue.setFont(new Font("Constantia", Font.BOLD, 14));
		queue.setBackground(Color.CYAN);
		queue.setBounds(317, 98, 107, 29);
		contentPane.add(queue);
		JButton cqueue = new JButton("CRICULAR QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//circular queue
				new CircularQueue().setVisible(true);
			}
		});
		cqueue.setFont(new Font("Constantia", Font.BOLD, 14));
		cqueue.setBackground(Color.CYAN);
		cqueue.setBounds(115, 149, 193, 29);
		contentPane.add(cqueue);
		JButton ll = new JButton("SINGLE LINKED LIST");
		ll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Single Linked LIST
				new SingleLinkedList().setVisible(true);
			}
		});
		ll.setFont(new Font("Constantia", Font.BOLD, 14));
		ll.setBackground(Color.CYAN);
		ll.setBounds(0, 221, 203, 29);
		contentPane.add(ll);
		JButton dbl = new JButton("DOUBLY LINKED LIST");
		dbl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//doubly linked list code
				new DoublyLinkedList().setVisible(true);
			}
		});
		dbl.setFont(new Font("Constantia", Font.BOLD, 14));
		dbl.setBackground(Color.CYAN);
		dbl.setBounds(221, 221, 213, 29);
		contentPane.add(dbl);
	}
}

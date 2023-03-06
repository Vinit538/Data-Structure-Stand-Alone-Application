package miniproject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefiled;
	private JTextField element;
	private JTextField res;
	private int cq[];
	private int size;
	private int r = -1;
	private int f = 0;
	private int count = 0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblNewLabel.setBackground(new Color(255, 204, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
		lblNewLabel.setBounds(92, 11, 265, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE QUEUE SIZE :");
		lblNewLabel_1.setForeground(new Color(178, 34, 34));
		lblNewLabel_1.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(50, 50, 167, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1_1.setForeground(new Color(178, 34, 34));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(33, 125, 123, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JButton cqueue = new JButton("CREATE  QUEUE");
		cqueue.setFont(new Font("Constantia", Font.PLAIN, 12));
		cqueue.setBackground(Color.CYAN);
		cqueue.setForeground(new Color(255, 0, 0));
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Cqueue Creation code
				size=Integer.valueOf(sizefiled.getText());
				cq=new int[size];
				String message="CircularQueue is Created of size "+size;
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		cqueue.setBounds(135, 79, 152, 23);
		contentPane.add(cqueue);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Cqueue insert code
				int elem;
				if (count == size) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not Possible");
				} else {
					
					elem = Integer.valueOf(element.getText());
					r = (r + 1) % size;
					cq[r]=elem;
					count++;
					JOptionPane.showMessageDialog(contentPane, "Insertion Done SussessFully");
					element.setText("");
				}
				
			}
		});
		insert.setForeground(Color.RED);
		insert.setFont(new Font("Constantia", Font.PLAIN, 12));
		insert.setBackground(Color.CYAN);
		insert.setBounds(274, 121, 84, 23);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//cqueue deletion code
				if (count == 0) {
					JOptionPane.showMessageDialog(contentPane, "Delete not possible");
				} else {
					String message="Element deleted is " + cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f = (f + 1) % size;
					--count;
				}
			}
		});
		delete.setForeground(Color.RED);
		delete.setFont(new Font("Constantia", Font.PLAIN, 12));
		delete.setBackground(Color.CYAN);
		delete.setBounds(159, 166, 94, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//cqueue display code
				String msg="";
				int f1 = f;
				if (count == 0) {
					JOptionPane.showMessageDialog(contentPane, "Display is not Possible");
				} else {
					for (int i = 1; i <= count; i++) {
						msg=msg+" "+cq[f1];
						f1 = (f1 + 1) % size;
					}
					res.setText(msg);
				}
			}
		});
		display.setForeground(Color.RED);
		display.setFont(new Font("Constantia", Font.PLAIN, 12));
		display.setBackground(Color.CYAN);
		display.setBounds(159, 196, 94, 23);
		contentPane.add(display);
		
		sizefiled = new JTextField();
		sizefiled.setBounds(223, 47, 86, 20);
		contentPane.add(sizefiled);
		sizefiled.setColumns(10);
		
		element = new JTextField();
		element.setBounds(167, 120, 86, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		res = new JTextField();
		res.setColumns(10);
		res.setBounds(50, 230, 324, 20);
		contentPane.add(res);
		res.setColumns(10);
	}

}

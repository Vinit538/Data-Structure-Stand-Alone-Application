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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefiled;
	private JTextField element;
	private JTextField res;
	private int q[];
	private int size;
	private int r = -1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setBackground(new Color(255, 204, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
		lblNewLabel.setBounds(114, 11, 187, 22);
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
		
		JButton queue = new JButton("CREATE  QUEUE");
		queue.setFont(new Font("Constantia", Font.PLAIN, 12));
		queue.setBackground(Color.CYAN);
		queue.setForeground(new Color(255, 0, 0));
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Queue Creation code
				size=Integer.valueOf(sizefiled.getText());
				q = new int[size];
				String message="Queue created with size "+size;
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		queue.setBounds(128, 79, 160, 23);
		contentPane.add(queue);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Queue insertion code
				int elem;
				if(r==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion is not possible");
				}
				else {
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane, " Inserted Sussessfully");
					element.setText("");
				}
			}
		});
		insert.setForeground(Color.RED);
		insert.setFont(new Font("Constantia", Font.PLAIN, 12));
		insert.setBackground(Color.CYAN);
		insert.setBounds(274, 121, 91, 23);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//queue deletion code
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion is not possible");
				}
				else {
					String message="Element deleted is "+q[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f++;
				}
			}
		});
		delete.setForeground(Color.RED);
		delete.setFont(new Font("Constantia", Font.PLAIN, 12));
		delete.setBackground(Color.CYAN);
		delete.setBounds(164, 167, 96, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Queue display code
				String msg="";
				if(r==-1||f>r) {
					JOptionPane.showMessageDialog(contentPane, "Display is not posible");
				}
				else {
					for(int i=f;i<=r;i++)
					{
						msg=msg+" "+q[i];
					}
					res.setText(msg);
				}
			}
		});
		display.setForeground(Color.RED);
		display.setFont(new Font("Constantia", Font.PLAIN, 12));
		display.setBackground(Color.CYAN);
		display.setBounds(164, 196, 96, 23);
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
		res.setBounds(33, 230, 356, 20);
		contentPane.add(res);
		res.setColumns(10);
	}
}


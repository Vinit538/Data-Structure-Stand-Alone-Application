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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField tx3;
	private int s[];
	private int size;
	private int top = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stack DATA STRUCTURE");
		lblNewLabel.setBackground(new Color(255, 204, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
		lblNewLabel.setBounds(114, 11, 187, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE :");
		lblNewLabel_1.setForeground(new Color(178, 34, 34));
		lblNewLabel_1.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(50, 50, 163, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1_1.setForeground(new Color(178, 34, 34));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(33, 125, 123, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JButton stack = new JButton("CREATE  STACK");
		stack.setFont(new Font("Constantia", Font.PLAIN, 12));
		stack.setBackground(Color.CYAN);
		stack.setForeground(new Color(255, 0, 0));
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Stack Creation code
				size=Integer.valueOf(sizefield.getText());
				s=new int[size];
				String message="Stack of size "+size+" created ";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		stack.setBounds(144, 79, 138, 23);
		contentPane.add(stack);
		
		JButton PUSH = new JButton("PUSH");
		PUSH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push code
				int elem;
				if (top == size - 1) {
					JOptionPane.showMessageDialog(contentPane, "Push is not Possible ");
				} else {
					elem=Integer.valueOf(element.getText());
					++top;
					s[top] = elem;
					JOptionPane.showMessageDialog(contentPane, "Push Successfull");
					element.setText("");
				}
			}
		});
		PUSH.setForeground(Color.RED);
		PUSH.setFont(new Font("Constantia", Font.PLAIN, 12));
		PUSH.setBackground(Color.CYAN);
		PUSH.setBounds(274, 121, 84, 23);
		contentPane.add(PUSH);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//pop code
				if (top == -1) {
					JOptionPane.showMessageDialog(contentPane, "pop is not Possible ");
					
				} else {
					String message="Element deleted is "+s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
			}
		});
		pop.setForeground(Color.RED);
		pop.setFont(new Font("Constantia", Font.PLAIN, 12));
		pop.setBackground(Color.CYAN);
		pop.setBounds(182, 165, 71, 23);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display code
				String msg="";
				if (top == -1) 
				{
					JOptionPane.showMessageDialog(contentPane, "Display is not Possible ");
				} 
				else 
				{
					for (int i = top; i >= 0; i--)
					{
						msg=msg+" "+s[i];
					}
					tx3.setText(msg);
				}
			}
		});
		display.setForeground(Color.RED);
		display.setFont(new Font("Constantia", Font.PLAIN, 12));
		display.setBackground(Color.CYAN);
		display.setBounds(172, 196, 95, 23);
		contentPane.add(display);
		
		sizefield = new JTextField();
		sizefield.setBounds(223, 47, 86, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		element = new JTextField();
		element.setBounds(167, 120, 86, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		tx3 = new JTextField();
		tx3.setColumns(10);
		tx3.setBounds(97, 230, 261, 20);
		contentPane.add(tx3);
		tx3.setColumns(10);
	}

}

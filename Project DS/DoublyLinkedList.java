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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField insertfront;
	private JTextField insertrear;
	private JTextField res;
	private Node first;
	
	//Node creation code
	class Node {
		Node prelink;
		int data;
		Node nextlink;
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setBackground(new Color(255, 204, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
		lblNewLabel.setBounds(74, 11, 291, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(178, 34, 34));
		lblNewLabel_1.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 50, 167, 18);
		contentPane.add(lblNewLabel_1);
		
		JButton inertfront = new JButton("INSERT FRONT");
		inertfront.setFont(new Font("Constantia", Font.PLAIN, 12));
		inertfront.setBackground(Color.CYAN);
		inertfront.setForeground(new Color(255, 0, 0));
		inertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert front code 
				int elem =Integer.valueOf(insertfront.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;
				if (first == null) {
					first = newnode;
				} else {
					newnode.nextlink = first;
					first.prelink = newnode;
					first = newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Node Inserted in Front SussessFully");
				insertfront.setText("");
			}
		});
		inertfront.setBounds(279, 44, 137, 23);
		contentPane.add(inertfront);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//delete front code
				if (first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Delete is not Possible");
				}
				else if (first.nextlink == null)
				{
					String message="Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = null;
				} 
				else
				{
					String message="Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = first.nextlink;
					first.prelink=null;
				}
			}
		});
		deletefront.setForeground(Color.RED);
		deletefront.setFont(new Font("Constantia", Font.PLAIN, 12));
		deletefront.setBackground(Color.CYAN);
		deletefront.setBounds(151, 124, 137, 23);
		contentPane.add(deletefront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete rear code
				Node temp;
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion is not Possible");
				} else if (first.nextlink == null) {
					String message="Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = null;
				} else {
					temp = first;
					while (temp.nextlink.nextlink != null) {
						temp = temp.nextlink;
					}
					String message="Element deleted is "+temp.nextlink.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.nextlink = null;
				}
			}
		});
		deleterear.setForeground(Color.RED);
		deleterear.setFont(new Font("Constantia", Font.PLAIN, 12));
		deleterear.setBackground(Color.CYAN);
		deleterear.setBounds(149, 150, 139, 23);
		contentPane.add(deleterear);
		
		JButton displayforward = new JButton("DISPLAY FORWARD");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display forward code
				String msg="";
				Node temp;
				if (first == null) 
				{
					JOptionPane.showMessageDialog(contentPane, "Display is not Possible");
					System.out.println("Display is not Possible");
				} 
				else if (first.nextlink == null) 
				{
					msg=" " +first.data;
					res.setText(msg);
				} 
				else 
				{
					temp = first;
					while (temp != null)
					{
						msg=msg+" "+temp.data;
						temp = temp.nextlink;
					}
				}
				res.setText(msg);
			}

			
		});
		displayforward.setForeground(Color.RED);
		displayforward.setFont(new Font("Constantia", Font.PLAIN, 12));
		displayforward.setBackground(Color.CYAN);
		displayforward.setBounds(46, 184, 167, 23);
		contentPane.add(displayforward);
		
		JLabel lblNewLabel_1_2 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1_2.setForeground(new Color(178, 34, 34));
		lblNewLabel_1_2.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(10, 95, 167, 18);
		contentPane.add(lblNewLabel_1_2);
		
		JButton inertrear = new JButton("INSERT REAR");
		inertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert rear code
				
				Node temp;
				int elem =Integer.valueOf(insertrear.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;
				if (first == null) 
				{
					first = newnode;
				} 
				else
				{
					temp = first;
					while (temp.nextlink != null) 
					{
						temp = temp.nextlink;
					}
					temp.nextlink = newnode;
					newnode.prelink = temp;
				}
				JOptionPane.showMessageDialog(contentPane, "Node Inserted in Rear SussessFully");
				insertrear.setText("");
			}
		});
		inertrear.setForeground(Color.RED);
		inertrear.setFont(new Font("Constantia", Font.PLAIN, 12));
		inertrear.setBackground(Color.CYAN);
		inertrear.setBounds(279, 93, 137, 23);
		contentPane.add(inertrear);
		
		insertfront = new JTextField();
		insertfront.setBounds(167, 47, 102, 20);
		contentPane.add(insertfront);
		insertfront.setColumns(10);
		
		insertrear = new JTextField();
		insertrear.setColumns(10);
		insertrear.setBounds(167, 92, 102, 20);
		contentPane.add(insertrear);
		
		res = new JTextField();
		res.setBounds(46, 230, 347, 20);
		contentPane.add(res);
		res.setColumns(10);
		res.setColumns(10);	
		
		JButton displayreverse = new JButton("DISPLAY REVERSE");
		displayreverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display reverse code
				Node temp;
				String msg="";
				if (first == null) 
				{
					JOptionPane.showMessageDialog(contentPane, "Display is not Possible");
				} 
				else if (first.nextlink == null) 
				{
					msg=" "+first.data;
					res.setText(msg);
				} 
				else 
				{
					temp = first;
					while (temp.nextlink != null) 
					{
						temp = temp.nextlink;
					}
					while (temp != null) 
					{
							msg=msg+" "+temp.data;
							temp = temp.prelink;
					}
				}
				res.setText(msg);
			}
			
		});
		displayreverse.setForeground(Color.RED);
		displayreverse.setFont(new Font("Constantia", Font.PLAIN, 12));
		displayreverse.setBackground(Color.CYAN);
		displayreverse.setBounds(234, 184, 159, 23);
		contentPane.add(displayreverse);
	}

}

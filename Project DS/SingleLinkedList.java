package miniproject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.lang.model.element.Element;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SingleLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField insertfornt;
	private JTextField insertrear;
	private JTextField res;
	private Node first;
	class Node {
		int data;
		Node link;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingleLinkedList frame = new SingleLinkedList();
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
	public SingleLinkedList() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLE LINKED LIST DATA STRUCTURE");
		lblNewLabel.setBackground(new Color(255, 204, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
		lblNewLabel.setBounds(79, 12, 286, 22);
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
				//Code for insert front
				Node temp;
				int elem=Integer.valueOf(insertfornt.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if (first == null) {
					first = newnode;
				} else {
					newnode.link = first;
					first = newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Node Inserted in Front SussessFully");
				insertfornt.setText("");
			}
				
		});
		inertfront.setBounds(282, 44, 134, 23);
		contentPane.add(inertfront);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete front
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion is not Possible");
				} else if (first.link == null) {
					String msg="Element Deleted is"+first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					first = null;
				} else {
					String msg="Element Deleted is"+first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					first = first.link;
				}
				
			}
		});
		deletefront.setForeground(Color.RED);
		deletefront.setFont(new Font("Constantia", Font.PLAIN, 12));
		deletefront.setBackground(Color.CYAN);
		deletefront.setBounds(46, 146, 131, 23);
		contentPane.add(deletefront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Delete rear
				Node temp;
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion is not Possible");
				} else if (first.link == null) {
					String msg="Element Deleted is"+first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					first = null;
				} else {
					temp = first;
					while (temp.link.link != null) {
						temp = temp.link;
					}
					String msg="Element Deleted is"+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					temp.link = null;
				}
			}
		});
		deleterear.setForeground(Color.RED);
		deleterear.setFont(new Font("Constantia", Font.PLAIN, 12));
		deleterear.setBackground(Color.CYAN);
		deleterear.setBounds(270, 146, 123, 23);
		contentPane.add(deleterear);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				Node temp;
				if (first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display is not Possible");
				} 
				else if (first.link == null) 
				{
					msg=msg+first.data;
				}
				else 
				{
					temp = first;
					while (temp != null) 
					{
						msg=msg+" "+temp.data;
						temp = temp.link;
					}
					
				}
				res.setText(msg);
			}
		});
		display.setForeground(Color.RED);
		display.setFont(new Font("Constantia", Font.PLAIN, 12));
		display.setBackground(Color.CYAN);
		display.setBounds(187, 189, 87, 23);
		contentPane.add(display);
		
		JLabel lblNewLabel_1_2 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1_2.setForeground(new Color(178, 34, 34));
		lblNewLabel_1_2.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(10, 95, 167, 18);
		contentPane.add(lblNewLabel_1_2);
		
		JButton inertrear = new JButton("INSERT REAR");
		inertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert rear
				Node temp;
				int elem=Integer.valueOf(insertrear.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if (first == null) {
					first = newnode;
				} else {
					temp = first;
					while (temp.link != null) {
						temp = temp.link;
					}
					temp.link = newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Node Inserted in Rear SussessFully");
				insertrear.setText("");
			}
			
		});
		inertrear.setForeground(Color.RED);
		inertrear.setFont(new Font("Constantia", Font.PLAIN, 12));
		inertrear.setBackground(Color.CYAN);
		inertrear.setBounds(282, 93, 134, 23);
		contentPane.add(inertrear);
		
		insertfornt = new JTextField();
		insertfornt.setBounds(187, 47, 81, 20);
		contentPane.add(insertfornt);
		insertfornt.setColumns(10);
		
		insertrear = new JTextField();
		insertrear.setColumns(10);
		insertrear.setBounds(187, 92, 81, 20);
		contentPane.add(insertrear);
		
		res = new JTextField();
		res.setBounds(46, 230, 347, 20);
		contentPane.add(res);
		res.setColumns(10);
		res.setColumns(10);
	}
}

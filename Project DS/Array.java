package miniproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField len;
	private JTextField elem;
	private JTextField dpos;
	private JTextField res;
	private int arr[];
	private JTextField ipos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setBackground(new Color(255, 204, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
		lblNewLabel.setBounds(114, 11, 191, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH :");
		lblNewLabel_1.setForeground(new Color(178, 34, 34));
		lblNewLabel_1.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(61, 50, 160, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN INTEGER ELEMENT");
		lblNewLabel_1_1.setForeground(new Color(178, 34, 34));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 125, 169, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("POSITION");
		lblNewLabel_1_2.setForeground(new Color(178, 34, 34));
		lblNewLabel_1_2.setFont(new Font("Constantia", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(238, 125, 57, 15);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("DELETE POSITON");
		lblNewLabel_1_3.setForeground(new Color(178, 34, 34));
		lblNewLabel_1_3.setFont(new Font("Constantia", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(49, 170, 100, 15);
		contentPane.add(lblNewLabel_1_3);
		
		JButton create = new JButton("CREATE  ARRAY");
		create.setFont(new Font("Constantia", Font.PLAIN, 12));
		create.setBackground(Color.CYAN);
		create.setForeground(new Color(255, 0, 0));
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//code for creating array
				int l= Integer.valueOf(len.getText());
				arr=new int[l];
				String message="Array of length "+l+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setBounds(157, 79, 138, 23);
		contentPane.add(create);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ele=Integer.valueOf(elem.getText());
				int pos=Integer.valueOf(ipos.getText());
				arr[pos]=ele;
				String message="Element "+ele+" Inserted @ Position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				elem.setText("");
				ipos.setText("");
			}
		});
		insert.setForeground(Color.RED);
		insert.setFont(new Font("Constantia", Font.PLAIN, 12));
		insert.setBackground(Color.CYAN);
		insert.setBounds(351, 121, 83, 23);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos=Integer.valueOf(dpos.getText());
				arr[pos]=0;
				String message="Element deleted @ the position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				dpos.setText("");
			}
		});
		delete.setForeground(Color.RED);
		delete.setFont(new Font("Constantia", Font.PLAIN, 12));
		delete.setBackground(Color.CYAN);
		delete.setBounds(270, 164, 91, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				for(int i=0;i<=arr.length-1;i++)
				{
					msg=msg+" "+arr[i];
				}
				res.setText(msg);
			}
		});
		display.setForeground(Color.RED);
		display.setFont(new Font("Constantia", Font.PLAIN, 12));
		display.setBackground(Color.CYAN);
		display.setBounds(184, 199, 100, 23);
		contentPane.add(display);
		
		len = new JTextField();
		len.setBounds(250, 47, 86, 20);
		contentPane.add(len);
		len.setColumns(10);
		
		elem = new JTextField();
		elem.setColumns(10);
		elem.setBounds(184, 120, 45, 20);
		contentPane.add(elem);
		
		dpos = new JTextField();
		dpos.setColumns(10);
		dpos.setBounds(187, 165, 73, 20);
		contentPane.add(dpos);
		
		res = new JTextField();
		res.setForeground(Color.DARK_GRAY);
		res.setBounds(105, 233, 242, 20);
		contentPane.add(res);
		res.setColumns(10);
		
		ipos = new JTextField();
		ipos.setColumns(10);
		ipos.setBounds(302, 120, 45, 20);
		contentPane.add(ipos);
	}
}

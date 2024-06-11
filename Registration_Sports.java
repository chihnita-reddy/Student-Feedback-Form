package p1;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Registration_Sports {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_Sports window = new Registration_Sports();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration_Sports() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.setBounds(100, 100, 1056, 717);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION FOR SPORTS");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 44));
		lblNewLabel.setBounds(121, 11, 632, 71);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 21));
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(309, 112, 357, 54);
		frame.getContentPane().add(textField);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Segoe UI Emoji", Font.BOLD, 25));
		lblName.setBounds(37, 116, 213, 49);
		frame.getContentPane().add(lblName);
		
		JLabel lblIdNumber = new JLabel("ID NUMBER");
		lblIdNumber.setFont(new Font("Segoe UI Emoji", Font.BOLD, 25));
		lblIdNumber.setBounds(37, 193, 213, 49);
		frame.getContentPane().add(lblIdNumber);
		
		JLabel lblPhoneNumber = new JLabel("PHONE NUMBER");
		lblPhoneNumber.setFont(new Font("Segoe UI Emoji", Font.BOLD, 25));
		lblPhoneNumber.setBounds(37, 263, 213, 54);
		frame.getContentPane().add(lblPhoneNumber);
		
		JLabel lblEmailId = new JLabel("E-MAIL ID");
		lblEmailId.setFont(new Font("Segoe UI Emoji", Font.BOLD, 25));
		lblEmailId.setBounds(37, 345, 213, 54);
		frame.getContentPane().add(lblEmailId);
		
		JLabel lblGames = new JLabel("GAMES");
		lblGames.setForeground(Color.BLACK);
		lblGames.setFont(new Font("Segoe UI Emoji", Font.BOLD, 25));
		lblGames.setBounds(37, 410, 213, 54);
		frame.getContentPane().add(lblGames);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(309, 189, 357, 54);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(309, 263, 357, 54);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 21));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(309, 345, 357, 54);
		frame.getContentPane().add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Basketball", "Volleyball", "Badminton", "Tennis", "Table tennis", "Cricket", "FootBall", "Hockey"}));
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 25));
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setBounds(309, 420, 357, 54);
		frame.getContentPane().add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("SINGLE PARTICIPATION");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 21));
		rdbtnNewRadioButton.setBackground(Color.YELLOW);
		rdbtnNewRadioButton.setBounds(193, 500, 309, 54);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("DOUBLE PARTICIPATION");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		rdbtnNewRadioButton_1.setBackground(Color.YELLOW);
		rdbtnNewRadioButton_1.setBounds(193, 579, 309, 49);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JButton submit = new JButton("SUBMIT");
		submit.setForeground(Color.MAGENTA);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String name=textField.getText();
				String id=textField_1.getText();
				String phno=textField_2.getText();
				String emd=textField_3.getText();
				String Value=comboBox.getSelectedItem().toString();
				String rb=rdbtnNewRadioButton.getText();
				if(textField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(submit, "Enter the NAME");
				}
				if(textField_1.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(submit, "Enter the ID NUMBER");
				}
				if(textField_2.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(submit, "Enter the PHONE NUMBER");
				}
				if(textField_3.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(submit, "Enter the E-MAIL ID");
				}
				try
				{
					FileWriter FW=new FileWriter("C:\\Users\\bchre\\OneDrive\\Desktop\\Java\\Registration_Sports.csv",true); 
					BufferedWriter BW=new BufferedWriter(FW);
					FW.append("\n******************************REGISTRATION FOR SPORTS******************************\n");
					FW.append("NAME is = " +textField.getText() +"\n");
					FW.append("ID NUMBER IS = " +textField_1.getText() +"\n");
					FW.append("PHONE NUMBER IS = " +textField_2.getText() +"\n");
					FW.append("E-MAIL ID IS = " +textField_3.getText() +"\n");
				    FW.append("SELECTED EVENT IS = " +comboBox.getSelectedItem().toString() +"\n");
				    FW.append("PARTICIPATION IS = " +rdbtnNewRadioButton.getText() +"\n");
				    FW.append("____________________________________________________________________________\n");
				    FW.flush();
				    FW.close();
				}
				catch(IOException E)
				{
					
				}
				JOptionPane.showMessageDialog(submit, "REGISTRATION COMPLETED SUCCESSFULLY");
			}
		});
		submit.setBackground(Color.CYAN);
		submit.setFont(new Font("Times New Roman", Font.BOLD, 35));
		submit.setBounds(794, 438, 190, 92);
		frame.getContentPane().add(submit);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(Color.MAGENTA);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				comboBox.getSelectedItem();
				buttonGroup.clearSelection();
			}
		});
		btnClear.setBackground(Color.CYAN);
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 35));
		btnClear.setBounds(794, 553, 190, 92);
		frame.getContentPane().add(btnClear);
	}

}

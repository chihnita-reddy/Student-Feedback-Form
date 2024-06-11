 package p1;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class STUDENT {

	private JFrame frame;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STUDENT window = new STUDENT();
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
	public STUDENT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 977, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStudentData = new JLabel("STUDENT DATA");
		lblStudentData.setForeground(Color.BLACK);
		lblStudentData.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblStudentData.setBounds(205, 11, 475, 78);
		frame.getContentPane().add(lblStudentData);
		
		JLabel lblSectionList = new JLabel("SECTION LIST");
		lblSectionList.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblSectionList.setBounds(37, 193, 200, 47);
		frame.getContentPane().add(lblSectionList);
		
		JLabel lblFaculty = new JLabel("FACULTY ");
		lblFaculty.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblFaculty.setBounds(37, 268, 200, 47);
		frame.getContentPane().add(lblFaculty);
		
		JLabel lblStudentFeedback = new JLabel("STUDENT FEEDBACK");
		lblStudentFeedback.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblStudentFeedback.setBounds(37, 347, 225, 47);
		frame.getContentPane().add(lblStudentFeedback);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.YELLOW);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6",}));
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 21));
		comboBox.setBounds(320, 193, 243, 47);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"MANIK", "ARNAV", "KUSHI", "SHIVAYY", "NANDINI", "ANIKA", "ARJUN", "RADHA", "KRISHNA",}));
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		comboBox_1.setBackground(Color.YELLOW);
		comboBox_1.setBounds(320, 268, 243, 47);
		frame.getContentPane().add(comboBox_1);
		
		JRadioButton rb1 = new JRadioButton("EXCELLENT");
		buttonGroup_1.add(rb1);
		rb1.setBackground(Color.ORANGE);
		rb1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		rb1.setBounds(320, 351, 167, 38);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("GOOD");
		buttonGroup_1.add(rb2);
		rb2.setBackground(Color.ORANGE);
		rb2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		rb2.setBounds(527, 351, 153, 38);
		frame.getContentPane().add(rb2);
		
		JRadioButton rb3 = new JRadioButton("AVERAGE");
		buttonGroup_1.add(rb3);
		rb3.setBackground(Color.ORANGE);
		rb3.setFont(new Font("Times New Roman", Font.BOLD, 21));
		rb3.setBounds(320, 413, 136, 46);
		frame.getContentPane().add(rb3);
		
		JRadioButton rb4 = new JRadioButton("BAD");
		buttonGroup_1.add(rb4);
		rb4.setBackground(Color.ORANGE);
		rb4.setFont(new Font("Times New Roman", Font.BOLD, 21));
		rb4.setBounds(527, 413, 153, 46);
		frame.getContentPane().add(rb4);
		
		JRadioButton rb5 = new JRadioButton("POOR");
		buttonGroup_1.add(rb5);
		rb5.setBackground(Color.ORANGE);
		rb5.setFont(new Font("Times New Roman", Font.BOLD, 21));
		rb5.setBounds(320, 483, 139, 38);
		frame.getContentPane().add(rb5);
		
		JButton submit = new JButton("SUBMIT");
		submit.setBackground(Color.BLUE);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String IDNO=textField.getText();
				String Value=comboBox.getSelectedItem().toString();
				String Val=comboBox_1.getSelectedItem().toString();
				String bg=rb1.getText();
				if(textField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(submit, "Enter STUDENT ID Number only");
				}
				if(comboBox.getSelectedIndex()==0)
				{
				try  
				{
					FileWriter FW=new FileWriter("C:\\Users\\bchre\\OneDrive\\Desktop\\Java\\SAMPLE-1.csv",true);
					BufferedWriter BW=new BufferedWriter(FW);
					FW.append("\n**********************STUDENT DETAILS ARE********************** \n");
					FW.append("STUDENT ID NUMBER IS = " +textField.getText() +"\n");
					FW.append("STUDENT SECTION IS = " +comboBox.getSelectedItem().toString() +"\n");
					FW.append("FACULTY NAME IS = " +comboBox_1.getSelectedItem().toString() +"\n");
					FW.append("STUDENT FEEDBACK IS = " +rb1.getText() +"\n");
					FW.append("__________________________________________________________________");
					FW.flush();
					FW.close();
				}
				catch(IOException E)
				{
					
				}
					JOptionPane.showMessageDialog(submit, "FEEDBACK Successfully");
			}				
			else
			if(comboBox.getSelectedIndex()==1)
			{
				try  
				{
						FileWriter FW=new FileWriter("C:\\Users\\bchre\\OneDrive\\Desktop\\Java\\SAMPLE-2.csv",true);
						BufferedWriter BW=new BufferedWriter(FW);
						FW.append("\n**********************STUDENT DETAILS ARE********************** \n");
						FW.append("STUDENT ID NUMBER IS = " +textField.getText() +"\n");
						FW.append("STUDENT SECTION IS = " +comboBox.getSelectedItem().toString() +"\n");
						FW.append("FACULTY NAME IS = " +comboBox_1.getSelectedItem().toString() +"\n");
						FW.append("STUDENT FEEDBACK IS = " +rb1.getText() +"\n");
						FW.append("__________________________________________________________________");
						FW.flush();
						FW.close();
				}
				catch(IOException E)
					{
							
			     	}
					JOptionPane.showMessageDialog(submit, "FEEDBACK Successfully");
		   }
			else
			if(comboBox.getSelectedIndex()==2)
			{
     			try  
				{
						FileWriter FW=new FileWriter("C:\\Users\\bchre\\OneDrive\\Desktop\\Java\\SAMPLE-3.csv",true);
						BufferedWriter BW=new BufferedWriter(FW);
						FW.append("\n**********************STUDENT DETAILS ARE********************** \n");
						FW.append("STUDENT ID NUMBER IS = " +textField.getText() +"\n");
						FW.append("STUDENT SECTION IS = " +comboBox.getSelectedItem().toString() +"\n");
						FW.append("FACULTY NAME IS = " +comboBox_1.getSelectedItem().toString() +"\n");
						FW.append("STUDENT FEEDBACK IS = " +rb1.getText() +"\n");
						FW.append("__________________________________________________________________");
						FW.flush();
						FW.close();
				}
				catch(IOException E)
					{
										
					}
				JOptionPane.showMessageDialog(submit, "FEEDBACK Successfully");
			}
		  	else
			if(comboBox.getSelectedIndex()==3)
			 {
				try  
				{
					FileWriter FW=new FileWriter("C:\\Users\\bchre\\OneDrive\\Desktop\\Java\\SAMPLE-4.csv",true);
					BufferedWriter BW=new BufferedWriter(FW);
					FW.append("\n**********************STUDENT DETAILS ARE********************** \n");
					FW.append("STUDENT ID NUMBER IS = " +textField.getText() +"\n");
					FW.append("STUDENT SECTION IS = " +comboBox.getSelectedItem().toString() +"\n");
					FW.append("FACULTY NAME IS = " +comboBox_1.getSelectedItem().toString() +"\n");
					FW.append("STUDENT FEEDBACK IS = " +rb1.getText() +"\n");
					FW.append("__________________________________________________________________");
					FW.flush();
					FW.close();
				}
				catch(IOException E)
						{
									
						}
				JOptionPane.showMessageDialog(submit, "FEEDBACK Successfully");
			}
             else
			 if(comboBox.getSelectedIndex()==4)
			 {
				try  
				 {
						FileWriter FW=new FileWriter("C:\\Users\\bchre\\OneDrive\\Desktop\\Java\\SAMPLE-5.csv",true);
						BufferedWriter BW=new BufferedWriter(FW);
						FW.append("\n**********************STUDENT DETAILS ARE********************** \n");
						FW.append("STUDENT ID NUMBER IS = " +textField.getText() +"\n");
						FW.append("STUDENT SECTION IS = " +comboBox.getSelectedItem().toString() +"\n");
						FW.append("FACULTY NAME IS = " +comboBox_1.getSelectedItem().toString() +"\n");
						FW.append("STUDENT FEEDBACK IS = " +rb1.getText() +"\n");
						FW.append("__________________________________________________________________");
						FW.flush();
						FW.close();
				 }
				catch(IOException E)
				  { 
										
				  }
				JOptionPane.showMessageDialog(submit, "FEEDBACK Successfully");
				}
				else
				if(comboBox.getSelectedIndex()==5)
				{
					try  
					{
						FileWriter FW=new FileWriter("C:\\Users\\bchre\\OneDrive\\Desktop\\Java\\SAMPLE-6.csv",true);
                        BufferedWriter BW=new BufferedWriter(FW);
                        FW.append("\n**********************STUDENT DETAILS ARE********************** \n");
            			FW.append("STUDENT ID NUMBER IS = " + textField.getText() +"\n");
                        FW.append("STUDENT SECTION IS = " +comboBox.getSelectedItem().toString() +"\n");
						FW.append("FACULTY NAME IS = " +comboBox_1.getSelectedItem().toString() +"\n");
						FW.append("STUDENT FEEDBACK IS = " +rb1.getText() +"\n");
						FW.append("__________________________________________________________________");
						FW.flush();
						FW.close();
					}
					catch(IOException E)
					 {
											
				     }
				 JOptionPane.showMessageDialog(submit, "FEEDBACK Successfully");
				}
			}
		});
		submit.setFont(new Font("Times New Roman", Font.BOLD, 21));
		submit.setBounds(671, 138, 200, 47);
		frame.getContentPane().add(submit);
		
		JButton btnNewButton_1_1 = new JButton("CLEAR");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
				comboBox.getSelectedItem();
				comboBox_1.getSelectedItem();
				buttonGroup_1.clearSelection();
			}
		});
		btnNewButton_1_1.setBackground(Color.BLUE);
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnNewButton_1_1.setBounds(671, 213, 200, 47);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("STUDENT ID NO");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setBounds(37, 104, 213, 58);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.YELLOW);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 21));
		textField.setBounds(311, 104, 249, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}

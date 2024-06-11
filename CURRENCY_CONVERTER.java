package p1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner.DefaultEditor;
import java.awt.event.ItemListener;
import java.io.FileWriter;
import java.awt.event.ItemEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CURRENCY_CONVERTER {

	
	private JFrame frmCurrencyConverter;
	private JTextField txtvalue;
	private JTextField txtcur;
	JSpinner sv;
	JSpinner sv_1;
	double v,s,s1;
	private JTextField txtcur1;
	JComboBox cmbcountry_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CURRENCY_CONVERTER window = new CURRENCY_CONVERTER();
					window.frmCurrencyConverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CURRENCY_CONVERTER() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCurrencyConverter = new JFrame();
		frmCurrencyConverter.setBounds(100, 100, 450, 300);
		frmCurrencyConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCurrencyConverter = new JFrame();
		
		frmCurrencyConverter.getContentPane().setBackground(Color.CYAN);
		frmCurrencyConverter.setBounds(100, 100, 1013, 657);
		frmCurrencyConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCurrencyConverter.getContentPane().setLayout(null);
		
		JLabel lblSelectCountry = new JLabel("CURRENCY CONVERTER");
		lblSelectCountry.setBackground(Color.CYAN);
		lblSelectCountry.setForeground(new Color(0, 0, 139));
		lblSelectCountry.setFont(new Font("Times New Roman", Font.BOLD, 55));
		lblSelectCountry.setBounds(99, 11, 718, 87);
		frmCurrencyConverter.getContentPane().add(lblSelectCountry);
		
		JLabel lblEnterValue = new JLabel("Enter Value :");
		lblEnterValue.setForeground(new Color(153, 50, 204));
		lblEnterValue.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblEnterValue.setBounds(25, 297, 193, 73);
		frmCurrencyConverter.getContentPane().add(lblEnterValue);
		
		JLabel lblEquivalentCurrencyValue = new JLabel("CURRENCY VALUE");
		lblEquivalentCurrencyValue.setForeground(new Color(65, 105, 225));
		lblEquivalentCurrencyValue.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblEquivalentCurrencyValue.setBounds(25, 405, 273, 78);
		frmCurrencyConverter.getContentPane().add(lblEquivalentCurrencyValue);
		
		JComboBox cmbcountry = new JComboBox();
		cmbcountry.setFont(new Font("Times New Roman", Font.BOLD, 25));
		cmbcountry.setBackground(Color.ORANGE);
		cmbcountry.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				/*String ImgPath1 = "E:\\Currency Converter\\";
				String ImgPath2 = "E:\\Currency Converter\\";*/
				if(cmbcountry.getSelectedIndex()==0)
				{
					sv.setValue(0);
					sv.setEnabled(false);
					txtcur.setText(null);
					txtvalue.setText(null);
				}
				if(cmbcountry.getSelectedIndex()==1)
				{
					/*ImgPath1 = ImgPath1 +"india.png";
					ImgPath2 = ImgPath2 + "rupee.jpg";*/
					txtcur.setText("Rupee");
					sv.setValue(0);
					txtvalue.setText(null);
					sv.setEnabled(true);
				}
				if(cmbcountry.getSelectedIndex()==2)
				{
					/*ImgPath1 = ImgPath1 +"singapore.png";
					ImgPath2 = ImgPath2 + "singd.jpeg";*/
					txtcur.setText("Singapore Dollar");
					sv.setValue(0);
					txtvalue.setText(null);
					sv.setEnabled(true);
				}
				if(cmbcountry.getSelectedIndex()==3)
				{
					/*ImgPath1 = ImgPath1 +"australia.png";
					ImgPath2 = ImgPath2 + "ausd.png";*/
					txtcur.setText("Australian Dollar");
					sv.setValue(0);
					txtvalue.setText(null);
					sv.setEnabled(true);
				}
				/*if(cmbcountry.getSelectedIndex()==4)
				{
					ImgPath1 = ImgPath1 +"switzerland.png";
					ImgPath2 = ImgPath2 + "swic.jpeg";
					txtcur.setText("Swiss Franc");
					sv.setValue(0);
					txtvalue.setText(null);
					sv.setEnabled(true);
				}
				if(cmbcountry.getSelectedIndex()==5)
				{
					ImgPath1 = ImgPath1 +"dubai.png";
					ImgPath2 = ImgPath2 + "dubaic.png";
					txtcur.setText("Dirham");
					sv.setValue(0);
					txtvalue.setText(null);
					sv.setEnabled(true);
				}
				if(cmbcountry.getSelectedIndex()==6)
				{
					ImgPath1 = ImgPath1 +"japan.png";
					ImgPath2 = ImgPath2 + "japanc.png";
					txtcur.setText("Yen");
					sv.setValue(0);
					txtvalue.setText(null);
					sv.setEnabled(true);
				}
				if(cmbcountry.getSelectedIndex()==7)
				{
					ImgPath1 = ImgPath1 +"russia.png";
					ImgPath2 = ImgPath2 + "russiac.png";
					txtcur.setText("Ruble");
					sv.setValue(0);
					txtvalue.setText(null);
					sv.setEnabled(true);
				}
				if(cmbcountry.getSelectedIndex()==8)
				{
					ImgPath1 = ImgPath1 +"ukraine.png";
					ImgPath2 = ImgPath2 + "ukrainec.png";
					txtcur.setText("Hryvnia");
					sv.setValue(0);
					txtvalue.setText(null);
					sv.setEnabled(true);
				}
				if(cmbcountry.getSelectedIndex()==9)
				{
					ImgPath1 = ImgPath1 +"germany.png";
					ImgPath2 = ImgPath2 + "germanyc.jpeg";
					txtcur.setText("Euro");
					sv.setValue(0);
					txtvalue.setText(null);
					sv.setEnabled(true);
				}
				if(cmbcountry.getSelectedIndex()==10)
				{
					ImgPath1 = ImgPath1 +"brazil.png";
					ImgPath2 = ImgPath2 + "brazilc.png";
					txtcur.setText("Brazilian Real");
					sv.setValue(0);
					txtvalue.setText(null);
					sv.setEnabled(true);
				}*/
				/*ImageIcon ImgIcon1 = new ImageIcon(ImgPath1);
				ImageIcon ImgIcon2 = new ImageIcon(ImgPath2);
				lblcur.setIcon(ImgIcon2);
				lblflag.setIcon(ImgIcon1);*/
			}
		});
		cmbcountry.setModel(new DefaultComboBoxModel(new String[] {"SELECT COUNTRY", "INDIA", "SINGAPORE", "AUSTRALIA"}));
		cmbcountry.setBounds(10, 135, 302, 53);
		frmCurrencyConverter.getContentPane().add(cmbcountry);
		
		sv = new JSpinner();
		sv.setBackground(new Color(0, 128, 128));
		sv.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(Double.parseDouble(sv.getValue().toString())>=1)
				{
			if(cmbcountry.getSelectedIndex()==1  && cmbcountry_1.getSelectedIndex()==1)
					{
						
						s = Double.parseDouble(sv.getValue().toString())*0.013;
						if((Double.parseDouble(sv.getValue().toString())>=1))
						txtvalue.setText(Double.toString(s)+" swiss franc");
					}
		
					if(cmbcountry.getSelectedIndex()==1 && cmbcountry_1.getSelectedIndex()==2 )
					{
						s= Double.parseDouble(sv.getValue().toString())*0.048;
						if((Double.parseDouble(sv.getValue().toString())>=1))
						txtvalue.setText(Double.toString(s)+" dirham");
					}
					
					if(cmbcountry.getSelectedIndex()==1 &&  cmbcountry_1.getSelectedIndex()==3)
					{
						s = Double.parseDouble(sv.getValue().toString())*1.68;
						if((Double.parseDouble(sv.getValue().toString())>=1))
						txtvalue.setText(Double.toString(s)+" yen");
					}
				if(cmbcountry.getSelectedIndex()==2 && cmbcountry_1.getSelectedIndex()==1)
				{
					s = Double.parseDouble(sv.getValue().toString())*0.70;
					if((Double.parseDouble(sv.getValue().toString())>=1))
					txtvalue.setText(Double.toString(s)+" swiss franc");
				}
				if(cmbcountry.getSelectedIndex()==2 && cmbcountry_1.getSelectedIndex()==2)
				{
					s = Double.parseDouble(sv.getValue().toString())*2.68;
					if((Double.parseDouble(sv.getValue().toString())>=1))
					txtvalue.setText(Double.toString(s)+" dhiram");
				}
				if(cmbcountry.getSelectedIndex()==2 && cmbcountry_1.getSelectedIndex()==3)
				{
					s = Double.parseDouble(sv.getValue().toString())*93.70;
					if((Double.parseDouble(sv.getValue().toString())>=1))
					txtvalue.setText(Double.toString(s)+" yen ");
				}
				if(cmbcountry.getSelectedIndex()==3 && cmbcountry_1.getSelectedIndex()==1)
				{
					s = Double.parseDouble(sv.getValue().toString())*0.69;
					if((Double.parseDouble(sv.getValue().toString())>=1))
					txtvalue.setText(Double.toString(s)+" swiss france");
				}
				if(cmbcountry.getSelectedIndex()==3 && cmbcountry_1.getSelectedIndex()==2)
				{
					s = Double.parseDouble(sv.getValue().toString())*2.66;
					if((Double.parseDouble(sv.getValue().toString())>=1))
					txtvalue.setText(Double.toString(s)+" dhiram");
				}
				if(cmbcountry.getSelectedIndex()==3 && cmbcountry_1.getSelectedIndex()==3)
				{
					s = Double.parseDouble(sv.getValue().toString())*93.13;
					if((Double.parseDouble(sv.getValue().toString())>=1))
					txtvalue.setText(Double.toString(s)+" yen");
				}
			
	 
				}
				else
				{
					txtvalue.setText(Integer.toString(0));
				}
			}
		});
		sv.setModel(new SpinnerNumberModel(0, 0, 100000, 1));
		sv.setFont(new Font("Times New Roman", Font.BOLD, 25));
		sv.setBounds(300, 297, 96, 56);
		sv.setEnabled(false);
		((DefaultEditor)sv.getEditor()).getTextField().setEditable(false);
		frmCurrencyConverter.getContentPane().add(sv);
		
		txtvalue = new JTextField();
		txtvalue.setForeground(new Color(102, 0, 153));
		txtvalue.setBackground(new Color(255, 255, 255));
		txtvalue.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtvalue.setEditable(false);
		txtvalue.setBounds(356, 405, 224, 78);
		frmCurrencyConverter.getContentPane().add(txtvalue);
		txtvalue.setColumns(10);
		
		txtcur = new JTextField();
		txtcur.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtcur.setEditable(false);
		txtcur.setBounds(368, 202, 225, 56);
		frmCurrencyConverter.getContentPane().add(txtcur);
		txtcur.setColumns(10);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbcountry.setSelectedIndex(0);
			}
		});
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnClear.setBackground(Color.BLACK);
		btnClear.setBounds(63, 522, 162, 54);
		frmCurrencyConverter.getContentPane().add(btnClear);
		
		cmbcountry_1 = new JComboBox();
		cmbcountry_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		cmbcountry_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				if(cmbcountry_1.getSelectedIndex()==0)
				{
					sv_1.setValue(0);
					sv_1.setEnabled(false);
					txtcur1.setText(null);
					txtvalue.setText(null);
				}
				if(cmbcountry_1.getSelectedIndex()==1)
				{
					/*ImgPath1 = ImgPath1 +"switzerland.png";
					ImgPath2 = ImgPath2 + "swic.jpeg";*/
					txtcur1.setText("Swiss Franc");
					sv_1.setValue(0);
					txtvalue.setText(null);
					sv_1.setEnabled(true);
				}
				if(cmbcountry_1.getSelectedIndex()==2)
				{
					/*ImgPath1 = ImgPath1 +"dubai.png";
					ImgPath2 = ImgPath2 + "dubaic.png";*/
					txtcur1.setText("Dirham");
					sv_1.setValue(0);
					txtvalue.setText(null);
					sv_1.setEnabled(true);
				}
				if(cmbcountry_1.getSelectedIndex()==3)
				{
					/*ImgPath1 = ImgPath1 +"japan.png";
					ImgPath2 = ImgPath2 + "japanc.png";*/
					txtcur1.setText("Yen");
					sv_1.setValue(0);
					txtvalue.setText(null);
					sv_1.setEnabled(true);
				}
			}
		});
		cmbcountry_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT COUNTRY", "SWITZERLAND", "DUBAI", "JAPAN"}));
		cmbcountry_1.setBackground(Color.ORANGE);
		cmbcountry_1.setBounds(10, 213, 302, 45);
		frmCurrencyConverter.getContentPane().add(cmbcountry_1);
		
		txtcur1 = new JTextField();
		txtcur1.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtcur1.setEditable(false);
		txtcur1.setColumns(10);
		txtcur1.setBounds(368, 135, 225, 53);
		frmCurrencyConverter.getContentPane().add(txtcur1);
		
		 sv_1 = new JSpinner();
		 sv_1.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		 sv_1.setBackground(new Color(0, 128, 128));
		sv_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e)
			{
				if(Double.parseDouble(sv_1.getValue().toString())>=1)
				{
			if(cmbcountry_1.getSelectedIndex()==1  && cmbcountry.getSelectedIndex()==1)
					{
						
						s = Double.parseDouble(sv_1.getValue().toString())*79.87;
						if((Double.parseDouble(sv_1.getValue().toString())>=1))
						txtvalue.setText(Double.toString(s)+" rupees");
					}
					
					if(cmbcountry_1.getSelectedIndex()==1 && cmbcountry.getSelectedIndex()==2 )
					{
						s= Double.parseDouble(sv_1.getValue().toString())*1.43;
						if((Double.parseDouble(sv_1.getValue().toString())>=1))
						txtvalue.setText(Double.toString(s)+" singapore dollar");
					}
					
					if(cmbcountry_1.getSelectedIndex()==1 &&  cmbcountry.getSelectedIndex()==3)
					{
						s = Double.parseDouble(sv_1.getValue().toString())*1.44;
						if((Double.parseDouble(sv_1.getValue().toString())>=1))
						txtvalue.setText(Double.toString(s)+" australian dollar");
					}
				if(cmbcountry_1.getSelectedIndex()==2 && cmbcountry.getSelectedIndex()==1)
				{
					s = Double.parseDouble(sv_1.getValue().toString())*20.82;
					if((Double.parseDouble(sv_1.getValue().toString())>=1))
					txtvalue.setText(Double.toString(s)+" rupees");
				}
				if(cmbcountry_1.getSelectedIndex()==2 && cmbcountry.getSelectedIndex()==2)
				{
					s = Double.parseDouble(sv_1.getValue().toString())*0.37;
					if((Double.parseDouble(sv_1.getValue().toString())>=1))
					txtvalue.setText(Double.toString(s)+" singapore dollar");
				}
				if(cmbcountry_1.getSelectedIndex()==2 && cmbcountry.getSelectedIndex()==3)
				{
					s = Double.parseDouble(sv_1.getValue().toString())*0.38;
					if((Double.parseDouble(sv_1.getValue().toString())>=1))
					txtvalue.setText(Double.toString(s)+" australian dollar");
				}
				if(cmbcountry_1.getSelectedIndex()==3 && cmbcountry.getSelectedIndex()==1)
				{
					s = Double.parseDouble(sv_1.getValue().toString())*0.59;
					if((Double.parseDouble(sv_1.getValue().toString())>=1))
					txtvalue.setText(Double.toString(s)+" rupees");
				}
				if(cmbcountry_1.getSelectedIndex()==3 && cmbcountry.getSelectedIndex()==2)
				{
					s = Double.parseDouble(sv_1.getValue().toString())*0.011;
					if((Double.parseDouble(sv_1.getValue().toString())>=1))
					txtvalue.setText(Double.toString(s)+" singapore dollar");
				}
				if(cmbcountry_1.getSelectedIndex()==3 && cmbcountry.getSelectedIndex()==3)
				{
					s = Double.parseDouble(sv_1.getValue().toString())*0.011;
					if((Double.parseDouble(sv_1.getValue().toString())>=1))
					txtvalue.setText(Double.toString(s)+" australian dollar");
				}
				}
				else
				{
					txtvalue.setText(Integer.toString(0));
				}
			}
			});
		sv_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		sv_1.setEnabled(false);
		((DefaultEditor)sv_1.getEditor()).getTextField().setEditable(false);
		sv_1.setBounds(497, 297, 96, 56);
		frmCurrencyConverter.getContentPane().add(sv_1);
		
		JButton btnstore = new JButton("SUBMIT");
		btnstore.setForeground(new Color(102, 0, 0));
		btnstore.setBackground(new Color(204, 153, 255));
		btnstore.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnstore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String c1,c2,cn,cn1,res;
			int s1,s2;
			c1 = (String) cmbcountry.getSelectedItem();
			c2 = (String) cmbcountry_1.getSelectedItem();
			s1 = (int) sv.getValue();
			s2 = (int) sv_1.getValue();
			cn = txtcur.getText();
			cn1 = txtcur1.getText();
			res = txtvalue.getText();
			try
			{
				FileWriter fw = new FileWriter("C:\\Users\\bchre\\OneDrive\\Desktop\\Java\\CURRENCY_CONVERTER.csv",true);
				fw.write(c1+","+cn+","+c2+","+cn1+","+s1+","+s2+","+res+"\n");
				fw.close();
				JOptionPane.showMessageDialog(null, "SUCCESSFULLY CONVERTED");
			}
			catch(Exception E)
			{
				JOptionPane.showMessageDialog(null, "ERROR OCCURED");
			}
			}
		});
		btnstore.setBounds(275, 522, 151, 53);
		frmCurrencyConverter.getContentPane().add(btnstore);
	}

}

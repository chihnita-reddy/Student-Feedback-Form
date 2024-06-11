package p1; 
 
import java.awt.EventQueue; 
 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JOptionPane; 
 
import java.awt.Font; 
import javax.swing.JTextField; 
import javax.swing.SpinnerNumberModel; 
import javax.swing.JSpinner; 
import javax.swing.JComboBox; 
import javax.swing.ButtonGroup; 
import javax.swing.DefaultComboBoxModel; 
import javax.swing.JButton; 
import java.awt.event.ActionListener; 
import java.io.*; 
import java.awt.event.ActionEvent; 
import java.awt.Color; 
import javax.swing.JRadioButton; 
 
public class HOTEL_BOOKING { 
 
 private JFrame frame; 
 private JTextField NameTxt; 
 private JTextField Checkin; 
 private JTextField Checkout; 
  
 private String Name, Age, Gender, CheckinDt, CheckoutDt, HeadCount, roomac,roombed; 
 private String s1 , s2; 
 boolean flag = true; 
 /** 
  * Launch the application. 
  */ 
 public static void main(String[] args) { 
  EventQueue.invokeLater(new Runnable() { 
   public void run() { 
    try { 
    	HOTEL_BOOKING window = new HOTEL_BOOKING(); 
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
 public HOTEL_BOOKING() { 
  initialize(); 
 } 
 
 /** 
  * Initialize the contents of the frame. 
  */ 
 private void initialize() { 
  frame = new JFrame(); 
  frame.getContentPane().setBackground(Color.CYAN);
  frame.getContentPane().setForeground(Color.YELLOW);
  frame.setBounds(100, 100, 1013, 712); 
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  frame.getContentPane().setLayout(null); 
   
  JLabel lblNewLabel = new JLabel("FIVE STAR HOTEL"); 
  lblNewLabel.setForeground(Color.BLUE);
  lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 43)); 
  lblNewLabel.setBounds(168, 11, 454, 52); 
  frame.getContentPane().add(lblNewLabel); 
   
  JLabel lblNewLabel_1 = new JLabel("Name"); 
  lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25)); 
  lblNewLabel_1.setBounds(40, 83, 131, 37); 
  frame.getContentPane().add(lblNewLabel_1); 
   
  JLabel lblNewLabel_1_1 = new JLabel("Age"); 
  lblNewLabel_1_1.setBackground(new Color(240, 240, 240));
  lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25)); 
  lblNewLabel_1_1.setBounds(40, 142, 100, 34); 
  frame.getContentPane().add(lblNewLabel_1_1); 
   
  JLabel lblNewLabel_1_2 = new JLabel("Gender"); 
  lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 25)); 
  lblNewLabel_1_2.setBounds(40, 187, 153, 37); 
  frame.getContentPane().add(lblNewLabel_1_2); 
   
  JLabel lblNewLabel_1_3 = new JLabel("Check-in-date"); 
  lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 25)); 
  lblNewLabel_1_3.setBounds(37, 247, 209, 37); 
  frame.getContentPane().add(lblNewLabel_1_3); 
   
  JLabel lblNewLabel_1_5 = new JLabel("Check-out-date"); 
  lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 25)); 
  lblNewLabel_1_5.setBounds(37, 315, 220, 43); 
  frame.getContentPane().add(lblNewLabel_1_5); 
   
  JLabel lblNewLabel_1_6 = new JLabel("Headcount"); 
  lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 25)); 
  lblNewLabel_1_6.setBounds(45, 373, 201, 52); 
  frame.getContentPane().add(lblNewLabel_1_6); 
   
  JLabel lblNewLabel_1_7 = new JLabel("Room preference"); 
  lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 25)); 
  lblNewLabel_1_7.setBounds(36, 522, 256, 35); 
  frame.getContentPane().add(lblNewLabel_1_7); 
   
  NameTxt = new JTextField(); 
  NameTxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
  NameTxt.setBackground(Color.ORANGE);
  NameTxt.setBounds(311, 70, 209, 34); 
  frame.getContentPane().add(NameTxt); 
  NameTxt.setColumns(10); 
   
  SpinnerNumberModel model3 = new SpinnerNumberModel(0,0,100,1); 
  JSpinner AgeSpinner = new JSpinner(model3); 
  AgeSpinner.setBackground(Color.ORANGE);
  AgeSpinner.setFont(new Font("Tahoma", Font.PLAIN, 18));
  AgeSpinner.setBounds(311, 127, 153, 34); 
  frame.getContentPane().add(AgeSpinner); 
   
  JComboBox GenderCmbbox = new JComboBox(); 
  GenderCmbbox.setBackground(Color.ORANGE);
  GenderCmbbox.setFont(new Font("Tahoma", Font.BOLD, 18));
  GenderCmbbox.setModel(new DefaultComboBoxModel(new String[] { "Male", "Female"})); 
  GenderCmbbox.setBounds(311, 187, 153, 43); 
  frame.getContentPane().add(GenderCmbbox); 
   
  Checkin = new JTextField(); 
  Checkin.setFont(new Font("Tahoma", Font.BOLD, 18));
  Checkin.setBackground(Color.ORANGE);
  Checkin.setColumns(10); 
  Checkin.setBounds(311, 263, 153, 37); 
  frame.getContentPane().add(Checkin); 
   
  Checkout = new JTextField(); 
  Checkout.setBackground(Color.ORANGE);
  Checkout.setFont(new Font("Tahoma", Font.BOLD, 18));
  Checkout.setColumns(10); 
  Checkout.setBounds(311, 323, 153,33); 
  frame.getContentPane().add(Checkout); 
   
  SpinnerNumberModel model1 = new SpinnerNumberModel(0,0,5,1); 
  JSpinner HeadcountSpinner = new JSpinner(model1); 
  HeadcountSpinner.setBackground(Color.ORANGE);
  HeadcountSpinner.setFont(new Font("Tahoma", Font.PLAIN, 18));
  HeadcountSpinner.setBounds(315, 381, 87, 43); 
  frame.getContentPane().add(HeadcountSpinner); 
   
  SpinnerNumberModel model2 = new SpinnerNumberModel(1,1,10,1); 
   
  JButton Submitbtn = new JButton("Submit"); 
  Submitbtn.setBackground(Color.BLUE);
  Submitbtn.setForeground(Color.BLACK);
  Submitbtn.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e){ 
    Name = NameTxt.getText(); 
    Age = String.valueOf(AgeSpinner.getValue()); 
    Gender = (String)GenderCmbbox.getSelectedItem(); 
    CheckinDt = Checkin.getText(); 
    CheckoutDt = Checkout.getText(); 
    HeadCount = String.valueOf(HeadcountSpinner.getValue()) ; 
    roomac = s1; 
    roombed=s2; 
    verify(Name, Age, Gender, CheckinDt, CheckoutDt, HeadCount, roomac,roombed); 
    if(flag == true) { 
     String details = "Name: " + Name + "\n" + 
       "Age: " + Age + "\n" +  
       "Gender: " + Gender + "\n" + 
       "Check-in-Date: " + CheckinDt + "\n" +  
       "Check-out-Date: " + CheckoutDt + "\n" + 
       "Headcount: " + HeadCount + "\n" + 
       "Room preference : " + roomac + "  " + roombed+ "\n\n"; 
     JOptionPane.showMessageDialog(Submitbtn, details); 
     try
     { 
      FileWriter f = new FileWriter("C:\\Users\\bchre\\OneDrive\\Desktop\\Java\\HOTEL_BOOKING.csv",true); 
      BufferedWriter bf = new BufferedWriter(f); 
      bf.write(details); 
      bf.newLine(); 
      bf.close(); 
      f.close(); 
       
     } catch (IOException e1) { 
      JOptionPane.showMessageDialog(Submitbtn, "Error"); 
      e1.printStackTrace(); 
     } 
     System.exit(0); 
    } 
    else { 
     JOptionPane.showMessageDialog(Submitbtn, "Re-Enter the form correctly"); 
    } 
   } 
    
    
 
   private void verify(String name, String age, String gender, String checkinDt, String checkoutDt, 
     String headCount, String roomac,String roombed) { 
    //System.out.println(name.length() + age + gender + checkinDt.length() + checkoutDt.length() + headCount + roomac +roombed); 
    if(name.length() == 0 || age == "0" || gender == "--" || checkinDt.length() == 0 ||  checkoutDt.length() == 0 || headCount == "0" || roomac.isEmpty() || roombed.isEmpty()) { 
     JOptionPane.showMessageDialog(Submitbtn, "Enter all the fields!!"); 
     flag = false; 
    } 
    else { 
     if(Integer.parseInt(age) > 0 && Integer.parseInt(age) <= 100) { 
      Age = age; 
      flag = true; 
     } 
     else { 
      flag = false; 
      Age = null; 
      JOptionPane.showMessageDialog(Submitbtn, "Invalid Age, please submit the form again"); 
     } 
      
     if(Integer.parseInt(age) < 18) { 
      flag = false; 
      JOptionPane.showMessageDialog(Submitbtn, "You are underaged"); 
     } 
      
     if(!CheckDateFormat(checkinDt)) { 
      flag = false; 
      JOptionPane.showMessageDialog(Submitbtn, "Invalid Check in Date Format, make sure its DD/MM/YYYY or DD-MM-YYYY"); 
     } 
      
     if(!CheckDateFormat(checkoutDt)) { 
      flag = false; 
      JOptionPane.showMessageDialog(Submitbtn, "Invalid Check out Date Format, make sure its DD/MM/YYYY or DD-MM-YYYY"); 
     } 
      
     if(Integer.parseInt(headCount) > 5) { 
      flag = false; 
      JOptionPane.showMessageDialog(Submitbtn, "HeadCount Limit exceded (max = 5)"); 
     } 
      
    } 
     
   } 
    
   private boolean CheckDateFormat(String Date) { 
     
    // DD/MM/YYYY 01-34-6789 checking 01 34 and 6789 check 2 5  
	   if((Date.charAt(2) == '/' || Date.charAt(2) == '-') && (Date.charAt(5) == '/' || Date.charAt(5) == '-')) {  
     return true; 
    } 
    else { 
     return false; 
    } 
     
   } 
  }); 
  Submitbtn.setFont(new Font("Tahoma", Font.BOLD, 20)); 
  Submitbtn.setBounds(358, 593, 270, 50); 
  frame.getContentPane().add(Submitbtn); 
   
  JLabel lblNewLabel_2 = new JLabel("DD/MM/YYYY"); 
  lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
  lblNewLabel_2.setForeground(Color.GRAY); 
  lblNewLabel_2.setBounds(504, 264, 124, 36); 
  frame.getContentPane().add(lblNewLabel_2); 
   
  JLabel lblNewLabel_2_1 = new JLabel("DD/MM/YYYY"); 
  lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
  lblNewLabel_2_1.setForeground(Color.GRAY); 
  lblNewLabel_2_1.setBounds(511, 324, 117, 30); 
  frame.getContentPane().add(lblNewLabel_2_1); 
   
  JRadioButton ac = new JRadioButton("AC"); 
  ac.setBackground(Color.YELLOW);
  ac.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e)  
   { 
    s1 = "AC"; 
   } 
  }); 
  ac.setFont(new Font("Tahoma", Font.PLAIN, 18)); 
  ac.setBounds(321, 442, 100, 35); 
  frame.getContentPane().add(ac); 
   
  JRadioButton nac = new JRadioButton("NON-AC"); 
  nac.setBackground(Color.YELLOW);
  nac.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) 
   { 
    s1 = "Non-AC"; 
   } 
  }); 
  nac.setFont(new Font("Tahoma", Font.PLAIN, 18)); 
  nac.setBounds(537, 442, 109, 35); 
  frame.getContentPane().add(nac); 
   
  JRadioButton sbed = new JRadioButton("Single Bed"); 
  sbed.setBackground(Color.YELLOW);
  sbed.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) 
   { 
    s2 = "Single Bed"; 
   } 
  }); 
  sbed.setFont(new Font("Tahoma", Font.PLAIN, 18)); 
  sbed.setBounds(325, 507, 170, 50); 
  frame.getContentPane().add(sbed); 
   
  JRadioButton dbed = new JRadioButton("Double Bed"); 
  dbed.setBackground(Color.YELLOW);
  dbed.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) 
   { 
    s2 = "Double Bed"; 
   } 
  }); 
  dbed.setFont(new Font("Tahoma", Font.PLAIN, 18)); 
  dbed.setBounds(537, 507, 170, 50); 
  frame.getContentPane().add(dbed); 
   
  ButtonGroup bg=new ButtonGroup(); 
  bg.add(ac); 
  bg.add(nac); 
   
  ButtonGroup b=new ButtonGroup(); 
  b.add(sbed); 
  b.add(dbed); 
 } 
}
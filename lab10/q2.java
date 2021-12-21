/*
Write a Swing program using JFrame to display Student information with
respective student’s marks, calculate the total marks and display using the
suitable swing components.
 */
package lab10;
import javax.swing.*;
import java.awt.*;
 
import java.awt.event.*;
 
public class q2 extends JFrame implements ActionListener {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JPanel cPanel;
   JLabel msglabel;
   JTextField name, email, address, phone, semester, program ,java, ecommerce, datamining, spm;
   JPasswordField pw, cpw;
   JButton calcBtn, clearBtn;
   String usernameVal,emailVal, addressVal, phoneVal;
   
   public q2(){
       prepareGUI();
   }
   public static void main(String[] args){
      q2 form = new q2();  
      form.showForm();       
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Student's Details");
      mainFrame.setSize(800,700);
      mainFrame.setLayout(new GridLayout(1, 1));

      headerLabel = new JLabel("Student's Details",JLabel.CENTER );
      headerLabel.setForeground(Color.blue);
      headerLabel.setFont(new Font("Calibri",Font.BOLD,28));
//      actions = new JLabel("",JLabel.CENTER);        
//      actions.setSize(350,50);
//      
      headerLabel.setSize(1000, 50);
       
      cPanel = new JPanel();
      cPanel.setLayout(new FlowLayout());

//      mainFrame.add(headerLabel);
      mainFrame.add(cPanel);
//      mainFrame.add(actions);
      mainFrame.setVisible(true);  
   }
   public void showForm(){
             
      calcBtn = new JButton("Calculate Total Marks");
      calcBtn.addActionListener(this);
      clearBtn = new JButton("Clear");
      clearBtn.addActionListener(this);
      
      JPanel btns = new JPanel();
      btns.setSize(200,100);
      btns.add(calcBtn);
      btns.add(clearBtn);
      JPanel panel = new JPanel();
//      panel.setBackground(Color.darkGray);

      panel.setSize(1600,1600);
      GridLayout layout = new GridLayout(0,2);
      layout.setHgap(10);
      layout.setVgap(10);
      
      name = new JTextField();
      email = new JTextField();   
      address = new JTextField();
      phone = new JTextField();
      phone.setSize(300, 50);
      semester = new JTextField();
      program = new JTextField();
      
      java = new JTextField();
      ecommerce = new JTextField();
      datamining = new JTextField();
      spm = new JTextField();
      panel.setLayout(layout); 
       
      panel.add(new JLabel("Username:"));
      panel.add(name);
      name.setText("Bikash Shrestha");
      panel.add(new JLabel("Email-ID:")); 
      panel.add(email);   
      email.setText("shresthabikash2073@gmail.com");
      panel.add(new JLabel("Address:")); 
      panel.add(address);    
      address.setText("Baishdhara, Kathmandu");
      panel.add(new JLabel("Contact no:")); 
      panel.add(phone);
      phone.setText("9865183709");
  
      panel.add(new JLabel("Semester:"));
      panel.add(semester);
      semester.setText("Seven");
      panel.add(new JLabel("Program:"));
      panel.add(program);
      program.setText("BCA");
      panel.add(new JLabel("Marks:>"));
      panel.add(new JLabel(""));
      
//      marks
      panel.add(new JLabel("JAVA Programming:"));
      panel.add(java);
      java.setText("80");
      panel.add(new JLabel("Data Mining"));
      panel.add(datamining);
      datamining.setText("80");
      panel.add(new JLabel("E-Commerce:"));
      panel.add(ecommerce);
      ecommerce.setText("70");
      panel.add(new JLabel("Software Project Mgmt:"));
      panel.add(spm);
      spm.setText("70");
      
      msglabel = new JLabel("total");
      panel.add(msglabel);
      
      
      cPanel.add(panel);
      mainFrame.add(btns); 
      mainFrame.setVisible(true);  
   }
   public void actionPerformed (ActionEvent e) {
            int total;
           if(e.getSource() == calcBtn){
               total = Integer.parseInt(java.getText())+Integer.parseInt(ecommerce.getText())+
                       Integer.parseInt(spm.getText())+Integer.parseInt(datamining.getText());
               msglabel.setText("Total marks: " + total);
               System.out.println(total);
               
           }else if(e.getSource()== clearBtn){
               msglabel.setText("");
           }
            
        
    }
}

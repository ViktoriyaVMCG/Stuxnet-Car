import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class Calculator extends JPanel implements ActionListener {
  //private JTextField display;
  private double result = 0;
  private String operator = "=";
  private boolean calculating = true;
  private JFrame frame = new JFrame(); 
  private JLabel pr, dP, inter;
  private JTextField display, display2, display3, display4;
  private JButton calcBtn, clearBtn;
  private JTextArea lol;
  private JPanel panel1 = new JPanel();
  private JPanel panel = new JPanel();
 
  public Calculator() {
    JFrame.setDefaultLookAndFeelDecorated(true);
    frame.setTitle("Calculator");
    frame.setSize(300, 950);
    frame.setResizable(false);
    
    frame.setLayout(new BorderLayout());
    
    frame.add(panel1, BorderLayout.NORTH);
    
    display = new JTextField();
    display.setPreferredSize(new Dimension(278, 45));
    display.setFont(new Font("Arial", Font.PLAIN, 40));
    display.setHorizontalAlignment(JTextField.RIGHT);
    display.setForeground(Color.GRAY);
    display.setEditable(false);
    panel1.add(display);
 
  
    frame.add(panel, BorderLayout.CENTER);
    //Buttons for loop
    String buttonLabels = "789÷456×123-";
      for (int i = 0; i < buttonLabels.length(); i++) {
      JButton b = new JButton(buttonLabels.substring(i, i + 1));
      panel.add(b);
      b.setPreferredSize(new Dimension(65, 65));
      b.setFont(new Font("Arial", Font.PLAIN, 30));
      b.addActionListener(this);
    }
    
    //Buttons for loop
    String butonLabels ="0";
     for (int i = 0; i < butonLabels.length(); i++) {
      JButton c = new JButton(butonLabels.substring(i, i + 1));
      panel.add(c);
      c.setPreferredSize(new Dimension(135,65));
      c.setFont(new Font("Arial", Font.PLAIN, 30));
      c.addActionListener(this);
     }
     
     //Buttons for loop 
     String btnLabels =".+";
      for (int i = 0; i < btnLabels.length(); i++) {
      JButton a = new JButton(btnLabels.substring(i, i + 1));
      panel.add(a);
      a.setPreferredSize(new Dimension(65, 65));
      a.setFont(new Font("Arial", Font.PLAIN, 30));
      a.addActionListener(this);
     }
     
     //Buttons for loop
     String butLabels ="=";
      for (int i = 0; i < butLabels.length(); i++) {
      JButton a = new JButton(butLabels.substring(i, i + 1));
      panel.add(a);
      a.setPreferredSize(new Dimension(135, 65));
      a.setFont(new Font("Arial", Font.PLAIN, 30));
      a.addActionListener(this);
  
     }
     
     //Button for loop
     String butnLabels ="C";
      for (int i = 0; i < butnLabels.length(); i++) {
      JButton a = new JButton(butnLabels.substring(i, i + 1));
      panel.add(a);
      a.setBackground(Color.RED);
      a.setPreferredSize(new Dimension(135, 65));
      a.setFont(new Font("Arial", Font.PLAIN, 30));
      a.addActionListener(this);
  
     }
            
      //Price lb
      JLabel pr = new JLabel();
      pr.setText("Price:");
      pr.setFont(new Font("Arial", Font.PLAIN, 28));
      panel.add(pr);
      
      //Display for price      
      display2 = new JTextField();
      display2.setPreferredSize(new Dimension(278, 45));
      display2.setFont(new Font("Arial", Font.PLAIN, 28));
      display2.setForeground(Color.GRAY);
      display2.setHorizontalAlignment(JTextField.RIGHT); 
      panel.add(display2);
      
      // Down Payment lb      
      dP = new JLabel();
      dP.setText("Down payment:");
      dP.setFont(new Font("Arial", Font.PLAIN, 28));
      panel.add(dP);
      
      // Display for DP       
      display3 = new JTextField();
      display3.setPreferredSize(new Dimension(278, 45));
      display3.setFont(new Font("Arial", Font.PLAIN, 28));
      display3.setForeground(Color.GRAY);
      display3.setHorizontalAlignment( JTextField.RIGHT ); 
      panel.add(display3);
      
      // Interest lb
      inter = new JLabel();
      inter.setText("Interest rate:");      
      inter.setFont(new Font("Arial", Font.PLAIN, 28));
      panel.add(inter);
      
      // Display for Int
      display4 = new JTextField();
      display.setText(null);
      display4.setPreferredSize(new Dimension(278, 45));
      display4.setFont(new Font("Arial", Font.PLAIN, 28));
      display4.setForeground(Color.GRAY);
      display4.setHorizontalAlignment( JTextField.RIGHT ); 
      panel.add(display4);
      
      // Calculate Button
      calcBtn = new JButton();
      calcBtn.setPreferredSize(new Dimension(135, 45));
      calcBtn.setFont(new Font("Arial", Font.PLAIN, 30));
      calcBtn.setText("Calc");
      calcBtn.setBackground(Color.RED);
      panel.add(calcBtn);
      
      calcBtn.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent event){
          double P, PD, T, MB, I, R, MP;
           if(checkAllTextFields()){ 
           P = Double.parseDouble(display2.getText());
           PD = Double.parseDouble(display3.getText());
           R = Double.parseDouble(display4.getText());///12;

           T = P-PD; // Total after price - payment down
           MB = T/36; //Monthly balance = total /36(month)
           I = (MB * R)/100;
           MP = (MB+I);
           //MP = P*Math.pow(1+R,PD)*R/(Math.pow(1+R,PD)-1);
           lol.setFont(new Font("Arial", Font.PLAIN, 30));
								lol.setText("Your monthly\npayment for next\n3 years is:\n" + MP);
           }
         }
       }
     );
     
     
      // CE Button
      clearBtn = new JButton();
      clearBtn.setPreferredSize(new Dimension(135, 45));
      clearBtn.setFont(new Font("Arial", Font.PLAIN, 30));
      clearBtn.setText("CE");
      clearBtn.setBackground(Color.RED);
      panel.add(clearBtn);
      clearBtn.addActionListener(new ActionListener(){
        public void actionPerformed( ActionEvent e){
             lol.setText("");
             display2.setText("");
             display3.setText("");
             display4.setText("");
            }
        } 
      ); 

      
      //TextArea where will be output      
      lol = new JTextArea();
      lol.setEditable(false);
      lol.setPreferredSize(new Dimension(278, 170));
      panel.add(lol);
      
      //Adding everything to the panel
       //frame.add(panel);
       frame.setVisible(true);
     } 
     


public boolean checkUserInputType(){
     try{
      Double.parseDouble(display2.getText());
      Double.parseDouble(display3.getText());
      Double.parseDouble(display4.getText());

     }catch(NumberFormatException e){
     lol.setText("You are not following\ndirections!");
     lol.setFont(new Font("Arial", Font.PLAIN, 30));
      return false;
     }
     
     return true;
  }

public boolean checkAllTextFields(){
  return checkUserInputType() && display2.getText()!=null && display3.getText()!=null && display4.getText()!=null 
  && !display2.getText().isEmpty() && !display3.getText().isEmpty() && !display4.getText().isEmpty();
}
     
  public void actionPerformed(ActionEvent evt) {
    String cmd = evt.getActionCommand();
    if ('0' <= cmd.charAt(0) && cmd.charAt(0) <= '9' || cmd.equals(".")) {
      if (calculating)
        display.setText(cmd);   
      else
        display.setText(display.getText() + cmd);
      calculating = false;
    } else if(cmd.equals("C")) {
      if (calculating)
        display.setText(" ");   
      else
        display.setText(" ");
      calculating = false;
    } else {
      if (calculating) {
        if (cmd.equals("-")) {
          display.setText(cmd);
          calculating = false;
        } else
          operator = cmd;
      } else {
        double x = Double.parseDouble(display.getText());
        calculate(x);
        operator = cmd;
        calculating = true;

      }
    }
  }
 
  private void calculate(double n) {
    if (operator.equals("+"))
      result += n;
    else if (operator.equals("-"))
      result -= n;
    else if (operator.equals("×"))
      result *= n;
    else if (operator.equals("÷"))
      result /= n;
    else if (operator.equals("="))
      result = n;
    display.setText("" + result);
  }
  
 
 
    
 }  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
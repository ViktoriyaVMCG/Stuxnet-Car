import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EbanoeA extends JPanel{
   private JLabel label;
   private JButton btnSubmit;
   private JFrame frame = new JFrame();
   private JTextField display = new JTextField("First Name");
   private JTextField display1 = new JTextField("Last Name");
   private JTextField display2 = new JTextField("Email");
   private JTextField display3 = new JTextField("Phone Number");
   private JTextArea display4 = new JTextArea("Questions/Comments.",5,5);
   private JTextArea display5 = new JTextArea("YOUR CONTACT INFORMATION");
   private JTextArea display6 = new JTextArea("Copyright © 2018, Stuxnet Business Services");
   private JPanel panel = new JPanel();
   
   public EbanoeA() {
    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Apl");
    frame.setSize(600, 590);
    frame.setResizable(false);
    frame.setLayout(new BorderLayout());
    frame.add(panel, BorderLayout.CENTER);
    
    display5.setFont(new Font("Arial", Font.PLAIN, 38));
    display5.setBackground(Color.RED);
    display5.setEditable(false);
    display5.setPreferredSize(new Dimension(590, 55));
    panel.add(display5); 
    
    display.setFont(new Font("Arial", Font.PLAIN, 20));
    display.setHorizontalAlignment(JTextField.LEFT);
    display.setForeground(Color.GRAY);
    display.setPreferredSize(new Dimension(500, 65));
    panel.add(display);
    display.addFocusListener(new FocusAdapter() {
    public void focusGained(FocusEvent e) {
        JTextField source = (JTextField)e.getComponent();
        source.setText("");
        source.removeFocusListener(this);
    }
});

        
    display1.setFont(new Font("Arial", Font.PLAIN, 20));
    display1.setHorizontalAlignment(JTextField.LEFT);
    display1.setForeground(Color.GRAY);
    display1.setPreferredSize(new Dimension(500, 65));
    panel.add(display1);
    display1.addFocusListener(new FocusAdapter() {
    public void focusGained(FocusEvent e) {
        JTextField source = (JTextField)e.getComponent();
        source.setText("");
        source.removeFocusListener(this);
    }
});

    
    display2.setFont(new Font("Arial", Font.PLAIN, 20));
    display2.setHorizontalAlignment(JTextField.LEFT);
    display2.setForeground(Color.GRAY);
    display2.setPreferredSize(new Dimension(500, 65));
    panel.add(display2);
    display2.addFocusListener(new FocusAdapter() {
    public void focusGained(FocusEvent e) {
        JTextField source = (JTextField)e.getComponent();
        source.setText("");
        source.removeFocusListener(this);
    }
});

    
    display3.setFont(new Font("Arial", Font.PLAIN, 20));
    display3.setHorizontalAlignment(JTextField.LEFT);
    display3.setForeground(Color.GRAY);
    display3.setPreferredSize(new Dimension(500, 65));
    panel.add(display3);
    display3.addFocusListener(new FocusAdapter() {
    public void focusGained(FocusEvent e) {
        JTextField source = (JTextField)e.getComponent();
        source.setText("");
        source.removeFocusListener(this);
       }
});
        
    display4.setFont(new Font("Arial", Font.PLAIN, 20));
    display4.setForeground(Color.GRAY);
    display4.setPreferredSize(new Dimension(500, 100));
    panel.add(display4);
    display4.addFocusListener(new FocusAdapter() {
    public void focusGained(FocusEvent e) {
        JTextArea source = (JTextArea)e.getComponent();
        source.setText("");
        source.removeFocusListener(this);
    }
});

    
    btnSubmit = new JButton("Submit");
    btnSubmit.setPreferredSize(new Dimension(170, 50));
    btnSubmit.setFont(new Font("Arial", Font.PLAIN, 20));
    btnSubmit.addActionListener(new ButtonListener());
    panel.add(btnSubmit);
    
    display6.setFont(new Font("Arial", Font.PLAIN, 18));
    display6.setBackground(Color.RED);
    display6.setEditable(false);
    display6.setPreferredSize(new Dimension(590, 55));
    panel.add(display6,"South");
    
    frame.setVisible(true);
    }
    
   
    
    private class ButtonListener implements ActionListener {
      public void actionPerformed(ActionEvent event){  
          String email;
          if(event.getSource()==btnSubmit){ 
             if(display.getText().equals("") || display.getText().equals("First Name") || display1.getText().equals("") ||
             display1.getText().equals("Last Name") || display3.getText().equals("")|| display3.getText().equals("Phone Number")){
             JOptionPane.showMessageDialog(null,"Fill the empty spaces.", "WARNING",JOptionPane.WARNING_MESSAGE); 
               }else{ email = display2.getText();
              if(email.indexOf("@")<0){ 
               JOptionPane.showMessageDialog(null,"Incorrect Email address. Please try again."); 
                }else{
               JOptionPane.showMessageDialog(null, 
               "Thank you for submitting your application. We will reply to you as soon as possible.");
               frame.dispose();
               frame.setVisible(false);
               
             } 
         } 
      }
    }
  }
 }
 
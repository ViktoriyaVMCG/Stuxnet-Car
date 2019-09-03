import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class NisC extends JPanel{
   private JLabel label;
   private JButton btnSubmit;
   private JFrame frame = new JFrame();
   private JTextArea display5 = new JTextArea("             Nissan 370Z 2018");
   private JTextArea display6 = new JTextArea("Copyright © 2018, Stuxnet Business Services.");
   private JPanel panel = new JPanel();
   
   public NisC() {
    JFrame.setDefaultLookAndFeelDecorated(true);
    frame.setTitle("Nissan 370Z 2018");
    frame.setSize(650, 600);
    frame.setResizable(false);
    frame.setLayout(new BorderLayout());
    frame.add(panel, BorderLayout.CENTER);
    
    ImageIcon icon8 = new ImageIcon("image/Nissan 370Z.png");
    panel.add(new JLabel(icon8));
    
    display5.setFont(new Font("Arial", Font.PLAIN, 38));
    display5.setBackground(Color.RED);
    display5.setEditable(false);
    display5.setPreferredSize(new Dimension(590, 55));
    panel.add(display5); 
    
      label = new JLabel();
      label.setText("Price:$29,990    Miles:6,348");      
      label.setFont(new Font("Arial", Font.PLAIN, 28));
      panel.add(label);
      
     
    btnSubmit = new JButton("Buy");
    btnSubmit.setPreferredSize(new Dimension(170, 50));
    btnSubmit.setFont(new Font("Arial", Font.PLAIN, 20));
    panel.add(btnSubmit);
    btnSubmit.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
			  new CarA();
           }
           });
  
    display6.setFont(new Font("Arial", Font.PLAIN, 18));
    display6.setBackground(Color.RED);
    display6.setEditable(false);
    display6.setPreferredSize(new Dimension(590, 55));
    panel.add(display6,"South");
    
    frame.setVisible(true);

    }
   
}

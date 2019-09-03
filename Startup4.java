import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Startup4{
       JFrame frame1 = new JFrame("Stuxnet");
       JLabel dP;
       JTextField display;
       JPanel topPanel = new JPanel();
       JPanel centrPanel = new JPanel();
       JPanel TypeOfCar = new JPanel();
       JPanel TypeOfCar1 = new JPanel();
       JPanel TypeOfCar2 = new JPanel();
       JPanel TypeOfCar3 = new JPanel();
       JPanel HS = new JPanel();
       JPanel HSUV = new JPanel();
       JPanel HT = new JPanel();
       JPanel TS = new JPanel();
       JPanel TSUV = new JPanel();
       JPanel TT = new JPanel();
       JPanel FS = new JPanel();
       JPanel FSUV = new JPanel();
       JPanel FT = new JPanel();
       JPanel FC = new JPanel();
       JPanel NS = new JPanel();
       JPanel NSUV = new JPanel();
       JPanel NT = new JPanel();
       JPanel NC = new JPanel();
       JPanel bottomPanel = new JPanel();
       JPanel rightPanel = new JPanel();
       JPanel rightPanel1 = new JPanel();
       JPanel panel1 = new JPanel();
       //JPanel panel2 = new JPanel();
       JButton calcBtn;
       JTextArea lol;

 public Startup4(){
    
      frame1.setSize(1710, 500);
      frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame1.setLayout(new BorderLayout());
      frame1.add(topPanel, BorderLayout.NORTH);
      MainPage();
      Ford();
      Toyot();
      Nisan();
      Honda();
      HondaS();
      HondaHSUV();
      HondaHT();
      ToyotS();
      ToyotHSUV();
      ToyotHT();
      FordS();
      FordFSUV();
      FordFT();
      FordFC();
      NisanS();
      NisanNSUV();
      NisanNT();
      NisanNC();
      
      frame1.setVisible(true);
      topPanel.setBackground(Color.BLACK);
      
      ImageIcon icon1 = new ImageIcon("image/j1.jpg");
      topPanel.add(new JLabel(icon1));
   } 
     
   public void MainPage(){       
      //Center main
       frame1.add(centrPanel, BorderLayout.CENTER);   
       centrPanel.setLayout(new GridLayout(0,1,4,4));
       JButton to = new JButton(new ImageIcon("image/to.png"));
       centrPanel.add(to);
       to.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
          cBottomPanel();
       }
      } 
     ); 

       JButton f = new JButton(new ImageIcon("image/make-Ford.png"));
       centrPanel.add(f);
       f.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
          clBottomPanel();
       }
      } 
     );
      
       JButton n = new JButton(new ImageIcon("image/ng.png"));
       centrPanel.add(n);
       n.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
          cleBottomPanel();

       }
      } 
     ); 

       JButton h = new JButton(new ImageIcon("image/honda-logo-11.png"));
       centrPanel.add(h);
       h.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
          cleaBottomPanel();
          
       }
      } 
     );
   }   
 //-------------------------------------------------------    
  //TypeOfCar Ford and TypeOfCarF
   public void Ford(){ 
    
      TypeOfCar.setLayout(new GridLayout(0,1,4,4));       
      JButton s = new JButton(new ImageIcon("image/s.png"));
       TypeOfCar.add(s);
       s.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
          clearBottomPanel9();
       }
      } 
     ); 
     
       JButton suv = new JButton(new ImageIcon("image/SUV.png"));
       TypeOfCar.add(suv);
       suv.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
          clearBottomPanel10();
       }
      } 
     ); 
     
      JButton tr = new JButton(new ImageIcon("image/truck.png"));
      TypeOfCar.add(tr);
      tr.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
         clearBottomPanel11();
       }
      } 
     );

      JButton cab = new JButton(new ImageIcon("image/cabriolet.png"));
      TypeOfCar.add(cab);
      cab.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
         clearBottomPanel12();

       }
      } 
     );
        
      JButton pr = new JButton(new ImageIcon("image/pr.png"));
      TypeOfCar.add(pr);
      pr.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
         clearBottomPanel16();

       }
      } 
     );
     

   }   
//-------------------------------------------------------    
     //TypeOfCar1 Toyot
     public void Toyot(){     
       TypeOfCar1.setLayout(new GridLayout(0,1,4,4));
       JButton s1 = new JButton(new ImageIcon("image/s.png"));
       TypeOfCar1.add(s1);
       s1.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
          clearBottomPanel5();
       }
      } 
     ); 
     
      JButton suv1 = new JButton(new ImageIcon("image/SUV.png"));
       TypeOfCar1.add(suv1);
       suv1.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
          clearBottomPanel6();
       }
      } 
     ); 
     
      JButton tr1 = new JButton(new ImageIcon("image/truck.png"));
      TypeOfCar1.add(tr1);
      tr1.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
         clearBottomPanel7();
       }
      } 
     );

      JButton cab1 = new JButton(new ImageIcon("image/cabriolet.png"));
      TypeOfCar1.add(cab1);
      cab1.addActionListener(new clearBottomPanel8());
 
      JButton pr = new JButton(new ImageIcon("image/pr.png"));
      TypeOfCar1.add(pr);
      pr.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
         clearBottomPanel16();

       }
      } 
     );
    }  
      
//--------------------------------------------------------  
//TypeOfCar2 Nisan
  public void Nisan(){
      
       TypeOfCar2.setLayout(new GridLayout(0,1,4,4));
       JButton s2 = new JButton(new ImageIcon("image/s.png"));
       TypeOfCar2.add(s2);
       s2.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
          clearBottomPanel13();
       }
      } 
     ); 
     
      JButton suv2 = new JButton(new ImageIcon("image/SUV.png"));
       TypeOfCar2.add(suv2);
       suv2.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
          clearBottomPanel14();
       }
      } 
     ); 
     
      JButton tr2 = new JButton(new ImageIcon("image/truck.png"));
      TypeOfCar2.add(tr2);
      tr2.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
         clearBottomPanel15();
       }
      } 
     );

      JButton cab2 = new JButton(new ImageIcon("image/cabriolet.png"));
      TypeOfCar2.add(cab2);
      cab2.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
         clearBottomPanel4();

       }
      } 
     );

 
      JButton pr = new JButton(new ImageIcon("image/pr.png"));
      TypeOfCar2.add(pr);
      pr.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
         clearBottomPanel16();

       }
      } 
     );
   }
      
//-------------------------------------------------------- 
 //TypeOfCar3 Honda
   public void Honda(){
                   
       TypeOfCar3.setLayout(new GridLayout(0,1,4,4));
       JButton s3 = new JButton(new ImageIcon("image/s.png"));
       TypeOfCar3.add(s3);
       s3.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
          clearBottomPanel1();
       }
      } 
     ); 
     
      JButton suv3 = new JButton(new ImageIcon("image/SUV.png"));
       TypeOfCar3.add(suv3);
       suv3.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
          clearBottomPanel2();
       }
      } 
     ); 
     
      JButton tr3 = new JButton(new ImageIcon("image/truck.png"));
      TypeOfCar3.add(tr3);
      tr3.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
         clearBottomPanel3();
       }
      } 
     );

      JButton cab3 = new JButton(new ImageIcon("image/cabriolet.png"));
      TypeOfCar3.add(cab3);
      cab3.addActionListener(new clearBottomPanel8());
           
     JButton pr = new JButton(new ImageIcon("image/pr.png"));
     TypeOfCar3.add(pr);
     pr.addActionListener(new ActionListener(){
     public void actionPerformed( ActionEvent e){
        clearBottomPanel16();

       }
      } 
     );
    } 
//------------------------------------------------------- 
//Honda Car
   public void HondaS(){ 
    //Honda Sedan
   HS.setLayout(new GridLayout(2,2));
   
   JButton hh = new JButton(new ImageIcon("image/HondClarity.png"));
   HS.add(hh);
   hh.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
			  new HondaS();
           }
           });       
       
   JButton h1 = new JButton(new ImageIcon("image/HondaAccord.png"));
   HS.add(h1);
   h1.addActionListener(new ActionListener(){
    public void actionPerformed( ActionEvent e){
			  new HondaS1();
           }
           });

       
   JButton h2 = new JButton(new ImageIcon("image/HondaCivic.png"));
   HS.add(h2);
   h2.addActionListener(new ActionListener(){
     public void actionPerformed( ActionEvent e){
			  new HondaS2();
           }
           });
           
     JButton pr = new JButton(new ImageIcon("image/pr.png"));
     HS.add(pr);
     pr.addActionListener(new ActionListener(){
     public void actionPerformed( ActionEvent e){
        clearBottomPanel17();

       }
      } 
     );
   }     

  //Honda SUV
  public void HondaHSUV(){
  HSUV.setLayout(new GridLayout(2,2));
  
  JButton h3 = new JButton(new ImageIcon("image/Honda CR-V.png"));
  HSUV.add(h3);
  h3.addActionListener(new ActionListener(){
  public void actionPerformed( ActionEvent e){
			  new HondaJ();
           }
           });
       
   JButton h4 = new JButton(new ImageIcon("image/HondaPilot.png"));
   HSUV.add(h4);
   h4.addActionListener(new ActionListener(){
    public void actionPerformed( ActionEvent e){
			  new HondaJ2();
           }
           });

       
   JButton h5 = new JButton(new ImageIcon("image/HondaHR-V.png"));
   HSUV.add(h5);
   h5.addActionListener(new ActionListener(){
     public void actionPerformed( ActionEvent e){
			  new HondaJ1();
           }
           });
           
   JButton pr = new JButton(new ImageIcon("image/pr.png"));
   HSUV.add(pr);
   pr.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
     clearBottomPanel17();

       }
      } 
     );
   }     
        

  //Honda Truck
  public void HondaHT(){
  HT.setLayout(new GridLayout(2,2));
  
  JButton h6 = new JButton(new ImageIcon("image/HondaRidgeline.png"));
  HT.add(h6);
  h6.addActionListener(new ActionListener(){
  public void actionPerformed( ActionEvent e){
			  new HondaT();
           }
           });
     JButton pr = new JButton(new ImageIcon("image/pr.png"));
   HT.add(pr);
   pr.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
     clearBottomPanel17();

       }
      } 
     );
   }     
      
  
//--------------------------------------------------------
//Toyota Car
   
   //Toyota Sedan
   public void ToyotS(){
   TS.setLayout(new GridLayout(2,2));
   
   JButton tt = new JButton(new ImageIcon("image/tt.png"));
   TS.add(tt);
   tt.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
			  new To();
           }
           });
       
   JButton t1 = new JButton(new ImageIcon("image/Cam.png"));
   TS.add(t1);
   t1.addActionListener(new ActionListener(){
    public void actionPerformed( ActionEvent e){
			  new Ta();
           }
           });

       
   JButton t2 = new JButton(new ImageIcon("image/Av.png"));
   TS.add(t2);
   t2.addActionListener(new ActionListener(){
     public void actionPerformed( ActionEvent e){
			  new Ti();
           }
           });
   
   JButton pr = new JButton(new ImageIcon("image/pr.png"));
   TS.add(pr);
   pr.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
     clearBottomPanel18();

       }
      } 
     );                
   }     

  //Toyota SUV
 public void ToyotHSUV(){
  TSUV.setLayout(new GridLayout(2,2));
  JButton t3 = new JButton(new ImageIcon("image/4Runner.png"));
  t3.setPreferredSize(new Dimension(450, 350));
  TSUV.add(t3);
  t3.addActionListener(new ActionListener(){
  public void actionPerformed( ActionEvent e){
			  new ToyotaSUV();
           }
           });
       
   JButton t4 = new JButton(new ImageIcon("image/C-HR.png"));
   TSUV.add(t4);
   t4.addActionListener(new ActionListener(){
    public void actionPerformed( ActionEvent e){
			  new ToyotaSUV1();
           }
           });

       
   JButton t5 = new JButton(new ImageIcon("image/RAV4.png"));
   TSUV.add(t5);
   t5.addActionListener(new ActionListener(){
     public void actionPerformed( ActionEvent e){
			  new ToyotaSUV2();
           }
           });
   
   JButton pr = new JButton(new ImageIcon("image/pr.png"));
   TSUV.add(pr);
   pr.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
     clearBottomPanel18();

       }
      } 
     );        
  }
  //Toyota Truck
 public void ToyotHT(){
  TT.setLayout(new GridLayout(2,2));
  
  JButton t6 = new JButton(new ImageIcon("image/ttt.png"));
  TT.add(t6);
  t6.addActionListener(new ActionListener(){
  public void actionPerformed( ActionEvent e){
			  new ToyotaT();
           }
           });
          
   JButton pr = new JButton(new ImageIcon("image/pr.png"));
   TT.add(pr);
   pr.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
     clearBottomPanel18();

       }
      } 
     );
  }      
  
  //Toyota Cabr we don't have car for that moment


//--------------------------------------------------------
//Ford Car
   
   //Ford Sedan
   public void FordS(){
   
   FS.setLayout(new GridLayout(2,2));
   
   JButton ff = new JButton(new ImageIcon("image/FordFocus.png"));
   FS.add(ff);
   ff.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
			  new FordFocus();
           }
           });
       
   JButton f1 = new JButton(new ImageIcon("image/FordFusion.png"));
   FS.add(f1);
   f1.addActionListener(new ActionListener(){
    public void actionPerformed( ActionEvent e){
			  new FordFusion();
           }
           });

       
   JButton f2 = new JButton(new ImageIcon("image/FordTaurus.png"));
   FS.add(f2);
   f2.addActionListener(new ActionListener(){
     public void actionPerformed( ActionEvent e){
			  new Taurus();
           }
           });
           
   JButton pr = new JButton(new ImageIcon("image/pr.png"));
   FS.add(pr);
   pr.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
     clearBottomPanel19();

       }
      } 
     );

  }
  
  //Ford SUV
  public void FordFSUV(){
  FSUV.setLayout(new GridLayout(2,2));
  
  JButton f3 = new JButton(new ImageIcon("image/FordEscape.png"));
  FSUV.add(f3);
  f3.addActionListener(new ActionListener(){
  public void actionPerformed( ActionEvent e){
			  new FordSUV2();
           }
           });
       
   JButton f4 = new JButton(new ImageIcon("image/FordExpedition.png"));
   FSUV.add(f4);
   f4.addActionListener(new ActionListener(){
    public void actionPerformed( ActionEvent e){
			  new FordSUV1();
           }
           });

       
   JButton f5 = new JButton(new ImageIcon("image/FordExplorer.png"));
   FSUV.add(f5);
   f5.addActionListener(new ActionListener(){
     public void actionPerformed( ActionEvent e){
			  new FordSUV();
           }
           });
   JButton pr = new JButton(new ImageIcon("image/pr.png"));
   FSUV.add(pr);
   pr.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
     clearBottomPanel19();

       }
      } 
     );        
  }
  
  //Ford Truck
  public void FordFT(){
  FT.setLayout(new GridLayout(2,2));
  
  JButton f6 = new JButton(new ImageIcon("image/FordF-150.png"));
  FT.add(f6);
  f6.addActionListener(new ActionListener(){
  public void actionPerformed( ActionEvent e){
			  new FordT();
           }
           });
       
   JButton f7 = new JButton(new ImageIcon("image/FordF-350.png"));
   FT.add(f7);
   f7.addActionListener(new ActionListener(){
    public void actionPerformed( ActionEvent e){
			  new FordT2();
           }
           });

       
   JButton f8 = new JButton(new ImageIcon("image/FordF-250.png"));
   FT.add(f8);
   f8.addActionListener(new ActionListener(){
     public void actionPerformed( ActionEvent e){
			  new FordT1();
           }
           });
   JButton pr = new JButton(new ImageIcon("image/pr.png"));
   FT.add(pr);
   pr.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
     clearBottomPanel19();

       }
      } 
     );
        
  }
  
  //Ford Cabr 
 public void FordFC(){
  FC.setLayout(new GridLayout(2,2));
  
  JButton f9 = new JButton(new ImageIcon("image/FC.png"));
  FC.add(f9);
  f9.addActionListener(new ActionListener(){
  public void actionPerformed( ActionEvent e){
			  new FordC1();
           }
           });
       
   JButton f10 = new JButton(new ImageIcon("image/FordMustang.png"));
   FC.add(f10);
   f10.addActionListener(new ActionListener(){
    public void actionPerformed( ActionEvent e){
			  new FordC();
           }
           });
       
   JButton pr = new JButton(new ImageIcon("image/pr.png"));
   FC.add(pr);
   pr.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
     clearBottomPanel19();

       }
      } 
     );       
   }        
//--------------------------------------------------------
//Nissan Car
   
   //Nissan Sedan
   public void NisanS(){
   NS.setLayout(new GridLayout(2,2));
   
   JButton nn = new JButton(new ImageIcon("image/ni.png"));
   NS.add(nn);
   nn.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
			  new NS();
           }
           });
       
   JButton n1 = new JButton(new ImageIcon("image/NissanVersa.png"));
   NS.add(n1);
   n1.addActionListener(new ActionListener(){
    public void actionPerformed( ActionEvent e){
			  new NS1();
           }
           });

       
   JButton n2 = new JButton(new ImageIcon("image/NissanMaxima.png"));
   NS.add(n2);
   n2.addActionListener(new ActionListener(){
     public void actionPerformed( ActionEvent e){
			  new NS2();
           }
           });
   JButton pr = new JButton(new ImageIcon("image/pr.png"));
   NS.add(pr);
   pr.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
     clearBottomPanel20();

       }
      } 
     );            
  }
  
  //Nissan SUV
  public void NisanNSUV(){
   NSUV.setLayout(new GridLayout(2,2));
  
  JButton n3 = new JButton(new ImageIcon("image/NissanMurano.png"));
  NSUV.add(n3);
  n3.addActionListener(new ActionListener(){
  public void actionPerformed( ActionEvent e){
			  new NJ2();
           }
           });
       
   JButton n4 = new JButton(new ImageIcon("image/NissanRogue.png"));
   NSUV.add(n4);
   n4.addActionListener(new ActionListener(){
    public void actionPerformed( ActionEvent e){
			  new NJ1();
           }
           });

       
   JButton n5 = new JButton(new ImageIcon("image/NissanArmada.png"));
   NSUV.add(n5);
   n5.addActionListener(new ActionListener(){
     public void actionPerformed( ActionEvent e){
			  new NJ();
           }
           });
   JButton pr = new JButton(new ImageIcon("image/pr.png"));
   NSUV.add(pr);
   pr.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
     clearBottomPanel20();

       }
      } 
     );            
}

//Nissan Cab
 public void NisanNC(){
 NC.setLayout(new GridLayout(2,2));
  
  JButton n9 = new JButton(new ImageIcon("image/Nissan 370Z.png"));
  NC.add(n9);
  n9.addActionListener(new ActionListener(){
  public void actionPerformed( ActionEvent e){
			  new NisC();
           }
           });
  JButton pr = new JButton(new ImageIcon("image/pr.png"));
  NC.add(pr);
  pr.addActionListener(new ActionListener(){
  public void actionPerformed( ActionEvent e){
  clearBottomPanel20();
    }
    });
         
}
  //Nissan Truck
 public void NisanNT(){

  NT.setLayout(new GridLayout(2,2));
  
  JButton n6 = new JButton(new ImageIcon("image/NissanFrontier.png"));
  NT.add(n6);
  n6.addActionListener(new ActionListener(){
  public void actionPerformed( ActionEvent e){
			  new NisT();
           }
           });
       
   JButton n7 = new JButton(new ImageIcon("image/NissanTitan.png"));
   NT.add(n7);
   n7.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
			  new NisT1();
           }
           });

       
   JButton n8 = new JButton(new ImageIcon("image/NissanTitanXD.png"));
   NT.add(n8);
   n8.addActionListener(new ActionListener(){
     public void actionPerformed( ActionEvent e){
			  new NisT2();
           }
           });
   JButton pr = new JButton(new ImageIcon("image/pr.png"));
   NT.add(pr);
   pr.addActionListener(new ActionListener(){
   public void actionPerformed( ActionEvent e){
     clearBottomPanel20();
    }
    });
        
  


//--------------------------------------------------------

     // Right Panel            
      frame1.add(rightPanel, BorderLayout.EAST);
      rightPanel.setBackground(Color.RED);
      rightPanel.setLayout(new BorderLayout());
      rightPanel.add(rightPanel1, BorderLayout.NORTH);
      rightPanel1.setBackground(Color.RED);
      JButton vehicleBtn = new JButton("Vehicle");
      vehicleBtn.setPreferredSize(new Dimension(290, 65));
      vehicleBtn.setFont(new Font("Arial", Font.PLAIN, 30));
      rightPanel1.add(vehicleBtn);
      vehicleBtn.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
           new Ve();
           
           }
     }
     );
      JButton calcBtn = new JButton("Calculator");
      calcBtn.setPreferredSize(new Dimension(290, 65));
      calcBtn.setFont(new Font("Arial", Font.PLAIN, 30));
      rightPanel1.add(calcBtn);
      calcBtn.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
           //frame1.dispose();
			  new Calculator();
    
             }
              
           
        } 
      );
      
      JButton qustBtn = new JButton("Questions");
      qustBtn.setPreferredSize(new Dimension(290, 65));
      qustBtn.setFont(new Font("Arial", Font.PLAIN, 30));
      rightPanel1.add(qustBtn);
      qustBtn.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
			  new EbanoeA();
    
             }
              
           
        } 
      );
                 
//----------------------------------------------------
//GIF imge   
 

             rightPanel.add(panel1, BorderLayout.EAST);
             panel1.setLayout(new BorderLayout());
             panel1.add(new ImagePanel(), BorderLayout.EAST);
             panel1.setLayout(new GridLayout(0,1));
             panel1.setBackground(Color.RED);
             lol = new JTextArea();
             lol.setEditable(false);
             lol.setPreferredSize(new Dimension(900,0));
             lol.setBackground(Color.RED);
             panel1.add(lol);
      
      //Bottom panel      
      frame1.add(bottomPanel, BorderLayout.SOUTH);
      JLabel p = new JLabel();
      p.setForeground(Color.WHITE);
      p.setText("Copyright © 2018, Stuxnet Business Services.");
      p.setFont(new Font("Arial", Font.PLAIN, 25));
      bottomPanel.add(p);
      bottomPanel.setBackground(Color.BLACK);
   

    }  
    //Replacing the panels
    public void clearBottomPanel(){
      centrPanel.removeAll();
      centrPanel.repaint();
      centrPanel.revalidate();
      
     // this will help to return to the main page clearBottomPanel()
   }
//---------------------------------------   
   //TypeOfCar Ford
    public void clBottomPanel(){
      centrPanel.removeAll();
      centrPanel.repaint();
      centrPanel.add(TypeOfCar);
      centrPanel.revalidate();
  } 

//---------------------------------------  
   //TypeOfCar1 Toyota
    public void cBottomPanel(){
      centrPanel.removeAll();
      centrPanel.repaint();
      centrPanel.add(TypeOfCar1);
      centrPanel.revalidate();
  }
//----------------------------------------
   //TypeOfCar2 Nisan
    public void cleBottomPanel(){
      centrPanel.removeAll();
      centrPanel.repaint();
      centrPanel.add(TypeOfCar2);
      centrPanel.revalidate();
  }
//----------------------------------------
   //TypeOfCar3 Honda
    public void cleaBottomPanel(){
      centrPanel.removeAll();
      centrPanel.repaint();
      centrPanel.add(TypeOfCar3);
      centrPanel.revalidate();
  }  
  
//----------------------------------------
  //Honda Sedan
     public void clearBottomPanel1(){
      TypeOfCar3.removeAll();
      TypeOfCar3.repaint();
      TypeOfCar3.add(HS);
      TypeOfCar3.revalidate();
    
  }
  //Honda SUV
     public void clearBottomPanel2(){
      TypeOfCar3.removeAll();
      TypeOfCar3.repaint();
      TypeOfCar3.add(HSUV);
      TypeOfCar3.revalidate();        
  }  
    
    //Honda Truck
     public void clearBottomPanel3(){
      TypeOfCar3.removeAll();
      TypeOfCar3.repaint();
      TypeOfCar3.add(HT);
      TypeOfCar3.revalidate();        
  } 
  
   
//-----------------------------------------    
    //Toyota Sedan
     public void clearBottomPanel5(){
      TypeOfCar1.removeAll();
      TypeOfCar1.repaint();
      TypeOfCar1.add(TS);
      TypeOfCar1.revalidate();
 }   
    //Toyota SUV
     public void clearBottomPanel6(){
      TypeOfCar1.removeAll();
      TypeOfCar1.repaint();
      TypeOfCar1.add(TSUV);
      TypeOfCar1.revalidate();        
  }  
    
    //Toyota Truck
     public void clearBottomPanel7(){
      TypeOfCar1.removeAll();
      TypeOfCar1.repaint();
      TypeOfCar1.add(TT);
      TypeOfCar1.revalidate();        
  } 
//--------------------------------------------------
    //Ford Sedan
     public void clearBottomPanel9(){
      TypeOfCar.removeAll();
      TypeOfCar.repaint();
      TypeOfCar.add(FS);
      TypeOfCar.revalidate();        
  }

    //Ford SUV
     public void clearBottomPanel10(){
      TypeOfCar.removeAll();
      TypeOfCar.repaint();
      TypeOfCar.add(FSUV);
      TypeOfCar.revalidate();        
  } 
  
    //Ford Truck
     public void clearBottomPanel11(){
      TypeOfCar.removeAll();
      TypeOfCar.repaint();
      TypeOfCar.add(FT);
      TypeOfCar.revalidate();        
  }    
   
    //Ford Cabr   
     public void clearBottomPanel12(){
      TypeOfCar.removeAll();
      TypeOfCar.repaint();
      TypeOfCar.add(FC);
      TypeOfCar.revalidate();        
  }    
//----------------------------------------- 
     //Niss Sedan
     public void clearBottomPanel13(){
      TypeOfCar2.removeAll();
      TypeOfCar2.repaint();
      TypeOfCar2.add(NS);
      TypeOfCar2.revalidate();        
  }

    //Niss SUV
     public void clearBottomPanel14(){
      TypeOfCar2.removeAll();
      TypeOfCar2.repaint();
      TypeOfCar2.add(NSUV);
      TypeOfCar2.revalidate();        
  } 
    //nis Cabr   
     public void clearBottomPanel4(){
      TypeOfCar2.removeAll();
      TypeOfCar2.repaint();
      TypeOfCar2.add(NC);
      TypeOfCar2.revalidate();        
  } 
  
    //Niss Truck
     public void clearBottomPanel15(){
      TypeOfCar2.removeAll();
      TypeOfCar2.repaint();
      TypeOfCar2.add(NT);
      TypeOfCar2.revalidate();        
  }    
//---------------------------------------
  //Go to Main
     public void clearBottomPanel16(){
       centrPanel.removeAll();
       centrPanel.repaint();
       MainPage();
       centrPanel.revalidate();
   } 
//---------------------------------------
  //Go to MainHonda
     public void clearBottomPanel17(){
       TypeOfCar3.removeAll();
       TypeOfCar3.repaint();
       Honda();
       TypeOfCar3.revalidate();
   } 
//---------------------------------------
  //Go to MainToyota
     public void clearBottomPanel18(){
       TypeOfCar1.removeAll();
       TypeOfCar1.repaint();
       Toyot();
       TypeOfCar1.revalidate();
   } 
//---------------------------------------
  //Go to MainFord
     public void clearBottomPanel19(){
       TypeOfCar.removeAll();
       TypeOfCar.repaint();
       Ford();
       TypeOfCar.revalidate();
   } 
//---------------------------------------
  //Go to MainNisan
     public void clearBottomPanel20(){
       TypeOfCar2.removeAll();
       TypeOfCar2.repaint();
       Nisan();
       TypeOfCar2.revalidate();
   } 
   
    
 
    
//----------------------------------------   
    // If no type of this car
    private class clearBottomPanel8 implements ActionListener {
      public void actionPerformed(ActionEvent event){  
             JOptionPane.showMessageDialog(null, 
             "Sorry we don't have at that moment this type of cars.");
            
          } 
      } 
   


 class ImagePanel extends JPanel {
     Image image;
       public ImagePanel() {
     image = Toolkit.getDefaultToolkit().createImage("image/c.gif");
      }
 
 
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     if (image != null) {
       g.drawImage(image, 0, 0, this);
     }
   }
 
 }
   
      public static void main(String[] args) {
		new Startup4();
       SwingUtilities.invokeLater(new Runnable() {
       public void run() {
         
       }
     });
 	}
 
}    
     


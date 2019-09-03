import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ve {  
     JPanel topPanel = new JPanel();
     JPanel TypeOfCar = new JPanel();
     JPanel TypeOfCar1 = new JPanel();

     public Ve(){
     JScrollPane scrollBar = new JScrollPane(TypeOfCar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
     JFrame frame=new JFrame("Vehicle");  
     frame.add(scrollBar);   
     frame.setSize(500,500); 
      
     TypeOfCar.setLayout(new BorderLayout());
     TypeOfCar.add(topPanel, BorderLayout.NORTH);     
     topPanel.setBackground(Color.BLACK);
     ImageIcon icon1 = new ImageIcon("image/j1.jpg");
     topPanel.add(new JLabel(icon1));
//----------------------------------------------------------          
     TypeOfCar.add(TypeOfCar1, BorderLayout.CENTER);
     TypeOfCar1.setLayout(new GridLayout(7,4,4,4));

//Honda Car
//Honda Sedan
    ImageIcon hc = new ImageIcon("image/HondClarity.png");
    JButton hh = new JButton("Honda Clarity", hc);
    hh.setForeground(Color.RED);
    hh.setFont(new Font("Arial", Font.PLAIN, 50));
    hh.setVerticalTextPosition(AbstractButton.TOP);
    hh.setHorizontalTextPosition(AbstractButton.CENTER);
         TypeOfCar1.add(hh);
         hh.addActionListener(new ActionListener(){
         public void actionPerformed( ActionEvent e){
			    new HondaS();
             }
            });       
       
      ImageIcon hc1 = new ImageIcon("image/HondaAccord.png");
      JButton h1 = new JButton("Honda Accord", hc1);
      h1.setForeground(Color.RED);
      h1.setFont(new Font("Arial", Font.PLAIN, 50));
      h1.setVerticalTextPosition(AbstractButton.TOP);
      h1.setHorizontalTextPosition(AbstractButton.CENTER);
          TypeOfCar1.add(h1);
          h1.addActionListener(new ActionListener(){
          public void actionPerformed( ActionEvent e){
			  new HondaS1();
           }
           });

       
      ImageIcon hc2 = new ImageIcon("image/HondaCivic.png");
      JButton h2 = new JButton("Honda Civic", hc2);
      h2.setForeground(Color.RED);
      h2.setFont(new Font("Arial", Font.PLAIN, 50));
      h2.setVerticalTextPosition(AbstractButton.TOP);
      h2.setHorizontalTextPosition(AbstractButton.CENTER);
         TypeOfCar1.add(h2);
         h2.addActionListener(new ActionListener(){
         public void actionPerformed( ActionEvent e){
			    new HondaS2();
           }
           });
    
        

  //Honda SUV
   
   ImageIcon hc3 = new ImageIcon("image/Honda CR-V.png");
   JButton h3 = new JButton("Honda CR-V", hc3);
   h3.setForeground(Color.RED);
   h3.setFont(new Font("Arial", Font.PLAIN, 50));
   h3.setVerticalTextPosition(AbstractButton.TOP); 
   h3.setHorizontalTextPosition(AbstractButton.CENTER);
      TypeOfCar1.add(h3);
      h3.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
 			  new HondaJ();
            }
            });
        
   ImageIcon hc4 = new ImageIcon("image/HondaPilot.png");
   JButton h4 = new JButton("Honda Pilot", hc4);
   h4.setForeground(Color.RED);
   h4.setFont(new Font("Arial", Font.PLAIN, 50));
   h4.setVerticalTextPosition(AbstractButton.TOP); 
   h4.setHorizontalTextPosition(AbstractButton.CENTER);
      TypeOfCar1.add(h4);
      h4.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
 			  new HondaJ2();
            }
            });
 
        
    ImageIcon hc5 = new ImageIcon("image/HondaHR-V.png");
    JButton h5 = new JButton("Honda HR-V", hc5);
    h5.setForeground(Color.RED);
    h5.setFont(new Font("Arial", Font.PLAIN, 50));
    h5.setVerticalTextPosition(AbstractButton.TOP); 
    h5.setHorizontalTextPosition(AbstractButton.CENTER);
       TypeOfCar1.add(h5);
       h5.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
 	       new HondaJ1();
            }
            });
            
   
         
 
   //Honda Truck  
   ImageIcon hc6 = new ImageIcon("image/HondaRidgeline.png");
   JButton h6 = new JButton("Honda Ridgeline", hc6);
   h6.setForeground(Color.RED);
   h6.setFont(new Font("Arial", Font.PLAIN, 50));
   h6.setVerticalTextPosition(AbstractButton.TOP); 
   h6.setHorizontalTextPosition(AbstractButton.CENTER);
      TypeOfCar1.add(h6);
      h6.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
 			  new HondaT();
            }
            });
    
        
       
   
//--------------------------------------------------------
 //Toyota Car    
 //Toyota Sedan
    ImageIcon tc = new ImageIcon("image/tt.png");
    JButton tt = new JButton("Toyota Corolla", tc);
    tt.setForeground(Color.RED);
    tt.setFont(new Font("Arial", Font.PLAIN, 50));
    tt.setVerticalTextPosition(AbstractButton.TOP); 
    tt.setHorizontalTextPosition(AbstractButton.CENTER);
         TypeOfCar1.add(tt);
         tt.addActionListener(new ActionListener(){
         public void actionPerformed( ActionEvent e){
 			   new To();
           }
            });
       
    
    ImageIcon tc1 = new ImageIcon("image/Cam.png");
    JButton t1 = new JButton("Toyota Camry Hybrid", tc1);
    t1.setForeground(Color.RED);
    t1.setFont(new Font("Arial", Font.PLAIN, 50));
    t1.setVerticalTextPosition(AbstractButton.TOP); 
    t1.setHorizontalTextPosition(AbstractButton.CENTER);
         TypeOfCar1.add(t1);
         t1.addActionListener(new ActionListener(){
         public void actionPerformed( ActionEvent e){
			   new Ta();
             }
             });
 
        
    ImageIcon tc2 = new ImageIcon("image/Av.png");
    JButton t2 = new JButton("Toyota Avalon", tc2);
    t2.setForeground(Color.RED);
    t2.setFont(new Font("Arial", Font.PLAIN, 50));
    t2.setVerticalTextPosition(AbstractButton.TOP); 
    t2.setHorizontalTextPosition(AbstractButton.CENTER);
         TypeOfCar1.add(t2);
         t2.addActionListener(new ActionListener(){
         public void actionPerformed( ActionEvent e){
            new Ti();
             }
             });
    
  
   //Toyota SUV
   ImageIcon tc3 = new ImageIcon("image/4Runner.png");
   JButton t3 = new JButton("Toyota 4Runner", tc3);
   t3.setForeground(Color.RED);
   t3.setFont(new Font("Arial", Font.PLAIN, 50));
   t3.setVerticalTextPosition(AbstractButton.TOP); 
   t3.setHorizontalTextPosition(AbstractButton.CENTER);
      TypeOfCar1.add(t3);
      t3.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
 			  new ToyotaSUV();
          }
        });
       
    ImageIcon tc4 = new ImageIcon("image/C-HR.png");
    JButton t4 = new JButton("Toyota C-HR", tc4);
    t4.setForeground(Color.RED);
    t4.setFont(new Font("Arial", Font.PLAIN, 50));
    t4.setVerticalTextPosition(AbstractButton.TOP); 
    t4.setHorizontalTextPosition(AbstractButton.CENTER);                                                                                                                                                                                              
          TypeOfCar1.add(t4);
          t4.addActionListener(new ActionListener(){
          public void actionPerformed( ActionEvent e){
             new ToyotaSUV1();
          }
         });
 
        
    ImageIcon tc5 = new ImageIcon("image/RAV4.png");
    JButton t5 = new JButton("Toyota RAV4", tc5);
    t5.setForeground(Color.RED);
    t5.setFont(new Font("Arial", Font.PLAIN, 50));
    t5.setVerticalTextPosition(AbstractButton.TOP); 
    t5.setHorizontalTextPosition(AbstractButton.CENTER); 
         TypeOfCar1.add(t5);
         t5.addActionListener(new ActionListener(){
         public void actionPerformed( ActionEvent e){
 		      new ToyotaSUV2();
     }
    });

//Toyota Truck
   
   ImageIcon tc6 = new ImageIcon("image/ttt.png");
   JButton t6 = new JButton("Toyota Tacoma", tc6);
   t6.setForeground(Color.RED);
   t6.setFont(new Font("Arial", Font.PLAIN, 50));
   t6.setVerticalTextPosition(AbstractButton.TOP); 
   t6.setHorizontalTextPosition(AbstractButton.CENTER);
          TypeOfCar1.add(t6);
          t6.addActionListener(new ActionListener(){
          public void actionPerformed( ActionEvent e){
 	   		new ToyotaT();
              }
           });
   
  //Toyota Cabr we don't have car for that moment

 
 //--------------------------------------------------------
 //Ford Car
  
   //Ford Sedan
     
    ImageIcon fl = new ImageIcon("image/FordFocus.png");
    JButton ff = new JButton("Ford Focus", fl);
    ff.setForeground(Color.RED);
    ff.setFont(new Font("Arial", Font.PLAIN, 50));
    ff.setVerticalTextPosition(AbstractButton.TOP); 
    ff.setHorizontalTextPosition(AbstractButton.CENTER);
       TypeOfCar1.add(ff);
       ff.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
 			  new FordFocus();
         }
     });
        
    ImageIcon fl1 = new ImageIcon("image/FordFusion.png");
    JButton f1 = new JButton("Ford Fusion", fl1);
    f1.setForeground(Color.RED);
    f1.setFont(new Font("Arial", Font.PLAIN, 50));
    f1.setVerticalTextPosition(AbstractButton.TOP); 
    f1.setHorizontalTextPosition(AbstractButton.CENTER);
         TypeOfCar1.add(f1);
         f1.addActionListener(new ActionListener(){
         public void actionPerformed( ActionEvent e){
 			      new FordFusion();
            }
           });

        
    ImageIcon fl2 = new ImageIcon("image/FordTaurus.png");
    JButton f2 = new JButton("Ford Taurus", fl2);
    f2.setForeground(Color.RED);
    f2.setFont(new Font("Arial", Font.PLAIN, 50));
    f2.setVerticalTextPosition(AbstractButton.TOP); 
    f2.setHorizontalTextPosition(AbstractButton.CENTER);
         TypeOfCar1.add(f2);
         f2.addActionListener(new ActionListener(){
         public void actionPerformed( ActionEvent e){
 			      new Taurus();
            }
            });
              
   //Ford SUV
   
   ImageIcon fl3 = new ImageIcon("image/FordEscape.png");
   JButton f3 = new JButton("Ford Escape", fl3);
   f3.setForeground(Color.RED);
   f3.setFont(new Font("Arial", Font.PLAIN, 50));
   f3.setVerticalTextPosition(AbstractButton.TOP); 
   f3.setHorizontalTextPosition(AbstractButton.CENTER);
         TypeOfCar1.add(f3);
         f3.addActionListener(new ActionListener(){
         public void actionPerformed( ActionEvent e){
 			   new FordSUV2();
            }
            });
        
    ImageIcon fl4 = new ImageIcon("image/FordExpedition.png");
    JButton f4 = new JButton("Ford Expedition", fl4);
    f4.setForeground(Color.RED);
    f4.setFont(new Font("Arial", Font.PLAIN, 50));
    f4.setVerticalTextPosition(AbstractButton.TOP); 
    f4.setHorizontalTextPosition(AbstractButton.CENTER);
         TypeOfCar1.add(f4);
         f4.addActionListener(new ActionListener(){
         public void actionPerformed( ActionEvent e){
 		      new FordSUV1();
            }
          });
 
        
    ImageIcon fl5 = new ImageIcon("image/FordExplorer.png");
    JButton f5 = new JButton("Ford Explorer", fl5);
    f5.setForeground(Color.RED);
    f5.setFont(new Font("Arial", Font.PLAIN, 50));
    f5.setVerticalTextPosition(AbstractButton.TOP); 
    f5.setHorizontalTextPosition(AbstractButton.CENTER);
         TypeOfCar1.add(f5);
         f5.addActionListener(new ActionListener(){
         public void actionPerformed( ActionEvent e){
 			      new FordSUV();
            }
            });  
 
 //Ford Truck
   
   ImageIcon fl6 = new ImageIcon("image/FordF-150.png");
   JButton f6 = new JButton("Ford F-150", fl6);
   f6.setForeground(Color.RED);
   f6.setFont(new Font("Arial", Font.PLAIN, 50));
   f6.setVerticalTextPosition(AbstractButton.TOP); 
   f6.setHorizontalTextPosition(AbstractButton.CENTER);
       TypeOfCar1.add(f6);
       f6.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
 			  new FordT();
            }
            });
        
    ImageIcon fl7 = new ImageIcon("image/FordF-350.png");
    JButton f7 = new JButton("Ford F-350", fl7);
    f7.setForeground(Color.RED);
    f7.setFont(new Font("Arial", Font.PLAIN, 50));
    f7.setVerticalTextPosition(AbstractButton.TOP); 
    f7.setHorizontalTextPosition(AbstractButton.CENTER);
       TypeOfCar1.add(f7);
       f7.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
 		   	  new FordT2();
          }
            });
 
        
    ImageIcon fl8 = new ImageIcon("image/FordF-250.png");
    JButton f8 = new JButton("Ford F-250", fl8);
    f8.setForeground(Color.RED);
    f8.setFont(new Font("Arial", Font.PLAIN, 50));
    f8.setVerticalTextPosition(AbstractButton.TOP); 
    f8.setHorizontalTextPosition(AbstractButton.CENTER);
         TypeOfCar1.add(f8);
         f8.addActionListener(new ActionListener(){
          public void actionPerformed( ActionEvent e){
 		         new FordT1();
            }
            });
            
 //Ford Cabr 
   ImageIcon fl9 = new ImageIcon("image/FC.png");
   JButton f9 = new JButton("Ford Mustang", fl9);
   f9.setForeground(Color.RED);
   f9.setFont(new Font("Arial", Font.PLAIN, 50));
   f9.setVerticalTextPosition(AbstractButton.TOP); 
   f9.setHorizontalTextPosition(AbstractButton.CENTER);
       TypeOfCar1.add(f9);
       f9.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
 			  new FordC1();
            }
            });
        
    ImageIcon fl10 = new ImageIcon("image/FordMustang.png");
    JButton f10 = new JButton("Ford Mustang", fl10);
    f10.setForeground(Color.RED);
    f10.setFont(new Font("Arial", Font.PLAIN, 50));
    f10.setVerticalTextPosition(AbstractButton.TOP); 
    f10.setHorizontalTextPosition(AbstractButton.CENTER);
         TypeOfCar1.add(f10);
         f10.addActionListener(new ActionListener(){
         public void actionPerformed( ActionEvent e){
 			  new FordC();
            }
            });
          
 //--------------------------------------------------------
 //Nissan Car
 //Nissan Sedan
    
    ImageIcon nn1 = new ImageIcon("image/ni.png");
    JButton nn = new JButton("Nissan Altima", nn1);
    nn.setForeground(Color.RED);
    nn.setFont(new Font("Arial", Font.PLAIN, 50));
    nn.setVerticalTextPosition(AbstractButton.TOP); 
    nn.setHorizontalTextPosition(AbstractButton.CENTER);
       TypeOfCar1.add(nn);
       nn.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
 			  new NS();
           }
           });
        
    ImageIcon nn2 = new ImageIcon("image/NissanVersa.png");
    JButton n1 = new JButton("Nissan Versa", nn2);
    n1.setForeground(Color.RED);
    n1.setFont(new Font("Arial", Font.PLAIN, 50));
    n1.setVerticalTextPosition(AbstractButton.TOP); 
    n1.setHorizontalTextPosition(AbstractButton.CENTER);
         TypeOfCar1.add(n1);
         n1.addActionListener(new ActionListener(){
             public void actionPerformed( ActionEvent e){
 			      new NS1();
                }
            });
 
        
    ImageIcon nn3 = new ImageIcon("image/NissanMaxima.png");
    JButton n2 = new JButton("Nissan Maxima", nn3);
    n2.setForeground(Color.RED);
    n2.setFont(new Font("Arial", Font.PLAIN, 50));
    n2.setVerticalTextPosition(AbstractButton.TOP); 
    n2.setHorizontalTextPosition(AbstractButton.CENTER);
         TypeOfCar1.add(n2);
         n2.addActionListener(new ActionListener(){
         public void actionPerformed( ActionEvent e){
 			  new NS2();
            }
            });
   //Nissan SUV  
   ImageIcon nn4 = new ImageIcon("image/NissanMurano.png");
   JButton n3 = new JButton("Nissan Murano", nn4);
   n3.setForeground(Color.RED);
   n3.setFont(new Font("Arial", Font.PLAIN, 50));
   n3.setVerticalTextPosition(AbstractButton.TOP); 
   n3.setHorizontalTextPosition(AbstractButton.CENTER);
        TypeOfCar1.add(n3);
        n3.addActionListener(new ActionListener(){
        public void actionPerformed( ActionEvent e){
 			  new NJ2();
            }
           });
        
    ImageIcon nn5 = new ImageIcon("image/NissanRogue.png");
    JButton n4 = new JButton("Nissan Rogue", nn5);
    n4.setForeground(Color.RED);
    n4.setFont(new Font("Arial", Font.PLAIN, 50));
    n4.setVerticalTextPosition(AbstractButton.TOP); 
    n4.setHorizontalTextPosition(AbstractButton.CENTER);
       TypeOfCar1.add(n4);
       n4.addActionListener(new ActionListener(){
       public void actionPerformed( ActionEvent e){
 			  new NJ1();
            }
            });
 
        
    ImageIcon nn6 = new ImageIcon("image/NissanArmada.png");
    JButton n5 = new JButton("Nissan Armada", nn6);
    n5.setForeground(Color.RED);
    n5.setFont(new Font("Arial", Font.PLAIN, 50));
    n5.setVerticalTextPosition(AbstractButton.TOP); 
    n5.setHorizontalTextPosition(AbstractButton.CENTER);
      TypeOfCar1.add(n5);
      n5.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
 			  new NJ();
            }
            });
    
//Nissan Cab  
   ImageIcon nn7 = new ImageIcon("image/Nissan 370Z.png");
   JButton n9 = new JButton("Nissan 370Z", nn7);
   n9.setForeground(Color.RED);
   n9.setFont(new Font("Arial", Font.PLAIN, 50));
   n9.setVerticalTextPosition(AbstractButton.TOP); 
   n9.setHorizontalTextPosition(AbstractButton.CENTER);
      TypeOfCar1.add(n9);
      n9.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
 			  new NisC();
            }
            });
//  //Nissan Truck
    
   ImageIcon nn8 = new ImageIcon("image/NissanFrontier.png");
   JButton n6 = new JButton("Nissan Frontier", nn8);
   n6.setForeground(Color.RED);
   n6.setFont(new Font("Arial", Font.PLAIN, 50));
   n6.setVerticalTextPosition(AbstractButton.TOP); 
   n6.setHorizontalTextPosition(AbstractButton.CENTER);
      TypeOfCar1.add(n6);
      n6.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
 			  new NisT();
            }
           });
        
    ImageIcon nn9 = new ImageIcon("image/NissanTitan.png");
    JButton n7 = new JButton("Nissan Titan", nn9);
    n7.setForeground(Color.RED);
    n7.setFont(new Font("Arial", Font.PLAIN, 50));
    n7.setVerticalTextPosition(AbstractButton.TOP); 
    n7.setHorizontalTextPosition(AbstractButton.CENTER);
      TypeOfCar1.add(n7);
      n7.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
 		  new NisT1();
            }
            });
 
        
    ImageIcon nn10 = new ImageIcon("image/NissanTitanXD.png");
    JButton n8 = new JButton("Nissan Titan XD", nn10);
    n8.setForeground(Color.RED);
    n8.setFont(new Font("Arial", Font.PLAIN, 50));
    n8.setVerticalTextPosition(AbstractButton.TOP); 
    n8.setHorizontalTextPosition(AbstractButton.CENTER);
      TypeOfCar1.add(n8);
      n8.addActionListener(new ActionListener(){
      public void actionPerformed( ActionEvent e){
 			  new NisT2();
            }
            });
     
      
  
       frame.setVisible(true);      
    }
    }
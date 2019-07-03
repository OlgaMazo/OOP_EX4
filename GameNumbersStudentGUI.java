/**
 *This class represents the game play when two studtens play against each other
 *@author Daniel and Olga
 */
public class GameNumbersStudentGUI extends javax.swing.JFrame {
    
    private int [] game; //the array with numbers to choose
    int i, j, n, sum1, sum2;
    String path1 = ""; //first path
    String path2 = ""; //second path
    
    /**
     *GameNumbersStudentGUI constructor
     */
    public GameNumbersStudentGUI() {
        initComponents();
        createArray();
        showList(0, game.length-1); //show the array with the numbers to choose
        i = sum1 = sum2 = 0;
        n = game.length;
        j = n-1;
        message_.setText("Student 1 it's your turn, please choose a number");
    }


    @SuppressWarnings("unchecked")                          
    private void initComponents() {

        game_array_ = new java.awt.List();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        student1_score_ = new java.awt.Label();
        student2_score_ = new java.awt.Label();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        student1_path_ = new java.awt.Label();
        student2_path_ = new java.awt.Label();
        top1_button_ = new javax.swing.JButton();
        lower1_button_ = new javax.swing.JButton();
        top2_button_ = new javax.swing.JButton();
        lower2_button_ = new javax.swing.JButton();
        message_ = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        game_array_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                game_array_ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); //choose font and size 
        jTextField1.setText("First Student:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); //choose font and size 
        jTextField2.setText("Second Student:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); //choose font and size 
        jTextField3.setText("Score:");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); //choose font and size 
        jTextField4.setText("Score:");

        student1_score_.setText("0");

        student2_score_.setText("0");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); //choose font and size 
        jTextField5.setText("Path:");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); //choose font and size 
        jTextField6.setText("Path:");

        top1_button_.setFont(new java.awt.Font("Tahoma", 0, 14)); //choose font and size 
        top1_button_.setText("To Choose Top");
        top1_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top1_button_ActionPerformed(evt);
            }
        });

        lower1_button_.setFont(new java.awt.Font("Tahoma", 0, 14)); //choose font and size 
        lower1_button_.setText("To Choose Lower");
        lower1_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lower1_button_ActionPerformed(evt);
            }
        });

        top2_button_.setFont(new java.awt.Font("Tahoma", 0, 14)); //choose font and size 
        top2_button_.setText("To Choose Top");
        top2_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top2_button_ActionPerformed(evt);
            }
        });

        lower2_button_.setFont(new java.awt.Font("Tahoma", 0, 14)); //choose font and size 
        lower2_button_.setText("To Choose Lower");
        lower2_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lower2_button_ActionPerformed(evt);
            }
        });

        message_.setFont(new java.awt.Font("Dialog", 1, 18)); //choose font and size 
        message_.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lower2_button_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(top2_button_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(student2_path_, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addComponent(student2_score_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(47, 47, 47)))
                        .addComponent(game_array_, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(student1_score_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jTextField3)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lower1_button_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(top1_button_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(student1_path_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(message_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(student2_score_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(student2_path_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(top2_button_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lower2_button_))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(game_array_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(student1_score_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(student1_path_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(top1_button_)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lower1_button_))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(message_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }                       

    private void game_array_ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    /**
     *top1_button_ActionPerformed
     *This function represents what happens when the first student selects the top number in the list 
     * @param evt - the click operation
     */
    private void top1_button_ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        sum1 = sum1 + game[i]; //update the first sum
        student1_score_.setText(Integer.toString(sum1));
        path1 = path1 + game[i] + "  "; //update the first path
        student1_path_.setText(path1);
	i++;
        showList(i, j);
        
        //decide if continue the game or we finish the game
        if (i <= j) {
            message_.setText("Student 2 it's your turn, please choose a number");
        }else {
        	//first student is the winner
            if (sum1 > sum2) {
                Winner1GUI w1 = new Winner1GUI();
                w1.setVisible(true);
                //second student is the winner
            } else if(sum1 < sum2) {
                Winner2GUI w2 = new Winner2GUI();
                w2.setVisible(true);
                //tie between two players
            }else {
                TieGUI t = new TieGUI();
                t.setVisible(true);
            }
        }
    }                                            

    /**
     *top2_button_ActionPerformed
     *This function represents what happens when the second student selects the top number in the list 
     *@param evt - the click operation
     */
    private void top2_button_ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        sum2 = sum2 + game[i]; //update the second sum
        student2_score_.setText(Integer.toString(sum2));
        path2 = path2 + game[i] + "  "; //update the first path
        student2_path_.setText(path2);
	i++;
        showList(i, j);
        
      //decide if continue the game or we finish the game
        if (i <= j) {
            message_.setText("Student 1 it's your turn, please choose a number");
        }else {
        	//first student is the winner
            if (sum1 > sum2) {
                Winner1GUI w1 = new Winner1GUI();
                w1.setVisible(true);
              //second student is the winner
            } else if(sum1 < sum2) {
                Winner2GUI w2 = new Winner2GUI();
                w2.setVisible(true);
              //tie between two players
            }else {
                TieGUI t = new TieGUI();
                t.setVisible(true);
            }
        }
    }                                            

    /**
     *lower1_button_ActionPerformed
     *This function represents what happens when the first student selects the lower number in the list 
     *@param evt - the click operation
     */
    private void lower1_button_ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        sum1 = sum1 + game[j]; //update the first sum
        student1_score_.setText(Integer.toString(sum1));
        path1 = path1 + game[j] + "  "; //update the first path
        student1_path_.setText(path1);
	j--;
        showList(i, j);
        
      //decide if continue the game or we finish the game
        if (i <= j) {
            message_.setText("Student 2 it's your turn, please choose a number");
        }else {
        	//first student is the winner
            if (sum1 > sum2) {
                Winner1GUI w1 = new Winner1GUI();
                w1.setVisible(true);
             //second student is the winner
            } else if(sum1 < sum2) {
                Winner2GUI w2 = new Winner2GUI();
                w2.setVisible(true);
              //tie between two players
            }else {
                TieGUI t = new TieGUI();
                t.setVisible(true);
            }
        }
    }                                              

    /**
     *lower2_button_ActionPerformed
     *This function represents what happens when the second student selects the lower number in the list 
     *@param evt - the click operation
     */
    private void lower2_button_ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        sum2 = sum2 + game[j]; //update the second sum
        student2_score_.setText(Integer.toString(sum2));
        path2 = path2 + game[j] + "  "; //update the second path
        student2_path_.setText(path2);
	j--;
        showList(i, j);
        
      //decide if continue the game or we finish the game
        if (i <= j) {
            message_.setText("Student 1 it's your turn, please choose a number");
        }else {
        	//first student is the winner
            if (sum1 > sum2) {
                Winner1GUI w1 = new Winner1GUI();
                w1.setVisible(true);
              //second student is the winner
            } else if(sum1 < sum2) {
                Winner2GUI w2 = new Winner2GUI();
                w2.setVisible(true);
              //tie between two players
            }else {
                TieGUI t = new TieGUI();
                t.setVisible(true);
            }
        }
    }                                              

    /**
     *main
     *start the game 
     *@param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameNumbersStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameNumbersStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameNumbersStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameNumbersStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameNumbersStudentGUI().setVisible(true);
            }
        });
    }
    
        private void createArray() {
          
        int size = (int)(Math.random()*20)+2;
        if(size % 2 != 0) {
            size++;
        }   
        game = new int [size];
        
        for (int i = 0; i<game.length; i++) 
            game[i] = (int)(Math.random()*100)+1;  
    }
        
        private void showList(int start, int end) {
        game_array_.removeAll();
        for(int i=start; i<=end; i++) {
            int value = game[i];
            game_array_.add(Integer.toString(value));
        }
    }

                    
    private java.awt.List game_array_;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton lower1_button_;
    private javax.swing.JButton lower2_button_;
    private java.awt.Label message_;
    private java.awt.Label student1_path_;
    private java.awt.Label student1_score_;
    private java.awt.Label student2_path_;
    private java.awt.Label student2_score_;
    private javax.swing.JButton top1_button_;
    private javax.swing.JButton top2_button_;
                    
}

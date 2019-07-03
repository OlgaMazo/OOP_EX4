/**
 * This class represent the main screen of the game - 
 * the player need to choice if he want to play against the computer or else student
 * @author Daniel and Olga
 *
 */
public class GameNumbersGUI extends javax.swing.JFrame {

    /**
     * GameNumbersGUI constructor
     */
    public GameNumbersGUI() {
        initComponents();
    }

    /**
     * initComponents
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")                       
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        computer_button_ = new javax.swing.JButton(); //chose to play with the computer button
        student_button_ = new javax.swing.JButton(); //chose to play with student button

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setText("Welcome To The Game Numbers"); //welcome message
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setText("Who would you like to play against?");

        computer_button_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        computer_button_.setText("Computer");
        computer_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computer_button_ActionPerformed(evt);
            }
        });

        student_button_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        student_button_.setText("Student");
        student_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_button_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(computer_button_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(student_button_, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computer_button_, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_button_, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }                  

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    /**
     * computer_button_ActionPerformed
     * open the game against the computer window if chose to play with the computer
     * @param evt - click on the button operation
     */
    private void computer_button_ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
        GameNumbersComputerGUI c = new GameNumbersComputerGUI();
        c.setVisible(true);
    }                                                

    /**
     * student_button_ActionPerformed
     * open the game against student window if chose to play with another student
     * @param evt - click on the button operation
     */
    private void student_button_ActionPerformed(java.awt.event.ActionEvent evt) {                                                
       
        GameNumbersStudentGUI s = new GameNumbersStudentGUI();
        s.setVisible(true);
    }                                               

    /**
     * main
     * the main function to run the program
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Set the Nimbus look and feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameNumbersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameNumbersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameNumbersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameNumbersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameNumbersGUI().setVisible(true);
            }
        });
    }

    //Variables declaration                
    private javax.swing.JButton computer_button_;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton student_button_;
}

/**
 *This class represents gui that means that the computer win the student
 *@author Daniel and Olga
 */
public class WinnerGUI extends javax.swing.JFrame {

    /**
     *WinnerGUI constructor
     */
    public WinnerGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")                         
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Tahoma", 1, 36)); //choose the font and the size
        label1.setForeground(new java.awt.Color(0, 204, 204)); //choose the screen color and size
        label1.setText("The Winner Is The"); //show on the screen

        label2.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        label2.setForeground(new java.awt.Color(0, 204, 204));
        label2.setText("Computer!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        pack();
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
            java.util.logging.Logger.getLogger(WinnerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinnerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinnerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinnerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

      //show on screen the winner
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinnerGUI().setVisible(true);
            }
        });
    }

                       
    private java.awt.Label label1;
    private java.awt.Label label2;
                    
}

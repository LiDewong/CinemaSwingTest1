
package cinemaswingtest1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StaffAddRemoveMovie extends javax.swing.JFrame {

    /**
     * Creates new form StaffAddMovie
     */
    public StaffAddRemoveMovie() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Spider-Man: No Way Home", "16 Dec 2021", "Tom Holland, Zendaya, Benedict Cumberbatch, Jacob Batalon", "For the first time in the cinematic history of Spider-Man, our friendly neighborhood hero's identity is revealed, bringing his Super Hero responsibilities into conflict with his normal life and putting those he cares about most at risk. When he enlists Doctor Strange's help to restore his secret, the spell tears a hole in their world, releasing the most powerful villains who've ever fought a Spider-Man in any universe. Now, Peter will have to overcome his greatest challenge yet, which will not only forever alter his own future but the future of the Multiverse. "},
                {"No Time To Die", "25 Nov 2021", "Daniel Craig, Rami Malek, Ana de Armas", "In No Time To Die, Bond has left active service and is enjoying a tranquil life in Jamaica. His peace is short-lived when his old friend Felix Leiter from the CIA turns up asking for help. The mission to rescue a kidnappted scientist turns out to be far more treachrous than expected, leading Bond onto the trail of a mysterious villain armed with dangerous new technology."},
                {"Eternals", "04 Nov 2021", "Angelina Jolie, Salma Hayek, Richard Madden", "The saga of the Eternals, a race of immortal beings who lived on Earth and shaped its history and civilizations."},
                {"The Medium", "02 Dec 2021", " Narilya Gulmongkolpech, Sawanee Utoomma, Sirani Yankittikan", "A horrifying story of a shaman's inheritance in the Isan region of Thailand. What could be possessing a family member might not be the Goddess they make it out to be."},
                {"Ghostbusters: Afterlife", "02 Dec 2021", "Carrie Coon, Mckenna Grace, Finn Wolfhard, Paul Rudd", "From director Jason Reitman and producer Ivan Reitman, comes the next chapter in the original Ghostbusters universe in Ghostbusters Afterlife, when a single mom and her two kids arrive in a small town, they begin to discover their connection to the original ghostbusters and the secret legacy their grandfather left behind. The film is written by Jason Reitman Gil Kenan."}
            },
            new String [] {
                "Title", "Release Date", "Cast", "Synopsis"
            }
        ));
        jTable1.setRowHeight(23);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 890, 300));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Back To Option");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 140, 37));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Save");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 140, 37));

        btnAdd.setBackground(new java.awt.Color(255, 255, 51));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 140, 37));

        btnRemove.setBackground(new java.awt.Color(255, 255, 51));
        btnRemove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 140, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/black 2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        StaffAddMovie addmovie=new StaffAddMovie();
        addmovie.setVisible(true);
        addmovie.pack();
        addmovie.setLocationRelativeTo(null);
        addmovie.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        StaffAddMovie mainMenu=new StaffAddMovie();
        mainMenu.show();     //display Main Menu here
        
        dispose(); 
        
        
//        //code to load date into table
//        //validation for not leave blank data
//        if(txtTitle.getText().equals("")||txtDate.getText().equals("")||txtCast.getText().equals("")||txtSynopsis.getText().equals("")){
//            //if any of four field left blank then show message
//            JOptionPane.showMessageDialog(this, "Please Enter All Data !");
//        }
//        else{
//            //if all data field then...
//            //store enter data into String array
//            String data[]={txtTitle.getText(),txtDate.getText(),txtCast.getText(),txtSynopsis.getText()};
//        
//            DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
//            tblModel.addRow(data); //row added
//            //successfully added message
//            JOptionPane.showMessageDialog(this,"Add Date Successfully !");
//            //clear textfield for new entry
//            txtTitle.setText("");
//            txtDate.setText("");
//            txtCast.setText("");
//            txtSynopsis.setText("");
//        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        //get jtable model first
        DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
        //delete row
        if(jTable1.getSelectedRowCount()==1){
           //if single row is selected than delete
           tblModel.removeRow(jTable1.getSelectedRow());
        }
        else{
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty.");
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select Single Row for Delete.");
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        StaffMainMenu mainMenu=new StaffMainMenu();
        mainMenu.show();     //display Main Menu here
        
        dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void AddRowToJTable(Object[] dataRow){
        DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
        tblModel.addRow(dataRow);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StaffAddRemoveMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffAddRemoveMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffAddRemoveMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffAddRemoveMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffAddRemoveMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

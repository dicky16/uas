/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

/**
 *
 * @author djavu
 */
public class TiketWisata extends javax.swing.JFrame {

    /**
     * Creates new form TiketWisata
     */
    public TiketWisata() {
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

        btnJTP1 = new javax.swing.JButton();
        btnJTP2 = new javax.swing.JButton();
        btnJTP3 = new javax.swing.JButton();
        btnEGP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnJTP1.setBackground(new java.awt.Color(0, 153, 255));
        btnJTP1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnJTP1.setForeground(new java.awt.Color(255, 255, 255));
        btnJTP1.setText("JATIM PARK 1");
        btnJTP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJTP1ActionPerformed(evt);
            }
        });

        btnJTP2.setBackground(new java.awt.Color(0, 153, 255));
        btnJTP2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnJTP2.setForeground(new java.awt.Color(255, 255, 255));
        btnJTP2.setText("JATIM PARK 2");
        btnJTP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJTP2ActionPerformed(evt);
            }
        });

        btnJTP3.setBackground(new java.awt.Color(0, 153, 255));
        btnJTP3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnJTP3.setForeground(new java.awt.Color(255, 255, 255));
        btnJTP3.setText("JATIM PARK 3");

        btnEGP.setBackground(new java.awt.Color(0, 153, 255));
        btnEGP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEGP.setForeground(new java.awt.Color(255, 255, 255));
        btnEGP.setText("ECO GREEN PARK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnJTP1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJTP2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJTP3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEGP, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJTP1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJTP2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJTP3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEGP, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJTP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJTP1ActionPerformed
        JTP1 jtp1 = new JTP1();
        jtp1.setLocationRelativeTo(this);
        jtp1.setVisible(true);
    }//GEN-LAST:event_btnJTP1ActionPerformed

    private void btnJTP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJTP2ActionPerformed
        JTP2 jtp2 = new JTP2();
        jtp2.setLocationRelativeTo(this);
        jtp2.setVisible(true);
    }//GEN-LAST:event_btnJTP2ActionPerformed

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
            java.util.logging.Logger.getLogger(TiketWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TiketWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TiketWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TiketWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiketWisata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEGP;
    private javax.swing.JButton btnJTP1;
    private javax.swing.JButton btnJTP2;
    private javax.swing.JButton btnJTP3;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

import java.util.Date;
import javax.swing.JOptionPane;
import static tiket.Fungsi.getJumlah;
import static tiket.Fungsi.getSubTotal;
import static tiket.Fungsi.getTotal;
import static tiket.Fungsi.setArray;
/**
 *
 * @author djavu
 */
public class EGP extends javax.swing.JFrame {

    /**
     * Creates new form MuseumTubuh
     */
    public EGP() {
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

        cTiket1 = new javax.swing.JCheckBox();
        cTiket2 = new javax.swing.JCheckBox();
        cTiket3 = new javax.swing.JCheckBox();
        txtJumlahTiket1 = new javax.swing.JTextField();
        txtJumlahTiket2 = new javax.swing.JTextField();
        txtJumlahTiket3 = new javax.swing.JTextField();
        txtSubTiket3 = new javax.swing.JTextField();
        txtSubTiket2 = new javax.swing.JTextField();
        txtSubTiket1 = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBayar = new javax.swing.JButton();
        lblTiket1 = new javax.swing.JLabel();
        lblTiket2 = new javax.swing.JLabel();
        lblTiket3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        cTiket1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cTiket1.setText("TIKET ECO GREEN PARK");
        cTiket1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTiket1ActionPerformed(evt);
            }
        });

        cTiket2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cTiket2.setText("TIKET PAKET 2 ( JATIM PARK 2 - ECO GREEN PARK )");

        cTiket3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cTiket3.setText("TIKET SAKTI (BERLAKU 2 HARI)");

        txtJumlahTiket1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtJumlahTiket1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJumlahTiket1KeyReleased(evt);
            }
        });

        txtJumlahTiket2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtJumlahTiket2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJumlahTiket2KeyReleased(evt);
            }
        });

        txtJumlahTiket3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtJumlahTiket3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJumlahTiket3KeyReleased(evt);
            }
        });

        txtSubTiket3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtSubTiket2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtSubTiket1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnHitung.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Total Harga");

        btnBayar.setBackground(new java.awt.Color(0, 153, 255));
        btnBayar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("BAYAR");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        lblTiket1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTiket1.setText("75000");

        lblTiket2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTiket2.setText("150000");

        lblTiket3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTiket3.setText("375000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(446, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTiket2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTiket1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTiket3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(364, 364, 364))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cTiket2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cTiket1)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGap(172, 172, 172)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtJumlahTiket2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addComponent(txtSubTiket2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtJumlahTiket1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(55, 55, 55)
                                    .addComponent(txtSubTiket1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(btnBayar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cTiket3)
                                    .addGap(369, 369, 369)
                                    .addComponent(txtJumlahTiket3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnHitung)
                                        .addComponent(txtSubTiket3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(56, 56, 56)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTiket1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTiket2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTiket3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cTiket1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSubTiket1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtJumlahTiket1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cTiket2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSubTiket2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtJumlahTiket2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cTiket3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSubTiket3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtJumlahTiket3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnHitung)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(18, 18, 18)
                    .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cTiket1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTiket1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTiket1ActionPerformed

    private void txtJumlahTiket1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahTiket1KeyReleased
        if(txtJumlahTiket1.getText().equals("")){
              txtJumlahTiket1.setText("0");
           txtSubTiket1.setText("0");
       }else{
        int hrg = Integer.parseInt(lblTiket1.getText());
        int jml = Integer.parseInt(txtJumlahTiket1.getText());
        int sub_total = getSubTotal(jml,hrg);
        txtSubTiket1.setText(""+sub_total);
        }
    }//GEN-LAST:event_txtJumlahTiket1KeyReleased

    private void txtJumlahTiket2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahTiket2KeyReleased
        // TODO add your handling code here:
        if(txtJumlahTiket2.getText().equals("")){
              txtJumlahTiket2.setText("0");
           txtSubTiket2.setText("0");
       }else{
        int hrg = Integer.parseInt(lblTiket2.getText());
        int jml = Integer.parseInt(txtJumlahTiket2.getText());
        int sub_total = getSubTotal(jml,hrg);
        txtSubTiket2.setText(""+sub_total);
        }
    }//GEN-LAST:event_txtJumlahTiket2KeyReleased

    private void txtJumlahTiket3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahTiket3KeyReleased
        if(txtJumlahTiket3.getText().equals("")){
              txtJumlahTiket3.setText("0");
           txtSubTiket3.setText("0");
       }else{
        int hrg = Integer.parseInt(lblTiket3.getText());
        int jml = Integer.parseInt(txtJumlahTiket3.getText());
        int sub_total = getSubTotal(jml,hrg);
        txtSubTiket3.setText(""+sub_total);
        }
    }//GEN-LAST:event_txtJumlahTiket3KeyReleased

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        int a,b,c,hasil;
        a = Integer.parseInt(txtSubTiket1.getText());
        b = Integer.parseInt(txtSubTiket2.getText());
        c = Integer.parseInt(txtSubTiket3.getText());
        if(cTiket1.isSelected()&&cTiket2.isSelected()&&cTiket3.isSelected()){
            hasil = getTotal(a,b,c);
            txtTotal.setText(""+hasil);
        }else if(cTiket1.isSelected()&&cTiket2.isSelected()){
            hasil = getJumlah(a,b);
            txtTotal.setText(""+hasil);

        }else if(cTiket1.isSelected()&&cTiket3.isSelected()){
            hasil = getJumlah(a,c);
            txtTotal.setText(""+hasil);

        }else if(cTiket1.isSelected()){
            txtTotal.setText(""+a);

        }else if(cTiket2.isSelected()){
            txtTotal.setText(""+b);

        }else if(cTiket3.isSelected()){
            txtTotal.setText(""+c);

        }else{
            JOptionPane.showMessageDialog(this, "Silahkan pilih jenis tiket !");
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        int jml,jml2,jml3,subs,jumlah;
        String jenis1,jenis2,jenis3,tgl,jenis,tanggal;
        Date date = new Date();
        jml = Integer.parseInt(txtJumlahTiket1.getText());
        jml2 = Integer.parseInt(txtJumlahTiket2.getText());
        jml3 = Integer.parseInt(txtJumlahTiket3.getText());
        jenis1 = cTiket1.getText();
        jenis2 = cTiket2.getText();
        jenis3 = cTiket3.getText();
        if(jml==0||jml2==0||jml3==0){
            JOptionPane.showMessageDialog(this, "Jumlah tiket kosong !");
        }
        if(txtTotal.getText().equals("0")){
            JOptionPane.showMessageDialog(this, "Silahkan hitung terlebih dahulu !");
        }else{
        if(cTiket1.isSelected()&&cTiket2.isSelected()&&cTiket3.isSelected()){
            jumlah = getTotal(jml,jml2,jml3);
            jenis = jenis1+","+jenis2+","+jenis3;
            tgl = date.toString();
            subs = Integer.parseInt(txtTotal.getText());
            setArray(jenis,tgl,subs,jumlah);
           JOptionPane.showMessageDialog(this, "Jenis : "+jenis+"\n"
            +"Jumlah Tiket : "+jumlah+"\n"
            +"Total : "+subs+"\n"
            +"Tanggal Pembelian : "+tgl);
        }else if(cTiket1.isSelected()&&cTiket2.isSelected()){
            jumlah = getJumlah(jml,jml2);
            jenis = jenis1+","+jenis2;
            tgl = date.toString();
            subs = Integer.parseInt(txtTotal.getText());
            setArray(jenis,tgl,subs,jumlah);
            JOptionPane.showMessageDialog(this, "Jenis : "+jenis+"\n"
            +"Jumlah Tiket : "+jumlah+"\n"
            +"Total : "+subs+"\n"
            +"Tanggal Pembelian : "+tgl);
        }else if(cTiket1.isSelected()&&cTiket3.isSelected()){
            jumlah = getJumlah(jml,jml3);
            jenis = jenis1+","+jenis3;
            tgl = date.toString();
            subs = Integer.parseInt(txtTotal.getText());
            setArray(jenis,tgl,subs,jumlah);
           JOptionPane.showMessageDialog(this, "Jenis : "+jenis+"\n"
            +"Jumlah Tiket : "+jumlah+"\n"
            +"Total : "+subs+"\n"
            +"Tanggal Pembelian : "+tgl);
        }else if(cTiket1.isSelected()){
            jumlah = jml;
            jenis = jenis1;
            tgl = date.toString();
            subs = Integer.parseInt(txtTotal.getText());
            setArray(jenis,tgl,subs,jumlah);
            JOptionPane.showMessageDialog(this, "Jenis : "+jenis+"\n"
            +"Jumlah Tiket : "+jumlah+"\n"
            +"Total : "+subs+"\n"
            +"Tanggal Pembelian : "+tgl);
        }else if(cTiket2.isSelected()){
            jumlah = jml2;
            jenis = jenis2;
            tgl = date.toString();
            subs = Integer.parseInt(txtTotal.getText());
            setArray(jenis,tgl,subs,jumlah);
           JOptionPane.showMessageDialog(this, "Jenis : "+jenis+"\n"
            +"Jumlah Tiket : "+jumlah+"\n"
            +"Total : "+subs+"\n"
            +"Tanggal Pembelian : "+tgl);
        }else if(cTiket3.isSelected()){
            jumlah = jml3;
            jenis = jenis3;
            tgl = date.toString();
            subs = Integer.parseInt(txtTotal.getText());
            setArray(jenis,tgl,subs,jumlah);
          JOptionPane.showMessageDialog(this, "Jenis : "+jenis+"\n"
            +"Jumlah Tiket : "+jumlah+"\n"
            +"Total : "+subs+"\n"
            +"Tanggal Pembelian : "+tgl);
        }else{
            JOptionPane.showMessageDialog(this, "Silahkan pilih jenis tiket !");
        }
        txtJumlahTiket1.setText("0");
        txtJumlahTiket2.setText("0");
        txtJumlahTiket3.setText("0");
        txtSubTiket1.setText("0");
        txtSubTiket2.setText("0");
        txtSubTiket3.setText("0");
        txtTotal.setText("0");
        cTiket1.setSelected(false);
        cTiket2.setSelected(false);
        cTiket3.setSelected(false);
        txtTotal.setEditable(false);
        }
    }//GEN-LAST:event_btnBayarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        txtJumlahTiket1.setText("0");
        txtJumlahTiket2.setText("0");
        txtJumlahTiket3.setText("0");
        txtSubTiket1.setText("0");
        txtSubTiket2.setText("0");
        txtSubTiket3.setText("0");
        txtSubTiket2.setEditable(false);
        txtSubTiket1.setEditable(false);
        txtSubTiket3.setEditable(false);
        txtTotal.setEditable(false);
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(EGP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EGP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EGP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EGP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EGP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnHitung;
    private javax.swing.JCheckBox cTiket1;
    private javax.swing.JCheckBox cTiket2;
    private javax.swing.JCheckBox cTiket3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTiket1;
    private javax.swing.JLabel lblTiket2;
    private javax.swing.JLabel lblTiket3;
    private javax.swing.JTextField txtJumlahTiket1;
    private javax.swing.JTextField txtJumlahTiket2;
    private javax.swing.JTextField txtJumlahTiket3;
    private javax.swing.JTextField txtSubTiket1;
    private javax.swing.JTextField txtSubTiket2;
    private javax.swing.JTextField txtSubTiket3;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

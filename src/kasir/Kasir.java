/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import Data.DataKasir;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author djavu
 */
public class Kasir extends javax.swing.JFrame {
    //deklarasi
    
//    static int byr;
//    static int ttl;
    static List <Integer> tHarga = new ArrayList<Integer>();
    private static ArrayList<ModelKasir> dataList = new ArrayList<>();
    DefaultListModel mdlNamaBarang = new DefaultListModel();
    DefaultListModel mdlJumlahHarga = new DefaultListModel();
    int baris =0;
    static Object kolom [] = {"ID","jumlah Item","Total Harga","Tanggal"};
    DefaultTableModel tbl = new DefaultTableModel(kolom, baris);
    /**
     * Creates new form kasir
     */
    public Kasir() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tJumlahHarga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPembelian = new javax.swing.JTable();
        addHargaJumlah = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tTotalHarga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tBayar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tKembalian = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lNamaBarang = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lHargaJumlah = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Daftar Nama Barang");

        jLabel2.setText("Barang dan Harga");

        tPembelian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tPembelian);

        addHargaJumlah.setText("Tambah");
        addHargaJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHargaJumlahActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\mata kuliah\\UIUX\\tugas\\Search.png")); // NOI18N

        jButton2.setText("Bayar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Total harga");

        jLabel4.setText("Bayar");

        tBayar.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tBayarComponentAdded(evt);
            }
        });
        tBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBayarActionPerformed(evt);
            }
        });
        tBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tBayarKeyReleased(evt);
            }
        });

        jLabel5.setText("Kembalian");

        tKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tKembalianActionPerformed(evt);
            }
        });

        lNamaBarang.setBackground(new java.awt.Color(255, 255, 255));
        lNamaBarang.setForeground(new java.awt.Color(0, 0, 0));
        lNamaBarang.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lNamaBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lNamaBarangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lNamaBarang);

        lHargaJumlah.setBackground(new java.awt.Color(51, 51, 255));
        lHargaJumlah.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lHargaJumlah.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lHargaJumlahAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(lHargaJumlah);

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel1))
                                    .addComponent(addHargaJumlah))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jScrollPane2))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tJumlahHarga)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(tKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tTotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(tBayar))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tJumlahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addHargaJumlah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        String[] listBarang = getListBarang();
        for (int i = 0;i<listBarang.length;i++){
            mdlNamaBarang.addElement(listBarang[i]);
            lNamaBarang.setModel(mdlNamaBarang);
        } 
        tTotalHarga.setEditable(false);
        tKembalian.setEditable(false);
        
        tPembelian.setModel(tbl);
    }//GEN-LAST:event_formComponentShown

    private void lNamaBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lNamaBarangMouseClicked
        // TODO add your handling code here:
        String select = lNamaBarang.getSelectedValue().toString();
        tJumlahHarga.setText(select);
    }//GEN-LAST:event_lNamaBarangMouseClicked

    private void addHargaJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHargaJumlahActionPerformed
        // TODO add your handling code here:
        int index;
        //get list barang
        String[] listBarang = getListBarang();
        
        List <String> ArrayBarang = new ArrayList<String>();
        ArrayBarang = lNamaBarang.getSelectedValuesList();
        String[] ArrBarang = new String [ArrayBarang.size()];
        ArrBarang = ArrayBarang.toArray(ArrBarang);
        String select = lNamaBarang.getSelectedValue();
        
        //call function find index
        index = mencari(listBarang,select);
        Integer[] ArrHarga =getListHarga();
        if (index==-1){
            JOptionPane.showMessageDialog(this, "kesalahan");
        }else{
        for(int i=0; i<ArrayBarang.size(); i++){
            mdlJumlahHarga.addElement(ArrBarang[i]+" @"+ArrHarga[index]);
            lHargaJumlah.setModel(mdlJumlahHarga);
            tHarga.add(ArrHarga[index]);
            
            }
        }
        int hasil = 0;
        for (int harga : tHarga){
                hasil += harga;
            }
        tTotalHarga.setText(""+hasil);
        
        
    }//GEN-LAST:event_addHargaJumlahActionPerformed

    private void lHargaJumlahAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lHargaJumlahAncestorAdded
        // TODO add your handling code her
    }//GEN-LAST:event_lHargaJumlahAncestorAdded

    private void tBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBayarActionPerformed
     // TODO add your handling code here:
        
    }//GEN-LAST:event_tBayarActionPerformed

    private void tBayarComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tBayarComponentAdded
        
    }//GEN-LAST:event_tBayarComponentAdded

    private void tBayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tBayarKeyReleased
        // TODO add your handling code here:
        int kembalian;
        int total_harga = Integer.parseInt(tTotalHarga.getText());
        int bayar = Integer.parseInt(tBayar.getText());
        
        kembalian = getKembalian(bayar, total_harga);
        tKembalian.setText(String.valueOf(kembalian));
    }//GEN-LAST:event_tBayarKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int hasil = 0;
        for (int harga : tHarga){
                hasil += harga;
            }
        tTotalHarga.setText(""+hasil);
        int total_item;
        total_item = tHarga.size();
        
        tbl.addRow(new Object[]{total_item,hasil});
        tPembelian.setModel(tbl);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tKembalianActionPerformed

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
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
            }
        });
    }
    
    //fungsi
    private static int mencari (String[] nilai, String cari){
        for (int i =0;i<nilai.length;i++){
            if (cari.equals(nilai[i])){
                return i;
            }
        }return -1;
    }
    
    static String[] getListBarang(){
        ArrayList<String> listBarang = new ArrayList<>();
        listBarang.add("Mie Sedaap Goreng");
        listBarang.add("Mie Sedaap Kuah");
        listBarang.add("Mie Indomie");
        listBarang.add("Aqua 1500 ml");
        listBarang.add("Aqua 330 ml");
        listBarang.add("Aqua 250 ml");
        listBarang.add("Aqua 600 ml");
        listBarang.add("Le Mineral 330 ml");
        listBarang.add("Le Mineral 600 ml");
        listBarang.add("Le Mineral 1500 ml");
        //convert arraylist to array barang
        String[] ArrBarang = new String [listBarang.size()];
        ArrBarang = listBarang.toArray(ArrBarang);
        return ArrBarang;
    }
    static Integer[] getListHarga(){
        //list harga
        ArrayList<Integer> listHarga = new ArrayList<>();
        listHarga.add(2500);
        listHarga.add(2500);
        listHarga.add(2500);
        listHarga.add(5000);
        listHarga.add(2000);
        listHarga.add(1500);
        listHarga.add(3000);
        listHarga.add(2000);
        listHarga.add(3000);
        listHarga.add(5000);
        //convert arraylist to array harga
        Integer[] ArrHarga = new Integer[listHarga.size()];
        ArrHarga = listHarga.toArray(ArrHarga);
        return ArrHarga;
    }
    
    public static int getKembalian(int byr, int ttl){
        int kembali = byr-ttl;
        return kembali;
    }
   
//    public static int getTotal(Integer arrHarga[]){
//        
//        return hasil;
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHargaJumlah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> lHargaJumlah;
    private javax.swing.JList<String> lNamaBarang;
    private javax.swing.JTextField tBayar;
    private javax.swing.JTextField tJumlahHarga;
    private javax.swing.JTextField tKembalian;
    private javax.swing.JTable tPembelian;
    private javax.swing.JTextField tTotalHarga;
    // End of variables declaration//GEN-END:variables
}

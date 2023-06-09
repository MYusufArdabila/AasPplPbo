/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi_kasir;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class kasir extends javax.swing.JFrame {
    int total, jumlah_bayar, jumlah_beli, kembalian, harga;

    /**
     * Creates new form kasir
     */
    public kasir() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_barang = new javax.swing.JComboBox<>();
        txt_total = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_jumlah_beli = new javax.swing.JTextField();
        btn_hitung = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_jumlah_bayar = new javax.swing.JTextField();
        txt_bayar = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        txt_batal = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_kembalian = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APLIKASI KASIR TOKO BIL NET KOMPUTER");

        jLabel2.setText("NAMA BARANG");

        jLabel3.setText("HARGA BARANG");

        jLabel4.setText("JUMLAH BELI");

        jLabel5.setText("TOTAL");

        cb_barang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH BARANG", "MOUSE", "KEYBOARD", "FLASHDISK", "HARDDISK", "HEADPHONE", "LAPTOP" }));
        cb_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_barangActionPerformed(evt);
            }
        });

        txt_total.setEditable(false);

        txt_harga.setEditable(false);

        txt_jumlah_beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlah_beliActionPerformed(evt);
            }
        });

        btn_hitung.setText("HITUNG");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        jLabel6.setText("JUMLAH BAYAR");

        txt_bayar.setText("BAYAR");
        txt_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bayarActionPerformed(evt);
            }
        });

        btn_keluar.setText("KELUAR");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        txt_batal.setText("BATAL");
        txt_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_batalActionPerformed(evt);
            }
        });

        jLabel7.setText("KEMBALIAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(btn_hitung)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_jumlah_beli)
                                .addComponent(txt_harga)
                                .addComponent(cb_barang, 0, 269, Short.MAX_VALUE)
                                .addComponent(txt_total)
                                .addComponent(txt_jumlah_bayar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_bayar)
                        .addGap(18, 18, 18)
                        .addComponent(txt_batal)
                        .addGap(18, 18, 18)
                        .addComponent(btn_keluar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_jumlah_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_hitung)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_jumlah_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_bayar)
                    .addComponent(btn_keluar)
                    .addComponent(txt_batal))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        int harga_barang = Integer.parseInt(txt_harga.getText());
        int jumlah_beli_barang = Integer.parseInt(txt_jumlah_beli.getText());
        total = harga_barang * jumlah_beli_barang;
        txt_total.setText(String.valueOf(total));
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void txt_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bayarActionPerformed
        int jumlah_bayar = Integer.parseInt(txt_jumlah_bayar.getText());
        int total_harga = Integer.parseInt(txt_total.getText());
        kembalian = jumlah_bayar - total_harga;
        txt_kembalian.setText(String.valueOf(kembalian));
    }//GEN-LAST:event_txt_bayarActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        int pilih = JOptionPane.showConfirmDialog(null , "Yakin mau keluar?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if (pilih == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
           JOptionPane.getRootFrame();
        }
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void txt_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_batalActionPerformed
        txt_total.setText("");
        txt_harga.setText("");
        txt_jumlah_bayar.setText("");
        txt_harga.setText("");
        txt_jumlah_beli.setText("");
        txt_kembalian.setText("");
        cb_barang.setSelectedItem("PILIH BARANG");
    }//GEN-LAST:event_txt_batalActionPerformed

    private void txt_jumlah_beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlah_beliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlah_beliActionPerformed

    private void cb_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_barangActionPerformed
        String pilih = cb_barang.getSelectedItem().toString();
        switch (pilih) {
            case "PILIH BARANG":
                txt_harga.setText("");
                break;
            case "MOUSE":
               harga = 50000;
               txt_harga.setText(String.valueOf(harga));
               break;
            case "KEYBOARD":
                harga = 150000;
                txt_harga.setText(String.valueOf(harga));
                break;
            case "FLASHDISK":
                harga = 60000;
                txt_harga.setText(String.valueOf(harga));
                break;
            case "HARDDISK":
                harga = 100000;
                txt_harga.setText(String.valueOf(harga));
                break;
            case "HEADPHONE":
                harga = 80000;
                txt_harga.setText(String.valueOf(harga));
                break;
            case "LAPTOP":
                harga = 7000000;
                txt_harga.setText(String.valueOf(harga));
                break;
            default:
                System.out.println("Pilihan tidak valid!!");
                break;
        }
    }//GEN-LAST:event_cb_barangActionPerformed

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
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hitung;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JComboBox<String> cb_barang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton txt_batal;
    private javax.swing.JButton txt_bayar;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_jumlah_bayar;
    private javax.swing.JTextField txt_jumlah_beli;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}

package briliana.florist.View;

import briliana.florist.Controller.Controller_florist;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Kyy
 */
public class View_florist extends javax.swing.JFrame {
    
    Controller_florist controller_fl;

    /**
     * Creates new form View_florist
     */
    public View_florist() {
        initComponents();
        controller_fl = new Controller_florist(this);
        controller_fl.isiTable();
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#FBE0E0"));

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
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelPelanggan = new javax.swing.JTable();
        BtnCari = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        TxtCari = new javax.swing.JTextField();
        BtnUpdate = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        TxtNamaBunga = new javax.swing.JTextField();
        TxtJumlahbeli = new javax.swing.JTextField();
        TxtHarga = new javax.swing.JTextField();
        BtnTambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 36)); // NOI18N
        jLabel1.setText("KASIR BRIILIANA FLORIST");

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        jLabel2.setText("Nama Bunga");

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        jLabel3.setText("Jumlah Beli");

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        jLabel4.setText("Harga");

        TabelPelanggan.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelPelangganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelPelanggan);

        BtnCari.setText("Cari");
        BtnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCariActionPerformed(evt);
            }
        });

        BtnRefresh.setText("Refresh");
        BtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshActionPerformed(evt);
            }
        });

        TxtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCariActionPerformed(evt);
            }
        });

        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        jLabel5.setText("ID:");

        TxtId.setEditable(false);

        TxtNamaBunga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaBungaActionPerformed(evt);
            }
        });

        TxtJumlahbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtJumlahbeliActionPerformed(evt);
            }
        });

        TxtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHargaActionPerformed(evt);
            }
        });

        BtnTambah.setText("Tambah");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(BtnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(BtnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRefresh))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BtnCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCari))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtJumlahbeli, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNamaBunga)
                            .addComponent(TxtHarga))
                        .addGap(84, 84, 84))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNamaBunga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtJumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRefresh)
                    .addComponent(BtnUpdate)
                    .addComponent(BtnHapus)
                    .addComponent(jLabel5)
                    .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCari)
                    .addComponent(TxtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCariActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
        controller_fl.update();
        controller_fl.isiTable();
        controller_fl.reset();
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        controller_fl.delete();
        controller_fl.isiTable();
        controller_fl.reset();
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        // TODO add your handling code here:
        controller_fl.reset();
        controller_fl.isiTable();
    }//GEN-LAST:event_BtnRefreshActionPerformed

    private void BtnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCariActionPerformed
        // TODO add your handling code here:
        controller_fl.cariData();
    }//GEN-LAST:event_BtnCariActionPerformed

    private void TabelPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelPelangganMouseClicked
        // TODO add your handling code here:
        controller_fl.isiField(TabelPelanggan.getSelectedRow());
    }//GEN-LAST:event_TabelPelangganMouseClicked

    private void TxtNamaBungaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaBungaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNamaBungaActionPerformed

    private void TxtJumlahbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtJumlahbeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtJumlahbeliActionPerformed

    private void TxtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHargaActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        // TODO add your handling code here:
        controller_fl.insert();
        controller_fl.isiTable();
        controller_fl.reset();
    }//GEN-LAST:event_BtnTambahActionPerformed

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
            java.util.logging.Logger.getLogger(View_florist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_florist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_florist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_florist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_florist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCari;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JTable TabelPelanggan;
    private javax.swing.JTextField TxtCari;
    private javax.swing.JTextField TxtHarga;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtJumlahbeli;
    private javax.swing.JTextField TxtNamaBunga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnCari() {
        return BtnCari;
    }

    public JButton getBtnHapus() {
        return BtnHapus;
    }

    public JButton getBtnTambah() {
        return BtnTambah;
    }

    public JButton getBtnUpdate() {
        return BtnUpdate;
    }

    public JTable getTabelPelanggan() {
        return TabelPelanggan;
    }

    public JTextField getTxtCari() {
        return TxtCari;
    }

    public JTextField getTxtHarga() {
        return TxtHarga;
    }

    public JTextField getTxtId() {
        return TxtId;
    }

    public JTextField getTxtJumlahbeli() {
        return TxtJumlahbeli;
    }

    public JTextField getTxtNamaBunga() {
        return TxtNamaBunga;
    }

    public JButton getBtnRefresh() {
        return BtnRefresh;
    }
    
    
}
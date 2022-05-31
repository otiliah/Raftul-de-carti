package raftulGUI;

import java.awt.Color;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import raftulDeCarti.*;


/*author: otiliah*/
public class FrmMain extends javax.swing.JFrame {
    
    private Data toateCartile = new Data();
    private List<Carte> cartiDeAfisat = toateCartile.getToateCartile();
    
    private DefaultListModel<Carte> modelLista = new DefaultListModel<>();
    private DefaultComboBoxModel modelFiltrare = new DefaultComboBoxModel(eFiltrare.values());
    private DefaultComboBoxModel modelOrdonare = new DefaultComboBoxModel(eOrdonare.values());
    
    public FrmMain() {
        initComponents();
        jList.setModel(modelLista);
        cmbFiltrare.setModel(modelFiltrare);
        cmbOrdonare.setModel(modelOrdonare);
        btnExit.setForeground(Color.GREEN);
        refreshLista(cartiDeAfisat);
    }
    
    private void refreshLista(List<Carte> carti) {
        modelLista.clear();
        for (Carte c : carti) {
            modelLista.addElement(c);
        }
    }
    
    private void dataFiltrareOrdonare() {
        eFiltrare filtru = (eFiltrare) cmbFiltrare.getSelectedItem();
        eOrdonare ordonare = (eOrdonare) cmbOrdonare.getSelectedItem();
        String sLitereTastate = txtCautaCarte.getText();
        cartiDeAfisat = toateCartile.getCartiDeAfisat(filtru, ordonare, sLitereTastate);
        refreshLista(cartiDeAfisat);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        txtCautaCarte = new javax.swing.JTextField();
        btnAddCarte = new javax.swing.JButton();
        btnEditCarte = new javax.swing.JButton();
        bntStergeCarte = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbFiltrare = new javax.swing.JComboBox<>();
        cmbOrdonare = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList);

        txtCautaCarte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCautaCarteKeyReleased(evt);
            }
        });

        btnAddCarte.setText("adauga carte");
        btnAddCarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarteActionPerformed(evt);
            }
        });

        btnEditCarte.setText("editare carte");
        btnEditCarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCarteActionPerformed(evt);
            }
        });

        bntStergeCarte.setText("sterge carte");
        bntStergeCarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntStergeCarteActionPerformed(evt);
            }
        });

        btnExit.setText("exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setText("filtreaza detalii carte dupa secventa:");

        cmbFiltrare.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFiltrareItemStateChanged(evt);
            }
        });

        cmbOrdonare.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOrdonareItemStateChanged(evt);
            }
        });

        jLabel2.setText("ordoneaza cartile dupa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddCarte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditCarte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntStergeCarte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbOrdonare, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txtCautaCarte)
                            .addComponent(cmbFiltrare, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCautaCarte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbOrdonare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnAddCarte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditCarte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntStergeCarte)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarteActionPerformed
        DialogAddEditCarte dlgEditare = new DialogAddEditCarte(this, true, false, null);
        dlgEditare.setVisible(true);
        if (dlgEditare.isCarteIncapsulataCreataValid()== true) {
            Carte cAdd = dlgEditare.getCarteEditata();
            if (toateCartile.adaugaCarte(cAdd) == true) {
                dataFiltrareOrdonare();
            }
        }
    }//GEN-LAST:event_btnAddCarteActionPerformed

    private void btnEditCarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCarteActionPerformed
        int index = jList.getSelectedIndex();
        if (index >= 0) {
            Carte carteSelectata = modelLista.get(index);
            DialogAddEditCarte dlgEditare = new DialogAddEditCarte(this, true, true, carteSelectata);
            dlgEditare.setVisible(true);
            if (dlgEditare.isCarteIncapsulataCreataValid()== true) {
                Carte carteEditate = dlgEditare.getCarteEditata();
                toateCartile.modificareCarte(carteSelectata, carteEditate);
                dataFiltrareOrdonare();
            }
        } else {
            JOptionPane.showMessageDialog(jList, "Nu ai selectat nici o carte!");
        }
    }//GEN-LAST:event_btnEditCarteActionPerformed

    private void bntStergeCarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntStergeCarteActionPerformed
        int index = jList.getSelectedIndex();
        if (index >= 0) {
            Carte cSelectata = modelLista.get(index);
            toateCartile.stergeCarte(cSelectata);
            dataFiltrareOrdonare();
        }
    }//GEN-LAST:event_bntStergeCarteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtCautaCarteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCautaCarteKeyReleased
        dataFiltrareOrdonare();
    }//GEN-LAST:event_txtCautaCarteKeyReleased

    private void cmbFiltrareItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFiltrareItemStateChanged
        dataFiltrareOrdonare();
    }//GEN-LAST:event_cmbFiltrareItemStateChanged

    private void cmbOrdonareItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOrdonareItemStateChanged
        dataFiltrareOrdonare();
    }//GEN-LAST:event_cmbOrdonareItemStateChanged
    
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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntStergeCarte;
    private javax.swing.JButton btnAddCarte;
    private javax.swing.JButton btnEditCarte;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cmbFiltrare;
    private javax.swing.JComboBox<String> cmbOrdonare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<Carte> jList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCautaCarte;
    // End of variables declaration//GEN-END:variables
}

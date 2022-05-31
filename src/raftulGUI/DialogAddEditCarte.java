package raftulGUI;

import javax.swing.JOptionPane;
import raftulDeCarti.Carte;

/*author: otiliah*/
public class DialogAddEditCarte extends javax.swing.JDialog {

    private boolean carteIncapsulataCreataOK;
    private Carte carteIncapsulata = null;

    public Carte getCarteEditata() {
        return carteIncapsulata;
    }

    public boolean setCarteIncapsulataCreataOK(boolean carteIncapsulataCreataOK) {
        return this.carteIncapsulataCreataOK = carteIncapsulataCreataOK;
    }

    public boolean isCarteIncapsulataCreataValid() {
        return carteIncapsulata == null ? false : true;
    }

    public DialogAddEditCarte(java.awt.Frame parent, boolean modal, boolean bIsEditare, Carte carteSelectata) {
        super(parent, modal);
        initComponents();
        if (bIsEditare) {
            txtISBN.setEditable(false);
            txtISBN.setText(carteSelectata.getIsbn());
            txtNume.setText(carteSelectata.getNume());
            txtAutor.setText(carteSelectata.getAutor());
            txtAnAparitie.setText(carteSelectata.getAnAparitie());          
        } else {
            txtISBN.setEditable(true);
            txtISBN.setText("");
            txtNume.setText("");
            txtAutor.setText("");
            txtAnAparitie.setText("");            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNume = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtAnAparitie = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        bntCancel = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nume:");

        jLabel2.setText("Autor:");

        jLabel3.setText("An apariție:");

        jLabel4.setText("ISBN:");

        bntCancel.setText("cancel");
        bntCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNume)
                            .addComponent(txtAutor)
                            .addComponent(txtAnAparitie)
                            .addComponent(txtISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btnOK)
                        .addGap(77, 77, 77)
                        .addComponent(bntCancel)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAnAparitie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntCancel)
                    .addComponent(btnOK))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        carteIncapsulata = Carte.getInstance(txtNume.getText(), txtAutor.getText(), txtAnAparitie.getText(), txtISBN.getText());
        if (carteIncapsulata == null) {
            JOptionPane.showMessageDialog(this, "Cartea nu a putut fi creata! Asigura-te ca ai completat toate campurile!");
            setCarteIncapsulataCreataOK(false);
        } else {
            setCarteIncapsulataCreataOK(true);
            dispose();
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void bntCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelActionPerformed
        carteIncapsulata = null;
        setCarteIncapsulataCreataOK(false);
        dispose();
    }//GEN-LAST:event_bntCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAnAparitie;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtNume;
    // End of variables declaration//GEN-END:variables
}

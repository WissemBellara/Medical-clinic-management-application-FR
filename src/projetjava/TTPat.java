/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

;

import static projetjava.InterfacePremiere.LSTDossMed;

/**
 *
 * @author WissemPC
 */
public class TTPat extends javax.swing.JInternalFrame {

    /**
     * Creates new form TTPat
     */
    public TTPat() {
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
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TP = new javax.swing.JTextArea();
        Rest = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Tout Les Patients");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TP.setColumns(20);
        TP.setRows(5);
        TP.setWrapStyleWord(true);
        TP.setEnabled(false);
        jScrollPane1.setViewportView(TP);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 463, 316));

        Rest.setText("Voir Resultat");
        Rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestActionPerformed(evt);
            }
        });
        getContentPane().add(Rest, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 112, 36));

        quit.setText("Quitter");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });
        getContentPane().add(quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava/ssss.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestActionPerformed
String res="" ;
        for (String i : LSTDossMed.keySet()) {               /*parcourir le hashmap et afficher tous les patients */
             res+=(LSTDossMed.get(i).dp() + "\n") ; }
        TP.setText(res);        // TODO add your handling code here:
    }//GEN-LAST:event_RestActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
setDefaultCloseOperation(NvConsultation.DISPOSE_ON_CLOSE);
setVisible(false);        /* Quitter l'interface en cliquant sur quitter  */
    }//GEN-LAST:event_quitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rest;
    private javax.swing.JTextArea TP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton quit;
    // End of variables declaration//GEN-END:variables
}
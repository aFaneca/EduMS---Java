/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edums.GUI;

import edums.DB;
import edums.Class;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Diogo
 */
public class AddClassFrame extends javax.swing.JFrame {    
    DB tempDB = new DB("teste.bin");
    edums.School s = new edums.School("School");    
     
      
    
    public AddClassFrame() {
        initComponents();
        s = tempDB.importData();
        
        DenomLabel.setVisible(false);
        cUnitsLabel.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner2 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jPanelCLASS = new javax.swing.JPanel();
        addClassTEXT = new javax.swing.JLabel();
        DenomTEXT = new javax.swing.JTextField();
        AddClassButton = new javax.swing.JButton();
        CancelButton_CLASS = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        TypeSELECT = new javax.swing.JComboBox<>();
        cUnitSELECT = new javax.swing.JComboBox<>();
        classesPWeek_SPINNER = new javax.swing.JSpinner();
        hoursPClass_SPINNER = new javax.swing.JSpinner();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        DenomLabel = new javax.swing.JLabel();
        cUnitsLabel = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 800, 600));

        addClassTEXT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        addClassTEXT.setText("Add Class");

        DenomTEXT.setText("Denom");

        AddClassButton.setText("Add Class");
        AddClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClassButtonActionPerformed(evt);
            }
        });

        CancelButton_CLASS.setText("Cancel");
        CancelButton_CLASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButton_CLASSActionPerformed(evt);
            }
        });

        TypeSELECT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T", "TP", "P" }));
        TypeSELECT.setToolTipText("");

        cUnitSELECT.setModel(new DefaultComboBoxModel(s.getcUnits().toArray()));

        classesPWeek_SPINNER.setModel(new javax.swing.SpinnerNumberModel(0, 0, 6, 1));
        classesPWeek_SPINNER.setToolTipText("");

        hoursPClass_SPINNER.setModel(new javax.swing.SpinnerNumberModel(0, 0, 6, 1));
        hoursPClass_SPINNER.setToolTipText("");

        label1.setName(""); // NOI18N
        label1.setText("Hours/Class:");

        label2.setName(""); // NOI18N
        label2.setText("Classes/Week:");

        DenomLabel.setText("jLabel1");

        cUnitsLabel.setText("jLabel2");

        javax.swing.GroupLayout jPanelCLASSLayout = new javax.swing.GroupLayout(jPanelCLASS);
        jPanelCLASS.setLayout(jPanelCLASSLayout);
        jPanelCLASSLayout.setHorizontalGroup(
            jPanelCLASSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCLASSLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(CancelButton_CLASS)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCLASSLayout.createSequentialGroup()
                .addGroup(jPanelCLASSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCLASSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelCLASSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addClassTEXT)
                            .addGroup(jPanelCLASSLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanelCLASSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cUnitSELECT, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelCLASSLayout.createSequentialGroup()
                                        .addComponent(DenomTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(TypeSELECT, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(DenomLabel)
                                    .addComponent(cUnitsLabel))
                                .addGap(23, 23, 23)
                                .addGroup(jPanelCLASSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCLASSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hoursPClass_SPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(classesPWeek_SPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelCLASSLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1))
                    .addGroup(jPanelCLASSLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AddClassButton)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanelCLASSLayout.setVerticalGroup(
            jPanelCLASSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCLASSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addClassTEXT)
                .addGroup(jPanelCLASSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCLASSLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanelCLASSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TypeSELECT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenomTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hoursPClass_SPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCLASSLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(DenomLabel)
                .addGroup(jPanelCLASSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCLASSLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCLASSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cUnitSELECT, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classesPWeek_SPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCLASSLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cUnitsLabel)
                .addGap(80, 80, 80)
                .addGroup(jPanelCLASSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddClassButton)
                    .addComponent(CancelButton_CLASS))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCLASS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCLASS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButton_CLASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButton_CLASSActionPerformed
        Frame fr[] = AddClassFrame.getFrames();
        for (Frame f : fr) {
            if(f instanceof AddClassFrame)
            f.dispose();
        }
    }//GEN-LAST:event_CancelButton_CLASSActionPerformed

    private void AddClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassButtonActionPerformed
        boolean isValid = true;
        DenomLabel.setVisible(false);
        cUnitsLabel.setVisible(false);
        
        
        if(DenomTEXT.getText().isEmpty()){
            DenomLabel.setText("* Denomination field required!");
            DenomLabel.setVisible(true);
            isValid = false;
        }
        
        if(isValid){
            Class c = new Class(DenomTEXT.getText(), TypeSELECT.getSelectedItem().toString(),cUnitSELECT.getSelectedItem().toString(), (int)hoursPClass_SPINNER.getValue(), (int)classesPWeek_SPINNER.getValue());

            EduMSFrame temp = null;
            Frame fr[] = AddClassFrame.getFrames();
            DB tempDB = new DB("teste.bin");
            for (Frame f : fr) {
                if(f instanceof EduMSFrame){
                    temp = (EduMSFrame) f;
                    temp.getSchool().addClass(c);
                    tempDB.exportData(temp.getSchool());
                }
             }
            temp.updateList();
            for (Frame f : fr) {
                if(f instanceof AddClassFrame)
                f.dispose();
            }
        }
    }//GEN-LAST:event_AddClassButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddClassFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClassFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClassFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClassFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddClassFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClassButton;
    private javax.swing.JButton CancelButton_CLASS;
    private javax.swing.JLabel DenomLabel;
    private javax.swing.JTextField DenomTEXT;
    private javax.swing.JComboBox<String> TypeSELECT;
    private javax.swing.JLabel addClassTEXT;
    private javax.swing.JComboBox<String> cUnitSELECT;
    private javax.swing.JLabel cUnitsLabel;
    private javax.swing.JSpinner classesPWeek_SPINNER;
    private javax.swing.JSpinner hoursPClass_SPINNER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelCLASS;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}

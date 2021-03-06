/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.LopHoc;
import Controller.LopHocController;
import Controller.HocSinhController;
import Utils.Validation;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class SuaLopHocView extends javax.swing.JFrame {

    private LopHoc lop;
    LopHocController lopHocController;
    HocSinhController hocSinhController;
    /**
     * Creates new form SuaLopHocView
     */
    public SuaLopHocView(String MaLop) {
        initComponents();
        
        ImageIcon image = new ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\DemoBTL - Copy2\\src\\img\\logo.png");
        this.setIconImage(image.getImage()); 
        
        lopHocController = new LopHocController();
        lop = lopHocController.getLopHocByMaLop(MaLop);

        txt_maLop.setText(lop.getMaLop());
        txt_tenLop.setText(lop.getTenLop());
        txt_SiSo.setText(String.valueOf(lop.getSiSo()));
        txt_thoiLuong.setText(String.valueOf(lop.getThoiLuong()));
        txt_giaTien.setText(String.valueOf(lop.getGiatien()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_maLop = new javax.swing.JTextField();
        txt_tenLop = new javax.swing.JTextField();
        txt_SiSo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_thoiLuong = new javax.swing.JTextField();
        txt_giaTien = new javax.swing.JTextField();
        btn_Back = new javax.swing.JButton();
        btn_Submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TH??NG TIN L???P H???C ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("M?? l???p");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("T??n l???p");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("S?? s???");

        txt_maLop.setEditable(false);

        txt_SiSo.setEditable(false);
        txt_SiSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SiSoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Th???i l?????ng");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Gi?? ti???n");

        btn_Back.setBackground(new java.awt.Color(102, 255, 204));
        btn_Back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Back.setText("Back");
        btn_Back.setMaximumSize(new java.awt.Dimension(89, 39));
        btn_Back.setMinimumSize(new java.awt.Dimension(89, 39));
        btn_Back.setPreferredSize(new java.awt.Dimension(89, 39));
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        btn_Submit.setBackground(new java.awt.Color(51, 255, 204));
        btn_Submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Submit.setText("Submit");
        btn_Submit.setMaximumSize(new java.awt.Dimension(89, 39));
        btn_Submit.setMinimumSize(new java.awt.Dimension(89, 39));
        btn_Submit.setPreferredSize(new java.awt.Dimension(89, 39));
        btn_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_giaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_thoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_maLop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tenLop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_SiSo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_maLop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_tenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_SiSo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_thoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_giaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubmitActionPerformed
        // TODO add your handling code here:
        if (validForm()) {
            lop.setTenLop(txt_tenLop.getText());
            lop.setSiSo(Integer.parseInt(txt_SiSo.getText()));
            lop.setThoiLuong(Integer.parseInt(txt_thoiLuong.getText()));
            lop.setGiatien(Integer.parseInt(txt_giaTien.getText()));
            lop.setPhainop(Integer.parseInt(txt_giaTien.getText())* Integer.parseInt(txt_thoiLuong.getText()));

            lopHocController.UpdateClass(lop);
            JOptionPane.showMessageDialog(this, "S???a l???p h???c th??nh c??ng");
        } else {
            return;
        }

        QLLopHocView back = new QLLopHocView();
        back.setVisible(true);
        back.setLocationRelativeTo(null);
        back.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btn_SubmitActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        // TODO add your handling code here:
        QLLopHocView back = new QLLopHocView();
        back.setVisible(true);
        back.setLocationRelativeTo(null);
        back.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btn_BackActionPerformed

    private void txt_SiSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SiSoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SiSoActionPerformed
    private boolean validForm() {
        if (!Validation.isEmpty(txt_maLop, "M?? l???p kh??ng ???????c tr???ng!")) {
            return false;
        }
        if (!Validation.isEmpty(txt_tenLop, "T??n l???p kh??ng ???????c tr???ng!")) {
            return false;
        }
        if (!Validation.isEmpty(txt_thoiLuong, "Th???i l?????ng kh??ng ???????c tr???ng!")) {
            return false;
        }
        if (!Validation.isNumber(txt_thoiLuong, "Th???i l?????ng ph???i l?? s???!")) {
            return false;
        }
        if (!Validation.isEmpty(txt_giaTien, "Gi?? ti???n kh??ng ???????c tr???ng!")) {
            return false;
        }
        if (!Validation.isNumber(txt_giaTien, "Gi?? ti???n ph???i l?? s???!")) {
            return false;
        }
        if (!Validation.checkGiaTien(txt_giaTien, "Gi?? ti???n ph???i >= 1.000 VN??!")) {
            return false;
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_Submit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txt_SiSo;
    private javax.swing.JTextField txt_giaTien;
    private javax.swing.JTextField txt_maLop;
    private javax.swing.JTextField txt_tenLop;
    private javax.swing.JTextField txt_thoiLuong;
    // End of variables declaration//GEN-END:variables
}

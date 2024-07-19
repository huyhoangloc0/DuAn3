package raven.form;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import raven.main.login;

import raven.tabbed.TabbedForm;
import raven.utils.JDBC;
import raven.utils.Model_NhanVien;
import raven.utils.MsgBox;


public class DoiMatKhau extends TabbedForm {
    public DoiMatKhau() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        btnThoat = new raven.swing.MyButton();
        btnChange = new raven.swing.MyButton();
        lb4 = new javax.swing.JLabel();
        txtnhaplaimkmoi = new javax.swing.JPasswordField();
        txtmkmoi = new javax.swing.JPasswordField();
        txtmkcu = new javax.swing.JPasswordField();
        txtuser = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Đổi mật khẩu");

        lb3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lb3.setForeground(new java.awt.Color(153, 153, 153));
        lb3.setText("Mật khẩu cũ");

        lb5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lb5.setForeground(new java.awt.Color(153, 153, 153));
        lb5.setText("Mật khẩu mới");

        lb6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lb6.setForeground(new java.awt.Color(153, 153, 153));
        lb6.setText("Nhập lại mật khẩu mới");

        btnThoat.setBackground(new java.awt.Color(0, 0, 204));
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.setBorderColor(new java.awt.Color(0, 204, 255));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThoat.setRadius(30);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnChange.setBackground(new java.awt.Color(255, 0, 0));
        btnChange.setForeground(new java.awt.Color(255, 255, 255));
        btnChange.setText("Lưu");
        btnChange.setBorderColor(new java.awt.Color(255, 0, 0));
        btnChange.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnChange.setRadius(30);
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        lb4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lb4.setForeground(new java.awt.Color(153, 153, 153));
        lb4.setText("Tài khoản");

        txtnhaplaimkmoi.setFont(txtnhaplaimkmoi.getFont().deriveFont(txtnhaplaimkmoi.getFont().getSize()+2f));
        txtnhaplaimkmoi.setForeground(new java.awt.Color(255, 255, 255));
        txtnhaplaimkmoi.setText("123");
        txtnhaplaimkmoi.setBorder(null);
        txtnhaplaimkmoi.setCaretColor(new java.awt.Color(255, 255, 255));
        txtnhaplaimkmoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnhaplaimkmoiKeyPressed(evt);
            }
        });

        txtmkmoi.setFont(txtmkmoi.getFont().deriveFont(txtmkmoi.getFont().getSize()+2f));
        txtmkmoi.setForeground(new java.awt.Color(255, 255, 255));
        txtmkmoi.setText("123");
        txtmkmoi.setBorder(null);
        txtmkmoi.setCaretColor(new java.awt.Color(255, 255, 255));
        txtmkmoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmkmoiKeyPressed(evt);
            }
        });

        txtmkcu.setFont(txtmkcu.getFont().deriveFont(txtmkcu.getFont().getSize()+2f));
        txtmkcu.setForeground(new java.awt.Color(255, 255, 255));
        txtmkcu.setText("123");
        txtmkcu.setBorder(null);
        txtmkcu.setCaretColor(new java.awt.Color(255, 255, 255));
        txtmkcu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmkcuKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmkcu)
                    .addComponent(txtmkmoi)
                    .addComponent(lb4)
                    .addComponent(lb3)
                    .addComponent(lb5)
                    .addComponent(lb6)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtnhaplaimkmoi)
                    .addComponent(txtuser))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtmkcu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtmkmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnhaplaimkmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void txtnhaplaimkmoiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnhaplaimkmoiKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (changePassword()) {
                init();
            }
        }
    }//GEN-LAST:event_txtnhaplaimkmoiKeyPressed

    private void txtmkmoiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmkmoiKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (changePassword()) {
                init();
            }
        }
    }//GEN-LAST:event_txtmkmoiKeyPressed

    private void txtmkcuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmkcuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (changePassword()) {
                init();
            }
        }
    }//GEN-LAST:event_txtmkcuKeyPressed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        if (changePassword()) {
                init();
            }
    }//GEN-LAST:event_btnChangeActionPerformed

    @Override
    public boolean formClose() {
//       if(txt.getText().trim().equals("")){
//           return true;
//       }
       int opt=JOptionPane.showConfirmDialog(this, "Data not save do you want to close ?", "Close", JOptionPane.YES_NO_OPTION);
       return opt==JOptionPane.YES_OPTION;
    }

    @Override
    public void formOpen() {
        System.out.println("Form open");
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private raven.swing.MyButton btnChange;
    private raven.swing.MyButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JPasswordField txtmkcu;
    private javax.swing.JPasswordField txtmkmoi;
    private javax.swing.JPasswordField txtnhaplaimkmoi;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
    String oldPass = txtmkcu.getText().trim();
    String newPass = txtmkmoi.getText().trim();
    String confirmPass = txtmkmoi.getText().trim();
    String username = txtuser.getText().trim();
private boolean changePassword(){
    if(oldPass.isEmpty() || newPass.isEmpty() || confirmPass.isEmpty() || username.isEmpty()){
        MsgBox.alert(this, "Vui lòng điển đủ  thông tin");
        return false;
    }
    if(!newPass.equals(confirmPass)){
        MsgBox.alert(this, "Mật khẩu mới và xác nhận không giống nhau");
        return false;
    }
    return true;
}
void init() {
        try {
            JDBC.getJdbc().connectToDatabase();
            exetucePass(oldPass, newPass, username);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
private void exetucePass(String oldPass,String newPass,String username) throws SQLException{
    try {
        PreparedStatement ps = JDBC.getJdbc().getConnection().prepareStatement("update NhanVien set password = ? where manv = ? and password = ?");
        ps.setString(1, newPass);
        ps.setString(2, username);
        ps.setString(3, oldPass);
        
        int rows = ps.executeUpdate();
        if(rows>0){
            MsgBox.alert(this, "Thay đổi mật khẩu thành công");
        }else{
            MsgBox.alert(this, "Thay đổi mật khẩu thất bại");
        }
        ps.close();
    } catch (Exception e) {
    }
}
    
}

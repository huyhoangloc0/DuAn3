package raven.form;

import java.awt.Component;
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


public class ThongTinCaNhan extends TabbedForm {
    private login loginJDialog;
    public ThongTinCaNhan() {
        this.loginJDialog = loginJDialog;
        initComponents();
        loadEmployeeData(loginJDialog.maNV);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        txtname = new raven.swing.MyTextField();
        txthoten = new raven.swing.MyTextField();
        lb5 = new javax.swing.JLabel();
        txtmatkhau = new raven.swing.MyTextField();
        lb6 = new javax.swing.JLabel();
        txtvaitro = new raven.swing.MyTextField();
        lb7 = new javax.swing.JLabel();
        myButton3 = new raven.swing.MyButton();
        myButton4 = new raven.swing.MyButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Thông tin cá nhân ");

        lb3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lb3.setForeground(new java.awt.Color(153, 153, 153));
        lb3.setText("Mã");

        lb5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lb5.setForeground(new java.awt.Color(153, 153, 153));
        lb5.setText("Họ và tên");

        lb6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lb6.setForeground(new java.awt.Color(153, 153, 153));
        lb6.setText("Mật khẩu");

        lb7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lb7.setForeground(new java.awt.Color(153, 153, 153));
        lb7.setText("Vai trò");

        myButton3.setBackground(new java.awt.Color(0, 0, 204));
        myButton3.setForeground(new java.awt.Color(255, 255, 255));
        myButton3.setText("Chỉnh sửa");
        myButton3.setBorderColor(new java.awt.Color(0, 204, 255));
        myButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myButton3.setRadius(30);
        myButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton3ActionPerformed(evt);
            }
        });

        myButton4.setBackground(new java.awt.Color(255, 0, 0));
        myButton4.setForeground(new java.awt.Color(255, 255, 255));
        myButton4.setText("Lưu");
        myButton4.setBorderColor(new java.awt.Color(255, 0, 0));
        myButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myButton4.setRadius(30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lb3)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb5)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb6)
                    .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb7)
                    .addComponent(txtvaitro, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(myButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(631, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtvaitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton3ActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private raven.swing.MyButton myButton3;
    private raven.swing.MyButton myButton4;
    private raven.swing.MyTextField txthoten;
    private raven.swing.MyTextField txtmatkhau;
    private raven.swing.MyTextField txtname;
    private raven.swing.MyTextField txtvaitro;
    // End of variables declaration//GEN-END:variables

ArrayList<Model_NhanVien> list = new ArrayList<>();
    
    private void filltotable(String MaNV)throws SQLException{
        try {
            PreparedStatement ps = JDBC.getJdbc().getConnection().prepareStatement("SELECT * FROM NhanVien WHERE MaNV = ?");
            ps.setString(1, MaNV);
            java.sql.ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            
            String name = rs.getString("MaNV"); // Replace "ColumnNameForName" with the actual column name for name
            String hoten = rs.getString("TenNV"); // Replace "ColumnNameForHoten" with the actual column name for hoten
            String matkhau = rs.getString("MatKhau"); // Replace "ColumnNameForMatkhau" with the actual column name for matkhau
            String vaitro = rs.getString("vaitro"); // Replace "ColumnNameForVaitro" with the actual column name for vaitro
            
            // Set retrieved data to respective text fields
            txtname.setText(name);
            txthoten.setText(hoten);
            txtmatkhau.setText(matkhau);
            txtvaitro.setText(vaitro);
        }
        } catch (Exception e) {
        }
    }

    private void loadEmployeeData(String MaNV) {
        try {
            JDBC.getJdbc().connectToDatabase();
            filltotable(MaNV); // Truyền MaNV để lấy dữ liệu
        } catch (Exception e) {
            // Xử lý các ngoại lệ
        }
    }
    
    

}

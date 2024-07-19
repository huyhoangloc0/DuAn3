package raven.form;

import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import raven.tabbed.TabbedForm;
import raven.utils.JDBC;
import raven.utils.Model_DSNhanVien;
import raven.utils.Model_NhanVien;
import raven.utils.Model_Tour;
import raven.utils.MsgBox;


public class QuanLiNhanVien extends TabbedForm {
    
    public QuanLiNhanVien() {
        initComponents();
        init();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lb14 = new javax.swing.JLabel();
        txtname7 = new raven.swing.MyTextField();
        jLabel1 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        txtmanv = new raven.swing.MyTextField();
        myButton3 = new raven.swing.MyButton();
        btnUpdate = new raven.swing.MyButton();
        lb4 = new javax.swing.JLabel();
        txtten = new raven.swing.MyTextField();
        lb8 = new javax.swing.JLabel();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        lb9 = new javax.swing.JLabel();
        txtdienthoai = new raven.swing.MyTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        lb10 = new javax.swing.JLabel();
        txtEmail = new raven.swing.MyTextField();
        lb11 = new javax.swing.JLabel();
        txtnamsinh = new raven.swing.MyTextField();
        lb12 = new javax.swing.JLabel();
        txtluong = new raven.swing.MyTextField();
        lb13 = new javax.swing.JLabel();
        txtvaitro = new raven.swing.MyTextField();
        lb15 = new javax.swing.JLabel();
        txtdiachi = new raven.swing.MyTextField();
        btnDelete = new raven.swing.MyButton();
        lb16 = new javax.swing.JLabel();
        txtdiachi1 = new raven.swing.MyTextField();
        Search = new raven.swing.MyButton();
        btnInsert = new raven.swing.MyButton();

        lb14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb14.setForeground(new java.awt.Color(153, 153, 153));
        lb14.setText("Vai trò");

        txtname7.setShadowColor(new java.awt.Color(0, 0, 255));

        setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản lí nhân viên");

        lb3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb3.setForeground(new java.awt.Color(153, 153, 153));
        lb3.setText("Mã nhân viên");

        txtmanv.setCaretColor(new java.awt.Color(0, 51, 51));
        txtmanv.setShadowColor(new java.awt.Color(0, 0, 255));

        myButton3.setBackground(new java.awt.Color(0, 0, 204));
        myButton3.setForeground(new java.awt.Color(255, 255, 255));
        myButton3.setText("Làm mới");
        myButton3.setBorderColor(new java.awt.Color(0, 204, 255));
        myButton3.setColor(new java.awt.Color(0, 0, 204));
        myButton3.setColorClick(new java.awt.Color(0, 0, 0));
        myButton3.setColorOver(new java.awt.Color(153, 153, 153));
        myButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myButton3.setRadius(30);
        myButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton3ActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 204, 51));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Lưu");
        btnUpdate.setBorderColor(new java.awt.Color(0, 204, 0));
        btnUpdate.setColor(new java.awt.Color(0, 204, 51));
        btnUpdate.setColorOver(new java.awt.Color(255, 153, 102));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setRadius(30);

        lb4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb4.setForeground(new java.awt.Color(153, 153, 153));
        lb4.setText("Giới tính");

        txtten.setShadowColor(new java.awt.Color(0, 0, 255));

        lb8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb8.setForeground(new java.awt.Color(153, 153, 153));
        lb8.setText("Tên nhân viên");

        buttonGroup1.add(rdNam);
        rdNam.setText("Nam");

        buttonGroup1.add(rdNu);
        rdNu.setText("Nữ");

        lb9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb9.setForeground(new java.awt.Color(153, 153, 153));
        lb9.setText("Số điện thoại");

        txtdienthoai.setShadowColor(new java.awt.Color(0, 0, 255));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        lb10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb10.setForeground(new java.awt.Color(153, 153, 153));
        lb10.setText("Email");

        txtEmail.setShadowColor(new java.awt.Color(0, 0, 255));

        lb11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb11.setForeground(new java.awt.Color(153, 153, 153));
        lb11.setText("Năm sinh");

        txtnamsinh.setShadowColor(new java.awt.Color(0, 0, 255));

        lb12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb12.setForeground(new java.awt.Color(153, 153, 153));
        lb12.setText("Lương");

        txtluong.setShadowColor(new java.awt.Color(0, 0, 255));

        lb13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb13.setForeground(new java.awt.Color(153, 153, 153));
        lb13.setText("Vai trò");

        txtvaitro.setShadowColor(new java.awt.Color(0, 0, 255));

        lb15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb15.setForeground(new java.awt.Color(153, 153, 153));
        lb15.setText("Địa chỉ");

        txtdiachi.setShadowColor(new java.awt.Color(0, 0, 255));

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Xóa");
        btnDelete.setBorderColor(new java.awt.Color(255, 0, 0));
        btnDelete.setColor(new java.awt.Color(255, 0, 0));
        btnDelete.setColorOver(new java.awt.Color(153, 153, 153));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelete.setRadius(30);

        lb16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lb16.setForeground(new java.awt.Color(51, 0, 51));
        lb16.setText("Tìm kiếm");

        txtdiachi1.setShadowColor(new java.awt.Color(0, 0, 255));

        Search.setBackground(new java.awt.Color(255, 0, 0));
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.setBorderColor(new java.awt.Color(255, 0, 0));
        Search.setColor(new java.awt.Color(0, 204, 51));
        Search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Search.setRadius(30);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(0, 204, 51));
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Thêm");
        btnInsert.setBorderColor(new java.awt.Color(0, 204, 0));
        btnInsert.setColor(new java.awt.Color(0, 204, 51));
        btnInsert.setColorOver(new java.awt.Color(0, 153, 204));
        btnInsert.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInsert.setRadius(30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb3)
                                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb4)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdNam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdNu))
                                    .addComponent(lb9)
                                    .addComponent(txtdienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtdiachi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lb15)
                                            .addGap(185, 185, 185)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtnamsinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(lb10)
                                                    .addGap(185, 185, 185)))
                                            .addComponent(lb11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb13)
                                            .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lb12)
                                            .addComponent(txtvaitro, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(myButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInsert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb16)
                                        .addGap(238, 238, 238))
                                    .addComponent(txtdiachi1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnamsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb4)
                            .addComponent(rdNam)
                            .addComponent(rdNu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb9)
                            .addComponent(lb15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(lb16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(lb13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtvaitro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdiachi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton3ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        current = tbl.getSelectedRow();
        edit();
    }//GEN-LAST:event_tblMouseClicked

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
    private raven.swing.MyButton Search;
    private raven.swing.MyButton btnDelete;
    private raven.swing.MyButton btnInsert;
    private raven.swing.MyButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb13;
    private javax.swing.JLabel lb14;
    private javax.swing.JLabel lb15;
    private javax.swing.JLabel lb16;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private raven.swing.MyButton myButton3;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tbl;
    private raven.swing.MyTextField txtEmail;
    private raven.swing.MyTextField txtdiachi;
    private raven.swing.MyTextField txtdiachi1;
    private raven.swing.MyTextField txtdienthoai;
    private raven.swing.MyTextField txtluong;
    private raven.swing.MyTextField txtmanv;
    private raven.swing.MyTextField txtname7;
    private raven.swing.MyTextField txtnamsinh;
    private raven.swing.MyTextField txtten;
    private raven.swing.MyTextField txtvaitro;
    // End of variables declaration//GEN-END:variables
void init(){
    try {
        JDBC.getJdbc().connectToDatabase();
        load_data();
    } catch (Exception e) {
    }
}
ArrayList<Model_DSNhanVien> list = new ArrayList<>();
int row = 0;
int current = 0;
private void load_data() throws SQLException{
    try {
            PreparedStatement ps = JDBC.getJdbc().getConnection().prepareStatement("Select * from NhanVien");
            ResultSet rs = ps.executeQuery();
            list.clear();
            while (rs.next()) {
                Model_DSNhanVien nv = new Model_DSNhanVien();
                nv.setManv(rs.getString("Manv"));
                nv.setTennv(rs.getString("Tennv"));
                nv.setGioitinh(rs.getBoolean("GioiTinh"));
                nv.setSdt(rs.getString("Sdt"));
                nv.setEmail(rs.getString("Email"));
                nv.setNamsinh(rs.getString("Namsinh"));
                nv.setDiachi(rs.getString("Diachi"));
                nv.setLuong(rs.getString("Luong"));
                nv.setMavaitro(rs.getString("Mavaitro"));
                list.add(nv);

            }
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            for (Model_DSNhanVien nv : list) {
                Object[] row = new Object[]{nv.getManv(), nv.getTennv(), nv.isGioitinh()?"Nam":"Nữ", nv.getSdt(), nv.getEmail(), nv.getNamsinh(), nv.getDiachi(), nv.getLuong(), nv.getMavaitro()};
                model.addRow(row);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
        }
}
    Model_DSNhanVien getForm(){
        Model_DSNhanVien model = new Model_DSNhanVien();
        model.setManv(txtmanv.getText());
        model.setTennv(txtten.getText());
        model.setGioitinh(rdNam.isSelected());
        model.setSdt(txtdienthoai.getText());
        model.setEmail(txtEmail.getText());
        model.setNamsinh(txtnamsinh.getText());
        model.setDiachi(txtdiachi.getText());
        model.setLuong(txtluong.getText());
        model.setMavaitro(txtvaitro.getText());
        return model;
    }
    void setForm(Model_DSNhanVien model){
        txtmanv.setText(model.getManv());
        txtten.setText(model.getTennv());
        rdNam.setSelected(model.isGioitinh());
        txtdienthoai.setText(model.getSdt());
        txtEmail.setText(model.getEmail());
        txtnamsinh.setText(model.getNamsinh());
        txtdiachi.setText(model.getDiachi());
        txtluong.setText(model.getLuong());
        txtvaitro.setText(model.getMavaitro());
    }
    
    void updateStatus(boolean edit){
        txtmanv.setEditable(edit);
        btnInsert.setEnabled(edit);
        btnUpdate.setEnabled(!edit);
        btnDelete.setEnabled(!edit);
    }
    void clearForm(){
        Model_DSNhanVien model = new Model_DSNhanVien();
        this.setForm(model);
        this.row = -1;
        this.updateStatus(true);
    }
    
    void insert(){
        Model_DSNhanVien model = getForm();
        try {
            PreparedStatement ps = JDBC.getJdbc().getConnection().prepareStatement("INSERT INTO NhanVien (Manv, Tennv, GioiTinh, Sdt, Email, Namsinh, Diachi, Luong, MaVaitro)"
                 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, model.getManv());
            ps.setString(2, model.getTennv());
            ps.setBoolean(3, model.isGioitinh());
            ps.setString(4, model.getSdt());
            ps.setString(5, model.getEmail());
            ps.setString(6, model.getNamsinh());
            ps.setString(7, model.getDiachi());
            ps.setString(8, model.getLuong());
            ps.setString(9, model.getMavaitro());
            int result = ps.executeUpdate();
            if (result > 0) {
                this.load_data();
                this.clearForm();
                MsgBox.alert(this, "Thêm mới thành công");
            } else {
                MsgBox.alert(this, "Thêm mới thất bại");
            }
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi: " + e.getMessage());
        }
    }
    void update(){
        Model_DSNhanVien model = getForm();
        try {
            PreparedStatement ps = JDBC.getJdbc().getConnection().prepareStatement("UPDATE NhanVien SET Tennv = ?, GioiTinh = ?, Sdt = ?, Email = ?, Namsinh = ?, Diachi = ?, Luong = ?, MaVaitro = ? "
                 + "WHERE Manv = ?");
            ps.setString(1, model.getTennv());
            ps.setBoolean(2, model.isGioitinh());
            ps.setString(3, model.getSdt());
            ps.setString(4, model.getEmail());
            ps.setString(5, model.getNamsinh());
            ps.setString(6, model.getDiachi());
            ps.setString(7, model.getLuong());
            ps.setString(8, model.getMavaitro());
            ps.setString(9, model.getManv());
            int result = ps.executeUpdate();
            if (result > 0) {
                load_data();
                MsgBox.alert(this, "Cập nhật thành công");
            } else {
                MsgBox.alert(this, "Cập nhật thất bại");
            }
        ps.close();
    } catch (SQLException e) {
        e.printStackTrace();
        MsgBox.alert(this, "Lỗi: " + e.getMessage());
    }
    }
    void delete(){
        if (MsgBox.confirm(this, "Bạn thực sự muốn xóa người học này?")) {
        try {
            PreparedStatement ps = JDBC.getJdbc().getConnection().prepareStatement("DELETE FROM NhanVien WHERE Manv = ?");
            ps.setString(1, txtmanv.getText());
            int result = ps.executeUpdate();
            if (result > 0) {
                load_data();
                MsgBox.alert(this, "Xóa thành công");
            } else {
                MsgBox.alert(this, "Xóa thất bại");
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi: " + e.getMessage());
        }
    }
    }
    void edit() {
    int selectedRow = tbl.getSelectedRow();
    if (selectedRow >= 0) {
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();

        String manv = model.getValueAt(selectedRow, 0).toString();
        String tennv = model.getValueAt(selectedRow, 1).toString();
        boolean gioitinh = model.getValueAt(selectedRow, 2).toString().equals("Nam");
        String sdt = model.getValueAt(selectedRow, 3).toString();
        String email = model.getValueAt(selectedRow, 4).toString();
        String namsinh = model.getValueAt(selectedRow, 5).toString();
        String diachi = model.getValueAt(selectedRow, 6).toString();
        String luong = model.getValueAt(selectedRow, 7).toString();
        String vaitro = model.getValueAt(selectedRow, 8).toString();

        txtmanv.setText(manv);
        txtten.setText(tennv);
        rdNam.setSelected(gioitinh);
        rdNu.setSelected(!gioitinh);
        txtdienthoai.setText(sdt);
        txtEmail.setText(email);
        txtnamsinh.setText(namsinh);
        txtdiachi.setText(diachi);
        txtnamsinh.setText(luong);
        txtdiachi.setText(vaitro);

        updateStatus(false);
    } else {
        MsgBox.alert(this, "Vui lòng chọn nhân viên để chỉnh sửa");
    }
}
}

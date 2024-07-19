package raven.form;

import java.awt.Color;
//import javaswingdev.chart.ModelPieChart;
//import javaswingdev.chart.PieChart;
import javax.swing.JOptionPane;
import raven.tabbed.TabbedForm;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import raven.swing.ModelPieChart;
import raven.utils.JDBC;
import raven.utils.Model_BaoCaoChung;
import raven.utils.Model_Month;

/**
 *
 * @author RAVEN
 */
public class BaoCaoChung extends TabbedForm {
    private int colorIndex = 0;
//    DefaultTableModel tblmodel = new DefaultTableModel();
    ArrayList<Model_BaoCaoChung> list = new ArrayList<>();
    
    public BaoCaoChung() {
        initComponents();
        init();
//        tblmodel.addColumn("Tháng");
//        tblmodel.addColumn("Năm");
//        tblmodel.addColumn("Tổng thu nhập");
//        tbl.setModel(tblmodel);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbMonth = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtbooking = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbbYear1 = new javax.swing.JComboBox<>();
        pieChart1 = new raven.swing.PieChart();
        txtTong = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setAutoscrolls(true);
        setInheritsPopupMenu(true);
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Báo cáo chung");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Số liệu chung");

        cbbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMonthActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 120));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("20");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel4.setText("BÁO GIÁ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 120));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel5.setText("QUYẾT TOÁN");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("20");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 120));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel7.setText("BOOKING");

        txtbooking.setBackground(new java.awt.Color(242, 242, 242));
        txtbooking.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        txtbooking.setForeground(new java.awt.Color(51, 204, 0));
        txtbooking.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbooking.setBorder(null);
        txtbooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtbooking, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbooking))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Tài chính - Kế toán");

        cbbYear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbYear1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Tổng thu nhập");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cbbYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(pieChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pieChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbbYear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbYear1ActionPerformed
        if(cbbYear1.getSelectedIndex()>=0){
            int year =Integer.valueOf(cbbYear1.getSelectedItem().toString());
            try {
                cbbMonth.removeAllItems();
                showMonth(year);
            } catch (Exception e) {
            }
            
        }
    }//GEN-LAST:event_cbbYear1ActionPerformed

    private void cbbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMonthActionPerformed
        if(cbbMonth.getSelectedIndex()>=0){
            int year = Integer.valueOf(cbbYear1.getSelectedItem().toString());
            Model_Month month = (Model_Month) cbbMonth.getSelectedItem();
            showData(year, month.getMonth());
            showData2(year, month.getMonth());
            showDataFinance(year, month.getMonth());
        }
    }//GEN-LAST:event_cbbMonthActionPerformed

    private void txtbookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookingActionPerformed
//        if(cbbMonth.getSelectedIndex()>=0){
//            int year = Integer.valueOf(cbbYear1.getSelectedItem().toString());
//            Model_Month month = (Model_Month) cbbMonth.getSelectedItem();
//            showData2(year, month.getMonth());
//        }
    }//GEN-LAST:event_txtbookingActionPerformed
    void init(){
        try {
            JDBC.getJdbc().connectToDatabase();
            showYear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void showYear() throws SQLException{
        PreparedStatement p = JDBC.getJdbc().getConnection().prepareStatement("select FORMAT(startDate,'yyyy') as YearNumBer from tblTravels group by FORMAT(startDate,'yyyy')");
        ResultSet r = p.executeQuery();
        while(r.next()){
            int year = r.getInt("YearNumber");
            cbbYear1.addItem(year + "");
        }
        r.close();
        p.close();
    }    
    private void showMonth(int year) throws SQLException{
        PreparedStatement p = JDBC.getJdbc().getConnection().prepareStatement("SELECT \n" +
                        "	DATENAME(MONTH, startDate) AS MonthName,\n" +
                        "    FORMAT(startDate, 'MM') AS MonthNumber\n" +
                        "FROM \n" +
                        "    tblTravels\n" +
                        "WHERE \n" +
                        "    YEAR(startDate) = ?\n" +
                        "GROUP BY \n" +
                        "    FORMAT(startDate, 'MM'), DATENAME(MONTH, startDate)\n" +
                        "ORDER BY \n" +
                        "    MonthNumber ASC;");
        p.setInt(1, year);
        ResultSet r = p.executeQuery();
        while(r.next()){
            String monthText = r.getString("MonthName");
            int month = r.getInt("MonthNumber");
            cbbMonth.addItem(new Model_Month(month, monthText));
        }
        r.close();
        p.close();
    }
    
    private void showData(int year, int month){
        try {
            PreparedStatement p = JDBC.getJdbc().getConnection().prepareStatement("SELECT \n" +
            "    c.name AS CategoryName,\n" +
            "    SUM(d.price) AS TotalPrice\n" +
            "FROM \n" +
            "    tblTravels t\n" +
            "INNER JOIN \n" +
            "    tblCategories c ON t.categoryId = c.id\n" +
            "INNER JOIN \n" +
            "    tblInvoice_detail d ON t.id = d.travelsId\n" +
            "WHERE \n" +
            "    YEAR(t.startDate) = ? AND MONTH(t.startDate) = ?\n" +
            "GROUP BY \n" +
            "c.name;");
            p.setInt(1, year);
            p.setInt(2,month);
            ResultSet r = p.executeQuery();
            while(r.next()){
                String productName = r.getString(1);
                double values = r.getDouble(2);
                pieChart1.addData(new ModelPieChart(productName,values,getColor()));
            }
            r.close();
            p.close();
        } catch (Exception e) {
            e.printStackTrace(); 
        } 
    }
    
    private void showData2(int year, int month){
        try {
            PreparedStatement p = JDBC.getJdbc().getConnection().prepareStatement(
                "SELECT COUNT(*) AS NumberOfTours FROM tblTravels " +
            "WHERE YEAR(startDate) = ? AND MONTH(startDate) = ?");

            // Set parameters for year and month
            p.setInt(1, year);
            p.setInt(2, month);

            ResultSet r = p.executeQuery();
            while (r.next()) {
                int numberOfTours = r.getInt("NumberOfTours");
                System.out.println("Số lượng: " + numberOfTours);
                txtbooking.setText(String.valueOf(numberOfTours)); // Set text field with the retrieved value
            }
            r.close();
            p.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    private void showDataFinance(int year, int month) {
    try {
        // Prepare SQL statement to retrieve financial data
        PreparedStatement p = JDBC.getJdbc().getConnection().prepareStatement(
            "SELECT " +
            "    MONTH(t.startDate) AS Thang, " +
            "    YEAR(t.startDate) AS Nam, " +
            "    SUM(d.Price * d.Qty) AS TongThuNhap " +
            "FROM " +
            "    tblTravels t " +
            "INNER JOIN " +
            "    tblInvoice_detail d ON t.Id = d.travelsId " +
            "INNER JOIN " +
            "    tblCategories c ON c.Id = d.categoryId " +
            "WHERE " +
            "    MONTH(t.startDate) = ? " +
            "    AND YEAR(t.startDate) = ? " +
            "GROUP BY " +
            "    MONTH(t.startDate), " +
            "    YEAR(t.startDate)"
        );

        // Set parameters for year and month in the prepared statement
        p.setInt(1, month);
        p.setInt(2, year);

        // Execute the query
        ResultSet rs = p.executeQuery();

        // Process the results
        while (rs.next()) {
            // Retrieve data for each row
            int monthValue = rs.getInt("Thang");
            int yearValue = rs.getInt("Nam");
            double totalIncome = rs.getDouble("TongThuNhap");
            txtTong.setText(String.valueOf(totalIncome));
            System.out.println("Month: " + monthValue + ", Year: " + yearValue + ", Total Income: " + totalIncome);
            // Create a Model_BaoCaoChung object to hold data
//            Model_BaoCaoChung model = new Model_BaoCaoChung();
//            model.setMonth(monthValue);
//            model.setYear(yearValue);
//            model.setGia(totalIncome);
//
//            // Add the model to the list
//            list.add(model);
        }

        // Update the table with the retrieved data
//        DefaultTableModel tbla = (DefaultTableModel) tbl.getModel();
//        tbla.setRowCount(0); // Clear existing table data
//        for (Model_BaoCaoChung model : list) {
//            Object[] row = new Object[]{model.getMonth(), model.getYear(), model.getGia()};
//            tbla.addRow(row); // Add row to the table model
//        }

        // Close the result set and prepared statement
        rs.close();
        p.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    private Color getColor(){
        Color[] color = new Color[]{new Color(255, 102, 102), new Color(221, 65, 65), new Color(47, 157, 64),new Color(204,0,0),new Color(0,0,204)};
        Color selectedColor = color[colorIndex];
        colorIndex = (colorIndex + 1) % color.length; // Đảm bảo chỉ số luôn nằm trong phạm vi mảng màu
        return selectedColor;
    }
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
    private javax.swing.JComboBox<Object> cbbMonth;
    private javax.swing.JComboBox<String> cbbYear1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private raven.swing.PieChart pieChart1;
    private javax.swing.JTextField txtTong;
    private javax.swing.JTextField txtbooking;
    // End of variables declaration//GEN-END:variables





}


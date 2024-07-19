/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.utils;

/**
 *
 * @author Loc
 */
public class Model_DSNhanVien {
    private String manv;
    private String tennv;
    private boolean gioitinh;
    private String sdt;
    private String email;
    private String namsinh;
    private String diachi;
    private String luong;
    private String mavaitro;

    public Model_DSNhanVien() {
    }

    
    
    public Model_DSNhanVien(String manv, String tennv, boolean gioitinh, String sdt, String email, String namsinh, String diachi, String luong, String mavaitro) {
        this.manv = manv;
        this.tennv = tennv;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.email = email;
        this.namsinh = namsinh;
        this.diachi = diachi;
        this.luong = luong;
        this.mavaitro = mavaitro;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public String getMavaitro() {
        return mavaitro;
    }

    public void setMavaitro(String mavaitro) {
        this.mavaitro = mavaitro;
    }
    
    
}

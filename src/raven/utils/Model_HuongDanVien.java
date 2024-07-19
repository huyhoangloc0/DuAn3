/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.utils;

/**
 *
 * @author Loc
 */
public class Model_HuongDanVien {
    private String mahdv;
    private String tenhdv;
    private boolean gioitinh;
    private String namsinh;
    private String email;
    private String sdt;
    private String diachi;
    private String trinhdohocvan;
    private String kynangdatbiet;

    public Model_HuongDanVien() {
    }

    public Model_HuongDanVien(String mahdv, String tenhdv, boolean gioitinh, String namsinh, String email, String sdt, String diachi, String trinhdohocvan, String kynangdatbiet) {
        this.mahdv = mahdv;
        this.tenhdv = tenhdv;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
        this.email = email;
        this.sdt = sdt;
        this.diachi = diachi;
        this.trinhdohocvan = trinhdohocvan;
        this.kynangdatbiet = kynangdatbiet;
    }

    public String getMahdv() {
        return mahdv;
    }

    public void setMahdv(String mahdv) {
        this.mahdv = mahdv;
    }

    public String getTenhdv() {
        return tenhdv;
    }

    public void setTenhdv(String tenhdv) {
        this.tenhdv = tenhdv;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTrinhdohocvan() {
        return trinhdohocvan;
    }

    public void setTrinhdohocvan(String trinhdohocvan) {
        this.trinhdohocvan = trinhdohocvan;
    }

    public String getKynangdatbiet() {
        return kynangdatbiet;
    }

    public void setKynangdatbiet(String kynangdatbiet) {
        this.kynangdatbiet = kynangdatbiet;
    }
    
    
}

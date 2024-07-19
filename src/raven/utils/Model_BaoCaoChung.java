/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.utils;

/**
 *
 * @author Loc
 */
public class Model_BaoCaoChung {
    private int month;
    private int year;
    private  double gia;

    public Model_BaoCaoChung() {
    }

    public Model_BaoCaoChung(int month, int year, double gia) {
        this.month = month;
        this.year = year;
        this.gia = gia;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    
}

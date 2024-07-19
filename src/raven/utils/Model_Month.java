/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.utils;

/**
 *
 * @author Loc
 */
public class Model_Month {
    int month;
    String monthText;

    public Model_Month(int month, String monthText) {
        this.month = month;
        this.monthText = monthText;
    }

    public Model_Month() {
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getMonthText() {
        return monthText;
    }

    public void setMonthText(String monthText) {
        this.monthText = monthText;
    }

    @Override
    public String toString() {
        return monthText;
    }
    
    
}

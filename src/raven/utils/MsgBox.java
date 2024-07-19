/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Loc
 */
public class MsgBox {
    //Hien thi thong bao cho nguoi dung
    public static void alert(Component parent,String message){
        JOptionPane.showMessageDialog(parent, message,"Hệ thống quản lí đào tạo",JOptionPane.INFORMATION_MESSAGE);
    }
    //Hien thi thongbao va yeu cau nguoi dung xac nhan
    public static boolean confirm(Component parent,String message){
        int result = JOptionPane.showConfirmDialog(parent, message,"Hệ thống quản lí đào tạo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
    //Hien thi thông báo yêu cầu nhập dữ liệu
    public static String prompt(Component parent,String message){
        return JOptionPane.showInputDialog(parent,message,"Hệ thống quản lí đào tạo",JOptionPane.INFORMATION_MESSAGE);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.TextField;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class Validation {

    public static boolean isEmpty(JTextField txtField, String msg) {
        String txtValue = txtField.getText().trim();
        boolean exp = (txtValue.length() == 0);
        return showMessage(txtField, msg, exp);
    }
    public static boolean isEmptyDate(JDateChooser jDateChooser, String msg) {
        Date Value = jDateChooser.getDate();
        boolean exp = (Value.toString().length() == 0);
        return showMessageDate(jDateChooser, msg, exp);
    }

    public static boolean checkSDT(JTextField txtField, String msg) {
        String txtValue = txtField.getText().trim();
        txtValue = txtValue.replace(".", "");//Phương thức replace() để thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới.
        txtValue = txtValue.replace(",", "");
        txtValue = txtValue.replace(" ", "");
        String strPtn = "^(09|08|03)[0-9]{8}$";
        boolean exp = (!txtValue.matches(strPtn));
        return showMessage(txtField, msg, exp);
    }

    public static boolean isNumber(JTextField txtField, String msg) {
        String txtValue = txtField.getText().trim();
        String strPtn = "^\\d{1,}$";
        boolean exp = (!txtValue.matches(strPtn));
        return showMessage(txtField, msg, exp);
    }
    public static boolean checkGiaTien(JTextField txtField, String msg) {
        String txtValue = txtField.getText().trim();
        boolean exp = (Integer.parseInt(txtValue) < 1000);
        return showMessage(txtField, msg, exp);
    }

    public static boolean checkMaHV(JTextField txtField, String msg) {
        String txtValue = txtField.getText().trim();
        String strPtn = "^(HV)[0-9]{4}$";
        boolean exp = (!txtValue.matches(strPtn));
        return showMessage(txtField, msg, exp);
    }

    private static boolean showMessage(JTextField txtField, String msg, boolean expression) {
        if (expression) {
            JOptionPane.showMessageDialog(null, msg);
            txtField.setBackground(Color.yellow);
            txtField.requestFocus();//giúp con trỏ nhảy đến JTextField đó
            return false;
        }
        txtField.setBackground(Color.white);
        return true;
    }

    private static boolean showMessageDate(JDateChooser txtField, String msg, boolean expression) {
        if (expression) {
            JOptionPane.showMessageDialog(null, msg);
            txtField.setBackground(Color.yellow);
            txtField.requestFocus();//giúp con trỏ nhảy đến JTextField đó
            return false;
        }
        txtField.setBackground(Color.white);
        return true;
    }
}

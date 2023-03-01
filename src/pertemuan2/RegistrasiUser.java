/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Rifqi Wirma Putra
 */
public class RegistrasiUser {
    public static void main(String[] args){
        JFrame j = new JFrame("Registrasi User");
        
        JLabel name = new JLabel();
        name.setText("Nama");
        name.setBounds(50, 50, 100, 30);
        j.add(name);
        
        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(150, 50, 200, 30);
        j.add(nameTxt);
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(50, 100, 100, 30);
        j.add(username);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150, 100, 200, 30);
        j.add(usernameTxt);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(50, 150, 100, 30);
        j.add(password);
        
        JTextField passwordTxt = new JTextField();
        passwordTxt.setBounds(150, 150, 200, 30);
        j.add(passwordTxt);
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(50, 200, 100, 30);
        j.add(email);
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(150, 200, 200, 30);
        j.add(emailTxt);
        
        JLabel nohp = new JLabel();
        nohp.setText("Nomor HP");
        nohp.setBounds(50, 250, 100, 30);
        j.add(nohp);
        
        JTextField nohpTxt = new JTextField();
        nohpTxt.setBounds(150, 250, 200, 30);
        j.add(nohpTxt);
        
        JButton loginButton = new JButton();
        loginButton.setText("Login");
        loginButton.setBounds(270, 370, 80, 35);
        j.add(loginButton);
        
        JLabel Alamat = new JLabel();
        Alamat.setText("Alamat");
        Alamat.setBounds(50, 300, 100, 30);
        j.add(Alamat);
        
        JTextArea testTxt = new JTextArea();
        testTxt.setBounds(150, 300, 200, 50);
        j.add(testTxt);
        
        
        j.setSize(500, 500);
        j.setLayout(null);
        j.setVisible(true);
    }
}

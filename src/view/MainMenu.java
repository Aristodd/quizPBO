/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author SKY-PC
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import controller.DatabaseHandler;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MainMenu implements ActionListener{
    static DatabaseHandler conn = new DatabaseHandler();
    
    JFrame mainMenuFrame = new JFrame();
    JLabel labTitle = new JLabel("Selamat Datang!");
    JButton buttonInsertDataJurusan = new JButton("Insert Data Jurusan Baru");  
    JButton buttonLihatDataJurusan = new JButton("Lihat Data Semua Jurusan");
    JButton buttonInsertDataMhs = new JButton("Insert Data Mahasiswa Baru");
    JButton buttonLihatDataMhs = new JButton("Lihat Data Mahasiswa Per Jurusan");
    
    public MainMenu(){
        mainMenuFrame.setSize(500,350);
        mainMenuFrame.setLocationRelativeTo(null);
        mainMenuFrame.setLayout(null);
        mainMenuFrame.setVisible(true);
        
        labTitle.setBounds(180,30, 200,20);
        
        buttonInsertDataJurusan.setBounds(130,70, 225,25);
        buttonInsertDataJurusan.setActionCommand("Insert Jurusan");
        buttonInsertDataJurusan.addActionListener(this);
        
        buttonLihatDataJurusan.setBounds(130,110, 225,25);
        buttonLihatDataJurusan.setActionCommand("Lihat Jurusan");
        buttonLihatDataJurusan.addActionListener(this);
        
        buttonInsertDataMhs.setBounds(130,150, 225,25);
        buttonInsertDataMhs.setActionCommand("Insert Mahasiswa");
        buttonInsertDataMhs.addActionListener(this);
        
        buttonLihatDataMhs.setBounds(130,190, 225,25);
        buttonLihatDataMhs.setActionCommand("Lihat Mahasiswa");
        buttonLihatDataMhs.addActionListener(this);
        
        mainMenuFrame.add(labTitle);
        mainMenuFrame.add(buttonInsertDataJurusan);
        mainMenuFrame.add(buttonLihatDataJurusan);
        mainMenuFrame.add(buttonInsertDataMhs);
        mainMenuFrame.add(buttonLihatDataMhs);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        switch(command){
            case "Insert Jurusan":
                mainMenuFrame.dispose();
                new InsertDataJurusan();
//                String[] opt = {"Admin", "Member"};
//                int logType = JOptionPane.showOptionDialog(mainMenuFrame, "Masuk sebagai ", "Pilih", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opt, null);
//                conn.connect();
//                if(logType==0){
//                    try {
//                        String query = "SELECT * FROM admin WHERE kodeAdmin='" + tfUsername.getText() + "'AND passwordAdmin='" + pfPassword.getText() + "'";
//                        Statement stmt = conn.con.createStatement();
//                        ResultSet rs = stmt.executeQuery(query);
//                        if(rs.next()) {
//                            Admin logAdmin = new Admin();
//                            logAdmin.setEmail(rs.getString("emailAdmin"));
//                            logAdmin.setFullName(rs.getString("fullNameAdmin"));
//                            logAdmin.setPassword(rs.getString("passwordAdmin"));
//                            logAdmin.setPhoneNum(rs.getString("phoneNumAdmin"));
//                            logAdmin.setKodeAdmin(rs.getString("kodeAdmin"));
//                            logAdmin.setPayroll(rs.getInt("payrollAdmin"));
//                            
//                            UserManager.getInstance().setAdmin(logAdmin);
//                            mainMenuFrame.dispose();
//                            JOptionPane.showMessageDialog(mainMenuFrame,"Selamat datang " + logAdmin.getFullName() + "!");
//                            new AdminMenu();
//                        }
//                        else{
//                        JOptionPane.showMessageDialog(mainMenuFrame, "Pengisian ada yang salah!", "Login Error",JOptionPane.WARNING_MESSAGE);
//                        }
//                    } catch (SQLException excLog) {
//                        excLog.printStackTrace();
//                    }
//                }else{
//                    try {
//                        String query = "SELECT * FROM member WHERE emailMember='" + tfUsername.getText() + "'AND passwordMember='" + pfPassword.getText() + "'";
//                        Statement stmt = conn.con.createStatement();
//                        ResultSet rs = stmt.executeQuery(query);
//                        if(rs.next()) {
//                            Member logMember = new Member();
//                            logMember.setEmail(rs.getString("emailMember"));
//                            logMember.setFullName(rs.getString("fullNameMember"));
//                            logMember.setPassword(rs.getString("passwordMember"));
//                            logMember.setPhoneNum(rs.getString("phoneNumMember"));
//                            logMember.setAddress(rs.getString("addressMember"));
//                            logMember.setPoint(rs.getInt("poinMember"));
//                            
//                            UserManager.getInstance().setMember(logMember);
//                            mainMenuFrame.dispose();
//                            JOptionPane.showMessageDialog(mainMenuFrame,"Selamat datang " + logMember.getFullName() + "!");
//                            new GuestMemberMenu();
//                        }
//                        else{
//                            JOptionPane.showMessageDialog(mainMenuFrame, "Pengisian ada yang salah!", "Login Error",JOptionPane.WARNING_MESSAGE);
//                        }
//                    } catch (SQLException excLog) {
//                        excLog.printStackTrace();
//                    }
//                }
                break;
            case "Lihat Jurusan":
//                User logUser = new User();
//                UserManager.getInstance().setUser(logUser);
                mainMenuFrame.dispose();
                new LihatDataJurusan();
//                new GuestMemberMenu();
                break;
            case "Insert Mahasiswa":
                mainMenuFrame.dispose();
                new InsertDataMahasiswa();
                break;
            case "Lihat Mahasiswa":
                mainMenuFrame.dispose();
                new LihatDataMahasiswa();
                break;
        }
    }
}

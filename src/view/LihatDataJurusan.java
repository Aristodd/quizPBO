/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author SKY-PC
 */
public class LihatDataJurusan implements ActionListener {
    JFrame lihatJurusanFrame = new JFrame();
    JButton buttonBack = new JButton("Back");
    
    public LihatDataJurusan(){
        lihatJurusanFrame.setSize(500,350);
        lihatJurusanFrame.setLocationRelativeTo(null);
        lihatJurusanFrame.setLayout(null);
        lihatJurusanFrame.setVisible(true);
        
        String data[][]={ {"IF","Teknik Informatika"},    
                          {"SI","Sistem Informasi"}};    
        String column[]={"Kode Jurusan","Nama Jurusan"};         
        JTable jt=new JTable(data,column);    
        jt.setBounds(30,40,200,300);          
        JScrollPane sp = new JScrollPane(jt);    
        
        buttonBack.setBounds(215,270, 100,25);
        buttonBack.setActionCommand("Back");
        buttonBack.addActionListener(this);
        
        lihatJurusanFrame.add(sp);
        lihatJurusanFrame.add(buttonBack);

    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        switch(command){
            case "Back":
                lihatJurusanFrame.dispose();
                new MainMenu();
                break;
        }
    }
}

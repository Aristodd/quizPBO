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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author SKY-PC
 */
public class InsertDataJurusan implements ActionListener {
    JFrame InsertJurusanFrame = new JFrame();
    JLabel labTitle = new JLabel("Insert Data Jurusan Baru");
    JLabel labKodeJurusan = new JLabel("Kode Jurusan  : ");
    JLabel labNamaJurusan = new JLabel("Nama Jurusan  : ");
    JTextField tfKodeJurusan = new JTextField();
    JTextField tfNamaJurusan = new JTextField();
    
    JButton buttonInsert = new JButton("Insert"); 
    JButton buttonBack = new JButton("Back");
    
    public InsertDataJurusan(){
        InsertJurusanFrame.setSize(500,350);
        InsertJurusanFrame.setLocationRelativeTo(null);
        InsertJurusanFrame.setLayout(null);
        InsertJurusanFrame.setVisible(true);
        
        labTitle.setBounds(150,30, 200,20);
        
        labKodeJurusan.setBounds(50,100, 150,30);
        labNamaJurusan.setBounds(50,180, 150,30);
        
        tfKodeJurusan.setBounds(200,180, 200,30);
        tfNamaJurusan.setBounds(200,100, 200,30);
        
        buttonInsert.setBounds(215,240, 100,25);
        buttonInsert.setActionCommand("Insert");
        buttonInsert.addActionListener(this);
        
        buttonBack.setBounds(215,270, 100,25);
        buttonBack.setActionCommand("Back");
        buttonBack.addActionListener(this);
        
        InsertJurusanFrame.add(labTitle);
        InsertJurusanFrame.add(labKodeJurusan);
        InsertJurusanFrame.add(labNamaJurusan);
        InsertJurusanFrame.add(tfKodeJurusan);
        InsertJurusanFrame.add(tfNamaJurusan);
        InsertJurusanFrame.add(buttonInsert);
        InsertJurusanFrame.add(buttonBack);

    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        switch(command){
            case "Insert":
                InsertJurusanFrame.dispose();
                JOptionPane.showMessageDialog(InsertJurusanFrame,"Berhasil Insert!");
                break;
            case "Back":
                InsertJurusanFrame.dispose();
                new MainMenu();
                break;
        }
    }
}

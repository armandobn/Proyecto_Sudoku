/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosudoku;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import static javax.swing.text.html.CSS.Attribute.BORDER;
import static javax.swing.text.html.HTML.Attribute.BORDER;

/**
 *
 * @author misti
 */
public class ProyectoSudoku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Inicio h=new Inicio();
        
        h.setVisible(true);
        
    }
    
}

class Inicio extends JFrame implements ActionListener{

    private JLabel label;
    private JTextField 
            
            /*
            Seccion A(fila:1,2,3)
            Seccion B(fila:4,5,6)
            Seccion C(fila:7,8,9)
            
            */
            
        //Seccion A
            tx_a_a1,tx_a_a2,tx_a_a3,
            tx_a_a4,tx_a_a5,tx_a_a6,
            tx_a_a7,tx_a_a8,tx_a_a9,
            
            tx_a_b1,tx_a_b2,tx_a_b3,
            tx_a_b4,tx_a_b5,tx_a_b6,
            tx_a_b7,tx_a_b8,tx_a_b9,
            
            tx_a_c1,tx_a_c2,tx_a_c3,
            tx_a_c4,tx_a_c5,tx_a_c6,
            tx_a_c7,tx_a_c8,tx_a_c9,
            
            tx_a_aa1,tx_a_aa2,tx_a_aa3,
            tx_a_aa4,tx_a_aa5,tx_a_aa6,
            tx_a_aa7,tx_a_aa8,tx_a_aa9,
            
            tx_a_bb1,tx_a_bb2,tx_a_bb3,
            tx_a_bb4,tx_a_bb5,tx_a_bb6,
            tx_a_bb7,tx_a_bb8,tx_a_bb9,
            
            tx_a_cc1,tx_a_cc2,tx_a_cc3,
            tx_a_cc4,tx_a_cc5,tx_a_cc6,
            tx_a_cc7,tx_a_cc8,tx_a_cc9,
            
            tx_a_aaa1,tx_a_aaa2,tx_a_aaa3,
            tx_a_aaa4,tx_a_aaa5,tx_a_aaa6,
            tx_a_aaa7,tx_a_aaa8,tx_a_aaa9,
            
            tx_a_bbb1,tx_a_bbb2,tx_a_bbb3,
            tx_a_bbb4,tx_a_bbb5,tx_a_bbb6,
            tx_a_bbb7,tx_a_bbb8,tx_a_bbb9,
            
            tx_a_ccc1,tx_a_ccc2,tx_a_ccc3,
            tx_a_ccc4,tx_a_ccc5,tx_a_ccc6,
            tx_a_ccc7,tx_a_ccc8,tx_a_ccc9,
    
        //Secion B
            tx_b_a1,tx_b_a2,tx_b_a3,
            tx_b_a4,tx_b_a5,tx_b_a6,
            tx_b_a7,tx_b_a8,tx_b_a9,
            
            tx_b_b1,tx_b_b2,tx_b_b3,
            tx_b_b4,tx_b_b5,tx_b_b6,
            tx_b_b7,tx_b_b8,tx_b_b9,
            
            tx_b_c1,tx_b_c2,tx_b_c3,
            tx_b_c4,tx_b_c5,tx_b_c6,
            tx_b_c7,tx_b_c8,tx_b_c9,
            
            tx_b_aa1,tx_b_aa2,tx_b_aa3,
            tx_b_aa4,tx_b_aa5,tx_b_aa6,
            tx_b_aa7,tx_b_aa8,tx_b_aa9,
            
            tx_b_bb1,tx_b_bb2,tx_b_bb3,
            tx_b_bb4,tx_b_bb5,tx_b_bb6,
            tx_b_bb7,tx_b_bb8,tx_b_bb9,
            
            tx_b_cc1,tx_b_cc2,tx_b_cc3,
            tx_b_cc4,tx_b_cc5,tx_b_cc6,
            tx_b_cc7,tx_b_cc8,tx_b_cc9,
            
            tx_b_aaa1,tx_b_aaa2,tx_b_aaa3,
            tx_b_aaa4,tx_b_aaa5,tx_b_aaa6,
            tx_b_aaa7,tx_b_aaa8,tx_b_aaa9,
            
            tx_b_bbb1,tx_b_bbb2,tx_b_bbb3,
            tx_b_bbb4,tx_b_bbb5,tx_b_bbb6,
            tx_b_bbb7,tx_b_bbb8,tx_b_bbb9,
            
            tx_b_ccc1,tx_b_ccc2,tx_b_ccc3,
            tx_b_ccc4,tx_b_ccc5,tx_b_ccc6,
            tx_b_ccc7,tx_b_ccc8,tx_b_ccc9,
    
    //Seccion C
            tx_c_a1,tx_c_a2,tx_c_a3,
            tx_c_a4,tx_c_a5,tx_c_a6,
            tx_c_a7,tx_c_a8,tx_c_a9,
            
            tx_c_b1,tx_c_b2,tx_c_b3,
            tx_c_b4,tx_c_b5,tx_c_b6,
            tx_c_b7,tx_c_b8,tx_c_b9,
            
            tx_c_c1,tx_c_c2,tx_c_c3,
            tx_c_c4,tx_c_c5,tx_c_c6,
            tx_c_c7,tx_c_c8,tx_c_c9,
            
            tx_c_aa1,tx_c_aa2,tx_c_aa3,
            tx_c_aa4,tx_c_aa5,tx_c_aa6,
            tx_c_aa7,tx_c_aa8,tx_c_aa9,
            
            tx_c_bb1,tx_c_bb2,tx_c_bb3,
            tx_c_bb4,tx_c_bb5,tx_c_bb6,
            tx_c_bb7,tx_c_bb8,tx_c_bb9,
            
            tx_c_cc1,tx_c_cc2,tx_c_cc3,
            tx_c_cc4,tx_c_cc5,tx_c_cc6,
            tx_c_cc7,tx_c_cc8,tx_c_cc9,
            
            tx_c_aaa1,tx_c_aaa2,tx_c_aaa3,
            tx_c_aaa4,tx_c_aaa5,tx_c_aaa6,
            tx_c_aaa7,tx_c_aaa8,tx_c_aaa9,
            
            tx_c_bbb1,tx_c_bbb2,tx_c_bbb3,
            tx_c_bbb4,tx_c_bbb5,tx_c_bbb6,
            tx_c_bbb7,tx_c_bbb8,tx_c_bbb9,
            
            tx_c_ccc1,tx_c_ccc2,tx_c_ccc3,
            tx_c_ccc4,tx_c_ccc5,tx_c_ccc6,
            tx_c_ccc7,tx_c_ccc8,tx_c_ccc9;
    
    private JButton btn_jugar;
   
    
    public Inicio(){
        
        this.setBounds(300, 100, 450, 500);
        this.setResizable(true);
        this.setDefaultCloseOperation(3);
        
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        setLocationRelativeTo(null);
        panel.setBackground(Color.BLUE);
        this.getContentPane().add(panel);
        
//Seccion A
    //Fila 1
        tx_a_a1 = new JTextField();
        tx_a_a1.setBounds(20, 20, 20, 20);
        tx_a_a1.setForeground(Color.BLACK);
        tx_a_a1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_a1);
        
        tx_a_a2 = new JTextField();
        tx_a_a2.setBounds(40, 20, 20, 20);
        tx_a_a2.setForeground(Color.BLACK);
        tx_a_a2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_a2);
        
        tx_a_a3 = new JTextField();
        tx_a_a3.setBounds(60, 20, 20, 20);
        tx_a_a3.setForeground(Color.BLACK);
        tx_a_a3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_a3);
        
        tx_a_b1 = new JTextField();
        tx_a_b1.setBounds(100, 20, 20, 20);
        tx_a_b1.setForeground(Color.BLACK);
        tx_a_b1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_b1);
        
        tx_a_b2 = new JTextField();
        tx_a_b2.setBounds(120, 20, 20, 20);
        tx_a_b2.setForeground(Color.BLACK);
        tx_a_b2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_b2);
        
        tx_a_b3 = new JTextField();
        tx_a_b3.setBounds(140, 20, 20, 20);
        tx_a_b3.setForeground(Color.BLACK);
        tx_a_b3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_b3);
        
        tx_a_c1 = new JTextField();
        tx_a_c1.setBounds(180, 20, 20, 20);
        tx_a_c1.setForeground(Color.BLACK);
        tx_a_c1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_c1);
        
        tx_a_c2 = new JTextField();
        tx_a_c2.setBounds(200, 20, 20, 20);
        tx_a_c2.setForeground(Color.BLACK);
        tx_a_c2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_c2);
        
        tx_a_c3 = new JTextField();
        tx_a_c3.setBounds(220, 20, 20, 20);
        tx_a_c3.setForeground(Color.BLACK);
        tx_a_c3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_c3);
        
    //Fila 2
        tx_a_aa1 = new JTextField();
        tx_a_aa1.setBounds(20, 40, 20, 20);
        tx_a_aa1.setForeground(Color.BLACK);
        tx_a_aa1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_aa1);
        
        tx_a_aa2 = new JTextField();
        tx_a_aa2.setBounds(40, 40, 20, 20);
        tx_a_aa2.setForeground(Color.BLACK);
        tx_a_aa2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_aa2);
        
        tx_a_aa3 = new JTextField();
        tx_a_aa3.setBounds(60, 40, 20, 20);
        tx_a_aa3.setForeground(Color.BLACK);
        tx_a_aa3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_aa3);
        
        tx_a_bb1 = new JTextField();
        tx_a_bb1.setBounds(100, 40, 20, 20);
        tx_a_bb1.setForeground(Color.BLACK);
        tx_a_bb1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_bb1);
        
        tx_a_bb2 = new JTextField();
        tx_a_bb2.setBounds(120, 40, 20, 20);
        tx_a_bb2.setForeground(Color.BLACK);
        tx_a_bb2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_bb2);
        
        tx_a_bb3 = new JTextField();
        tx_a_bb3.setBounds(140, 40, 20, 20);
        tx_a_bb3.setForeground(Color.BLACK);
        tx_a_bb3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_bb3);
        
        tx_a_cc1 = new JTextField();
        tx_a_cc1.setBounds(180, 40, 20, 20);
        tx_a_cc1.setForeground(Color.BLACK);
        tx_a_cc1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_cc1);
        
        tx_a_cc2 = new JTextField();
        tx_a_cc2.setBounds(200, 40, 20, 20);
        tx_a_cc2.setForeground(Color.BLACK);
        tx_a_cc2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_cc2);
        
        tx_a_cc3 = new JTextField();
        tx_a_cc3.setBounds(220, 40, 20, 20);
        tx_a_cc3.setForeground(Color.BLACK);
        tx_a_cc3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_cc3);
        
    //fila 3 
        tx_a_aaa1 = new JTextField();
        tx_a_aaa1.setBounds(20, 60, 20, 20);
        tx_a_aaa1.setForeground(Color.BLACK);
        tx_a_aaa1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_aaa1);
        
        tx_a_aaa2 = new JTextField();
        tx_a_aaa2.setBounds(40, 60, 20, 20);
        tx_a_aaa2.setForeground(Color.BLACK);
        tx_a_aaa2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_aaa2);
        
        tx_a_aaa3 = new JTextField();
        tx_a_aaa3.setBounds(60, 60, 20, 20);
        tx_a_aaa3.setForeground(Color.BLACK);
        tx_a_aaa3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_aaa3);
        
        tx_a_bbb1 = new JTextField();
        tx_a_bbb1.setBounds(100, 60, 20, 20);
        tx_a_bbb1.setForeground(Color.BLACK);
        tx_a_bbb1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_bbb1);
        
        tx_a_bbb2 = new JTextField();
        tx_a_bbb2.setBounds(120, 60, 20, 20);
        tx_a_bbb2.setForeground(Color.BLACK);
        tx_a_bbb2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_bbb2);
        
        tx_a_bbb3 = new JTextField();
        tx_a_bbb3.setBounds(140, 60, 20, 20);
        tx_a_bbb3.setForeground(Color.BLACK);
        tx_a_bbb3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_bbb3);
        
        tx_a_ccc1 = new JTextField();
        tx_a_ccc1.setBounds(180, 60, 20, 20);
        tx_a_ccc1.setForeground(Color.BLACK);
        tx_a_ccc1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_ccc1);
        
        tx_a_ccc2 = new JTextField();
        tx_a_ccc2.setBounds(200, 60, 20, 20);
        tx_a_ccc2.setForeground(Color.BLACK);
        tx_a_ccc2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_ccc2);
        
        tx_a_ccc3 = new JTextField();
        tx_a_ccc3.setBounds(220, 60, 20, 20);
        tx_a_ccc3.setForeground(Color.BLACK);
        tx_a_ccc3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_a_ccc3);
        
//Seccion B
    //fila 4
        tx_b_a1 = new JTextField();
        tx_b_a1.setBounds(20, 100, 20, 20);
        tx_b_a1.setForeground(Color.BLACK);
        tx_b_a1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_a1);
        
        tx_b_a2 = new JTextField();
        tx_b_a2.setBounds(40, 100, 20, 20);
        tx_b_a2.setForeground(Color.BLACK);
        tx_b_a2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_a2);
        
        tx_b_a3 = new JTextField();
        tx_b_a3.setBounds(60, 100, 20, 20);
        tx_b_a3.setForeground(Color.BLACK);
        tx_b_a3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_a3);
        
        tx_b_b1 = new JTextField();
        tx_b_b1.setBounds(100, 100, 20, 20);
        tx_b_b1.setForeground(Color.BLACK);
        tx_b_b1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_b1);
        
        tx_b_b2 = new JTextField();
        tx_b_b2.setBounds(120, 100, 20, 20);
        tx_b_b2.setForeground(Color.BLACK);
        tx_b_b2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_b2);
        
        tx_b_b3 = new JTextField();
        tx_b_b3.setBounds(140, 100, 20, 20);
        tx_b_b3.setForeground(Color.BLACK);
        tx_b_b3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_b3);
        
        tx_b_c1 = new JTextField();
        tx_b_c1.setBounds(180, 100, 20, 20);
        tx_b_c1.setForeground(Color.BLACK);
        tx_b_c1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_c1);
        
        tx_b_c2 = new JTextField();
        tx_b_c2.setBounds(200, 100, 20, 20);
        tx_b_c2.setForeground(Color.BLACK);
        tx_b_c2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_c2);
        
        tx_b_c3 = new JTextField();
        tx_b_c3.setBounds(220, 100, 20, 20);
        tx_b_c3.setForeground(Color.BLACK);
        tx_b_c3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_c3);
        
    //Fila 5
        tx_b_aa1 = new JTextField();
        tx_b_aa1.setBounds(20, 120, 20, 20);
        tx_b_aa1.setForeground(Color.BLACK);
        tx_b_aa1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_aa1);
        
        tx_b_aa2 = new JTextField();
        tx_b_aa2.setBounds(40, 120, 20, 20);
        tx_b_aa2.setForeground(Color.BLACK);
        tx_b_aa2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_aa2);
        
        tx_b_aa3 = new JTextField();
        tx_b_aa3.setBounds(60, 120, 20, 20);
        tx_b_aa3.setForeground(Color.BLACK);
        tx_b_aa3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_aa3);
        
        tx_b_bb1 = new JTextField();
        tx_b_bb1.setBounds(100, 120, 20, 20);
        tx_b_bb1.setForeground(Color.BLACK);
        tx_b_bb1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_bb1);
        
        tx_b_bb2 = new JTextField();
        tx_b_bb2.setBounds(120, 120, 20, 20);
        tx_b_bb2.setForeground(Color.BLACK);
        tx_b_bb2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_bb2);
        
        tx_b_bb3 = new JTextField();
        tx_b_bb3.setBounds(140, 120, 20, 20);
        tx_b_bb3.setForeground(Color.BLACK);
        tx_b_bb3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_bb3);
        
        tx_b_cc1 = new JTextField();
        tx_b_cc1.setBounds(180, 120, 20, 20);
        tx_b_cc1.setForeground(Color.BLACK);
        tx_b_cc1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_cc1);
        
        tx_b_cc2 = new JTextField();
        tx_b_cc2.setBounds(200,120, 20, 20);
        tx_b_cc2.setForeground(Color.BLACK);
        tx_b_cc2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_cc2);
        
        tx_b_cc3 = new JTextField();
        tx_b_cc3.setBounds(220, 120, 20, 20);
        tx_b_cc3.setForeground(Color.BLACK);
        tx_b_cc3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_cc3);
        
    //fila 6 
        tx_b_aaa1 = new JTextField();
        tx_b_aaa1.setBounds(20, 140, 20, 20);
        tx_b_aaa1.setForeground(Color.BLACK);
        tx_b_aaa1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_aaa1);
        
        tx_b_aaa2 = new JTextField();
        tx_b_aaa2.setBounds(40, 140, 20, 20);
        tx_b_aaa2.setForeground(Color.BLACK);
        tx_b_aaa2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_aaa2);
        
        tx_b_aaa3 = new JTextField();
        tx_b_aaa3.setBounds(60, 140, 20, 20);
        tx_b_aaa3.setForeground(Color.BLACK);
        tx_b_aaa3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_aaa3);
        
        tx_b_bbb1 = new JTextField();
        tx_b_bbb1.setBounds(100, 140, 20, 20);
        tx_b_bbb1.setForeground(Color.BLACK);
        tx_b_bbb1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_bbb1);
        
        tx_b_bbb2 = new JTextField();
        tx_b_bbb2.setBounds(120, 140, 20, 20);
        tx_b_bbb2.setForeground(Color.BLACK);
        tx_b_bbb2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_bbb2);
        
        tx_b_bbb3 = new JTextField();
        tx_b_bbb3.setBounds(140, 140, 20, 20);
        tx_b_bbb3.setForeground(Color.BLACK);
        tx_b_bbb3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_bbb3);
        
        tx_b_ccc1 = new JTextField();
        tx_b_ccc1.setBounds(180, 140, 20, 20);
        tx_b_ccc1.setForeground(Color.BLACK);
        tx_b_ccc1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_ccc1);
        
        tx_b_ccc2 = new JTextField();
        tx_b_ccc2.setBounds(200, 140, 20, 20);
        tx_b_ccc2.setForeground(Color.BLACK);
        tx_b_ccc2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_ccc2);
        
        tx_b_ccc3 = new JTextField();
        tx_b_ccc3.setBounds(220, 140, 20, 20);
        tx_b_ccc3.setForeground(Color.BLACK);
        tx_b_ccc3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_b_ccc3);

//Seccion C
    //fila 7
        tx_c_a1 = new JTextField();
        tx_c_a1.setBounds(20, 180, 20, 20);
        tx_c_a1.setForeground(Color.BLACK);
        tx_c_a1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_a1);
        
        tx_c_a2 = new JTextField();
        tx_c_a2.setBounds(40, 180, 20, 20);
        tx_c_a2.setForeground(Color.BLACK);
        tx_c_a2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_a2);
        
        tx_c_a3 = new JTextField();
        tx_c_a3.setBounds(60, 180, 20, 20);
        tx_c_a3.setForeground(Color.BLACK);
        tx_c_a3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_a3);
        
        tx_c_b1 = new JTextField();
        tx_c_b1.setBounds(100, 180, 20, 20);
        tx_c_b1.setForeground(Color.BLACK);
        tx_c_b1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_b1);
        
        tx_c_b2 = new JTextField();
        tx_c_b2.setBounds(120, 180, 20, 20);
        tx_c_b2.setForeground(Color.BLACK);
        tx_c_b2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_b2);
        
        tx_c_b3 = new JTextField();
        tx_c_b3.setBounds(140, 180, 20, 20);
        tx_c_b3.setForeground(Color.BLACK);
        tx_c_b3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_b3);
        
        tx_c_c1 = new JTextField();
        tx_c_c1.setBounds(180, 180, 20, 20);
        tx_c_c1.setForeground(Color.BLACK);
        tx_c_c1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_c1);
        
        tx_c_c2 = new JTextField();
        tx_c_c2.setBounds(200, 180, 20, 20);
        tx_c_c2.setForeground(Color.BLACK);
        tx_c_c2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_c2);
        
        tx_c_c3 = new JTextField();
        tx_c_c3.setBounds(220, 180, 20, 20);
        tx_c_c3.setForeground(Color.BLACK);
        tx_c_c3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_c3);
        
    //Fila 8
        tx_c_aa1 = new JTextField();
        tx_c_aa1.setBounds(20, 200, 20, 20);
        tx_c_aa1.setForeground(Color.BLACK);
        tx_c_aa1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_aa1);
        
        tx_c_aa2 = new JTextField();
        tx_c_aa2.setBounds(40, 200, 20, 20);
        tx_c_aa2.setForeground(Color.BLACK);
        tx_c_aa2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_aa2);
        
        tx_c_aa3 = new JTextField();
        tx_c_aa3.setBounds(60, 200, 20, 20);
        tx_c_aa3.setForeground(Color.BLACK);
        tx_c_aa3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_aa3);
        
        tx_c_bb1 = new JTextField();
        tx_c_bb1.setBounds(100, 200, 20, 20);
        tx_c_bb1.setForeground(Color.BLACK);
        tx_c_bb1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_bb1);
        
        tx_c_bb2 = new JTextField();
        tx_c_bb2.setBounds(120, 200, 20, 20);
        tx_c_bb2.setForeground(Color.BLACK);
        tx_c_bb2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_bb2);
        
        tx_c_bb3 = new JTextField();
        tx_c_bb3.setBounds(140, 200, 20, 20);
        tx_c_bb3.setForeground(Color.BLACK);
        tx_c_bb3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_bb3);
        
        tx_c_cc1 = new JTextField();
        tx_c_cc1.setBounds(180, 200, 20, 20);
        tx_c_cc1.setForeground(Color.BLACK);
        tx_c_cc1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_cc1);
        
        tx_c_cc2 = new JTextField();
        tx_c_cc2.setBounds(200,200, 20, 20);
        tx_c_cc2.setForeground(Color.BLACK);
        tx_c_cc2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_cc2);
        
        tx_c_cc3 = new JTextField();
        tx_c_cc3.setBounds(220, 200, 20, 20);
        tx_c_cc3.setForeground(Color.BLACK);
        tx_c_cc3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_cc3);
        
    //fila 9 
        tx_c_aaa1 = new JTextField();
        tx_c_aaa1.setBounds(20, 220, 20, 20);
        tx_c_aaa1.setForeground(Color.BLACK);
        tx_c_aaa1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_aaa1);
        
        tx_c_aaa2 = new JTextField();
        tx_c_aaa2.setBounds(40, 220, 20, 20);
        tx_c_aaa2.setForeground(Color.BLACK);
        tx_c_aaa2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_aaa2);
        
        tx_c_aaa3 = new JTextField();
        tx_c_aaa3.setBounds(60, 220, 20, 20);
        tx_c_aaa3.setForeground(Color.BLACK);
        tx_c_aaa3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_aaa3);
        
        tx_c_bbb1 = new JTextField();
        tx_c_bbb1.setBounds(100, 220, 20, 20);
        tx_c_bbb1.setForeground(Color.BLACK);
        tx_c_bbb1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_bbb1);
        
        tx_c_bbb2 = new JTextField();
        tx_c_bbb2.setBounds(120, 220, 20, 20);
        tx_c_bbb2.setForeground(Color.BLACK);
        tx_c_bbb2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_bbb2);
        
        tx_c_bbb3 = new JTextField();
        tx_c_bbb3.setBounds(140, 220, 20, 20);
        tx_c_bbb3.setForeground(Color.BLACK);
        tx_c_bbb3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_bbb3);
        
        tx_c_ccc1 = new JTextField();
        tx_c_ccc1.setBounds(180, 220, 20, 20);
        tx_c_ccc1.setForeground(Color.BLACK);
        tx_c_ccc1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_ccc1);
        
        tx_c_ccc2 = new JTextField();
        tx_c_ccc2.setBounds(200, 220, 20, 20);
        tx_c_ccc2.setForeground(Color.BLACK);
        tx_c_ccc2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_ccc2);
        
        tx_c_ccc3 = new JTextField();
        tx_c_ccc3.setBounds(220, 220, 20, 20);
        tx_c_ccc3.setForeground(Color.BLACK);
        tx_c_ccc3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_c_ccc3);
        
        
        btn_jugar= new JButton("Jugar");
        btn_jugar.setBounds(150, 300, 100, 20);
        panel.add(btn_jugar);
        btn_jugar.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

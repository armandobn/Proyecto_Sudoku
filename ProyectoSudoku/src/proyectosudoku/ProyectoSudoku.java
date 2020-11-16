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
    JTextField tx_interfaz[][]= new JTextField[9][9];
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
        tx_interfaz[0][0] = new JTextField();
        tx_interfaz[0][0].setBounds(20, 20, 20, 20);
        tx_interfaz[0][0].setForeground(Color.BLACK);
        tx_interfaz[0][0].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[0][0]);
        
        tx_interfaz[0][1] = new JTextField();
        tx_interfaz[0][1].setBounds(40, 20, 20, 20);
        tx_interfaz[0][1].setForeground(Color.BLACK);
        tx_interfaz[0][1].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[0][1]);
        
        tx_interfaz[0][2] = new JTextField();
        tx_interfaz[0][2].setBounds(60, 20, 20, 20);
        tx_interfaz[0][2].setForeground(Color.BLACK);
        tx_interfaz[0][2].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[0][2]);
        
        tx_interfaz[0][3] = new JTextField();
        tx_interfaz[0][3].setBounds(100, 20, 20, 20);
        tx_interfaz[0][3].setForeground(Color.BLACK);
        tx_interfaz[0][3].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[0][3]);
        
        tx_interfaz[0][4] = new JTextField();
        tx_interfaz[0][4].setBounds(120, 20, 20, 20);
        tx_interfaz[0][4].setForeground(Color.BLACK);
        tx_interfaz[0][4].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[0][4]);
        
        tx_interfaz[0][5] = new JTextField();
        tx_interfaz[0][5].setBounds(140, 20, 20, 20);
        tx_interfaz[0][5].setForeground(Color.BLACK);
        tx_interfaz[0][5].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[0][5]);
        
        tx_interfaz[0][6] = new JTextField();
        tx_interfaz[0][6].setBounds(180, 20, 20, 20);
        tx_interfaz[0][6].setForeground(Color.BLACK);
        tx_interfaz[0][6].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[0][6]);
        
        tx_interfaz[0][7] = new JTextField();
        tx_interfaz[0][7].setBounds(200, 20, 20, 20);
        tx_interfaz[0][7].setForeground(Color.BLACK);
        tx_interfaz[0][7].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[0][7]);
        
        tx_interfaz[0][8] = new JTextField();
        tx_interfaz[0][8].setBounds(220, 20, 20, 20);
        tx_interfaz[0][8].setForeground(Color.BLACK);
        tx_interfaz[0][8].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[0][8]);
        
    //Fila 2
        tx_interfaz[1][0] = new JTextField();
        tx_interfaz[1][0].setBounds(20, 40, 20, 20);
        tx_interfaz[1][0].setForeground(Color.BLACK);
        tx_interfaz[1][0].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[1][0]);
        
        tx_interfaz[1][1] = new JTextField();
        tx_interfaz[1][1].setBounds(40, 40, 20, 20);
        tx_interfaz[1][1].setForeground(Color.BLACK);
        tx_interfaz[1][1].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[1][1]);
        
        tx_interfaz[1][2] = new JTextField();
        tx_interfaz[1][2].setBounds(60, 40, 20, 20);
        tx_interfaz[1][2].setForeground(Color.BLACK);
        tx_interfaz[1][2].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[1][2]);
        
        tx_interfaz[1][3] = new JTextField();
        tx_interfaz[1][3].setBounds(100, 40, 20, 20);
        tx_interfaz[1][3].setForeground(Color.BLACK);
        tx_interfaz[1][3].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[1][3]);
        
        tx_interfaz[1][4] = new JTextField();
        tx_interfaz[1][4].setBounds(120, 40, 20, 20);
        tx_interfaz[1][4].setForeground(Color.BLACK);
        tx_interfaz[1][4].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[1][4]);
        
        tx_interfaz[1][5] = new JTextField();
        tx_interfaz[1][5].setBounds(140, 40, 20, 20);
        tx_interfaz[1][5].setForeground(Color.BLACK);
        tx_interfaz[1][5].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[1][5]);
        
        tx_interfaz[1][6] = new JTextField();
        tx_interfaz[1][6].setBounds(180, 40, 20, 20);
        tx_interfaz[1][6].setForeground(Color.BLACK);
        tx_interfaz[1][6].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[1][6]);
        
        tx_interfaz[1][7] = new JTextField();
        tx_interfaz[1][7].setBounds(200, 40, 20, 20);
        tx_interfaz[1][7].setForeground(Color.BLACK);
        tx_interfaz[1][7].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[1][7]);
        
        tx_interfaz[1][8] = new JTextField();
        tx_interfaz[1][8].setBounds(220, 40, 20, 20);
        tx_interfaz[1][8].setForeground(Color.BLACK);
        tx_interfaz[1][8].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[1][8]);
        
    //fila 3 
        tx_interfaz[2][0] = new JTextField();
        tx_interfaz[2][0].setBounds(20, 60, 20, 20);
        tx_interfaz[2][0].setForeground(Color.BLACK);
        tx_interfaz[2][0].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[2][0]);
        
        tx_interfaz[2][1] = new JTextField();
        tx_interfaz[2][1].setBounds(40, 60, 20, 20);
        tx_interfaz[2][1].setForeground(Color.BLACK);
        tx_interfaz[2][1].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[2][1]);
        
        tx_interfaz[2][2] = new JTextField();
        tx_interfaz[2][2].setBounds(60, 60, 20, 20);
        tx_interfaz[2][2].setForeground(Color.BLACK);
        tx_interfaz[2][2].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[2][2]);
        
        tx_interfaz[2][3] = new JTextField();
        tx_interfaz[2][3].setBounds(100, 60, 20, 20);
        tx_interfaz[2][3].setForeground(Color.BLACK);
        tx_interfaz[2][3].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[2][3]);
        
        tx_interfaz[2][4] = new JTextField();
        tx_interfaz[2][4].setBounds(120, 60, 20, 20);
        tx_interfaz[2][4].setForeground(Color.BLACK);
        tx_interfaz[2][4].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[2][4]);
        
        tx_interfaz[2][5] = new JTextField();
        tx_interfaz[2][5].setBounds(140, 60, 20, 20);
        tx_interfaz[2][5].setForeground(Color.BLACK);
        tx_interfaz[2][5].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[2][5]);
        
        tx_interfaz[2][6] = new JTextField();
        tx_interfaz[2][6].setBounds(180, 60, 20, 20);
        tx_interfaz[2][6].setForeground(Color.BLACK);
        tx_interfaz[2][6].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[2][6]);
        
        tx_interfaz[2][7] = new JTextField();
        tx_interfaz[2][7].setBounds(200, 60, 20, 20);
        tx_interfaz[2][7].setForeground(Color.BLACK);
        tx_interfaz[2][7].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[2][7]);
        
        tx_interfaz[2][8] = new JTextField();
        tx_interfaz[2][8].setBounds(220, 60, 20, 20);
        tx_interfaz[2][8].setForeground(Color.BLACK);
        tx_interfaz[2][8].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[2][8]);
        
//Seccion B
    //fila 4
        tx_interfaz[3][0] = new JTextField();
        tx_interfaz[3][0].setBounds(20, 100, 20, 20);
        tx_interfaz[3][0].setForeground(Color.BLACK);
        tx_interfaz[3][0].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[3][0]);
        
        tx_interfaz[3][1] = new JTextField();
        tx_interfaz[3][1].setBounds(40, 100, 20, 20);
        tx_interfaz[3][1].setForeground(Color.BLACK);
        tx_interfaz[3][1].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[3][1]);
        
        tx_interfaz[3][2] = new JTextField();
        tx_interfaz[3][2].setBounds(60, 100, 20, 20);
        tx_interfaz[3][2].setForeground(Color.BLACK);
        tx_interfaz[3][2].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[3][2]);
        
        tx_interfaz[3][3] = new JTextField();
        tx_interfaz[3][3].setBounds(100, 100, 20, 20);
        tx_interfaz[3][3].setForeground(Color.BLACK);
        tx_interfaz[3][3].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[3][3]);
        
        tx_interfaz[3][4] = new JTextField();
        tx_interfaz[3][4].setBounds(120, 100, 20, 20);
        tx_interfaz[3][4].setForeground(Color.BLACK);
        tx_interfaz[3][4].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[3][4]);
        
        tx_interfaz[3][5] = new JTextField();
        tx_interfaz[3][5].setBounds(140, 100, 20, 20);
        tx_interfaz[3][5].setForeground(Color.BLACK);
        tx_interfaz[3][5].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[3][5]);
        
        tx_interfaz[3][6] = new JTextField();
        tx_interfaz[3][6].setBounds(180, 100, 20, 20);
        tx_interfaz[3][6].setForeground(Color.BLACK);
        tx_interfaz[3][6].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[3][6]);
        
        tx_interfaz[3][7] = new JTextField();
        tx_interfaz[3][7].setBounds(200, 100, 20, 20);
        tx_interfaz[3][7].setForeground(Color.BLACK);
        tx_interfaz[3][7].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[3][7]);
        
        tx_interfaz[3][8] = new JTextField();
        tx_interfaz[3][8].setBounds(220, 100, 20, 20);
        tx_interfaz[3][8].setForeground(Color.BLACK);
        tx_interfaz[3][8].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[3][8]);
        
    //Fila 5
        tx_interfaz[4][0] = new JTextField();
        tx_interfaz[4][0].setBounds(20, 120, 20, 20);
        tx_interfaz[4][0].setForeground(Color.BLACK);
        tx_interfaz[4][0].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[4][0]);
        
        tx_interfaz[4][1] = new JTextField();
        tx_interfaz[4][1].setBounds(40, 120, 20, 20);
        tx_interfaz[4][1].setForeground(Color.BLACK);
        tx_interfaz[4][1].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[4][1]);
        
        tx_interfaz[4][2] = new JTextField();
        tx_interfaz[4][2].setBounds(60, 120, 20, 20);
        tx_interfaz[4][2].setForeground(Color.BLACK);
        tx_interfaz[4][2].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[4][2]);
        
        tx_interfaz[4][3] = new JTextField();
        tx_interfaz[4][3].setBounds(100, 120, 20, 20);
        tx_interfaz[4][3].setForeground(Color.BLACK);
        tx_interfaz[4][3].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[4][3]);
        
        tx_interfaz[4][4] = new JTextField();
        tx_interfaz[4][4].setBounds(120, 120, 20, 20);
        tx_interfaz[4][4].setForeground(Color.BLACK);
        tx_interfaz[4][4].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[4][4]);
        
        tx_interfaz[4][5] = new JTextField();
        tx_interfaz[4][5].setBounds(140, 120, 20, 20);
        tx_interfaz[4][5].setForeground(Color.BLACK);
        tx_interfaz[4][5].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[4][5]);
        
        tx_interfaz[4][6] = new JTextField();
        tx_interfaz[4][6].setBounds(180, 120, 20, 20);
        tx_interfaz[4][6].setForeground(Color.BLACK);
        tx_interfaz[4][6].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[4][6]);
        
        tx_interfaz[4][7] = new JTextField();
        tx_interfaz[4][7].setBounds(200,120, 20, 20);
        tx_interfaz[4][7].setForeground(Color.BLACK);
        tx_interfaz[4][7].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[4][7]);
        
        tx_interfaz[4][8] = new JTextField();
        tx_interfaz[4][8].setBounds(220, 120, 20, 20);
        tx_interfaz[4][8].setForeground(Color.BLACK);
        tx_interfaz[4][8].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[4][8]);
        
    //fila 6 
        tx_interfaz[5][0] = new JTextField();
        tx_interfaz[5][0].setBounds(20, 140, 20, 20);
        tx_interfaz[5][0].setForeground(Color.BLACK);
        tx_interfaz[5][0].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[5][0]);
        
        tx_interfaz[5][1] = new JTextField();
        tx_interfaz[5][1].setBounds(40, 140, 20, 20);
        tx_interfaz[5][1].setForeground(Color.BLACK);
        tx_interfaz[5][1].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[5][1]);
        
        tx_interfaz[5][2] = new JTextField();
        tx_interfaz[5][2].setBounds(60, 140, 20, 20);
        tx_interfaz[5][2].setForeground(Color.BLACK);
        tx_interfaz[5][2].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[5][2]);
        
        tx_interfaz[5][3] = new JTextField();
        tx_interfaz[5][3].setBounds(100, 140, 20, 20);
        tx_interfaz[5][3].setForeground(Color.BLACK);
        tx_interfaz[5][3].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[5][3]);
        
        tx_interfaz[5][4] = new JTextField();
        tx_interfaz[5][4].setBounds(120, 140, 20, 20);
        tx_interfaz[5][4].setForeground(Color.BLACK);
        tx_interfaz[5][4].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[5][4]);
        
        tx_interfaz[5][5] = new JTextField();
        tx_interfaz[5][5].setBounds(140, 140, 20, 20);
        tx_interfaz[5][5].setForeground(Color.BLACK);
        tx_interfaz[5][5].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[5][5]);
        
        tx_interfaz[5][6] = new JTextField();
        tx_interfaz[5][6].setBounds(180, 140, 20, 20);
        tx_interfaz[5][6].setForeground(Color.BLACK);
        tx_interfaz[5][6].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[5][6]);
        
        tx_interfaz[5][7] = new JTextField();
        tx_interfaz[5][7].setBounds(200, 140, 20, 20);
        tx_interfaz[5][7].setForeground(Color.BLACK);
        tx_interfaz[5][7].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[5][7]);
        
        tx_interfaz[5][8] = new JTextField();
        tx_interfaz[5][8].setBounds(220, 140, 20, 20);
        tx_interfaz[5][8].setForeground(Color.BLACK);
        tx_interfaz[5][8].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[5][8]);

//Seccion C
    //fila 7
        tx_interfaz[6][0] = new JTextField();
        tx_interfaz[6][0].setBounds(20, 180, 20, 20);
        tx_interfaz[6][0].setForeground(Color.BLACK);
        tx_interfaz[6][0].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[6][0]);
        
        tx_interfaz[6][1] = new JTextField();
        tx_interfaz[6][1].setBounds(40, 180, 20, 20);
        tx_interfaz[6][1].setForeground(Color.BLACK);
        tx_interfaz[6][1].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[6][1]);
        
        tx_interfaz[6][2] = new JTextField();
        tx_interfaz[6][2].setBounds(60, 180, 20, 20);
        tx_interfaz[6][2].setForeground(Color.BLACK);
        tx_interfaz[6][2].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[6][2]);
        
        tx_interfaz[6][3] = new JTextField();
        tx_interfaz[6][3].setBounds(100, 180, 20, 20);
        tx_interfaz[6][3].setForeground(Color.BLACK);
        tx_interfaz[6][3].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[6][3]);
        
        tx_interfaz[6][4] = new JTextField();
        tx_interfaz[6][4].setBounds(120, 180, 20, 20);
        tx_interfaz[6][4].setForeground(Color.BLACK);
        tx_interfaz[6][4].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[6][4]);
        
        tx_interfaz[6][5] = new JTextField();
        tx_interfaz[6][5].setBounds(140, 180, 20, 20);
        tx_interfaz[6][5].setForeground(Color.BLACK);
        tx_interfaz[6][5].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[6][5]);
        
        tx_interfaz[6][6] = new JTextField();
        tx_interfaz[6][6].setBounds(180, 180, 20, 20);
        tx_interfaz[6][6].setForeground(Color.BLACK);
        tx_interfaz[6][6].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[6][6]);
        
        tx_interfaz[6][7] = new JTextField();
        tx_interfaz[6][7].setBounds(200, 180, 20, 20);
        tx_interfaz[6][7].setForeground(Color.BLACK);
        tx_interfaz[6][7].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[6][7]);
        
        tx_interfaz[6][8] = new JTextField();
        tx_interfaz[6][8].setBounds(220, 180, 20, 20);
        tx_interfaz[6][8].setForeground(Color.BLACK);
        tx_interfaz[6][8].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[6][8]);
        
    //Fila 8
        tx_interfaz[7][0] = new JTextField();
        tx_interfaz[7][0].setBounds(20, 200, 20, 20);
        tx_interfaz[7][0].setForeground(Color.BLACK);
        tx_interfaz[7][0].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[7][0]);
        
        tx_interfaz[7][1] = new JTextField();
        tx_interfaz[7][1].setBounds(40, 200, 20, 20);
        tx_interfaz[7][1].setForeground(Color.BLACK);
        tx_interfaz[7][1].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[7][1]);
        
        tx_interfaz[7][2] = new JTextField();
        tx_interfaz[7][2].setBounds(60, 200, 20, 20);
        tx_interfaz[7][2].setForeground(Color.BLACK);
        tx_interfaz[7][2].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[7][2]);
        
        tx_interfaz[7][3] = new JTextField();
        tx_interfaz[7][3].setBounds(100, 200, 20, 20);
        tx_interfaz[7][3].setForeground(Color.BLACK);
        tx_interfaz[7][3].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[7][3]);
        
        tx_interfaz[7][4] = new JTextField();
        tx_interfaz[7][4].setBounds(120, 200, 20, 20);
        tx_interfaz[7][4].setForeground(Color.BLACK);
        tx_interfaz[7][4].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[7][4]);
        
        tx_interfaz[7][5] = new JTextField();
        tx_interfaz[7][5].setBounds(140, 200, 20, 20);
        tx_interfaz[7][5].setForeground(Color.BLACK);
        tx_interfaz[7][5].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[7][5]);
        
        tx_interfaz[7][6] = new JTextField();
        tx_interfaz[7][6].setBounds(180, 200, 20, 20);
        tx_interfaz[7][6].setForeground(Color.BLACK);
        tx_interfaz[7][6].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[7][6]);
        
        tx_interfaz[7][7] = new JTextField();
        tx_interfaz[7][7].setBounds(200,200, 20, 20);
        tx_interfaz[7][7].setForeground(Color.BLACK);
        tx_interfaz[7][7].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[7][7]);
        
        tx_interfaz[7][8] = new JTextField();
        tx_interfaz[7][8].setBounds(220, 200, 20, 20);
        tx_interfaz[7][8].setForeground(Color.BLACK);
        tx_interfaz[7][8].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[7][8]);
        
    //fila 9 
        tx_interfaz[8][0] = new JTextField();
        tx_interfaz[8][0].setBounds(20, 220, 20, 20);
        tx_interfaz[8][0].setForeground(Color.BLACK);
        tx_interfaz[8][0].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[8][0]);
        
        tx_interfaz[8][1] = new JTextField();
        tx_interfaz[8][1].setBounds(40, 220, 20, 20);
        tx_interfaz[8][1].setForeground(Color.BLACK);
        tx_interfaz[8][1].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[8][1]);
        
        tx_interfaz[8][2] = new JTextField();
        tx_interfaz[8][2].setBounds(60, 220, 20, 20);
        tx_interfaz[8][2].setForeground(Color.BLACK);
        tx_interfaz[8][2].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[8][2]);
        
        tx_interfaz[8][3] = new JTextField();
        tx_interfaz[8][3].setBounds(100, 220, 20, 20);
        tx_interfaz[8][3].setForeground(Color.BLACK);
        tx_interfaz[8][3].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[8][3]);
        
        tx_interfaz[8][4] = new JTextField();
        tx_interfaz[8][4].setBounds(120, 220, 20, 20);
        tx_interfaz[8][4].setForeground(Color.BLACK);
        tx_interfaz[8][4].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[8][4]);
        
        tx_interfaz[8][5] = new JTextField();
        tx_interfaz[8][5].setBounds(140, 220, 20, 20);
        tx_interfaz[8][5].setForeground(Color.BLACK);
        tx_interfaz[8][5].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[8][5]);
        
        tx_interfaz[8][6] = new JTextField();
        tx_interfaz[8][6].setBounds(180, 220, 20, 20);
        tx_interfaz[8][6].setForeground(Color.BLACK);
        tx_interfaz[8][6].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[8][6]);
        
        tx_interfaz[8][7] = new JTextField();
        tx_interfaz[8][7].setBounds(200, 220, 20, 20);
        tx_interfaz[8][7].setForeground(Color.BLACK);
        tx_interfaz[8][7].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[8][7]);
        
        tx_interfaz[8][8] = new JTextField();
        tx_interfaz[8][8].setBounds(220, 220, 20, 20);
        tx_interfaz[8][8].setForeground(Color.BLACK);
        tx_interfaz[8][8].setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(tx_interfaz[8][8]);
        
        //muestra();
        
        btn_jugar= new JButton("Jugar");
        btn_jugar.setBounds(150, 300, 100, 20);
        panel.add(btn_jugar);
        btn_jugar.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //
    public void msatriz(){
        
         int[][] matriz = new int[9][9];
         
         matriz[0][0] = 1;
         matriz[0][1] = 2;
         matriz[0][2] = 3;
         matriz[0][3] = 4;
         matriz[0][5] = 6;
         matriz[0][6] = 9;
         matriz[0][7] = 7;
         matriz[0][8] = 5;
         matriz[0][9] = 8;
         
         matriz[1][0] = 8;
         matriz[1][1] = 4;
         matriz[1][2] = 6;
         matriz[1][3] = 5;
         matriz[1][5] = 7;
         matriz[1][6] = 1;
         matriz[1][7] = 2;
         matriz[1][8] = 9;
         matriz[1][9] = 3;
         
         matriz[2][0] = 9;
         matriz[2][1] = 5;
         matriz[2][2] = 7;
         matriz[2][3] = 2;
         matriz[2][5] = 8;
         matriz[2][6] = 3;
         matriz[2][7] = 6;
         matriz[2][8] = 4;
         matriz[2][9] = 1;
    
         matriz[3][0] = 3;
         matriz[3][1] = 1;
         matriz[3][2] = 2;
         matriz[3][3] = 7;
         matriz[3][5] = 5;
         matriz[3][6] = 8;
         matriz[3][7] = 4;
         matriz[3][8] = 6;
         matriz[3][9] = 9;
         
         matriz[4][0] = 4;
         matriz[4][1] = 6;
         matriz[4][2] = 8;
         matriz[4][3] = 3;
         matriz[4][5] = 9;
         matriz[4][6] = 2;
         matriz[4][7] = 1;
         matriz[4][8] = 7;
         matriz[4][9] = 5;
         
         matriz[5][0] = 5;
         matriz[5][1] = 7;
         matriz[5][2] = 9;
         matriz[5][3] = 1;
         matriz[5][5] = 4;
         matriz[5][6] = 6;
         matriz[5][7] = 8;
         matriz[5][8] = 3;
         matriz[5][9] = 2;
         
         matriz[6][0] = 2;
         matriz[6][1] = 3;
         matriz[6][2] = 4;
         matriz[6][3] = 6;
         matriz[6][5] = 1;
         matriz[6][6] = 5;
         matriz[6][7] = 9;
         matriz[6][8] = 8;
         matriz[6][9] = 7;
         
         matriz[7][0] = 6;
         matriz[7][1] = 8;
         matriz[7][2] = 1;
         matriz[7][3] = 9;
         matriz[7][5] = 3;
         matriz[7][6] = 7;
         matriz[7][7] = 5;
         matriz[7][8] = 2;
         matriz[7][9] = 4;
         
         matriz[8][0] = 7;
         matriz[8][1] = 9;
         matriz[8][2] = 5;
         matriz[8][3] = 8;
         matriz[8][5] = 2;
         matriz[8][6] = 4;
         matriz[8][7] = 3;
         matriz[8][8] = 1;
         matriz[8][9] = 6;
     
    }

    public void muestra(){
        
        //tx_a_a1.setText("5");
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojadedoce2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class LojaDeDoceTest extends JFrame implements ActionListener {
    JLabel labels[];
    JTextField fields[];
    JButton toggle;
    Icon icons[];
    GridLayout layout1;
    BorderLayout layout2;
    boolean toggle2 = true;
    Container container;
    JButton buy;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    double soma;
    double preco1;
    double preco2;
    double preco3;
    
    LojaDeDoceTest(){
        layout1 = new GridLayout(2,2,10,10);
        layout2 = new BorderLayout(5,5);
        p1 = new JPanel();
        p1.setLayout(new GridLayout(3,1,10,10));
        p2 = new JPanel();
        p2.setLayout(new GridLayout(3,1,10,10));
        p3 = new JPanel();
        p3.setLayout(new GridLayout(2,1,10,10));
        container = new Container();
        container = getContentPane();
        setLayout(layout2);
        icons = new Icon[3];
        icons[0] = new ImageIcon(getClass().getResource("brigadeiro.png"));
        icons[1] = new ImageIcon(getClass().getResource("cookie.png"));
        icons[2] = new ImageIcon(getClass().getResource("pudim.png"));
        labels = new JLabel[icons.length];
        fields = new JTextField[labels.length];
        
        fields[0] = new JTextField("R$: 3,00");
        fields[1] = new JTextField("R$: 5,50");
        fields[2] = new JTextField("R$: 7,50");
        for(int i = 0; i <3; i ++){
            labels[i]= new JLabel(icons[i]);
            p1.add(labels[i]);
            
            p2.add(fields[i]);
            
            fields[i].addActionListener(this);
            
        }
        
        toggle = new JButton("toggle");
        buy = new JButton("Comprar");
        p3.add(toggle);
        p3.add(buy);
        
        buy.addActionListener(this);
        toggle.addActionListener(this);
        add(p1,BorderLayout.WEST);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.EAST);
        
        

    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
            if(e.getSource() == toggle){
                if(toggle2){
                    container.setLayout(layout1);

                }
                 if(!toggle2){
                    container.setLayout(layout2);
                }
                toggle2 = !toggle2;
                container.validate();
            }
            if(e.getSource() == fields[0]){
                preco1 = Integer.valueOf(e.getActionCommand())*3.0;
                
            }
            if(e.getSource() == fields[1]){
                preco2 = Integer.valueOf(e.getActionCommand())*5.5;
               
            }
            if(e.getSource() == fields[2]){
                preco3 = Integer.valueOf(e.getActionCommand())*7.5;
                System.out.println(e.getActionCommand());
                
            }
            if(e.getSource() == buy){
                soma = preco1 + preco2 + preco3;
                JOptionPane.showMessageDialog(null,"A compra deu:" + soma);
            }
            
        
                
    
    }
    
    
    
        
}

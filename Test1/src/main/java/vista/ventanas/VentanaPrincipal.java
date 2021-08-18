/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.ventanas;

import vista.paneles.PPanel2;
import vista.paneles.PPanel1;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author Sistemas06
 */
public class VentanaPrincipal extends JFrame implements ActionListener{

    JLabel lblTitulo;
    JButton btnPanel1, btnPanel2;
    
    PPanel1 miPanel1;
    PPanel2 miPanel2;
    
    JScrollPane scrollPaneles;
    
    
    public VentanaPrincipal()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(357, 365);
        setTitle("Ejemplo Jpanel BASICO");
        setLayout(null);
        
        setLocationRelativeTo(null);
        iniciarComponentes();
        
    }
    
    
    private void iniciarComponentes() {
       miPanel1 = new PPanel1();
       miPanel2 = new PPanel2();
       
       scrollPaneles = new JScrollPane();
       scrollPaneles.setBounds(5, 112, 360, 200);
       
       lblTitulo = new JLabel("Ejemplo Panel");
       lblTitulo.setFont(new Font("YU Gothic UI Semilight", Font.PLAIN, 30));
       lblTitulo.setBounds(10, 14, 221, 51);
       
       btnPanel1 = new JButton("Panel 1");
       btnPanel1.setBounds(10, 76, 89, 23);
       btnPanel1.addActionListener(this);
       
       btnPanel2 = new JButton("Panel 2");
       btnPanel2.setBounds(10, 76, 89, 23);
       btnPanel2.addActionListener(this);
       
       add(btnPanel1);
       add(btnPanel2);
       add(lblTitulo);
       add(scrollPaneles);
       
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btnPanel1)
        {
         definirPanel(miPanel1);
        }
        if(e.getSource() == btnPanel2)
        {
            definirPanel(miPanel2);
        }
    }

    private void definirPanel(PPanel1 miPanel2) {
        
        scrollPaneles.setViewportView(miPanel1);
    
    }

    private void definirPanel(PPanel2 miPanel) {
        scrollPaneles.setViewportView(miPanel1);
        
    }

    
    
}

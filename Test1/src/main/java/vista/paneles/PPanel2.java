/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.paneles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sistemas06
 */
public class PPanel2 extends JPanel implements ActionListener {
    private JTextField campo, num1, nume2;
    private JButton btnPanelInterno, btn;
    
    
    public PPanel2()
    {
    setLayout(null);
    setBackground(Color.RED);
    setPreferredSize(new Dimension(340, 230));
        
        iniciarComponentes();
    
    }
    
    private void iniciarComponentes()
    {
        btnPanelInterno = new JButton();
        btnPanelInterno.setText("Enviar");
        btnPanelInterno.setBounds(200, 10, 90, 25);
        btnPanelInterno.addActionListener(this);
        
        btn = new JButton();
        btn.setText("SUMAR");
        btn.setBounds(200, 50, 90, 25);
        btn.addActionListener(this);
        
        campo = new JTextField();
        campo.setBounds(10, 10, 180, 25);
        
        num1 = new JTextField();
        num1.setBounds(10, 50, 80, 25);
        
        nume2 = new JTextField();
        nume2.setBounds(100, 50, 80, 25);
        
        add(btn);
        add(num1);
        add(nume2);
        
        add(btnPanelInterno);
        add(campo);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == btnPanelInterno)
       {
           JOptionPane.showMessageDialog(null,"Lo que el usuario ingresa es: " + campo.getText());
       }
       if(e.getSource() == btnPanelInterno)
       {
          int n1 = Integer.parseInt(num1.getText());
          int n2 = Integer.parseInt(nume2.getText());
          int suma = n1 + n2;
       
           JOptionPane.showMessageDialog(null,"La suma es" + suma);
       }
    }
}

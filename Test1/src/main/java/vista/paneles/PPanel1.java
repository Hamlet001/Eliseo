/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.paneles;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Sistemas06
 */
public class PPanel1 extends JPanel {
    
    JTextArea textArea;
    
    public PPanel1()
    {
       setLayout(null);
       setBackground(Color.GREEN);
       iniciarComponentes();
    }

    private void iniciarComponentes() {
        textArea = new JTextArea();
        textArea.setBounds(10, 10, 350, 181);
        String texto= "ESTO ES UN EJEMPLO DEL PANEL ";
        textArea.setText(texto);
        
        add(textArea);
    }
}

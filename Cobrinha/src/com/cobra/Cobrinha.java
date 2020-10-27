package com.cobra;

// Importações necessárias para rodar o jogo
import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author ygohamon
 */

public class Cobrinha extends JFrame
{

    // Método construtor da classe
    public Cobrinha ()
    {
    
        initUI();
    }
        private void initUI() {
        
        add(new Grade());
               
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(() -> {
            JFrame ex = new Cobrinha();
            ex.setVisible(true);
        });
    }

}

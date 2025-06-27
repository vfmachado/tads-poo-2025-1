import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Tela extends JPanel implements KeyListener, Runnable {
    
    // ABSTRAIR X E Y PARA UMA CLASSE PONTO
    // E CRIAR UM JOGADOR
    private int x = 100;
    private int y = 100;
    private int velocidade = 5;
    private boolean cima = false;
    private boolean baixo = false;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillRect(x, y, 20, 20);

        // try {
        //     Thread.sleep(16);
        // } catch (Exception e) { }
        // x = x + velocidade;
        
        // if (x >= 780 || x < 0) {
        //     velocidade = -velocidade;
        // }

        if (cima) {
            y = y - velocidade;
        }

        if (baixo) {
            y = y + velocidade;
        }
        
        // this.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyChar() + " foi pressionada");
        if (e.getKeyChar() == 'w')
            cima = true; 
            // y = y - velocidade;

        if (e.getKeyChar() == 's')
            baixo = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar() + " foi solta");
        if (e.getKeyChar() == 'w')
            cima = false;

        if (e.getKeyChar() == 's')
            baixo = false;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(16);
            } catch (Exception e) { }
            this.repaint();
        }
    }
}

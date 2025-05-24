import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        // NO TERMINAL
        // export JAVA_TOOL_OPTIONS="-Dsun.java2d.opengl=True"
        System.out.println("OPENGL " + System.getProperty("sun.java2d.opengl"));

        JFrame frame = new JFrame("JANELA");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Tela tela = new Tela();
        
        frame.add(tela);    
        frame.addKeyListener(tela);
        
        frame.setVisible(true);

        tela.run();;
    }
}

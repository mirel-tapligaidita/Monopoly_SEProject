import java.awt.Button;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Panel;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Monopoly {

    private JFrame frame;



    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Monopoly window = new Monopoly();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Monopoly() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();

        try{

            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:/Users/test/Desktop/monopolyboard.jpg")))));

        }catch(IOException e){
            System.out.println("Image Doesn't exist");
        }

        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

    }

}

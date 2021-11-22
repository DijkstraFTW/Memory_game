import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



/**
 * Memory
 */
public class Memory extends JFrame implements ActionListener {

    int nb_succ = 0;
    int nb_try = 0;

    public Memory() {

        JPanel top = new JPanel() ;
        JPanel center = new JPanel() ;
        JPanel bottom = new JPanel() ;


        // top

        top.setLayout(new BorderLayout());

        JLabel title = new JLabel("                                                                                                                                                                                 Bienvenue à Memory game");
        JLabel message = new JLabel("                                                                                                                                                                      Choissisez deux cartes pour commencer !");


        top.add(title, BorderLayout.NORTH) ;
        top.add(message, BorderLayout.SOUTH) ;



        // center

        bottom.setLayout(new GridLayout(4, 4));

        for (int i =0 ; i < 16 ; i++) {
            JButton img = new JButton(new ImageIcon("test.png")) ;
            center.add(img);
        }
        
        /*
        JButton img1 = new JButton(new ImageIcon("test_img.png")) ;
        JButton img2 = new JButton(new ImageIcon("test_img.png")) ;
        JButton img3 = new JButton(new ImageIcon("test_img.png")) ;
        JButton img4 = new JButton(new ImageIcon("test_img.png")) ;
        JButton img5 = new JButton(new ImageIcon("test_img.png")) ;
        JButton img6 = new JButton(new ImageIcon("test_img.png")) ;
        JButton img7 = new JButton(new ImageIcon("test_img.png")) ;
        JButton img8 = new JButton(new ImageIcon("test_img.png")) ;
        JButton img9 = new JButton(new ImageIcon("test_img.png")) ;
        JButton img10 = new JButton(new ImageIcon("test_img.png")) ;
        JButton img11 = new JButton(new ImageIcon("test_img.png")) ;
        JButton img12 = new JButton(new ImageIcon("test_img.png")) ;
        JButton img13 = new JButton(new ImageIcon("test_img.png")) ;



        center.add(img1);
        center.add(img2);
        center.add(img3);
        center.add(img4);
        center.add(img5);
        center.add(img6);
        center.add(img7);
        center.add(img8);
        center.add(img9);
        center.add(img10);
        center.add(img11);
        center.add(img12);
        center.add(img13);
        center.add(img14);
        center.add(img15);
        center.add(img16);

        */


        // bottom 

        JLabel nb_success = new JLabel("           Nombre de réponses correctes : " + nb_succ);
        JLabel nb_tries = new JLabel("Nombre d'essais : " + nb_try + "                    ");

        bottom.setLayout(new BorderLayout());
        bottom.add(nb_success, BorderLayout.WEST) ;
        bottom.add(nb_tries, BorderLayout.EAST) ;


        this.add(top, BorderLayout.NORTH) ;
        this.add(center, BorderLayout.CENTER) ;
        this.add(bottom, BorderLayout.SOUTH) ;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    public static void main(String[] args) {
        
        Memory game = new Memory();

        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setSize(1200, 980);
        game.setVisible(true);

    }

    
}
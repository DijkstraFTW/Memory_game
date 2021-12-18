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

        JLabel title = new JLabel("                                                                                                                                                       Bienvenue à Memory game");
        JLabel message = new JLabel("                                                                                                                                             Choissisez deux cartes pour commencer !");


        top.add(title, BorderLayout.NORTH) ;
        top.add(message, BorderLayout.SOUTH) ;



        // center

        bottom.setLayout(new GridLayout(4, 3));

        for (int i = 0 ; i < 12 ; i++) {
            JButton img = new JButton(new ImageIcon("qstmark.png")) ;
            center.add(img);
        }
        
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
        game.setSize(1200, 750);
        game.setVisible(true);

    }

    
}
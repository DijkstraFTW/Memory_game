import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



/**
 * Memory
 */
public class Memory extends JFrame implements ActionListener {

    protected int nb_succ;
    protected int nb_try;

    protected JLabel nb_tries;
    protected JLabel nb_success;




    public Memory() {


        // LAYOUT

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


        JButton img1 = new JButton(new ImageIcon("qstmark.png")) ;
        img1.addActionListener(this);
        center.add(img1);

        JButton img2 = new JButton(new ImageIcon("qstmark.png")) ;
        img2.addActionListener(this);
        center.add(img2);

        JButton img3 = new JButton(new ImageIcon("qstmark.png")) ;
        img3.addActionListener(this);
        center.add(img3);

        JButton img4 = new JButton(new ImageIcon("qstmark.png")) ;
        img4.addActionListener(this);
        center.add(img4);

        JButton img5 = new JButton(new ImageIcon("qstmark.png")) ;
        img5.addActionListener(this);
        center.add(img5);

        JButton img6 = new JButton(new ImageIcon("qstmark.png")) ;
        img6.addActionListener(this);
        center.add(img6);

        JButton img7 = new JButton(new ImageIcon("qstmark.png")) ;
        img7.addActionListener(this);
        center.add(img7);

        JButton img8 = new JButton(new ImageIcon("qstmark.png")) ;
        img8.addActionListener(this);
        center.add(img8);

        JButton img9 = new JButton(new ImageIcon("qstmark.png")) ;
        img9.addActionListener(this);
        center.add(img9);

        JButton img10 = new JButton(new ImageIcon("qstmark.png")) ;
        img10.addActionListener(this);
        center.add(img10);

        JButton img11 = new JButton(new ImageIcon("qstmark.png")) ;
        img11.addActionListener(this);
        center.add(img11);

        JButton img12 = new JButton(new ImageIcon("qstmark.png")) ;
        img12.addActionListener(this);
        center.add(img12);

        
        // bottom 

        nb_success = new JLabel("           Nombre de réponses correctes : " + nb_succ);
        nb_tries = new JLabel("Nombre d'essais : " + nb_try + "                    ");

        bottom.setLayout(new BorderLayout());
        bottom.add(nb_success, BorderLayout.WEST) ;
        bottom.add(nb_tries, BorderLayout.EAST) ;


        this.add(top, BorderLayout.NORTH) ;
        this.add(center, BorderLayout.CENTER) ;
        this.add(bottom, BorderLayout.SOUTH) ;

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        nb_try++;

        this.update();
        
        this.flipCard(e);      
    }

    public void update() {
        
        nb_tries.setText("Nombre d'essais : " + nb_try + "                    ");

        nb_success.setText("           Nombre de réponses correctes : " + nb_succ);
    }

    private void flipCard(ActionEvent e) {
        JButton curr_card = (JButton) e.getSource();
        curr_card.setIcon(new ImageIcon("cardtest.png"));



    }


    public static void main(String[] args) {
        
        Memory game = new Memory();
        
        game.setTitle(" Memory Game");

        
        
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setSize(1200, 750);
        game.setVisible(true);

    }

    
}
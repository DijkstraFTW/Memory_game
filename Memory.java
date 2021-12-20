import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;



/**
 * Memory
 */
public class Memory extends JFrame implements ActionListener {

    protected ArrayList<String> cards = new ArrayList<String>();

    protected ArrayList<String> game_cards = new ArrayList<String>();

    protected int temp ;
    
    protected int nb_succ;
    protected int nb_try;

    protected JLabel nb_tries;
    protected JLabel nb_success;


    public Memory() {

        // Initializing cards

        cards.add("cards/monkey.png");
        cards.add("cards/elephant.png");
        cards.add("cards/girafe.png");
        cards.add("cards/horse.png");
        cards.add("cards/sheep.png");
        cards.add("cards/snake.png");
        cards.add("cards/monkey.png");
        cards.add("cards/elephant.png");
        cards.add("cards/girafe.png");
        cards.add("cards/horse.png");
        cards.add("cards/sheep.png");
        cards.add("cards/snake.png");


        // LAYOUT

        JPanel top = new JPanel() ;
        JPanel center = new JPanel() ;
        JPanel bottom = new JPanel() ;


        // TOP

        top.setLayout(new BorderLayout());

        JLabel title = new JLabel("                                                                                                                                                       Bienvenue à Memory game");
        JLabel message = new JLabel("                                                                                                                                             Choissisez deux cartes pour commencer !");

        top.add(title, BorderLayout.NORTH) ;
        top.add(message, BorderLayout.SOUTH) ;


        // CENTER

        bottom.setLayout(new GridLayout(4, 3));


        JButton img1 = new JButton(new ImageIcon("cards/qstmark.png")) ;
        img1.setName("img1");
        img1.addActionListener(this);
        center.add(img1);

        JButton img2 = new JButton(new ImageIcon("cards/qstmark.png")) ;
        img2.setName("img2");
        img2.addActionListener(this);
        center.add(img2);

        JButton img3 = new JButton(new ImageIcon("cards/qstmark.png")) ;
        img3.setName("img3");
        img3.addActionListener(this);
        center.add(img3);

        JButton img4 = new JButton(new ImageIcon("cards/qstmark.png")) ;
        img4.setName("img4");
        img4.addActionListener(this);
        center.add(img4);

        JButton img5 = new JButton(new ImageIcon("cards/qstmark.png")) ;
        img5.setName("img5");
        img5.addActionListener(this);
        center.add(img5);

        JButton img6 = new JButton(new ImageIcon("cards/qstmark.png")) ;
        img6.setName("img6");
        img6.addActionListener(this);
        center.add(img6);

        JButton img7 = new JButton(new ImageIcon("cards/qstmark.png")) ;
        img7.setName("img7");
        img7.addActionListener(this);
        center.add(img7);

        JButton img8 = new JButton(new ImageIcon("cards/qstmark.png")) ;
        img8.setName("img8");
        img8.addActionListener(this);
        center.add(img8);

        JButton img9 = new JButton(new ImageIcon("cards/qstmark.png")) ;
        img9.setName("img9");
        img9.addActionListener(this);
        center.add(img9);

        JButton img10 = new JButton(new ImageIcon("cards/qstmark.png")) ;
        img10.setName("img10");
        img10.addActionListener(this);
        center.add(img10);

        JButton img11 = new JButton(new ImageIcon("cards/qstmark.png")) ;
        img11.setName("img11");
        img11.addActionListener(this);
        center.add(img11);

        JButton img12 = new JButton(new ImageIcon("cards/qstmark.png")) ;
        img12.setName("img12");
        img12.addActionListener(this);
        center.add(img12);

        
        // BOTTOM 

        nb_success = new JLabel("           Nombre de réponses correctes : " + nb_succ);
        nb_tries = new JLabel("Nombre d'essais : " + nb_try + "                    ");

        bottom.setLayout(new BorderLayout());
        bottom.add(nb_success, BorderLayout.WEST) ;
        bottom.add(nb_tries, BorderLayout.EAST) ;


        this.add(top, BorderLayout.NORTH) ;
        this.add(center, BorderLayout.CENTER) ;
        this.add(bottom, BorderLayout.SOUTH) ;


        // Setting game_cards
        
        for (int i = 0 ; i < 12 ; i++) {
            temp =  (int) (cards.size() * Math.random());
            game_cards.add(cards.get(temp));
            cards.remove(temp);
        }

        System.out.println("\ngame : " + game_cards);
        System.out.println("cards : " + cards);
    }

    
        @Override
        public void actionPerformed(ActionEvent e) {

            nb_try++;

            this.update();
        
            this.flipCard(e); 

            Timer timer = new Timer(1500, new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent evt) {
                    coverCard(e);
                }
            });

            timer.setRepeats(false);
            timer.start();



        }
    

    private void update() {
        
        nb_tries.setText("Nombre d'essais : " + nb_try + "                    ");

        nb_success.setText("           Nombre de réponses correctes : " + nb_succ);
    }

    private void flipCard(ActionEvent e) {

        if (e.getSource() instanceof JButton) {
        
            JButton curr_card = (JButton) e.getSource();

            switch (curr_card.getName()) {

                case "img1" : curr_card.setIcon(new ImageIcon(game_cards.get(0))); break;
                case "img2" : curr_card.setIcon(new ImageIcon(game_cards.get(1))); break;
                case "img3" : curr_card.setIcon(new ImageIcon(game_cards.get(2))); break;
                case "img4" : curr_card.setIcon(new ImageIcon(game_cards.get(3))); break;
                case "img5" : curr_card.setIcon(new ImageIcon(game_cards.get(4))); break;
                case "img6" : curr_card.setIcon(new ImageIcon(game_cards.get(5))); break;
                case "img7" : curr_card.setIcon(new ImageIcon(game_cards.get(6))); break;
                case "img8" : curr_card.setIcon(new ImageIcon(game_cards.get(7))); break;
                case "img9" : curr_card.setIcon(new ImageIcon(game_cards.get(8))); break;
                case "img10" : curr_card.setIcon(new ImageIcon(game_cards.get(9))); break;
                case "img11" : curr_card.setIcon(new ImageIcon(game_cards.get(10))); break;
                case "img12" : curr_card.setIcon(new ImageIcon(game_cards.get(11))); break;

            }     
        
        }
    }

    private void coverCard(ActionEvent e) {

        if (e.getSource() instanceof JButton) {
        
            JButton curr_card = (JButton) e.getSource();

            switch (curr_card.getName()) {

                case "img1" : curr_card.setIcon(new ImageIcon("cards/qstmark.png"));break;
                case "img2" : curr_card.setIcon(new ImageIcon("cards/qstmark.png")); break;
                case "img3" : curr_card.setIcon(new ImageIcon("cards/qstmark.png")); break;
                case "img4" : curr_card.setIcon(new ImageIcon("cards/qstmark.png")); break;
                case "img5" : curr_card.setIcon(new ImageIcon("cards/qstmark.png")); break;
                case "img6" : curr_card.setIcon(new ImageIcon("cards/qstmark.png")); break;
                case "img7" : curr_card.setIcon(new ImageIcon("cards/qstmark.png")); break;
                case "img8" : curr_card.setIcon(new ImageIcon("cards/qstmark.png")); break;
                case "img9" : curr_card.setIcon(new ImageIcon("cards/qstmark.png")); break;
                case "img10" : curr_card.setIcon(new ImageIcon("cards/qstmark.png")); break;
                case "img11" : curr_card.setIcon(new ImageIcon("cards/qstmark.png")); break;
                case "img12" : curr_card.setIcon(new ImageIcon("cards/qstmark.png")); break;

        }
    }
    }




    public static void main(String[] args) {
        
        Memory game = new Memory();
        
        game.setTitle(" Memory Game");

        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setSize(1200, 750);
        game.setVisible(true);

    }
    
    
}

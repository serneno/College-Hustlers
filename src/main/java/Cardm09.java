package bin.main.classes;

import javax.swing.ImageIcon;

//Parking Violation
public class Cardm09 extends Card {
    
        public Cardm09() {
            card_img = new ImageIcon("./resources/cardm09.png");
            card_ID = 9;
            card_name = "Parking Violation";
        }
    
        //If player in Forbidden Parking, get 1 Learning Chip
        //Can discard 1 game card for another Learning Chip
        public void play(PlayerModel player) {
            if(player.getCurrentRoom().getName().equals("Forbidden Parking")) {
                player.addLearning(1);
                System.out.println(player.getPlayer().getName() + " played " + getName() + "for 1 Learning Chip");
                //Dialog pops up to discard 1 game card of choice
                //player.addLearning(1);
            }
        }
    }
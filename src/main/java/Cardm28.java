package bin.main.classes;

import javax.swing.ImageIcon;

//Professor Englert
public class Cardm28 extends Card {

    public Cardm28() {
        card_img = new ImageIcon("./resources/cardm28.png");
        card_ID = 28;
        card_name = "Professor Englert";
    }

    //If player in CECS Conference and has 3 Integrity Chips, get 1 Chip of Choice 
    //Else, discard 1 Game Card
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("CECS Conference") && player.getIntegrity() >= 3) {
            //player.addCraft(1);
            //System.out.println(player.getPlayer().getName() + " played " + getName() + " for 1 Craft Chip");

            //player.addIntegrity(1);
            //System.out.println(player.getPlayer().getName() + " played " + getName() + " for 1 Integrity Chip");

            //player.addLearning(1);
            //System.out.println(player.getPlayer().getName() + " played " + getName() + " for 1 Learning Chip");
        }
        else {
            int discard = (int) Math.random() * (player.getHand().size() - 1);
            deck.discard(player.getHand().remove(discard));
            System.out.println(player.getPlayer().getName() + " played " + getName() + " discarded 1 Game Card");
        }
    }
}
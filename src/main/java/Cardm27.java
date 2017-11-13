package bin.main.classes;

import javax.swing.ImageIcon;

//Loud Buzzing
public class Cardm27 extends Card {

    public Cardm27() {
        card_img = new ImageIcon("./resources/cardm27.png");
        card_ID = 27;
        card_name = "Loud Buzzing";
    }

    //If player in Eat Room and has >= 3 Craft Chip, get 1 Chip of Choice
    //Else, lose 2 Quality Points
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("Eat Room") && player.getCraft() >= 3) {            
            //player.addCraft(1);
            //System.out.println(player.getPlayer().getName() + " played " + getName() + "for 1 Craft Chip");

            //player.addIntegrity(1);
            //System.out.println(player.getPlayer().getName() + " played " + getName() + "for 1 Integrity Chip");

            //player.addLearning(1);
            //System.out.println(player.getPlayer().getName() + " played " + getName() + "for 1 Learning Chip");
        }
        else {
            player.addQuality(-2);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for -2 Quality Points");
        }
    }
}
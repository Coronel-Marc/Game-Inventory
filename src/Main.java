import Inventory.Game.Game;
import Inventory.Inventory;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.setName("Midnight 3");
        game.setGenre("Racing");
        game.setPrice(12.5);
        game.setCompany("EA GAMES");
        game.setPlatform("Console");

        Game game2 = new Game();
        game2.setName("Elden Ring");
        game2.setGenre("Dark Fantasy");
        game2.setPrice(55.60);
        game2.setCompany("Bandai Namco");
        game2.setPlatform("Console, PC");


        game.showDetails();
        System.out.println("-----------------");

        Inventory inventory = new Inventory();
        inventory.addGame(game);
        inventory.addGame(game2);
        //System.out.println(inventory.showGame(0));
        System.out.println(inventory.showList());
    }
}
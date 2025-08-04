import Inventory.Game.Game;

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

        game.showDetails();
    }
}
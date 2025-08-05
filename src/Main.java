import Inventory.Game.Game;
import Inventory.Inventory;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

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
        boolean loop = true;
        while(loop){
            System.out.println("Inventory of games");
            System.out.print("Please, choose an option");
            System.out.printf(
                    """
                    1. Add new game
                    2. Remove a game
                    3. See all the games
                    0. Exit
                    """
            );
            int option = sc.nextInt();
            switch (option){
                case 1:
                    //inventory
                    System.out.println("Type the name of the game");
                    //I need to save the game in the memory... How can I do that?

            }
        }

        inventory.addGame(game);
        inventory.addGame(game2);
        System.out.println(inventory.showGame(0));
        System.out.println(inventory.showList());
    }
}
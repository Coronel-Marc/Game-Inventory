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



        game.showDetails();
        System.out.println("-----------------");
        boolean loop = true;
        while(loop){
            System.out.println("Inventory of games");
            System.out.print("Please, choose an option\n");
            System.out.print(
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
                    sc.reset();
                    //inventory
                    System.out.println("Please type the name, genre, price, company and platform of the game");
                    //I need to save the game in the memory... How can I do that?
                    System.out.print("Name: ");
                    game.setName(sc.nextLine());

                    System.out.print("Genre: ");
                    game.setGenre(sc.nextLine());

                    System.out.print("Price: ");
                    game.setPrice(sc.nextDouble());

                    System.out.print("The company: ");
                    game.setCompany(sc.next());

                    System.out.print("Which platform: ");
                    game.setPlatform(sc.next());

                    System.out.printf(
                            """
                            New game on the inventory: %s
                            """,game.getName()
                    );
                    inventory.addGame(game);
                    break;
                case 2:
                    System.out.print("Please type the name of the game: ");
                    inventory.deleteGame(sc.nextInt()); //Yeah I know, I need to improve this...
                    break;
                case 3:
                    System.out.println("Showing all games on the inventory");
                    System.out.println(inventory.showList());
                    break;
                case 0:
                    System.exit(0);
                    loop = false;
            }
        }
    }
}
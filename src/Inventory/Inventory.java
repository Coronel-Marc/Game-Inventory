package Inventory;

import Inventory.Game.Game;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements IInventory{

    List<Game> gamesList = new ArrayList<Game>();






    @Override
    public void addGame(Game g) {
        gamesList.add(g);
    }

    @Override
    public void deleteGame(int index) {
        gamesList.remove(index);
    }

    @Override
    public void showGame(int index) {
        System.out.println(gamesList.get(index));


    }

    @Override
    public void showList() {
        System.out.println(gamesList.listIterator().toString());
    }
}

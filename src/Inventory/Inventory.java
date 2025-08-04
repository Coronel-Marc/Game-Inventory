package Inventory;

import Inventory.Game.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
    public String showGame(int index) {
        return gamesList.get(index).showDetails();


    }

    @Override
    public String showList() {

        return gamesList.toString();
    }
}

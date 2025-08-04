package Inventory;


import Inventory.Game.Game;

public interface IInventory {
    //List<Game>

    void addGame(Game g);
    void deleteGame(int index);
    void showGame(int index);
    void showList();
}

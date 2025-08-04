package Inventory.Game;

public class Game implements IGame{
    private String name;
    private String genre;
    private double price;

    /*-------------------- Getters and Setters --------------------*/

    /*--- Name ---*/
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /*--- Genre ---*/
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /*--- Price ---*/
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    /*-------------------- Methods --------------------*/
    @Override
    public void showDetails() {
        System.out.printf(
                """
                Name: %s
                Genre: %s
                Price: %.2f
                """,name, genre, price
        );
    }
}

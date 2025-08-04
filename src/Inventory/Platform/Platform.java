package Inventory.Platform;

public class Platform implements IPlatform{
    private String name;
    private String company;


    /*-------------------- Getters and Setters --------------------*/

    /*--- Name ---*/
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /*--- Company ---*/
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    /*-------------------- Methods --------------------*/
    @Override
    public void showPlatform() {
        System.out.printf(
        """
        Platform: %s
        Company: %s
        """,name,company
        );

    }
}

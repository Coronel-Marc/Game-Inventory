package Inventory.Platform;

public class Platform implements IPlatform{
    private String platform;
    private String company;


    /*-------------------- Getters and Setters --------------------*/

    /*--- Name ---*/
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
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
        """, platform,company
        );

    }
}

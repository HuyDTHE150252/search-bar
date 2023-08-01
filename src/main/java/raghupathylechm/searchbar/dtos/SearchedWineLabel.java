package raghupathylechm.searchbar.dtos;


public class SearchedWineLabel {
    private Integer id;
    private String wine_name;
    private String brand_name;
    private String bottle_information;

    public SearchedWineLabel(Integer id, String wineName, String brandName, String bottleInformation) {
        this.id = id;
        this.wine_name = wineName;
        this.brand_name = brandName;
        this.bottle_information = bottleInformation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWine_name() {
        return wine_name;
    }

    public void setWine_name(String wine_name) {
        this.wine_name = wine_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getBottle_information() {
        return bottle_information;
    }

    public void setBottle_information(String bottle_information) {
        this.bottle_information = bottle_information;
    }
}

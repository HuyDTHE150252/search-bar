package raghupathylechm.searchbar.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
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
}

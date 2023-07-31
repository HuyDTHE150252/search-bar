package raghupathylechm.searchbar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raghupathylechm.searchbar.dtos.SearchedWineLabel;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {
    @Autowired
    private WineLabelService _wineLabelService;
    private String lowerCaseKeyWord;

    public List<SearchedWineLabel> searchedWineLabels(String[] keyWords) {
        List<SearchedWineLabel> output = new ArrayList<>();
        for (String keyWord : keyWords) {
            String lowerCaseKeyWord = keyWord.toLowerCase();
            output = _wineLabelService.getAll()
                    .stream()
                    .filter(wine -> wine.getWine_name().toLowerCase().contains(lowerCaseKeyWord)
                            || wine.getBrand_name().toLowerCase().contains(lowerCaseKeyWord)
                            || wine.getAlcohol_content().toString().toLowerCase().contains(lowerCaseKeyWord)
                            || wine.getBottle_information().toLowerCase().contains(lowerCaseKeyWord)
                            || wine.getImporter_information().toLowerCase().contains(lowerCaseKeyWord)
                            || wine.getGrape_variety().toLowerCase().contains(lowerCaseKeyWord)
                            || wine.getModel_name().toLowerCase().contains(lowerCaseKeyWord)
                            || wine.getRegion_of_production().toLowerCase().contains(lowerCaseKeyWord)
                            || wine.getQuantity().toString().toLowerCase().equals(lowerCaseKeyWord)
                            || wine.getVintage().toString().toLowerCase().equals(lowerCaseKeyWord)
                            || wine.getInboundList().getT_cartons().toString().toLowerCase().contains(lowerCaseKeyWord)
                            || wine.getInboundList().getPermit_no().toLowerCase().contains(lowerCaseKeyWord)
                            || wine.getInboundList().getT_quantity().toString().toLowerCase().contains(lowerCaseKeyWord)
                            || wine.getInboundList().getImporter().toLowerCase().contains(lowerCaseKeyWord)
                            || wine.getInboundList().getHandling_agent().toLowerCase().contains(lowerCaseKeyWord)
                            || wine.getInboundList().getExporter().toLowerCase().contains(lowerCaseKeyWord)
                            && wine.getInboundList().getStatus_completed()
                            && wine.getStatus_completed()
                    )
                    .map(wine -> {
                        return new SearchedWineLabel(wine.getId(), wine.getWine_name(), wine.getBrand_name(), wine.getBottle_information());
                    })
                    .toList();
        }
        return output;
    }
}

package raghupathylechm.searchbar.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import raghupathylechm.searchbar.dtos.SearchedWineLabel;
import raghupathylechm.searchbar.entities.InboundList;
import raghupathylechm.searchbar.services.InboundListService;
import raghupathylechm.searchbar.services.SearchService;

import java.util.ArrayList;
import java.util.List;

@RestController("/")
@RequestMapping("/api/search")
public class SearchController {
    @Autowired
    private SearchService _searchService;
    @GetMapping("")
    public ResponseEntity<List<SearchedWineLabel>> getWineLabels(@RequestParam(name = "q", defaultValue = "") String keyWords){
        System.out.println("log: " +keyWords);
        return ResponseEntity.status(HttpStatus.OK).body(_searchService.searchedWineLabels(keyWords.split(" ")));
    }
}

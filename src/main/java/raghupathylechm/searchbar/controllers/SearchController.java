package raghupathylechm.searchbar.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/")
@RequestMapping("/api/search")
public class SearchController {
    @GetMapping("")
    public List<String> getItems(@RequestParam(name = "q") String keyWord){
        return new ArrayList<>();
    }
}

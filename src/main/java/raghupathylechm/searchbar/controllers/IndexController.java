package raghupathylechm.searchbar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import raghupathylechm.searchbar.dtos.WineLabelAndRelatedInBound;
import raghupathylechm.searchbar.services.InboundListService;
import raghupathylechm.searchbar.services.WineLabelService;

@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    private WineLabelService _wineLabelService;

    @Autowired
    private InboundListService _inboundListService;

    @GetMapping
    public String getIndex() {
        return "/index";
    }

    @GetMapping("/{id}")
    public String getDetail(@PathVariable Integer id, Model model) {
        WineLabelAndRelatedInBound data = new WineLabelAndRelatedInBound();
        data.wineLabel = _wineLabelService.getById(id);
        data.relatedInBound = _wineLabelService.getAll().stream().filter(w -> w.getInboundList().getId() == data.wineLabel.getInboundList().getId()).toList();
        model.addAttribute("data", data);
        return "/detail";
    }
}

package raghupathylechm.searchbar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raghupathylechm.searchbar.entities.WineLabel;
import raghupathylechm.searchbar.repository.WineLabelRepo;

import java.util.List;

@Service
public class WineLabelService {
    @Autowired
    private WineLabelRepo _wineLabelRepo;

    public List<WineLabel> getAll() {
        return _wineLabelRepo.findAll();
    }

    public WineLabel getById(Integer id) {
        return _wineLabelRepo.findById(id).orElse(new WineLabel());
    }
}

package raghupathylechm.searchbar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raghupathylechm.searchbar.entities.InboundList;
import raghupathylechm.searchbar.repository.InboundListRepo;

import java.util.List;

@Service
public class InboundListService {
    @Autowired
    private InboundListRepo _inboundListRepo;

    public List<InboundList> getAll(){
        return _inboundListRepo.findAll();
    }
}

package raghupathylechm.searchbar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raghupathylechm.searchbar.repository.InboundListRepo;

@Service
public class InboundListService {
    @Autowired
    private InboundListRepo _inboundListRepo;

    
}

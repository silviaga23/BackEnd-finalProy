package cr.brainstation.store.services;

import cr.brainstation.store.models.Purchase;
import cr.brainstation.store.repository.IPurchaseRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class PurchseServiceImp implements PurchaseService {


    private IPurchaseRepository purchaseRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Purchase create(Purchase purchase) {

        return new Purchase();
    }
}

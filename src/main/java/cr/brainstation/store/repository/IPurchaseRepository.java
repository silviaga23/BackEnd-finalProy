package cr.brainstation.store.repository;

import cr.brainstation.store.dto.PurchaseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPurchaseRepository extends JpaRepository<PurchaseDTO, Integer> {
}

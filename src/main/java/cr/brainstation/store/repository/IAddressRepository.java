package cr.brainstation.store.repository;

import cr.brainstation.store.dto.AddressDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<AddressDTO, Integer> {
}

package cr.brainstation.store.repository;

import cr.brainstation.store.dto.PaymentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaymentRepository extends JpaRepository<PaymentDTO, Integer> {
}

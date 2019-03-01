package cr.brainstation.store.repository;

import cr.brainstation.store.dto.UserDTO;
import cr.brainstation.store.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserDTO, Integer> {

    public UserDTO findByEmail (String email);



}

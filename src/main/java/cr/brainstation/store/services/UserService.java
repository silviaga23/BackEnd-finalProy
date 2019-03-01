package cr.brainstation.store.services;

import cr.brainstation.store.dto.PurchaseDTO;
import cr.brainstation.store.dto.UserDTO;
import cr.brainstation.store.models.Purchase;
import cr.brainstation.store.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User create(User user);
    Optional<UserDTO> findById(Integer id);
    Optional<UserDTO> update(UserDTO user);
    boolean delete(Integer userId);
    List<User> getUserList();
    Integer getUserIndex(Integer userId);
    User login(User user);
    Purchase purchase(User user);
}

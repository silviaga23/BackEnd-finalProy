package cr.brainstation.store.controllers;

import cr.brainstation.store.dto.PurchaseDTO;
import cr.brainstation.store.dto.UserDTO;
import cr.brainstation.store.models.Purchase;
import cr.brainstation.store.models.User;
import cr.brainstation.store.services.UserService;
import cr.brainstation.store.services.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/register")
    public ResponseEntity<User> create(@RequestBody User user) {

        return new ResponseEntity<>(this.service.create(user), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody User user) {

        return new ResponseEntity<>(this.service.login(user), HttpStatus.OK);
    }

    @PostMapping("/purchase")
    public ResponseEntity<Purchase> purchase(@RequestBody User user){
        return new ResponseEntity<>(this.service.purchase(user),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(this.service.getUserList(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<UserDTO> update(@RequestBody UserDTO user) {
        Optional<UserDTO> updateUser = this.service.update(user);
        return updateUser.isPresent() ? new ResponseEntity<>(updateUser.get(), HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getById(@PathVariable Integer id) {
        return this.service.getUserIndex(id) != -1  ? new ResponseEntity(this.service.findById(id), HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser (@PathVariable Integer id){
        return this.service.delete(id) ? new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}

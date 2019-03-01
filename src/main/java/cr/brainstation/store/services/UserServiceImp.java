package cr.brainstation.store.services;

import cr.brainstation.store.dto.*;
import cr.brainstation.store.models.*;
import cr.brainstation.store.repository.IAddressRepository;
import cr.brainstation.store.repository.IPaymentRepository;
import cr.brainstation.store.repository.IPurchaseRepository;
import cr.brainstation.store.repository.IUserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Type;
import java.util.*;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private IPurchaseRepository purchaseRepository;
    @Autowired
    private IAddressRepository addressRepository;
    @Autowired
    private IPaymentRepository paymentRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public User create(User user) {

        UserDTO dtoUser = modelMapper.map(user, UserDTO.class);

        if(!dtoUser.getEmail().equals("") && !ifExists(dtoUser)){

            UserDTO dtoResult = userRepository.save(dtoUser);

            User userModel = modelMapper.map(dtoResult, User.class);
            return userModel;
        }else{
            return null;
        }
    }

    private boolean ifExists(UserDTO user){
        System.out.println(user.getEmail());
        UserDTO ifExists = userRepository.findByEmail(user.getEmail());
        System.out.println(ifExists);
        if(ifExists != null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Optional<UserDTO> findById(Integer id) {
        if(getUserList().get(getUserIndex(id)) != null){
            return this.userRepository.findById(id);
        }
        return Optional.empty();
    }

    @Override
    public Optional<UserDTO> update(UserDTO user) {
        Optional<UserDTO> userData = this.userRepository.findById(user.getId());

        if(userData.isPresent()){
            UserDTO userDTO = userData.get();

            userDTO.setName(user.getName());

            return Optional.of(this.userRepository.save(userDTO));
        }
        return userData;
    }

    @Override
    public boolean delete(Integer userId) {
        int index = getUserIndex(userId);
        if(index != -1 ){
            userRepository.deleteById(userId);
            return true;
        }
        return false;
    }

    @Override
    public List<User> getUserList() {

        Type listType = new TypeToken<List<User>>() {}.getType();
        List<UserDTO> list = userRepository.findAll();
        List<User> listProduct = modelMapper.map(list, listType);
        list.size();
        return listProduct;

    }

    @Override
    public Integer getUserIndex(Integer userId) {
        int index = -1;

        for (int i = 0; i < getUserList().size(); i++) {
            if (getUserList().get(i).getEmail().equals(userId)) {
                index = i;
            }
        }
        return index;
    }
    @Override
    public User login(User user) {

        UserDTO dtoUser = modelMapper.map(user, UserDTO.class);

        UserDTO dtoResult = userRepository.findByEmail(dtoUser.getEmail());

        if(dtoResult != null){

            String pass = dtoResult.getPassword();
            if( user.getPassword().equals(pass) ) {
                User userModel = modelMapper.map(dtoResult, User.class);
                return userModel;
            }else{
                return null;
            }
        }else{
            return null;
        }
    }
    @Override
    public Purchase purchase(User user) {

        // test purchase
        Address address = new Address();
        Payment payment = new Payment();

        //obtain user from db
        UserDTO dtoUser = modelMapper.map(user, UserDTO.class);
        UserDTO dtoUserResult = userRepository.findByEmail(dtoUser.getEmail());

        //obtein purchase for request and create a new one
        Purchase newPurchase = new Purchase();
        for (Purchase purchase : user.getListPurchases()) {
            newPurchase = purchase;
        }
        //set address and payment
        address = newPurchase.getAddress();
        //set payment
        payment= newPurchase.getPayment();
        //conver adress to dto
        AddressDTO dtoAdress = modelMapper.map(address, AddressDTO.class);
        //convert payment to dto
        PaymentDTO dtoPayment = modelMapper.map(payment,PaymentDTO.class);
        //set user
        dtoAdress.setUserAd(dtoUserResult);
        dtoPayment.setUser(dtoUserResult);
        //save dto en bd
        AddressDTO dtoResultAd = addressRepository.save(dtoAdress);
        PaymentDTO dtoResultPayment = paymentRepository.save(dtoPayment);

        PurchaseDTO pur = new PurchaseDTO(newPurchase.getDate(),newPurchase.getAmount(),dtoUserResult , dtoResultAd,dtoResultPayment);
        PurchaseDTO purDb = purchaseRepository.save(pur);

        List<ProductPurchaseDTO> listP = new ArrayList<>();

       for (ProductPurchase productP : newPurchase.getProductPurchase()) {

            ProductDTO dtoProduct = modelMapper.map(productP.getProduct(),ProductDTO.class);
            ProductPurchaseDTO newP = new ProductPurchaseDTO(productP.getQuantity(),dtoProduct,purDb);

            listP.add(newP);
        }

       PurchaseDTO purchase = new PurchaseDTO(newPurchase.getDate(),newPurchase.getAmount(),dtoUserResult,listP,dtoResultAd,dtoResultPayment);
       PurchaseDTO purchasedb = purchaseRepository.save(purchase);
       Purchase purchaseModel = modelMapper.map(purchasedb, Purchase.class);

        return purchaseModel;

    }

}

package cr.brainstation.store.dto;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Payment")
public class PaymentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String titularName;
    @Column(nullable = false)
    private int numberCard;
    @Column(nullable = false)
    private Date expirationDate;
    @Column(nullable = false)
    private int securityCode;
    @Column(nullable = false)
    private String type;
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private UserDTO user;

    public PaymentDTO(){
        super();
    }

    public PaymentDTO(String titularName, int numberCard, Date expirationDate, int securityCode, String type, UserDTO user) {
        this.titularName = titularName;
        this.numberCard = numberCard;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.type = type;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitularName() {
        return titularName;
    }

    public void setTitularName(String titularName) {
        this.titularName = titularName;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}

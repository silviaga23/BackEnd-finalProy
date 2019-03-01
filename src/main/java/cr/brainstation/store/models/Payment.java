package cr.brainstation.store.models;

import javax.validation.constraints.NotNull;
import java.util.Date;


public class Payment {

    private int id;
    @NotNull
    private String titularName;
    @NotNull
    private int numberCard;
    @NotNull
    private Date expirationDate;
    @NotNull
    private int securityCode;
    @NotNull
    private String type;
    @NotNull
    private User user;

    public Payment(){
        super();
    }

    public Payment(@NotNull String titularName, @NotNull String type, @NotNull int numberCard, @NotNull Date expirationDate, @NotNull int securityCode, @NotNull User user) {
        this.titularName = titularName;
        this.numberCard = numberCard;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.user = user;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getTitularName() {
        return titularName;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitularName(String titularName) {
        this.titularName = titularName;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

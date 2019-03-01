package cr.brainstation.store.dto;

import javax.persistence.*;

@Entity
@Table(name = "Payments_Type")
public class PaymentTypeDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String name;

    public PaymentTypeDTO(){
        super();
    }

    public PaymentTypeDTO(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package cr.brainstation.store.models;

import javax.validation.constraints.NotNull;

public class PaymentType {

    private int id;
    @NotNull
    private String name;

    public PaymentType(){
        super();
    }

    public PaymentType(int id, @NotNull String name) {
        this.id = id;
        this.name = name;
    }

    public PaymentType(@NotNull String name) {
        this.id = id;
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

package edu.mcc.codeschool.resttemplates.model.external;

public class Ingredient {
    private String name;
    private Amount amount;

    public String getName() {
        return name;
    }

    public Ingredient setName(String name) {
        this.name = name;
        return this;
    }

    public Amount getAmount() {
        return amount;
    }

    public Ingredient setAmount(Amount amount) {
        this.amount = amount;
        return this;
    }
}

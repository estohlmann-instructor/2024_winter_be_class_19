package edu.mcc.codeschool.resttemplates.model.external;

import java.util.List;

public class Ingredients {
    private List<Ingredient> malt;
    private List<Ingredient> hops;

    private String yeats;

    public List<Ingredient> getMalt() {
        return malt;
    }

    public Ingredients setMalt(List<Ingredient> malt) {
        this.malt = malt;
        return this;
    }

    public List<Ingredient> getHops() {
        return hops;
    }

    public Ingredients setHops(List<Ingredient> hops) {
        this.hops = hops;
        return this;
    }

    public String getYeats() {
        return yeats;
    }

    public Ingredients setYeats(String yeats) {
        this.yeats = yeats;
        return this;
    }
}

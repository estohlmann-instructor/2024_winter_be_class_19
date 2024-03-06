package edu.mcc.codeschool.resttemplates.model.external;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Method {
    private List<CookTime> mashTemp;

    private Fermentation fermentation;
    private String twist;

    public List<CookTime> getMashTemp() {
        return mashTemp;
    }

    public Method setMashTemp(List<CookTime> mashTemp) {
        this.mashTemp = mashTemp;
        return this;
    }

    public Fermentation getFermentation() {
        return fermentation;
    }

    public Method setFermentation(Fermentation fermentation) {
        this.fermentation = fermentation;
        return this;
    }

    public String getTwist() {
        return twist;
    }

    public Method setTwist(String twist) {
        this.twist = twist;
        return this;
    }
}

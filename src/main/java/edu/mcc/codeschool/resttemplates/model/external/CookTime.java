package edu.mcc.codeschool.resttemplates.model.external;

public class CookTime {
    Amount temp;
    Integer duration;

    public Amount getTemp() {
        return temp;
    }

    public CookTime setTemp(Amount temp) {
        this.temp = temp;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public CookTime setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
}

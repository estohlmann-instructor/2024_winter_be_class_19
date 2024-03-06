package edu.mcc.codeschool.resttemplates.model.external;

public class Amount {
    private Integer value;
    private String unit;

    public Integer getValue() {
        return value;
    }

    public Amount setValue(Integer value) {
        this.value = value;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public Amount setUnit(String unit) {
        this.unit = unit;
        return this;
    }
}

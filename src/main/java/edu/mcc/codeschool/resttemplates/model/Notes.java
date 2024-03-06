package edu.mcc.codeschool.resttemplates.model;

public class Notes {
    private String tips;
    private String contribution;
    private String mappedBy;

    public String getTips() {
        return tips;
    }

    public Notes setTips(String tips) {
        this.tips = tips;
        return this;
    }

    public String getContribution() {
        return contribution;
    }

    public Notes setContribution(String contribution) {
        this.contribution = contribution;
        return this;
    }

    public String getMappedBy() {
        return mappedBy;
    }

    public Notes setMappedBy(String mappedBy) {
        this.mappedBy = mappedBy;
        return this;
    }
}

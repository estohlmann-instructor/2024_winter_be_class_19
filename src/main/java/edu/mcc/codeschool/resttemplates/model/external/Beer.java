package edu.mcc.codeschool.resttemplates.model.external;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Beer {
    private Integer id;
    private String name;

    private String tagline;

    private String firstBrewed;
    private String description;
    private String imageUrl;
    private Double abv;
    private Integer ibu;
    private Amount volume;
    private Amount boilVolume;

    private Method method;
    private Ingredients ingredients;

    private List<String> foodPairing;
    private String brewersTips;
    private String contributedBy;

    public Integer getId() {
        return id;
    }

    public Beer setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Beer setName(String name) {
        this.name = name;
        return this;
    }

    public String getTagline() {
        return tagline;
    }

    public Beer setTagline(String tagline) {
        this.tagline = tagline;
        return this;
    }

    public String getFirstBrewed() {
        return firstBrewed;
    }

    public Beer setFirstBrewed(String firstBrewed) {
        this.firstBrewed = firstBrewed;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Beer setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Beer setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Double getAbv() {
        return abv;
    }

    public Beer setAbv(Double abv) {
        this.abv = abv;
        return this;
    }

    public Integer getIbu() {
        return ibu;
    }

    public Beer setIbu(Integer ibu) {
        this.ibu = ibu;
        return this;
    }

    public Amount getVolume() {
        return volume;
    }

    public Beer setVolume(Amount volume) {
        this.volume = volume;
        return this;
    }

    public Amount getBoilVolume() {
        return boilVolume;
    }

    public Beer setBoilVolume(Amount boilVolume) {
        this.boilVolume = boilVolume;
        return this;
    }

    public Method getMethod() {
        return method;
    }

    public Beer setMethod(Method method) {
        this.method = method;
        return this;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public Beer setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public List<String> getFoodPairing() {
        return foodPairing;
    }

    public Beer setFoodPairing(List<String> foodPairing) {
        this.foodPairing = foodPairing;
        return this;
    }

    public String getBrewersTips() {
        return brewersTips;
    }

    public Beer setBrewersTips(String brewersTips) {
        this.brewersTips = brewersTips;
        return this;
    }

    public String getContributedBy() {
        return contributedBy;
    }

    public Beer setContributedBy(String contributedBy) {
        this.contributedBy = contributedBy;
        return this;
    }
}

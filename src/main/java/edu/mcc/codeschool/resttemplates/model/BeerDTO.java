package edu.mcc.codeschool.resttemplates.model;

import java.util.UUID;

public class BeerDTO {
    private Integer id;
    private UUID myNewId;
    private String name;
    private String firstBrewed;

    private String description;
    private String imageUrl;
    private String alcoholByVolume;

    private Integer volume;

    private Notes notes;

    public Integer getId() {
        return id;
    }

    public BeerDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public UUID getMyNewId() {
        return myNewId;
    }

    public BeerDTO setMyNewId(UUID myNewId) {
        this.myNewId = myNewId;
        return this;
    }

    public String getName() {
        return name;
    }

    public BeerDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getFirstBrewed() {
        return firstBrewed;
    }

    public BeerDTO setFirstBrewed(String firstBrewed) {
        this.firstBrewed = firstBrewed;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BeerDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public BeerDTO setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getAlcoholByVolume() {
        return alcoholByVolume;
    }

    public BeerDTO setAlcoholByVolume(String alcoholByVolume) {
        this.alcoholByVolume = alcoholByVolume;
        return this;
    }

    public Integer getVolume() {
        return volume;
    }

    public BeerDTO setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    public Notes getNotes() {
        return notes;
    }

    public BeerDTO setNotes(Notes notes) {
        this.notes = notes;
        return this;
    }
}

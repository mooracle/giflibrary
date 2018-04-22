package com.mooracle.giflibrary.model;

import java.time.LocalDate;

public class Gif {
    /** ENTRY 10: Modelling Data with POJOs
     *  1.  One of the most powerful feature in Spring is the ability to use Plain Old Java Object to control the
     *      application. Since POJO is coded for its natural functionality not for the specific framework in which it
     *      will be used, the content of POJO class will be just like any other common Java class with constructor,
     *      getter, and setter, etc.
     *  2.  In this ENTRY 10 we will use POJO to model (to define or to describe) how a Gif as a data should be like
     *      and should behave. Just like any other POJO, Gif.java with have all the attributes inside parameters and
     *      fields and also behaviors in its methods. This Gif.java POJO will be attached to each gif images
     *      uploaded inside the gifs directory
     *      NOTE: since it is new schema uploaded the coding and naming mught slightly different
     *  3.  Inside class Gif put all necessary attributes into declared fields and constructor
     *  4.  Create getter and Setter for all variables (fields)
     *
     *  NEXT: ENTRY 11: Feeding Data to Our Thymeleaf Templates
     *  GOTO: GifController.java for ENTRY 11!
     *  */

    //10-3: attribute fields declaration and constructor
    private String name;
    private LocalDate dateUploaded;
    private String username;
    private boolean favorite;

    public Gif(String name, LocalDate dateUploaded, String username, boolean favorite) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
    }

    //10-4: getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}

package com.example.animehub;

public class Anime {

    String title;
    String character;
    String power;

    public Anime(String title, String character, String power) {
        this.title = title;
        this.character = character;
        this.power = power;
    }

    public String getTitle() {
        return title;
    }

    public String getCharacter() {
        return character;
    }

    public String getPower() {
        return power;
    }
}
package com.example.animehub;

public class Anime {

    private String title;
    private String imageUrl;
    private double score;
    private int episodes;
    private String synopsis;

    public Anime(String title, String imageUrl, double score, int episodes, String synopsis) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.score = score;
        this.episodes = episodes;
        this.synopsis = synopsis;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public double getScore() {
        return score;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getSynopsis() {
        return synopsis;
    }
}
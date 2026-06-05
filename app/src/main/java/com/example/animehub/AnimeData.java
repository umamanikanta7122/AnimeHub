package com.example.animehub;

public class AnimeData {

    private String title;
    private double score;
    private int episodes;
    private String synopsis;
    private Images images;

    public String getTitle() {
        return title;
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

    public Images getImages() {

        return images;
    }

    public static class Images {
        public String getImageUrl() {
            return jpg.image_url;
        }
        private Jpg jpg;

        public Jpg getJpg() {
            return jpg;
        }
    }

    public static class Jpg {
        private String image_url;

        public String getImageUrl() {
            return image_url;
        }
    }
}
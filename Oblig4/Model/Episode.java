package no.hiof.no.joakimga.Oblig4.Model;

import java.time.LocalDate;

public class Episode extends Production implements Comparable<Episode>{
   private int episodeNumber;
   private int season;

    public Episode(int episodeNumber, int season,String title, int playTime) {
        super(title, playTime);
        this.episodeNumber = episodeNumber;
        this.season = season;

    }
    public Episode(int episodeNumber, int season, String title) {
        super(title,0);
        this.episodeNumber = episodeNumber;
        this.season = season;
    }
    public Episode(int episodeNumber, int season, String title, int playTime, LocalDate releaseDate,String description){
        super(title, playTime, releaseDate, description);
        this.episodeNumber = episodeNumber;
        this.season = season;
    }





    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }


    @Override
    public String toString() {
        return "Episode nr: " + episodeNumber + ". Sesong: " + season + ". Tittel: " + super.getTitle() + ". Spilletid: " + super.getPlayTime();
    }

    @Override
    public int compareTo(Episode episode) {
        if (this.season < episode.season){
            return -1;
        }
        else if (this.season >episode.season){
            return 1;
        }
        else if (this.getEpisodeNumber() < episode.episodeNumber){
            return -1;
        }
        else if (this.getEpisodeNumber() < episode.episodeNumber){
            return 1;
        }
        return 0;
    }
}


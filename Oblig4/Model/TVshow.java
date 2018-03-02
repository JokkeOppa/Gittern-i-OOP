package no.hiof.no.joakimga.Oblig4.Model;

import java.time.LocalDate;
import java.util.ArrayList;


public class TVshow implements Comparable<TVshow>{
    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodesList = new ArrayList<>();
    private float averagePlaytime;

    public ArrayList<Episode> getEpisodesList() {
        return episodesList;
    }

    private int numberOfSeasons;
    private static ArrayList<TVshow> tvShowList = new ArrayList<>();

    public static ArrayList<TVshow> getTvShowList() {
        return tvShowList;
    }

    @Override
     public int compareTo(TVshow show) {
        int compare = this.getTitle().compareTo(show.getTitle());
        if (compare < 0) {
             return -1;

        }
        else if (compare > 0){
             return 1;
        }
        return 0;
     }

    public ArrayList<Role> getCast()
    {
        ArrayList<Role> listsCast = new ArrayList<>();
        for(Episode e : episodesList){
            for (Role b : e.getRoleList()) {
                listsCast.add(b);
            }
        }
        return listsCast;
    }

    public TVshow(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.tvShowList.add(this);
    }
    public void addEpisode(Episode episodesList){

        if(episodesList.getSeason() > numberOfSeasons + 1){
            System.out.println("FEIL!!!!");
        }
        else {
            this.episodesList.add(episodesList);
            if (episodesList.getSeason() > numberOfSeasons)
                numberOfSeasons = episodesList.getSeason();
        }
        updateAveragePlaytime();
    }
    public void getSeason(int season){
        for(Episode test : episodesList){
            if(test.getSeason() == season)
                System.out.println(test);
        }

    }
    private void updateAveragePlaytime(){
        float playtimeSummed = 0;

        for(Episode x : episodesList){
            playtimeSummed += x.getPlayTime();
        }
        averagePlaytime = playtimeSummed / episodesList.size();

    }

    public float getAveragePlaytime(){
        return averagePlaytime;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
    public ArrayList getEpisodes() {
        return episodesList;
    }
    public void setEpisodes(ArrayList episodesList) {
        this.episodesList = episodesList;
    }

    @Override
    public String toString() {
        return "Tittel: " + title + ". Description " + description + ". Release Date: " + releaseDate;
    }






}

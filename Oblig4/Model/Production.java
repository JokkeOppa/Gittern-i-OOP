package no.hiof.no.joakimga.Oblig4.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Production {
    private String title;
    private int playTime;
    private LocalDate releaseDate;
    private String description;
    private Person director;
    private ArrayList<Role> roleList = new ArrayList<>();


    public Production(){

    }
    public Production(String title, int playTime) {
        this.title = title;
        this.playTime = playTime;
    }
    public Production(String title, int playTime, LocalDate releaseDate, String description){
        this.title = title;
        this.playTime = playTime;
        this.releaseDate = releaseDate;
        this.description = description;
        
    }
    public void addARole(Role role){
        roleList.add(role);
    }
    public void addARoleList(ArrayList<Role> role){
        roleList.addAll(role);
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPlayTime() {
        return playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }
    public ArrayList<Role> getRoleList() {
        return roleList;
    }

    @Override
    public String toString() {
        return "Film: " + getTitle() + " sjanger: " + getDescription() + getPlayTime() + getReleaseDate() + "\n" + "Direktør: " + getDirector() + getRoleList();
    }
}

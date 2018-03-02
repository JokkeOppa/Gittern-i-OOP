package no.hiof.no.joakimga.Oblig4;


import no.hiof.no.joakimga.Oblig4.Model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        LocalDate dSuits = LocalDate.parse("1990-05-11");
        LocalDate dDeadpool2 = LocalDate.parse("2017-04-12");
        LocalDate dBlackPanther = LocalDate.parse("2017-02-14");
        LocalDate dAvengers = LocalDate.parse("2017-09-15");

        TVshow suits = new TVshow("suits", "Action", dSuits);
        TVshow jaha = new TVshow("jaha","ok", dSuits);
        TVshow aaa = new TVshow("aaaa","dat good shit", dSuits);

        Movie Gudfather = new Movie("gudfather",66,dSuits,"bra");

        Episode en = new Episode(2, 5, "First Episode", 90);

        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 20; j++){
                suits.addEpisode(new Episode(j,i,"ep"+j,new Random().nextInt(10+1)+20));

            }
        }
        //Oppgave 4:
        Movie Deadpool2 = new Movie("Deadpool 2",200,dDeadpool2,"Action komedie, very fun");
        Movie blackpanther = new Movie("Black Panther", 170, dBlackPanther,"Action, marvel");
        Movie Avengers = new Movie("Avengers Infinity Wars",220,dAvengers,"Action, marvel, heroes");

        //Oppgave 6
        Person director1 = new Person("Tom","Heine");
        Person director2 = new Person("haha", "hehe");
        Person director3 = new Person("episode","Direktør");

        Deadpool2.setDirector(director1);
        blackpanther.setDirector(director2);
        en.setDirector(director3);

        //Oppgave 7
        Person skuespiller1 = new Person("David", "Nek");
        Person skuespiller2 = new Person("Ola", "Petersen");
        Person skuespiller3 = new Person("Joakim","Gabrielsen");

        Role stautKar = new Role("Hubba", "Bubba",skuespiller2);
        Role skadetKar = new Role("Forrest","Gump",skuespiller1);
        Role test3 = new Role("yup", "navn", skuespiller3);

        en.addARole(skadetKar);
        en.addARole(stautKar);

        //legger til mange i en film
        ArrayList<Role> addmany = new ArrayList<>();
        addmany.add(skadetKar);
        addmany.add(stautKar);
        addmany.add(test3);
        blackpanther.addARoleList(addmany);

        //henter episodene til suits
        System.out.println(suits.getEpisodes());
        //henter informasjon om suits
        System.out.println(suits);
        System.out.println("*******************" + "\n");
        //Henter sesong 4:
        System.out.println("Sesong 4: " + "\n" );
        suits.getSeason(4);
        //Gjennomsnittlig spilletid
        System.out.println("**********************");
        System.out.println("Gjennomsnittlig spilletid:");
        System.out.println(suits.getAveragePlaytime());
        //Tester å legge til episode i sesong 7, blir ikke lagt til.
        System.out.println("********************");
        suits.addEpisode(en);
        System.out.println("Totalt antall sesonger: " + suits.getNumberOfSeasons());
        System.out.println("**********************");
        //OBLIG 3 UNDER HER
        System.out.println("Oppgave 4:");
        //Oppgave 4
        System.out.println("Filmer som vises: " + Deadpool2.getTitle()+ ", " + blackpanther.getTitle() +" og " + Avengers.getTitle()+".");
        System.out.println("****************");
        //Oppgave 6
        System.out.println("Oppgave 6:");
        System.out.println("Regissør for " + Deadpool2.getTitle() + " er " + Deadpool2.getDirector());
        System.out.println("Regissør for " + blackpanther.getTitle() + " er " +blackpanther.getDirector());
        System.out.println("Regissør for " + en.getTitle() + " er " + en.getDirector());
        //Oppgave 7
        System.out.println("**************************");
        System.out.println("Oppgave 7:");
        System.out.println(en.getRoleList());
        System.out.println("Black Panther sin rolle liste:");
        System.out.println(blackpanther.getRoleList());
        //Oppgave 9:
        System.out.println("***********************");
        System.out.println("Oppgave 9:");
        System.out.println(suits.getCast());

        //Oblig 4
        System.out.println("Oppgave 4: TVSERIER");
        ArrayList<TVshow> testtest = TVshow.getTvShowList();
        System.out.println(testtest);
        System.out.println("*************SORTERT LISTE****************************");
        Collections.sort(testtest);
        System.out.println(testtest);

        System.out.println("EPISODER:");
        Collections.sort(suits.getEpisodesList());
        System.out.println(suits.getEpisodesList());

        System.out.println("FILMER:");
        ArrayList<Movie> showArray = Movie.getMovieArray();
        System.out.println(showArray);
        Collections.sort(showArray);
        System.out.println("***********SORTERT LISTE**********************");
        System.out.println(showArray);













    }
}

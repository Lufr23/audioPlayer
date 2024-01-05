package br.com.alura.audioPlayer.musics;

import br.com.alura.audioPlayer.display.Display;

public class Audio  {
    private String title;
    private String duration;
    private int totalReproduction;
    private int classification;
    private int likes;

    public void liked(){
        this.likes++;
    }

    public void reproduce(){
        this.totalReproduction++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public int getTotalReproduction() {
        return totalReproduction;
    }

    public double getClassification() {
        return classification;
    }

    public int getLikes() {
        return likes;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


}

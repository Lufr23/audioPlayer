package br.com.alura.audioPlayer.musics;

import br.com.alura.audioPlayer.display.Display;

public class Podcast extends Audio implements Display {

    private String presenter;
    private String description;
    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void display() {
        System.out.println("Presenter: "+ getPresenter());
        System.out.println("Description "+ getDescription());
        System.out.println(getTitle());
        System.out.println(getDuration());
        System.out.println("Likes: "+getLikes());
        System.out.println("Total Reproduction: "+ getTotalReproduction()+"\n");
    }

    @Override
    public double getClassification(){
        if(getTotalReproduction()>1000){
            return 10;
        }else{
            return 7;
        }
    }
}

package br.com.alura.audioPlayer.musics;

import br.com.alura.audioPlayer.display.Display;

public class Music extends Audio implements Display {
    private String album;
    private String singer;
    private String gender;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void display() {
        System.out.println("Album: "+ getAlbum());
        System.out.println("Singer: "+ getSinger());
        System.out.println(getTitle());
        System.out.println(getDuration());
        System.out.println("Gender: "+ getGender());
        System.out.println("Likes: "+getLikes());
        System.out.println("Total Reproduction: "+ getTotalReproduction()+"\n");
    }
    @Override
    public double getClassification(){
        if (getTotalReproduction()>2000){
            return 8;
        }else {
            return 6;
        }
    }

}

package br.com.alura.audioPlayer.display;

import br.com.alura.audioPlayer.musics.Audio;

public class MyFavorites {
    public void includes(Audio audio){
        if(audio.getClassification()>9){
            System.out.println(audio.getTitle()+" It's among the most played! Your favorite is also the crowd's favorite!");
        }else{
            System.out.println(audio.getTitle()+" It's a good sound, put it on your favorites list and watch it become a hit!");
        }
    }
}

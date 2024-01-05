import br.com.alura.audioPlayer.display.MyFavorites;
import br.com.alura.audioPlayer.musics.Music;
import br.com.alura.audioPlayer.musics.Podcast;


public class Main {
    public static void main(String[] args) {

        Music summerTime = new Music();
        summerTime.setTitle("Summertime sadness");
        summerTime.setAlbum("Born to Die");
        summerTime.setSinger("Lana Del Rey");
        summerTime.setGender("Pop");
        summerTime.setDuration("4:25 minutes");

        for (int i = 0; i < 1000; i++) {
            summerTime.reproduce();
        }

        for (int i = 0; i < 50; i++) {
            summerTime.liked();
        }
        summerTime.display();

        Podcast psychologyInPractice = new Podcast();
        psychologyInPractice.setTitle("How to set healthy limits");
        psychologyInPractice.setPresenter("Alana Anijar");
        psychologyInPractice.setDescription("Topics about psychology");
        psychologyInPractice.setDuration("35:21 minutes");

        for (int i = 0; i < 1500; i++) {
            psychologyInPractice.reproduce();
        }

        for (int i = 0; i < 75; i++) {
            psychologyInPractice.liked();
        }
        psychologyInPractice.display();

        MyFavorites favorite = new MyFavorites();
        favorite.includes(summerTime);
        favorite.includes(psychologyInPractice);
    }
}
import java.util.ArrayList;
import java.util.List;

public class main
{
    public static void main(String[] args) {

        List<Song> allSongs = new ArrayList<Song>();
        Song song1 = new Song("Traitor", new Artist("Olivia Rodrigo"), new Album("Sour"), new Duration(3.50));
        Song song2 = new Song("Good 4 U", new Artist("Olivia Rodrigo"), new Album("Sour"), new Duration(2.59));
        Song song3 = new Song("Happier Than Ever", new Artist("Billie Eilish"), new Album("Happier Than Ever"), new Duration(4.59));
        Song song4 = new Song("Bad Habits", new Artist("Ed Sheeran"), new Album("Bad Habits"), new Duration(3.52));
        Song song5 = new Song("Painkiller", new Artist("Ruel"), new Album("Painkiller"), new Duration(3.34));

        allSongs.add(song1);
        allSongs.add(song2);
        allSongs.add(song3);
        allSongs.add(song4);
        allSongs.add(song5);

        List<PlayList> allPlayLists = new ArrayList<PlayList>();
        List<Song> songsInThePlayList = new ArrayList<Song>();
        songsInThePlayList.add(song2);
        PlayList playList1 = new PlayList("Olivia", songsInThePlayList);
        allPlayLists.add(playList1);

        JukeBox jukeBox = new JukeBox(allSongs, allPlayLists);

        if(Operation.print() == 1){
            jukeBox.playPlayList("Olivia");
        }

    }
}

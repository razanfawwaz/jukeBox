import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JukeBox
{
    List<Song> allSongs;
    List<PlayList> allPlayLists;
    Queue<Song> currentPlayQueue;

    public JukeBox(List<Song> allSongs,List<PlayList> allPlayLists) {
        this.allSongs = allSongs;
        this.allPlayLists = allPlayLists;
        currentPlayQueue = new LinkedList<Song>();
    }

    public Song selectSong(String songName){
        Song requiredSong = null;
        for(Song song : allSongs){
            if(song.getSongName().equals(songName)){
                requiredSong = song;
                break;
            }
        }
        if(requiredSong == null){
            throw new IllegalArgumentException("Sorry, song not available");
        }
        return requiredSong;
    }

    public void playSong(String songName){
        Song requiredSong = selectSong(songName);
        requiredSong.playSong();
    }

    public PlayList selectPlayList(String playListName){
        PlayList requiredPlayList = null;
        for(PlayList playList : allPlayLists){
            if(playList.getPlaylistName().equals(playListName)){
                requiredPlayList = playList;
            }
        }
        if(requiredPlayList == null){
            throw new IllegalArgumentException("Sorry, playlist not available");
        }
        return requiredPlayList;
    }

    public void playPlayList(String playListName){
        PlayList playList = selectPlayList(playListName);
        List<Song> allSongsInThePlayList = playList.getSongsInPlaylist();
        allSongsInThePlayList.get(0).playSong();

        Song currentSong;
        for(int i = 1; i < allSongsInThePlayList.size(); i++){
            currentSong = allSongsInThePlayList.get(i);
            currentPlayQueue.add(currentSong);
        }
    }
}

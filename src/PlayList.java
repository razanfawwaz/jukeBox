import java.util.List;
import java.lang.String;

public class PlayList
{
    String playlistName;
    List<Song> songsInPlaylist;

    public PlayList (String playlistName, List<Song> songsInPlaylist)
    {
        this.playlistName = playlistName;
        this.songsInPlaylist = songsInPlaylist;
    }

    public void addSong(Song song)
    {
        songsInPlaylist.add(song);
    }

    public String getPlaylistName()
    {
        return playlistName;
    }

    public List<Song> getSongsInPlaylist()
    {
        return songsInPlaylist;
    }
}

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

    public String getPlaylistName()
    {
        return playlistName;
    }

    public List<Song> getSongsInPlaylist()
    {
        return songsInPlaylist;
    }
}

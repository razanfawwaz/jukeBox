public class Song
{
    String songName;
    Artist artist;
    Album album;
    Duration duration;

    public Song()
    {

    }

    public Song (String songName, Artist artist, String album, double duration)
    {

    }

    public Song(String songName, Artist artist, Album album, Duration duration) {
        this.songName = songName;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public void playSong()
    {
        System.out.println("Playing the song: " + this.songName);
        System.out.println("From artist: " + this.artist);
        System.out.println("From album: " + this.album);
        System.out.println("Song duration: " + this.duration);
    }

    public String getSongName()
    {
        return songName;
    }

    public Artist getArtist()
    {
        return artist;
    }

    public Album getAlbum()
    {
        return album;
    }

    public Duration getDuration()
    {
        return duration;
    }

    @Override
    public String toString()
    {
        return
                songName + '\'' +
                artist + '\'' +
                album + '\'' +
                duration;
    }
}

public class Song
{
    String songName;
    Artist artist;

    public Song (String songName, Artist artist)
    {
        this.songName = songName;
        this.artist = artist;
    }

    public void playSong()
    {
        System.out.println("Playing the song" + songName);
    }

    public String getSongName()
    {
        return songName;
    }

    public Artist getArtist()
    {
        return artist;
    }

    @Override
    public String toString()
    {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", artist=" + artist +
                '}';
    }
}

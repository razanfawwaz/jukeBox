public class Artist
{
    String artistName;

    public Artist(String artistName)
    {
        this.artistName = artistName;
    }

    @Override
    public String toString()
    {
        return artistName;
    }
}

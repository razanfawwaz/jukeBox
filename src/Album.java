public class Album {
    String albumName;

    public Album(String albumName)
    {
        this.albumName = albumName;
    }

    @Override
    public String toString()
    {
        return "Album{" +
                "Album name= " + albumName + '\'' +
                '}';
    }
}

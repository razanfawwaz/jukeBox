public class Duration {
    Double Duration;

    public Duration(Double Duration)
    {
        this.Duration = Duration;
    }

    @Override
    public String toString()
    {
        return "Duration{" +
                "Song duration='" + Duration + '\'' +
                '}';
    }
}

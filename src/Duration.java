public class Duration {
    Double Duration;
    String durationStr;

    public Duration(Double Duration)
    {
        this.Duration = Duration;
        durationStr = Duration+"";
    }

    @Override
    public String toString()
    {
        return durationStr;
    }
}

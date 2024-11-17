public class CD implements Packable {
    private String artist;
    private String cdName;
    private int publication;

    public CD(String artist, String cdName, int publication) {
        this.artist = artist;
        this.cdName = cdName;
        this.publication = publication;

    }

    public String getName() {
        return this.artist;
    }

    public String getCdName() {
        return this.cdName;
    }

    public int getPublication() {
        return this.publication;
    }

    @Override
    public String toString() {
        return getName() + ": " + getCdName() + " (" + getPublication() + ")";
    }

    @Override
    public double weight() {
        return 0.1;
    }

}
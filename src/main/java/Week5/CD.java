package Week5;

public class CD implements ToBeStored{

    private String artist;
    private String title;
    private int publishingYear;

    public CD(String artist, String title, int publihishingYear){

        this.artist = artist;
        this.title =title;
        this.publishingYear = publihishingYear;

    }
    private double weight = 0.1;

    public double weight(){
        return weight;
    }

    @Override
    public String toString(){
        return this.artist+": "+this.title+" ("+this.publishingYear+")";
    }

}

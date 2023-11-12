package Week6.BirdwatchersDatabase;

public class Bird {
    private String name;
    private String latin_name;
    private int observations;

    public Bird(String name, String latin_name, int observations) {
        this.name = name;
        this.latin_name = latin_name;
        this.observations = observations;
    }
    public Bird (String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getLatin_name() {
        return latin_name;
    }

    public int getObservations() {
        return observations;
    }

    public void setObservations() {
        this.observations++;
    }

    @Override
    public String toString(){
        return this.name+" ("+this.latin_name+"): " + this.observations + " observations";
    }

}

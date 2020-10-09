package music;

public class Sax extends MusicalInstrument implements Tuneable, VolumeAdjustable{
    private String saxType;

    Sax(String aSaxType){
        super("Saxophone");
        this.saxType = aSaxType;
    }

    //getter
    public String getSaxType(){
        return this.saxType;
    }

    //setter
    public void setSaxType(String aSaxType) {
        this.saxType = aSaxType;
    }

    //Playable
    @Override
    public void startMusic() {
        System.out.println("Music plays for the sax...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stops for the sax...");
    }

    //Tuneable
    @Override
    public void tuneInstrument() {
        System.out.println("Tuning up the sax...");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Tuning down for the sax...");
    }

    //Volume Adjustable
    @Override
    public void volumeUp(){
        System.out.println("Sax volume increases...");
    }

    @Override
    public void volumeDown(){
        System.out.println("Sax volume decrease...");
    }
}

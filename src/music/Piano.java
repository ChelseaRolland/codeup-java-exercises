package music;

public class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable {
    private int numberOfKeys;

    Piano(int aNumberOfKeys){
        super("Piano");
        this.numberOfKeys = aNumberOfKeys;
    }

    //getter
    public int getNumberOfKeys(){
        return this.numberOfKeys;
    }

    //setter
    public void setNumberOfKeys(int aNumberOfKeys) {
        this.numberOfKeys = aNumberOfKeys;
    }

    //Playable
    @Override
    public void startMusic() {
        System.out.println("Music plays for the piano...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stops for the piano...");
    }

    //Tuneable
    @Override
    public void tuneInstrument() {
        System.out.println("Tuning up the piano...");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Tuning down for the piano...");
    }

    //Volume Adjustable
    @Override
    public void volumeUp(){
        System.out.println("Piano volume increases...");
    }

    @Override
    public void volumeDown(){
        System.out.println("Piano volume decrease...");
    }
}

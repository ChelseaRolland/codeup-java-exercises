package music;

public abstract class MusicalInstrument implements Playable{

    private String instrumentClassification;

    MusicalInstrument(String aInstrumentClassification){
        this.instrumentClassification = aInstrumentClassification;
    }

    //getter
    public String getInstrumentClassification() {
        return this.instrumentClassification;
    }

    //setter
    public void setInstrumentClassification(String aInstrumentClassification) {
        this.instrumentClassification = aInstrumentClassification;
    }

}

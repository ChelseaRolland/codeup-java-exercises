package music;

public class MusicTest {
    public static void main(String[] args) {

        Piano piano1 = new Piano(108);
        Sax sax1 = new Sax("Tenor");

        detuneRetune(piano1);
        detuneRetune(sax1);

        makeTwoStaccatoSounds(piano1);
        makeTwoStaccatoSounds(sax1);

        piano1.startMusic();
        sax1.startMusic();

        piano1.stopMusic();
        sax1.stopMusic();

    }

    public static void detuneRetune(Tuneable tuneableObj) {
        tuneableObj.detuneInstrument();
        tuneableObj.tuneInstrument();
    }

    public static void makeTwoStaccatoSounds(VolumeAdjustable va) {
        va.volumeUp();
        va.volumeDown();
        va.volumeUp();
        va.volumeDown();
    }
}

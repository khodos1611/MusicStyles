public class MainApp {
    public static void main(String[] args) {

        MusicStyles [] bands = {new PopMusic(), new RockMusic(), new ClassicMusic()};

        for (MusicStyles band: bands) {
            band.playMusic();
        }
    }
}

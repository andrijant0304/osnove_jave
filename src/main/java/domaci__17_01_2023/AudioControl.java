package domaci__17_01_2023;

public class AudioControl extends Control{

    private boolean pojacaj;

//    constructors
    public AudioControl(VideoPlayer videoPlayer, boolean pojacaj) {
        super(videoPlayer);
        this.pojacaj = pojacaj;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (pojacaj){
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() + 1);
            if (videoPlayer.getJacinaZvuka() > 100)
                videoPlayer.setJacinaZvuka(100);
        } else {
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() - 1);
            if (videoPlayer.getJacinaZvuka() < 0)
                videoPlayer.setJacinaZvuka(0);
        }
    }
}

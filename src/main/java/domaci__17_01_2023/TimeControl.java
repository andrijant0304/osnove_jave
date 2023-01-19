package domaci__17_01_2023;

public class TimeControl extends Control {
    private boolean napred;

//    constructors

    public TimeControl(VideoPlayer videoPlayer, boolean napred) {
        super(videoPlayer);
        this.napred = napred;
    }

    //    METHODS
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (napred) {
            videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme() + 15);
            if (videoPlayer.getTrenutnoVreme() > videoPlayer.getDuzinaVidea())
                videoPlayer.setTrenutnoVreme(videoPlayer.getDuzinaVidea());

        }
        else {
            videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme() - 15);
            if (videoPlayer.getTrenutnoVreme() < 0)
                videoPlayer.setTrenutnoVreme(0);
        }
    }
}

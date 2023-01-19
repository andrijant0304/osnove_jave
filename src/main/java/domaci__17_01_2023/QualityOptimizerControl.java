package domaci__17_01_2023;

public class QualityOptimizerControl extends Control {

    private double brzinaNeta;

//    constructors
    public QualityOptimizerControl(VideoPlayer videoPlayer, double brzinaNeta) {
        super(videoPlayer);
        this.brzinaNeta = brzinaNeta;
    }

//        getters and setters
    public double getBrzinaNeta() {
        return brzinaNeta;
    }

    public void setBrzinaNeta(double brzinaNeta) {
        this.brzinaNeta = brzinaNeta;
    }

//    METHODS
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double kvalitet = this.brzinaNeta * 10.1;
        if (kvalitet > 720){
            videoPlayer.setKvalitetVidea(1080);
        } else if (kvalitet > 480 && kvalitet <= 720) {
            videoPlayer.setKvalitetVidea(720);
        } else if (kvalitet > 360 && kvalitet <= 480) {
            videoPlayer.setKvalitetVidea(480);
        } else if (kvalitet > 240 && kvalitet <= 360) {
            videoPlayer.setKvalitetVidea(360);
        } else if (kvalitet > 144 && kvalitet <= 240) {
            videoPlayer.setKvalitetVidea(240);
        } else {
            videoPlayer.setKvalitetVidea(144);
        }
    }
}
//Kvalitet videa (144, 240, 360, 480, 720, 1080)

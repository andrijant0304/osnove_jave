package domaci__17_01_2023;

public abstract class Control {

    private VideoPlayer videoPlayer;

//    constructors
    public Control(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

//     METHODS
    public abstract void izvrsiAkciju(VideoPlayer videoPlayer);
}

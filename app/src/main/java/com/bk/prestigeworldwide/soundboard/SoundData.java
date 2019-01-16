package com.bk.prestigeworldwide.soundboard;

/**
 * Created by abdalla on 1/12/18.
 */

public class SoundData {

    private String soundName;
    private String soundDescription;
    private int soundImage;
    private int audioFile;

    public SoundData(String soundName, String soundDescription, int soundImage, int audioFile) {
        this.soundName = soundName;
        this.soundDescription = soundDescription;
        this.soundImage = soundImage;
        this.audioFile = audioFile;
    }

    public String getSoundName() {
        return soundName;
    }

    public String getSoundDescription() {
        return soundDescription;
    }

    public int getSoundImage() {
        return soundImage;
    }

    public int getAudioFile() {
        return audioFile;
    }
}

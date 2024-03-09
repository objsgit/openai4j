package dev.ai4j.openai4jaudio;

public enum SpeechResponseFormat {

    MP3("mp3"),
    OPUS("opus"),
    AAC("aac"),
    FLAC("flac"),
    WAV("wav"),
    PCM("pcm");

    private final String value;

    SpeechResponseFormat(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
	
}

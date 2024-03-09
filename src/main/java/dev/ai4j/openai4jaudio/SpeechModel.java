package dev.ai4j.openai4jaudio;

public enum SpeechModel {

    TTS_1("tts-1"),
    TTS_1_HD("tts-1-hd");

    private final String value;

    SpeechModel(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}

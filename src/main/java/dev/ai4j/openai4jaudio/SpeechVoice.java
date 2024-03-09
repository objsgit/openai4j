package dev.ai4j.openai4jaudio;

public enum SpeechVoice {

    ALLOY("alloy"),
    ECHO("echo"),
    FABLE("fable"),
    NOYX("onyx"),
    NOVA("nova"),
    SHIMMER("shimmer");

    private final String value;

    SpeechVoice(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}

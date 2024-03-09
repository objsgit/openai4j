package dev.ai4j.openai4jaudio;

public enum TranscriptionModel {

    WHISPER_1("whisper-1");

    private final String value;

    TranscriptionModel(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}

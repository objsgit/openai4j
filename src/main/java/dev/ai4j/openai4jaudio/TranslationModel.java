package dev.ai4j.openai4jaudio;

public enum TranslationModel {

    WHISPER_1("whisper-1");

    private final String value;

    TranslationModel(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}

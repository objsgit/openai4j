package dev.ai4j.openai4jaudio;

public enum TranslationResponseFormat {

    JSON("json"),
    TEXT("text"),
    SRT("srt"),
    VERBOSE_JSON("verbose_json"),
    VTT("vtt");

    private final String value;

    TranslationResponseFormat(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
	
}

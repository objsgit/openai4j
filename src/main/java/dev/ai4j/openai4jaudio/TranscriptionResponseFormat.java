package dev.ai4j.openai4jaudio;

public enum TranscriptionResponseFormat {

    JSON("json"),
    TEXT("text"),
    SRT("srt"),
    VERBOSE_JSON("verbose_json"),
    VTT("vtt");

    private final String value;

    TranscriptionResponseFormat(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
	
}

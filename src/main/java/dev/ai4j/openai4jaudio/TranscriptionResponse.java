package dev.ai4j.openai4jaudio;

import java.util.List;
import java.util.Objects;

public class TranscriptionResponse {

	private final String language;
	private final String duration;
	private final String text;
	private final List<String> words;
	private final List<String> segments;
	
	public TranscriptionResponse(Builder builder) {
        this.language = builder.language;
        this.duration = builder.duration;
        this.text = builder.text;
        this.words = builder.words;
        this.segments = builder.segments;
	}
	
    @Override
    public boolean equals(Object another) {
        if (this == another) return true;
        return another instanceof TranscriptionResponse
                && equalTo((TranscriptionResponse) another);
    }

    private boolean equalTo(TranscriptionResponse another) {
        return Objects.equals(language, another.language) 
        		&& Objects.equals(duration, another.duration)
        		&& Objects.equals(text, another.text)
        		&& Objects.equals(words, another.words)
        		&& Objects.equals(segments, another.segments);
    }

    @Override
    public int hashCode() {
        int h = 5381;
        h += (h << 5) + Objects.hashCode(language);
        h += (h << 5) + Objects.hashCode(duration);
        h += (h << 5) + Objects.hashCode(text);
        h += (h << 5) + Objects.hashCode(words);
        h += (h << 5) + Objects.hashCode(segments);
        return h;
    }

	@Override
	public String toString() {
		return "TranscriptionResponse [language=" + language 
				+ ", duration=" + duration 
				+ ", text=" + text 
				+ ", words=" + words 
				+ ", segments=" + segments + "]";
	}

	public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

    	private String language;
    	private String duration;
    	private String text;
    	private List<String> words;
    	private List<String> segments;
    	
        public Builder from(TranscriptionResponse response) {
        	language(response.language);
        	duration(response.duration);
        	text(response.text);
        	words(response.words);
        	segments(response.segments);
            return this;
        }

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Builder language(String language) {
            this.language = language;
            return this;
        }

        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        public Builder words(List<String> words) {
            this.words = words;
            return this;
        }

        public Builder segments(List<String> segments) {
            this.segments = segments;
            return this;
        }

        public TranscriptionResponse build() {
            return new TranscriptionResponse(this);
        }
    	
    }	

}

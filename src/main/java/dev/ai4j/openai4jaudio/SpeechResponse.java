package dev.ai4j.openai4jaudio;

import java.util.Objects;

public class SpeechResponse {

	private final String b64Json;
	
	public SpeechResponse(Builder builder) {
        this.b64Json = builder.b64Json;
	}
	
    @Override
    public boolean equals(Object another) {
        if (this == another) return true;
        return another instanceof SpeechResponse
                && equalTo((SpeechResponse) another);
    }

    private boolean equalTo(SpeechResponse another) {
        return Objects.equals(b64Json, another.b64Json);
    }

    @Override
    public int hashCode() {
        int h = 5381;
        h += (h << 5) + Objects.hashCode(b64Json);
        return h;
    }
    
	@Override
	public String toString() {
		return "SpeechResponse [b64Json=" + b64Json + "]";
	}

	public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

    	private String b64Json;
    	
        public Builder from(SpeechResponse response) {
        	b64Json(response.b64Json);
            return this;
        }

        public Builder b64Json(String b64Json) {
            this.b64Json = b64Json;
            return this;
        }

        public SpeechResponse build() {
            return new SpeechResponse(this);
        }
    	
    }	

}

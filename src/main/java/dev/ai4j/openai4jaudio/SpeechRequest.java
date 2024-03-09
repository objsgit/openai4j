package dev.ai4j.openai4jaudio;

import java.util.Objects;

public class SpeechRequest {

	private final SpeechModel model;
	private final String input;
	private final SpeechVoice voice;
	private final SpeechResponseFormat responseFormat;
	private final Float speed;
	
	public SpeechRequest(Builder builder) {
        this.model = builder.model;
        this.input = builder.input;
        this.voice = builder.voice;
        this.responseFormat = builder.responseFormat;
        this.speed = builder.speed;
	}
	
    @Override
    public boolean equals(Object another) {
        if (this == another) return true;
        return another instanceof SpeechRequest
                && equalTo((SpeechRequest) another);
    }

    private boolean equalTo(SpeechRequest another) {
        return Objects.equals(model, another.model)
        		&& Objects.equals(input, another.input)
        		&& Objects.equals(voice, another.voice)
        		&& Objects.equals(responseFormat, another.responseFormat)
        		&& Objects.equals(speed, another.speed);
    }

    @Override
    public int hashCode() {
        int h = 5381;
        h += (h << 5) + Objects.hashCode(model);
        h += (h << 5) + Objects.hashCode(input);
        h += (h << 5) + Objects.hashCode(voice);
        h += (h << 5) + Objects.hashCode(responseFormat);
        h += (h << 5) + Objects.hashCode(speed);
        return h;
    }
    
	@Override
	public String toString() {
		return "SpeechRequest [model=" + model 
				+ ", input=" + input 
				+ ", voice=" + voice 
				+ ", responseFormat=" + responseFormat 
				+ ", speed=" + speed + "]";
	}

	public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

    	private SpeechModel model;
    	private String input;
    	private SpeechVoice voice;
    	private SpeechResponseFormat responseFormat;
    	private Float speed;

        public Builder from(SpeechRequest request) {
        	model(request.model);
        	input(request.input);
        	voice(request.voice);
            responseFormat(request.responseFormat);
            speed(request.speed);
            return this;
        }

        public Builder model(SpeechModel model) {
            this.model = model;
            return this;
        }

        public Builder input(String input) {
            this.input = input;
            return this;
        }

        public Builder voice(SpeechVoice voice) {
            this.voice = voice;
            return this;
        }

        public Builder responseFormat(SpeechResponseFormat responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }

        public Builder speed(Float speed) {
            this.speed = speed;
            return this;
        }

        public SpeechRequest build() {
            return new SpeechRequest(this);
        }
    	
    }	
}

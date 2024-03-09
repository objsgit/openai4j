package dev.ai4j.openai4jaudio;

import java.util.Objects;

public class TranscriptionRequest {

	private final String file;
	private final TranscriptionModel model;
	private final String language;
	private final String prompt;
	private final TranscriptionResponseFormat responseFormat;
	private final Float temperature;
	
	public TranscriptionRequest(Builder builder) {
        this.file = builder.file;
        this.model = builder.model;
        this.language = builder.language;
        this.prompt = builder.prompt;
        this.responseFormat = builder.responseFormat;
        this.temperature = builder.temperature;
	}
	
    public String getFile() {
		return file;
	}

	public TranscriptionModel getModel() {
		return model;
	}

	public String getLanguage() {
		return language;
	}

	public String getPrompt() {
		return prompt;
	}

	public TranscriptionResponseFormat getResponseFormat() {
		return responseFormat;
	}

	public Float getTemperature() {
		return temperature;
	}

    @Override
    public boolean equals(Object another) {
        if (this == another) return true;
        return another instanceof TranscriptionRequest
                && equalTo((TranscriptionRequest) another);
    }

    private boolean equalTo(TranscriptionRequest another) {
        return Objects.equals(file, another.file)
        		&& Objects.equals(model, another.model)
        		&& Objects.equals(language, another.language)
        		&& Objects.equals(prompt, another.prompt)
        		&& Objects.equals(responseFormat, another.responseFormat)
        		&& Objects.equals(temperature, another.temperature);
    }

    @Override
    public int hashCode() {
        int h = 5381;
        h += (h << 5) + Objects.hashCode(file);
        h += (h << 5) + Objects.hashCode(model);
        h += (h << 5) + Objects.hashCode(language);
        h += (h << 5) + Objects.hashCode(prompt);
        h += (h << 5) + Objects.hashCode(responseFormat);
        h += (h << 5) + Objects.hashCode(temperature);
        return h;
    }
    
	@Override
	public String toString() {
		return "TranscriptionRequest [file=" + file 
				+ ", model=" + model 
				+ ", language=" + language 
				+ ", prompt=" + prompt 
				+ ", responseFormat=" + responseFormat 
				+ ", temperature=" + temperature + "]";
	}

	public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

    	private String file;
    	private TranscriptionModel model;
    	private String language;
    	private String prompt;
    	private TranscriptionResponseFormat responseFormat;
    	private Float temperature;

        public Builder from(TranscriptionRequest request) {
        	file(request.file);
            model(request.model);
            language(request.language);
            prompt(request.prompt);
            responseFormat(request.responseFormat);
            temperature(request.temperature);
            return this;
        }

        public Builder file(String file) {
            this.file = file;
            return this;
        }

        public Builder model(TranscriptionModel model) {
            this.model = model;
            return this;
        }

        public Builder language(String language) {
            this.language = language;
            return this;
        }

        public Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        public Builder responseFormat(TranscriptionResponseFormat responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }

        public Builder temperature(Float temperature) {
            this.temperature = temperature;
            return this;
        }

        public TranscriptionRequest build() {
            return new TranscriptionRequest(this);
        }
    	
    }	
}

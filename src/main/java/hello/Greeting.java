package hello;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting extends ResourceSupport {

    private final String content;
    private final String name;

    @JsonCreator
    public Greeting(@JsonProperty("content") String content) {
        this.content = content;
        this.name = "sample";
    }

    public String getContent() {
        return content;
    }
    
    public String getName() {
    	return this.name;
    }
}

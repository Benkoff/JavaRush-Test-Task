package io.github.benkoff.spring5books.domain;

/**
 * Created by Ben on 2017-10-24.
 */
public class Sample {
    private String content;

    public Sample() {
        content = "";
    }

    public Sample(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

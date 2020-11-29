package com.telstra.codechallenge.github;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Repos {
    private Item[] items;
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    @Data
    public class Item {
        private String html_url;
        private int watchers_count;
        private String language;
        private String description;
        private String name;
    }

    // public Item[] getItems() {
    //     return items;
    // }
}

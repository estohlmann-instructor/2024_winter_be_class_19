package edu.mcc.codeschool.resttemplates.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "api.beer")
public class BeerApiConfig {

    private String host;

    private String beerByIdPath;
    private String apiKey;
    private String apiHost;

    public String getHost() {
        return host;
    }

    public BeerApiConfig setHost(String host) {
        this.host = host;
        return this;
    }

    public String getBeerByIdPath() {
        return beerByIdPath;
    }

    public BeerApiConfig setBeerByIdPath(String beerByIdPath) {
        this.beerByIdPath = beerByIdPath;
        return this;
    }

    public String getApiKey() {
        return apiKey;
    }

    public BeerApiConfig setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    public String getApiHost() {
        return apiHost;
    }

    public BeerApiConfig setApiHost(String apiHost) {
        this.apiHost = apiHost;
        return this;
    }
}

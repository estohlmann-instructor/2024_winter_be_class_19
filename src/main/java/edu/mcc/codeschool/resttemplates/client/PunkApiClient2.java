package edu.mcc.codeschool.resttemplates.client;

import edu.mcc.codeschool.resttemplates.config.BeerApiConfig;
import edu.mcc.codeschool.resttemplates.model.external.Beer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.function.Consumer;

@Component
public class PunkApiClient2 {
    private final BeerApiConfig beerApiConfig;
    private final WebClient webClient;

    public PunkApiClient2(BeerApiConfig beerApiConfig, WebClient.Builder webClientBuilder) {
        this.beerApiConfig = beerApiConfig;
        this.webClient = webClientBuilder
                .baseUrl(beerApiConfig.getHost())
                .defaultHeaders(httpHeaders())
                .build();
    }
    private Consumer<HttpHeaders> httpHeaders(){
        return headers -> {
            headers.set("Accept", String.valueOf(MediaType.APPLICATION_JSON));
            headers.set("X-RapidAPI-Key", beerApiConfig.getApiKey());
            headers.set("X-RapidAPI-Host", beerApiConfig.getApiHost());
        };
    }

    public Mono<Beer[]> getBeerById(Integer id){
        System.out.println(beerApiConfig.getHost() + beerApiConfig.getBeerByIdPath());
        return webClient.get().uri(uriBuilder -> uriBuilder
                .path(beerApiConfig.getBeerByIdPath())
                .queryParam("q", "test")
                .build(id))
                .retrieve()
                .bodyToMono(Beer[].class);
    }


}

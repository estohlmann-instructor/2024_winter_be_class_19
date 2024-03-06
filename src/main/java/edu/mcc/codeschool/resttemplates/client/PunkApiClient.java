package edu.mcc.codeschool.resttemplates.client;

import edu.mcc.codeschool.resttemplates.model.external.Beer;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PunkApiClient {
    private final RestTemplate restTemplate;

    public PunkApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public Beer getBeerById(Integer id){
        Beer[] ret =  restTemplate.getForObject("https://api.punkapi.com/v2/beers/{id}", Beer[].class, id);
        return ret != null && ret.length > 0 ? ret[0] : null;
    }
}

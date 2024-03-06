package edu.mcc.codeschool.resttemplates.service;

import edu.mcc.codeschool.resttemplates.client.PunkApiClient;
import edu.mcc.codeschool.resttemplates.mapper.BeerMapper;
import edu.mcc.codeschool.resttemplates.model.BeerDTO;
import edu.mcc.codeschool.resttemplates.model.external.Beer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BeerService {

    private final PunkApiClient punkApiClient;
    private final BeerMapper beerMapper;

    public BeerService(PunkApiClient punkApiClient, BeerMapper beerMapper) {
        this.punkApiClient = punkApiClient;
        this.beerMapper = beerMapper;
    }

    public ResponseEntity<BeerDTO> getBeer(Integer id){
        Beer beer = punkApiClient.getBeerById(id);
        return ResponseEntity.ok(beerMapper.mapBeer(beer));
    }
}

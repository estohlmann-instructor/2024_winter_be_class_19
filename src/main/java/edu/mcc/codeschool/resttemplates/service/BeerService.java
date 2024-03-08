package edu.mcc.codeschool.resttemplates.service;

import edu.mcc.codeschool.resttemplates.client.PunkApiClient;
import edu.mcc.codeschool.resttemplates.client.PunkApiClient2;
import edu.mcc.codeschool.resttemplates.mapper.BeerMapper;
import edu.mcc.codeschool.resttemplates.model.BeerDTO;
import edu.mcc.codeschool.resttemplates.model.external.Beer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BeerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BeerService.class);

    private final PunkApiClient punkApiClient;

    private final PunkApiClient2 punkApiClient2;
    private final BeerMapper beerMapper;

    public BeerService(PunkApiClient punkApiClient, PunkApiClient2 punkApiClient2, BeerMapper beerMapper) {
        this.punkApiClient = punkApiClient;
        this.punkApiClient2 = punkApiClient2;
        this.beerMapper = beerMapper;
    }

    public ResponseEntity<BeerDTO> getBeer(Integer id){
        Beer beer = punkApiClient.getBeerById(id);
        return ResponseEntity.ok(beerMapper.mapBeer(beer));
    }

    public ResponseEntity<BeerDTO> getBeerReactive(Integer id){
        LOGGER.info("GETTING BEER {}", id);
        Beer[] ret = punkApiClient2.getBeerById(id).block();
        Beer beer = ret != null && ret.length > 0 ? ret[0] : null;
        LOGGER.info("WE GOT BEER!!");
        return ResponseEntity.ok(beerMapper.mapBeer(beer));
    }
}

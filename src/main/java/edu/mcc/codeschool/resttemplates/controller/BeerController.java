package edu.mcc.codeschool.resttemplates.controller;


import edu.mcc.codeschool.resttemplates.model.BeerDTO;
import edu.mcc.codeschool.resttemplates.model.external.Beer;
import edu.mcc.codeschool.resttemplates.service.BeerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeerController {
    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/api/v1/beers/{id}")
    public ResponseEntity<BeerDTO> getBeer(@PathVariable Integer id){
        return beerService.getBeer(id);
    }

    @GetMapping("/api/v2/beers/{id}")
    public ResponseEntity<BeerDTO> getBeerV2(@PathVariable Integer id){
        return beerService.getBeerReactive(id);
    }
}

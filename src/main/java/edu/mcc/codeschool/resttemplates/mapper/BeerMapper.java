package edu.mcc.codeschool.resttemplates.mapper;

import edu.mcc.codeschool.resttemplates.model.BeerDTO;
import edu.mcc.codeschool.resttemplates.model.external.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BeerMapper {


    @Mapping(target = "volume", source = "volume.value")
    @Mapping(target = "alcoholByVolume", source = "abv")
    @Mapping(target = "id", source = "id")
    @Mapping(target="name", ignore = true)
    @Mapping(target = "notes.tips", source = "brewersTips")
    @Mapping(target = "notes.contribution", source = "contributedBy")
    @Mapping(target="notes.mappedBy", constant = "Evan Almighty")
    @Mapping(target = "myNewId", expression = "java(java.util.UUID.randomUUID())")
    BeerDTO mapBeer(Beer beer);
}

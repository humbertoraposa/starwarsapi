package com.ohcs.starwarsapi.planet;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "planets")
public interface PlanetRepository extends MongoRepository<Planet, String> {

    List<Planet> findByNameLike(@Param("name") String name);

}

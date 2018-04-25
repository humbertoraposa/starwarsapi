package com.ohcs.starwarsapi.planet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

@RepositoryRestController
@RequestMapping(value = "/planet*")
public class PlanetController {
    @Autowired
    PlanetRepository planetRepository;

    @RequestMapping(value="/", method = RequestMethod.POST)
    public Planet create(@RequestBody Planet planet) {
        return planetRepository.save(planet);
        
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Planet> findAll() {
        return planetRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/id/{id}")
    public Planet read(@PathVariable String id) {
        return planetRepository.findById(id).get();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        planetRepository.deleteById(id);
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public List<Planet> findByName(@PathVariable String name) {
        return planetRepository.findByNameLike(name);
    }

}
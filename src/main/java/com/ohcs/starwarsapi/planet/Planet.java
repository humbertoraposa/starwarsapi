package com.ohcs.starwarsapi.planet;

import org.springframework.data.annotation.Id;

public class Planet {

    @Id
    private String id;

    private String name;
    private String climate;
    private String terrain;
    private String featured;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the climate
     */
    public String getClimate() {
        return climate;
    }

    /**
     * @param climate the climate to set
     */
    public void setClimate(String climate) {
        this.climate = climate;
    }

    /**
     * @return the terrain
     */
    public String getTerrain() {
        return terrain;
    }

    /**
     * @param terrain the terrain to set
     */
    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the featured
     */
    public String getFeatured() {
        return featured;
    }

    /**
     * @param featured the featured to set
     */
    public void setFeatured(String featured) {
        this.featured = featured;
    }
}
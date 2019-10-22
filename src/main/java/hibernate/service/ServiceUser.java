package hibernate.service;

import hibernate.dao.DaoPlanet;
import hibernate.model.Planet;
import org.springframework.beans.factory.annotation.Autowired;



public class ServiceUser {

    @Autowired
    private DaoPlanet daoPlanet;

    public ServiceUser() {
    }

    public ServiceUser(DaoPlanet daoPlanet) {
        this.daoPlanet = daoPlanet;
    }

    public Planet find(int id) {
        return daoPlanet.findById(id);
    }

    public void saves(Planet planet) {
        daoPlanet.save(planet);
    }

    public void delete(Planet planet){
        daoPlanet.delete(planet);
    }

}

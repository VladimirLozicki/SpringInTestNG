package hibernate.model;
import hibernate.config.DataConfig;
import hibernate.config.WebConfig;
import hibernate.dao.DaoPlanet;
import hibernate.service.ServiceUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;


@ComponentScan(basePackages = "hibernate")
@ContextConfiguration(classes = {WebConfig.class, DataConfig.class})
@PropertySource("classpath:db.properties")
@PropertySource("classpath:hibernate.properties")
@WebAppConfiguration
public class PlanetTest extends AbstractTestNGSpringContextTests {


    @Autowired
    ServiceUser serviceUser;

    @Test
    public void findIdUser() {
        Planet planet = new Planet();
        planet.setName("dffb");
        serviceUser.saves(planet);
    }

}
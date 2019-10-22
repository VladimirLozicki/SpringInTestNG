package hibernate.model;
import hibernate.config.WebConfig;
import hibernate.service.ServiceUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;


@ComponentScan(basePackages = "hibernate.config")
@ContextConfiguration(classes = {WebConfig.class})
@WebAppConfiguration
public class PlanetTest extends AbstractTestNGSpringContextTests {

    @Autowired
    ServiceUser serviceUser;

    @Test
    public void findIdUser() {
        Planet planet = new Planet();
        serviceUser.saves(planet);
        serviceUser.delete(planet);
    }

    @Test
    public void find() {
        Planet planet = serviceUser.find(10);
        System.out.println(planet.getUserId());
    }

}
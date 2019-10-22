package hibernate.config;

import hibernate.dao.DaoPlanet;
import hibernate.model.Planet;
import hibernate.service.ServiceUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "hibernate")
@Component
public class WebConfig  {

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public ServiceUser getServiceUser(){
        return new ServiceUser(getDao());
    }

    @Bean
    public DaoPlanet getDao(){
        return new DaoPlanet();
    }

    @Bean
    public Planet getPlanet(){
        return new Planet();
    }

}

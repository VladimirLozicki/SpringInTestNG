package hibernate.controller;

import hibernate.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    private static final String index = "/index";


    private ServiceUser serviceUser;

    @Autowired
    public void setServiceUser(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }

    @GetMapping(value = "/")
    public String galaxyPage() {
        return index;
    }

}

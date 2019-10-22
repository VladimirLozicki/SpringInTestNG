package hibernate.controller;

import hibernate.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


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

    @PostMapping(value = "/pol")
    public String galaxy(Model model) {
        model.addAttribute("value", serviceUser.find(10).getUserId());
        return index;
    }

}

package com.drzinks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by golebiow on 2016-03-10.
 */
@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String returnWelcomeView() {
        return "welcomeView";
    }

}

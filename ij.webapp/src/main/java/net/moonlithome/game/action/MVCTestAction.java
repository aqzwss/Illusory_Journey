package net.moonlithome.game.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by moonlithome on 2015/3/12.
 */
@Controller
@RequestMapping("/")
public class MVCTestAction {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String testMVC(ModelMap modelMap){
        System.out.println("very good!!");
        modelMap.addAttribute("message", "Hello World!!");
        return "hello";
    }
}

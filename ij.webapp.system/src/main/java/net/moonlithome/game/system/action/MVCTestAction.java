package net.moonlithome.game.system.action;

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

//    @Autowired
//    private TestMyBatis testMyBatis;


    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String testMVC(ModelMap modelMap){

        modelMap.addAttribute("message", "Hello World!!");
//        testMyBatis.testInsert("aaaaaa", "verygood");
//        testMyBatis.testInsertTwice("111", "1111");
//        testMyBatis.testInsertTrible("1111");
        System.out.println("very good!!");
        return "hello";
    }


}

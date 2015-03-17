package net.moonlithome.game.server.user.action;

import net.moonlithome.game.server.user.service.UserOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by moonlithome on 2015/3/15.
 */
@Controller
@RequestMapping("/user_operation")
public class UserOperationAction {

    @Autowired
    private UserOperationService userOperationService;


}

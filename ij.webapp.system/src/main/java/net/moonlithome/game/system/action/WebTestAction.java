package net.moonlithome.game.system.action;

import net.moonlithome.game.common.dto.user.UserLevelDto;
import net.moonlithome.game.system.dao.UserLevelManageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by MF on 3/14/2015.
 */
@Controller
public class WebTestAction {

    @Autowired
    private UserLevelManageDao userLevelManageDao;

    @RequestMapping("user_level")
    public void testUserLevel(HttpServletRequest request, HttpServletResponse response){
        UserLevelDto userLevelDto = new UserLevelDto();
        userLevelDto.setId(5);
        userLevelDto.setLevelFlag("12");
        userLevelDto.setBeforeName("学徒");
        userLevelDto.setAfterName("2级");
        userLevelManageDao.updateUserLevel(userLevelDto);
        System.out.println(" user level success!!");
    }
}

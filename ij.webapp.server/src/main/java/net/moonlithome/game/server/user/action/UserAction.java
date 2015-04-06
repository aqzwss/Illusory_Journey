package net.moonlithome.game.server.user.action;

import net.moonlithome.game.common.dto.user.UserAttributeDto;
import net.moonlithome.game.common.dto.user.UserInfoDto;
import net.moonlithome.game.common.dto.user.UserStatusDto;
import net.moonlithome.game.framework.action.BaseAction;
import net.moonlithome.game.framework.util.JsonBeanUtil;
import net.moonlithome.game.server.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by moonlithome on 2015/3/15.
 */
@Controller
@RequestMapping("/user")
public class UserAction extends BaseAction {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserAttribute")
    public void getUserAttribute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        UserInfoDto userInfoDto = JsonBeanUtil.getBeanFromJson(getJsonFromRequest(request), UserInfoDto.class);
        UserAttributeDto userAttributeDto = null;
        if(userInfoDto != null){
            userAttributeDto = userService.getUserAttribute(userInfoDto.getUserId());
        }
        responseJson(response, userAttributeDto);
    }

    @RequestMapping("/getUserStatus")
    public void getUserStatus(HttpServletRequest request, HttpServletResponse response) throws Exception {
        UserInfoDto userInfoDto = JsonBeanUtil.getBeanFromJson(getJsonFromRequest(request), UserInfoDto.class);
        UserStatusDto userStatusDto = null;
        if(userInfoDto != null){
            userStatusDto = userService.getUserStatus(userInfoDto.getUserId());
        }
        responseJson(response, userStatusDto);
    }


}

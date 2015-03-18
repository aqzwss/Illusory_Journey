package net.moonlithome.game.server.user.action;

import net.moonlithome.game.common.dto.user.UserInfoDto;
import net.moonlithome.game.framework.action.BaseAction;
import net.moonlithome.game.framework.dto.BaseCommunicationDto;
import net.moonlithome.game.framework.util.JsonBeanUtil;
import net.moonlithome.game.server.user.dao.UserInfoDao;
import net.moonlithome.game.server.user.service.UserOperationService;
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
public class UserOperationAction extends BaseAction{

    @Autowired
    private UserOperationService userOperationService;

    @RequestMapping("/create")
    public void createUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        UserInfoDto userInfoDto = JsonBeanUtil.getBeanFromJson(getJsonFromRequest(request), UserInfoDto.class);
        if(permission_check()){
            userOperationService.userRegiste(userInfoDto);
        }
        BaseCommunicationDto baseCommunicationDto = new BaseCommunicationDto();
        responseJson(response, baseCommunicationDto);
    }


}

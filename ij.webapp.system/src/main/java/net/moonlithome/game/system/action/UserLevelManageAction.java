package net.moonlithome.game.system.action;

import net.moonlithome.game.common.dto.user.UserLevelDto;
import net.moonlithome.game.framework.action.BaseAction;
import net.moonlithome.game.framework.dto.BaseCommunicationDto;
import net.moonlithome.game.framework.util.JsonBeanUtil;
import net.moonlithome.game.system.mapper.UserLevelManageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by MF on 3/15/2015.
 */
@Controller
public class UserLevelManageAction extends BaseAction{

    @Autowired
    private UserLevelManageDao userLevelManageDao;

    @RequestMapping("/addUserLevel")
    public void addUserLevel(HttpServletRequest request, HttpServletResponse response) throws Exception {
        UserLevelDto userLevelDto = JsonBeanUtil.getBeanFromJson(getJsonFromRequest(request), UserLevelDto.class);
        //TODO check session
        if(userLevelDto != null){
            userLevelManageDao.addUserLevel(userLevelDto);
        }
        BaseCommunicationDto baseCommunicationDto = new BaseCommunicationDto();
        responseJson(response, baseCommunicationDto);
    }

    @RequestMapping("/updateUserLevel")
    public void updateUserLevel(HttpServletRequest request, HttpServletResponse response) throws Exception {
        UserLevelDto userLevelDto = JsonBeanUtil.getBeanFromJson(getJsonFromRequest(request), UserLevelDto.class);
        //TODO check session
        if(userLevelDto != null){
            userLevelManageDao.updateUserLevel(userLevelDto);
        }
        BaseCommunicationDto baseCommunicationDto = new BaseCommunicationDto();
        responseJson(response, baseCommunicationDto);
    }

    @RequestMapping("/removeUserLevel")
    public void removeUserLevel(HttpServletRequest request, HttpServletResponse response) throws Exception {
        UserLevelDto userLevelDto = JsonBeanUtil.getBeanFromJson(getJsonFromRequest(request), UserLevelDto.class);
        //TODO check session
        if(userLevelDto != null){
            userLevelManageDao.removeUserLevel(userLevelDto.getId());
        }
        BaseCommunicationDto baseCommunicationDto = new BaseCommunicationDto();
        responseJson(response, baseCommunicationDto);
    }

    @RequestMapping("/getUserLevel")
    public void getUserLevel(HttpServletRequest request, HttpServletResponse response) throws Exception {

    }

}

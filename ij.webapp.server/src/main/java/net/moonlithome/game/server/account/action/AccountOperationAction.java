package net.moonlithome.game.server.account.action;

import net.moonlithome.game.common.dto.account.AccountInfoDto;
import net.moonlithome.game.common.dto.user.UserInfoDto;
import net.moonlithome.game.framework.action.BaseAction;
import net.moonlithome.game.framework.dto.BaseCommunicationDto;
import net.moonlithome.game.framework.util.JsonBeanUtil;
import net.moonlithome.game.server.account.service.AccountOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by moonlithome on 2015/3/17.
 */
@Controller
@RequestMapping("/account")
public class AccountOperationAction extends BaseAction {

    @Autowired
    private AccountOperationService accountOperationService;

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public void accountRegist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        AccountInfoDto accountInfoDto = JsonBeanUtil.getBeanFromJson(getJsonFromRequest(request), AccountInfoDto.class);
        //TODO check session
        BaseCommunicationDto baseCommunicationDto = null;
        if(accountInfoDto != null){
            baseCommunicationDto = accountOperationService.accountRegist(accountInfoDto);
        }
        responseJson(response, baseCommunicationDto);
    }

    @RequestMapping("/login")
    public void accountLogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
        AccountInfoDto accountInfoDto = JsonBeanUtil.getBeanFromJson(getJsonFromRequest(request), AccountInfoDto.class);

        UserInfoDto userInfoDto = null;
        if(accountInfoDto != null){
            userInfoDto = accountOperationService.accountLogin(accountInfoDto);
        }
        responseJson(response, userInfoDto);
    }

}

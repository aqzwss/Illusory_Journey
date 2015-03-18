package net.moonlithome.game.server.account.action;

import net.moonlithome.game.common.dto.account.AccountInfoDto;
import net.moonlithome.game.framework.action.BaseAction;
import net.moonlithome.game.framework.dto.BaseCommunicationDto;
import net.moonlithome.game.framework.util.JsonBeanUtil;
import net.moonlithome.game.server.account.service.AccountOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by moonlithome on 2015/3/18.
 */
@Controller
@RequestMapping("/account")
public class AccountOperationAction extends BaseAction{

    @Autowired
    private AccountOperationService accountOperationService;

    @RequestMapping("/registe")
    public void registeAccount(HttpServletRequest request, HttpServletResponse response) throws Exception {
        AccountInfoDto accountInfoDto = JsonBeanUtil.getBeanFromJson(getJsonFromRequest(request), AccountInfoDto.class);
        if(permission_check()) {
            accountOperationService.registerAccount(accountInfoDto);

            BaseCommunicationDto baseCommunicationDto = new BaseCommunicationDto();
            responseJson(response, baseCommunicationDto);
        }
    }

    @RequestMapping("/retrieval")
    public void retrieval(HttpServletRequest request, HttpServletResponse response) throws Exception {
        AccountInfoDto accountInfoDto = JsonBeanUtil.getBeanFromJson(getJsonFromRequest(request), AccountInfoDto.class);
        if(permission_check()) {
            accountOperationService.getPasswdClose(accountInfoDto.getAccountId());

            BaseCommunicationDto baseCommunicationDto = new BaseCommunicationDto();
            responseJson(response, baseCommunicationDto);
        }
    }

}

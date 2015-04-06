package net.moonlithome.game.server.account.action;

import net.moonlithome.game.common.dto.account.AccountInfoDto;
import net.moonlithome.game.framework.contant.ErrorCode;
import net.moonlithome.game.framework.dto.BaseCommunicationDto;
import net.moonlithome.game.server.HttpClientUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by MF on 3/28/2015.
 */
public class AccountOperationActionTest {

    @Test
    public void testRegist(){
        System.out.println("testttttttttttttttttttttttt");
        AccountInfoDto accountInfoDto = new AccountInfoDto();
        accountInfoDto.setAccountId("ceshi");
        accountInfoDto.setPasswd("123456");
        accountInfoDto.setTrueName("中文校验");
        accountInfoDto.setMobile("12332112312");
        accountInfoDto.setEmail("aqzwss@gmail.com");

        BaseCommunicationDto baseCommunicationDto = HttpClientUtil.doPost("/account/regist", accountInfoDto);
        assertEquals(ErrorCode.ERROR_OK.toString(), baseCommunicationDto.getErrorCode());

    }
}

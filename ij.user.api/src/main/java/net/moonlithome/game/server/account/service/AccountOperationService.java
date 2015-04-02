package net.moonlithome.game.server.account.service;

import net.moonlithome.game.common.dto.account.AccountInfoDto;
import net.moonlithome.game.common.dto.user.UserInfoDto;
import net.moonlithome.game.common.service.BaseService;
import net.moonlithome.game.framework.dto.BaseCommunicationDto;


/**
 * Created by moonlithome on 2015/3/17.
 */
public interface AccountOperationService{

    public BaseCommunicationDto accountRegist(AccountInfoDto accountInfoDto);

    public UserInfoDto accountLogin(AccountInfoDto accountInfoDto);

    /**
     * 获取暗文密码
     * @param accountId
     * @return
     */
    public String getPasswdClose(String accountId);

    /**
     * 获取铭文密码
     * @param accountId
     * @return
     */
    public String getPasswdOpen(String accountId);

}

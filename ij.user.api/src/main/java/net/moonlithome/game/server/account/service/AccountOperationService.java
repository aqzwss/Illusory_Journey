package net.moonlithome.game.server.account.service;

import net.moonlithome.game.common.dto.account.AccountInfoDto;
import net.moonlithome.game.common.service.BaseService;

/**
 * Created by moonlithome on 2015/3/17.
 */
public interface AccountOperationService extends BaseService{

    public void registerAccount(AccountInfoDto accountInfoDto);

    public String getPasswdClose(String accountId);

    public String getPasswdOpen(String accountId);

}

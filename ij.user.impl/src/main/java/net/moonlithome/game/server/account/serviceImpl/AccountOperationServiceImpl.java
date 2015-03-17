package net.moonlithome.game.server.account.serviceImpl;

import net.moonlithome.game.common.dto.account.AccountInfoDto;
import net.moonlithome.game.server.account.dao.AccountOperationDao;
import net.moonlithome.game.server.account.service.AccountOperationService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by moonlithome on 2015/3/17.
 */
public class AccountOperationServiceImpl implements AccountOperationService{

    @Autowired
    private AccountOperationDao accountOperationDao;

    @Override
    public void registerAccount(AccountInfoDto accountInfoDto) {
        accountOperationDao.registerAccount(accountInfoDto);
    }

    @Override
    public String getPasswdClose(String accountId) {
        return accountOperationDao.getPasswdClose(accountId);
    }

    @Override
    public String getPasswdOpen(String accountId) {
        return null;
    }
}

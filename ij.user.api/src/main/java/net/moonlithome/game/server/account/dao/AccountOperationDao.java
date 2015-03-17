package net.moonlithome.game.server.account.dao;

import net.moonlithome.game.common.dto.account.AccountInfoDto;
import org.apache.ibatis.annotations.Param;

/**
 * Created by moonlithome on 2015/3/17.
 */
public interface AccountOperationDao {

    void registerAccount(AccountInfoDto accountInfoDto);

    String getPasswdClose(@Param("accountId")String accountId);

}

package net.moonlithome.game.server.account.mapper;

import net.moonlithome.game.common.dto.account.AccountInfoDto;
import org.apache.ibatis.annotations.Param;

/**
 * Created by moonlithome on 2015/3/17.
 */
public interface AccountOperationMapper {

    void registAccount(AccountInfoDto accountInfoDto);

    String getPasswdClose(@Param("accountId")String accountId);

}

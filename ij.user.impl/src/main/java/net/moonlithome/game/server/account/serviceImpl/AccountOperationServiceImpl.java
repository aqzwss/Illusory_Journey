package net.moonlithome.game.server.account.serviceImpl;

import net.moonlithome.game.framework.contant.ErrorCode;
import net.moonlithome.game.common.dto.account.AccountInfoDto;
import net.moonlithome.game.common.dto.user.UserInfoDto;
import net.moonlithome.game.framework.dto.BaseCommunicationDto;
import net.moonlithome.game.server.account.mapper.AccountOperationMapper;
import net.moonlithome.game.server.account.service.AccountOperationService;
import net.moonlithome.game.server.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
import org.springframework.util.StringUtils;
=======
>>>>>>> master

/**
 * Created by moonlithome on 2015/3/17.
 */
@Service
public class AccountOperationServiceImpl implements AccountOperationService{

    @Autowired
    private AccountOperationMapper accountOperationDao;

    @Autowired
    private UserService userService;

    @Override
    public BaseCommunicationDto accountRegist(AccountInfoDto accountInfoDto) {
        //check
        BaseCommunicationDto baseCommunicationDto = new BaseCommunicationDto();
        try {
            accountOperationDao.registAccount(accountInfoDto);
            baseCommunicationDto.setErrorCode(ErrorCode.ERROR_OK);
        } catch (Exception e){
            e.printStackTrace();
            baseCommunicationDto.setErrorCode(ErrorCode.ERROR_SERVICE);
        }
        return baseCommunicationDto;
    }

    @Override
    public UserInfoDto accountLogin(AccountInfoDto accountInfoDto) {
        UserInfoDto userInfoDto = new UserInfoDto();
        if(!StringUtils.isEmpty(accountInfoDto.getAccountId()) && !StringUtils.isEmpty(accountInfoDto.getPasswd())){
            if(accountInfoDto.getPasswd().equals(this.getPasswdClose(accountInfoDto.getAccountId()))){
                userInfoDto = userService.getUserInfo(accountInfoDto.getUserId());
                userInfoDto.setErrorCode(ErrorCode.ERROR_OK);
            } else {
                userInfoDto.setErrorCode(ErrorCode.ERROR_DATA);
            }
        } else {
            userInfoDto.setErrorCode(ErrorCode.ERROR_DATA);
        }
        return userInfoDto;
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

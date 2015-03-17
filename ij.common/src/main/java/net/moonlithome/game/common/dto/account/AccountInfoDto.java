package net.moonlithome.game.common.dto.account;

import net.moonlithome.game.framework.dto.BaseServerDto;

/**
 * Created by moonlithome on 2015/3/17.
 */
public class AccountInfoDto extends BaseServerDto {

    private String accountId;
    private String passwd;
    private String trueName;
    private String mobile;
    private String email;
    private String userId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

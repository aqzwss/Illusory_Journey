package net.moonlithome.game.framework.dto;

import net.moonlithome.game.framework.contant.ErrorCode;

import java.io.Serializable;

/**
 * Created by MF on 3/15/2015.
 */
public class BaseCommunicationDto implements Serializable{

    private String errorCode;
    private String errorMsg;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}

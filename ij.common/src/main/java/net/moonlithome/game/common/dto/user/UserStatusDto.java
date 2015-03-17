package net.moonlithome.game.common.dto.user;

import net.moonlithome.game.framework.dto.BaseServerDto;

/**
 * Created by moonlithome on 2015/3/15.
 */
public class UserStatusDto extends BaseServerDto {

    public UserStatusDto() {
    }

    public UserStatusDto(int userId, int currentHp, int maxHp, int currentMp, int maxMp) {
        this.userId = userId;
        this.currentHp = currentHp;
        this.maxHp = maxHp;
        this.currentMp = currentMp;
        this.maxMp = maxMp;
    }

    private int userId;
    private int currentHp;
    private int maxHp;
    private int currentMp;
    private int maxMp;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getCurrentMp() {
        return currentMp;
    }

    public void setCurrentMp(int currentMp) {
        this.currentMp = currentMp;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(int maxMp) {
        this.maxMp = maxMp;
    }
}

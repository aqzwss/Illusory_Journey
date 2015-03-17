package net.moonlithome.game.common.dto.user;

import net.moonlithome.game.framework.dto.BaseServerDto;

/**
 * Created by moonlithome on 2015/3/15.
 */
public class UserInfoDto extends BaseServerDto {

    public UserInfoDto() {
    }

    public UserInfoDto(String userId, String name, String sex, String race, String levelFlag, int experience, int exIncreaseRate, int positionId, String bagId) {
        this.userId = userId;
        this.name = name;
        this.sex = sex;
        this.race = race;
        this.levelFlag = levelFlag;
        this.experience = experience;
        this.exIncreaseRate = exIncreaseRate;
        this.positionId = positionId;
        this.bagId = bagId;
    }

    private String userId;
    private String name;
    private String sex;
    private String race;
    private String levelFlag;
    private int experience;
    private int exIncreaseRate;
    private int positionId;
    private String bagId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getLevelFlag() {
        return levelFlag;
    }

    public void setLevelFlag(String levelFlag) {
        this.levelFlag = levelFlag;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExIncreaseRate() {
        return exIncreaseRate;
    }

    public void setExIncreaseRate(int exIncreaseRate) {
        this.exIncreaseRate = exIncreaseRate;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getBagId() {
        return bagId;
    }

    public void setBagId(String bagId) {
        this.bagId = bagId;
    }
}

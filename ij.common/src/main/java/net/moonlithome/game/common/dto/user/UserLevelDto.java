package net.moonlithome.game.common.dto.user;

import net.moonlithome.game.framework.dto.BaseServerDto;

/**
 * Created by MF on 3/14/2015.
 */
public class UserLevelDto extends BaseServerDto {

    public UserLevelDto() {
    }

    public UserLevelDto(String levelFlag, String beforeName, String afterName, int experience, int adventure) {
        this.levelFlag = levelFlag;
        this.beforeName = beforeName;
        this.afterName = afterName;
        this.experience = experience;
        this.adventure = adventure;
    }

    private String levelFlag;
    private String beforeName;
    private String afterName;
    private int experience;
    private int adventure;

    public String getLevelFlag() {
        return levelFlag;
    }

    public void setLevelFlag(String levelFlag) {
        this.levelFlag = levelFlag;
    }

    public String getBeforeName() {
        return beforeName;
    }

    public void setBeforeName(String beforeName) {
        this.beforeName = beforeName;
    }

    public String getAfterName() {
        return afterName;
    }

    public void setAfterName(String afterName) {
        this.afterName = afterName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAdventure() {
        return adventure;
    }

    public void setAdventure(int adventure) {
        this.adventure = adventure;
    }
}

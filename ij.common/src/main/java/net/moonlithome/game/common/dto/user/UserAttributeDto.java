package net.moonlithome.game.common.dto.user;

import net.moonlithome.game.framework.dto.BaseServerDto;

/**
 * Created by moonlithome on 2015/3/15.
 */
public class UserAttributeDto extends BaseServerDto {

    public UserAttributeDto() {
    }

    public UserAttributeDto(int userId, int physicalAttack, int spellAttack, int armor, int resistance, int physicalDefence, int spellDefence, int armorPenetration, int spellPenetration) {
        this.userId = userId;
        this.physicalAttack = physicalAttack;
        this.spellAttack = spellAttack;
        this.armor = armor;
        this.resistance = resistance;
        this.physicalDefence = physicalDefence;
        this.spellDefence = spellDefence;
        this.armorPenetration = armorPenetration;
        this.spellPenetration = spellPenetration;
    }

    private int userId;
    private int physicalAttack;
    private int spellAttack;
    private int armor;
    private int resistance;
    private int physicalDefence;
    private int spellDefence;
    private int armorPenetration;
    private int spellPenetration;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPhysicalAttack() {
        return physicalAttack;
    }

    public void setPhysicalAttack(int physicalAttack) {
        this.physicalAttack = physicalAttack;
    }

    public int getSpellAttack() {
        return spellAttack;
    }

    public void setSpellAttack(int spellAttack) {
        this.spellAttack = spellAttack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getPhysicalDefence() {
        return physicalDefence;
    }

    public void setPhysicalDefence(int physicalDefence) {
        this.physicalDefence = physicalDefence;
    }

    public int getSpellDefence() {
        return spellDefence;
    }

    public void setSpellDefence(int spellDefence) {
        this.spellDefence = spellDefence;
    }

    public int getArmorPenetration() {
        return armorPenetration;
    }

    public void setArmorPenetration(int armorPenetration) {
        this.armorPenetration = armorPenetration;
    }

    public int getSpellPenetration() {
        return spellPenetration;
    }

    public void setSpellPenetration(int spellPenetration) {
        this.spellPenetration = spellPenetration;
    }
}

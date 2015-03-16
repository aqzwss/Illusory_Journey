package net.moonlithome.game.common.dto.monster;

import net.moonlithome.game.framework.dto.BaseServerDto;

/**
 * Created by neusoft on 2015/3/16.
 */
public class MonsterInfoDto extends BaseServerDto{

    private int monsterId;
    private String name;
    private int hp;
    private int mp;
    private int physicalAttack;
    private int spellAttack;
    private int armor;
    private int resistance;
    private int physicalDefence;
    private int spellDefence;

    public int getMonsterId() {
        return monsterId;
    }

    public void setMonsterId(int monsterId) {
        this.monsterId = monsterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
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
}

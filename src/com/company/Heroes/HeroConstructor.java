package com.company.Heroes;

import com.company.Hero;
import com.company.Skills.CuttingStrike;
import com.company.Skills.Heal;
import com.company.Skills.Skip;
import com.company.Skills.SwordStrike;
import com.company.Team;

/**
 * Created by Dima on 20.03.2017.
 */
public class HeroConstructor {
    public Healer constructHealer(int dexterity, int power, String name,  Team team) {
        Healer product = new Healer(dexterity, power, name, team);
        product.skills.add(new Heal(product));
        return product;
    }
    public Healer constructHealer(String name, Team team) {return constructHealer(3, 10, name, team);}

    public Swordsman constructSwordsman(int dexterity, int power, String name,  Team team) {
        Swordsman product = new Swordsman(dexterity, power, name, team);
        product.skills.add(new SwordStrike(product));
        product.skills.add(new CuttingStrike(product));
        product.skills.add(new Skip(product));
        return  product;
    }
    public Swordsman constructSwordsman(String name, Team team){return constructSwordsman(5, 10, name, team);}
}

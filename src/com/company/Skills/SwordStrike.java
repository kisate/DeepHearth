package com.company.Skills;

import com.company.HeroParams.Skill;
import com.company.Unit;

/**
 * Created by Dima on 23.02.2017.
 */
public class SwordStrike extends Skill {
    public SwordStrike(){
        name = "Sword strike";
        description = "Strike enemy with sword and deal 5 damage";
        cost = 0;
    }
    @Override
    public void use(Unit target, Unit user) {
        super.use(target, user);
        System.out.println("Stroke " + target.name + " dealing 5 damage");
        target.modHealth(5);
    }
}

package com.company.Skills;

import com.company.HeroParams.Skill;
import com.company.Unit;

/**
 * Created by Dima on 28.03.2017.
 */
public class Skip extends Skill {
    public Skip(Unit owner) {
        super(owner);
    }

    @Override
    public void use(Unit target) {
        super.use(target);
        System.out.println(owner.name + "skipped his move");
    }
}

package com.company.Dungeon.Interactables;

import com.company.Dungeon.Interactable;
import com.company.Dungeon.ObjectTypes;

/**
 * Created by Dima on 10.04.2017.
 */
public class Enemy extends Interactable{
    public Enemy (){
        this.type = ObjectTypes.Enemy;
        this.price = 1;
    }
}

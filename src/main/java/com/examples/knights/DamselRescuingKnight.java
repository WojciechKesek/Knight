package com.examples.knights;

import com.examples.quests.Quest;
import com.examples.quests.RescueDamselQuest;
import com.examples.quests.SlayDragonQuest;

// przyklady zlych ustawien i zachowan
public class DamselRescuingKnight implements Knight {
    private Quest quest;

    public DamselRescuingKnight() {
        //cz rycerz powinien wiedziec cos jaki quest wykonuje i zajmowa sie nim ?

        this.quest = new SlayDragonQuest();
        // czy rycerz powinien zajmowac sie swoim ministrelem ?
//        this.ministrel = new Ministrel(System.out);
    }

    @Override
    public void embarkOnQuest() {
        quest.embark(this);
    }
}

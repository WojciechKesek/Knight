package com.examples.knights;


import com.examples.config.condition.BraveKnightCondition;
import com.examples.quests.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(BraveKnightCondition.class)
public class BraveKnight implements Knight{

    @Autowired
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark(this);
    }

    @Override
    public String toString() {
        return "BraveKnight ";
    }
}

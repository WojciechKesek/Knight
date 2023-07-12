package com.examples.knights;

import com.examples.config.condition.NotSoBraveKnightCondition;
import com.examples.quests.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(NotSoBraveKnightCondition.class)
public class NotSoBraveKnight implements Knight{
    @Autowired
    Quest quest;

    public NotSoBraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark(this);
    }


    @Override
    public String toString() {
        return "NotSoBraveKnight ";
    }
}

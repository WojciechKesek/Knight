package com.examples.quests;

import com.examples.config.condition.NotGonnaDoThisCondition;
import com.examples.knights.Knight;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(NotGonnaDoThisCondition.class)
public class NotGonnaDoThisQuest implements Quest{
    @Override
    public void embark(Knight knight) {
        System.out.println(knight + "not gonna do this!");
    }
}

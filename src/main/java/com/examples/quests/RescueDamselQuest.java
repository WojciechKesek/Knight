package com.examples.quests;

import com.examples.config.condition.RescueDamselCondtion;
import com.examples.knights.Knight;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(RescueDamselCondtion.class)
public class RescueDamselQuest implements Quest{
    @Override
    public void embark(Knight knight) {
        System.out.println(knight + "started quest RescueDamselQuest");
    }
}

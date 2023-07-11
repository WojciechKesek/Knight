package com.examples.quests;

import org.springframework.stereotype.Component;

@Component
public class RescueDamselQuest implements Quest{
    @Override
    public void embark() {
        System.out.println("started quest RescueDamselQuest");
    }
}

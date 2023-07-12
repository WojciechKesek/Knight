package com.examples.config.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class RescueDamselCondtion implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return Boolean.TRUE.equals(context.getEnvironment().getProperty("chosen.knight", Boolean.class));
    }
}

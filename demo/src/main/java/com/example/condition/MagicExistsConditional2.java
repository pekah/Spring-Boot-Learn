package com.example.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsConditional2 implements Condition {

    @Override
    public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
       return false;
    }

}

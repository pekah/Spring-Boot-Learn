package com.example.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsConditional implements Condition {

    @Override
    public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
        Environment env=arg0.getEnvironment();//获取上下文环境
        return env.containsProperty("magic");//检查是否包含magic属性
    }

}

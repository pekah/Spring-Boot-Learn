package com.example.readinglist;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by zhouyilin on 2017/12/16.
 */
public class JdbcTemplateCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        try {
            context.getClassLoader().loadClass("org.springframework.jdbc.BadSqlGrammarException");
            return true;
        } catch (Exception e){
            return false;
        }
    }
}

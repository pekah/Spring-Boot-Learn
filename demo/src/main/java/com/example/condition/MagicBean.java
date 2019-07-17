package com.example.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

public class MagicBean {

    @Bean
    @Conditional({MagicExistsConditional.class, MagicExistsConditional2.class})
    public MagicBean magicBean(){
        return new MagicBean();
    }

}

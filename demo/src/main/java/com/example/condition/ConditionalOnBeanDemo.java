package com.example.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;

/**
 * Created by elizhou on 2018/1/4.
 */
public class ConditionalOnBeanDemo {

    @Bean
    @ConditionalOnBean(name = {"redisTemplate"})
    public MagicBean magicBean(){
        return new MagicBean();
    }
}

package com.example.condition;

import org.springframework.boot.actuate.metrics.export.MetricExportProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.web.WebMvcProperties;
import org.springframework.context.annotation.Bean;

/**
 * Created by elizhou on 2018/1/4.
 */
public class ConditionalOnClassDemo {

    @Bean
    @ConditionalOnClass({MetricExportProperties.Redis.class, WebMvcProperties.Servlet.class})
    public MagicBean magicBean(){
        return new MagicBean();
    }
}

package com.example.readinglist;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

/**
 * Created by zhouyilin on 2017/12/16.
 */
@Conditional(JdbcTemplateCondition.class)
public class ConditionBean {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

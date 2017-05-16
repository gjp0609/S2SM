package com.baizhi.s2sm.test;

import com.baizhi.s2sm.action.PersonAction;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gjp06 on 17.5.16.
 */
public class PersonDaoTest {
    @Test
    void selectPerson() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring.xml");
        System.out.println(ctx);
//        Object personDao = ctx.getBean("personDao");
//        PersonDao dao = (PersonDao) personDao;
//        System.out.println(dao);

    }

    @Test
    void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring.xml");
        Object basic = ctx.getBean("personAction");
        PersonAction action= (PersonAction) basic;
        System.out.println(action.queryAll());
    }
}

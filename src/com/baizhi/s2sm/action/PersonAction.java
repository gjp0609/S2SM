package com.baizhi.s2sm.action;

import com.baizhi.s2sm.entity.Person;
import com.baizhi.s2sm.service.PersonService;

import java.util.List;

/**
 * Created by gjp06 on 17.5.16.
 */
public class PersonAction {
    private PersonService service;

    public String queryAll() {
        if (service != null) {
            List<Person> people = service.queryPerson();
            for (Person p : people) {
                System.out.println(p);
            }
        } else System.err.println(false);
        return null;
    }

    public void setService(PersonService service) {
        this.service = service;
    }
}

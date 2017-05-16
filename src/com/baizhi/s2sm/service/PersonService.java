package com.baizhi.s2sm.service;

import com.baizhi.s2sm.entity.Person;

import java.util.List;

/**
 * Created by gjp06 on 17.5.16.
 */
public interface PersonService {
    public List<Person> queryPerson();

    public int addPerson(Person person);
}

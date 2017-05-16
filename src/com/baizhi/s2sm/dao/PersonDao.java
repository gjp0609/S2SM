package com.baizhi.s2sm.dao;

import com.baizhi.s2sm.entity.Person;

import java.util.List;

/**
 * Created by gjp06 on 17.5.16.
 */
public interface PersonDao {

    public List<Person> selectPerson();

    public int addPerson(Person person);
}

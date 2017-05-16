package com.baizhi.s2sm.service.impl;

import com.baizhi.s2sm.dao.PersonDao;
import com.baizhi.s2sm.entity.Person;
import com.baizhi.s2sm.service.PersonService;

import java.util.List;

/**
 * Created by gjp06 on 17.5.16.
 */
public class PersonServiceImpl implements PersonService {
    private PersonDao dao;

    @Override
    public List<Person> queryPerson() {
        return dao.selectPerson();
    }

    @Override
    public int addPerson(Person person) {
        return dao.addPerson(person);
    }

    public void setDao(PersonDao dao) {
        this.dao = dao;
    }
}

package com.luv2code.jpa_one_to_one.dao;

import com.luv2code.jpa_one_to_one.entity.Instructor;

public interface AppDao {
    public void save(Instructor instructor);
    public Instructor findInstracturById(int id);
    public void deleteInstracturByid(int id);
}

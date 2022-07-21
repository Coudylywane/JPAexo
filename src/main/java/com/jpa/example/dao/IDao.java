package com.jpa.example.dao;

import java.util.List;

public interface IDao<T, S> {
    boolean save(T o);
    boolean delete(T o);
    boolean update(T o);
    T findById(S s);
    List<T> findAll();
    
}

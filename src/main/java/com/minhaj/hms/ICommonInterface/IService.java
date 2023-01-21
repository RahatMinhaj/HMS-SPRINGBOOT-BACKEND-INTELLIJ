package com.minhaj.hms.ICommonInterface;

import com.minhaj.hms.Entity.Departments;

import java.util.List;

public interface IService<T> {

    List<Departments> getAllList();

    Departments saveData(T t);

}

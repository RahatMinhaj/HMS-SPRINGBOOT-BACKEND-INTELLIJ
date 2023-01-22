package com.minhaj.hms.ICommonInterface;

import com.minhaj.hms.Entity.Departments;

import java.util.List;

public interface IService<T> {

    List<Departments> getAllLists();

    Departments saveDatas(T t);

    Departments getByIds(Long id);

    void deleteByIDs(Long id);

    Departments editByIDs(Long id, Departments departments);

}

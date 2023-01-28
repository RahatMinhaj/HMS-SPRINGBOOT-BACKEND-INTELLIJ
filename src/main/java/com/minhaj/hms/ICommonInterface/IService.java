package com.minhaj.hms.ICommonInterface;

import java.util.List;
import java.util.Optional;

public interface IService<T> {

    List<T> getAllLists();

    T saveDatas(T t);

    T getByIds(Long id);

    void deleteByIDs(Long id);

    T editByIDs(Long id, T t);

}

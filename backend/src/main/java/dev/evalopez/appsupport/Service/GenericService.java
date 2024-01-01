package dev.evalopez.appsupport.Service;

import java.util.List;

public interface GenericService<T> {
    
    List<T> getAll();
    
    T save(T entity);

    T update(T entity);

    void delete(T entity);

    T findById(Long id);
}

package geometry.com.epam.repository;

import java.util.List;

public interface Repository<T> {
    void add(T item);
    void remove(T item);
    List<T> readAll();

}

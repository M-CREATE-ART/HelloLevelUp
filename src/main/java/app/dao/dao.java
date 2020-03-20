package app.dao;

import java.util.Collection;
import java.util.List;

public interface dao<M> {
    void add(M m);
    Collection<M> getAll();
    M getByID(int M);
    void save(M m);
    boolean delete(M m);
}

package briliana.florist.DAOImplement;

import briliana.florist.Model.Model_florist;


public interface DAOImplement_florist {
    
    public void insert(Model_florist florist);
    
    public void update(Model_florist florist);
    
    public void delete(int id);
    
    public java.util.List<Model_florist> getAll();
    
    public java.util.List<Model_florist> getByKeyword(String keyword);
}

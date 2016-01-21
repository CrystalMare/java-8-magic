package nl.ireal.hibernate.demo.dao;

import nl.ireal.hibernate.demo.model.H2goLocatie;

public interface LocatieDao {
    H2goLocatie getLocatieById(int id);
}

package nl.ireal.hibernate.demo.impl.jpa;

import nl.ireal.hibernate.demo.dao.LocatieDao;
import nl.ireal.hibernate.demo.model.H2goLocatie;

class HibernateLocatieConnector implements LocatieDao {
    public H2goLocatie getLocatieById(int id) {
        return new LocatieEntity();
    }
}

package nl.ireal.hibernate.demo.impl.jdbc;

import nl.ireal.hibernate.demo.dao.LocatieDao;
import nl.ireal.hibernate.demo.model.H2goLocatie;

class JdbcLocatieConnector implements LocatieDao {

    @Override
    public H2goLocatie getLocatieById(int id) {
        return new Locatie();
    }
}

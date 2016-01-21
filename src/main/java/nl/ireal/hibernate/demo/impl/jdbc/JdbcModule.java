package nl.ireal.hibernate.demo.impl.jdbc;

import com.google.inject.AbstractModule;
import nl.ireal.hibernate.demo.dao.LocatieDao;

public class JdbcModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(LocatieDao.class).to(JdbcLocatieConnector.class);
    }
}

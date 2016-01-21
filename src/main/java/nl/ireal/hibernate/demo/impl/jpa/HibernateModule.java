package nl.ireal.hibernate.demo.impl.jpa;

import com.google.inject.AbstractModule;
import nl.ireal.hibernate.demo.dao.LocatieDao;

public class HibernateModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(LocatieDao.class).to(HibernateLocatieConnector.class);
    }
}

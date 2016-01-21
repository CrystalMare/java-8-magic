package nl.ireal.hibernate.demo;

import com.google.inject.Guice;
import com.google.inject.Injector;
import nl.ireal.hibernate.demo.dao.LocatieDao;
import nl.ireal.hibernate.demo.impl.jpa.HibernateModule;
import nl.ireal.hibernate.demo.model.H2goLocatie;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new HibernateModule());

        LocatieDao dao = injector.getInstance(LocatieDao.class);

        H2goLocatie locatie = dao.getLocatieById(0);
        System.out.println(locatie.getClass().getCanonicalName());
    }
}

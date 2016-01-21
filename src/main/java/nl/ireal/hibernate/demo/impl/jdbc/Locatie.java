package nl.ireal.hibernate.demo.impl.jdbc;

import nl.ireal.hibernate.demo.model.H2goLocatie;
import nl.ireal.hibernate.demo.model.H2goLocatieWerkgebied;

import java.util.ArrayList;
import java.util.List;

class Locatie implements H2goLocatie {

    private int locatieid;
    private String naam;
    private List<H2goLocatieWerkgebied> werkgebieden = new ArrayList<>();

    public int getLocatieid() {
        return locatieid;
    }

    public void setLocatieid(int locatieid) {
        this.locatieid = locatieid;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public List<H2goLocatieWerkgebied> getWerkgebieden() {
        return werkgebieden;
    }

    public void setWerkgebieden(List<H2goLocatieWerkgebied> werkgebieden) {
        this.werkgebieden = werkgebieden;
    }
}

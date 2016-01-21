package nl.ireal.hibernate.demo.impl.jpa;

import nl.ireal.hibernate.demo.model.H2goLocatie;
import nl.ireal.hibernate.demo.model.H2goLocatieWerkgebied;

import java.util.List;

class LocatieEntity implements H2goLocatie {
    private int locatieid;
    private String naam;
    private List<H2goLocatieWerkgebied> werkgebieden;

    public List<H2goLocatieWerkgebied> getWerkgebieden() {
        return werkgebieden;
    }

    public void setWerkgebieden(List<H2goLocatieWerkgebied> werkgebieden) {
        this.werkgebieden = werkgebieden;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocatieEntity that = (LocatieEntity) o;

        return locatieid == that.locatieid && (naam != null ? naam.equals(that.naam) : that.naam == null);
    }

    @Override
    public int hashCode() {
        int result = locatieid;
        result = 31 * result + (naam != null ? naam.hashCode() : 0);
        return result;
    }
}

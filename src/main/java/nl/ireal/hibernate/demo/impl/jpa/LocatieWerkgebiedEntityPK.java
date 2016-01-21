package nl.ireal.hibernate.demo.impl.jpa;

import java.io.Serializable;

class LocatieWerkgebiedEntityPK implements Serializable {
    private int locatie;
    private int werkgebied;

    public int getLocatie() {
        return locatie;
    }

    public void setLocatie(int locatie) {
        this.locatie = locatie;
    }

    public int getWerkgebied() {
        return werkgebied;
    }

    public void setWerkgebied(int werkgebied) {
        this.werkgebied = werkgebied;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocatieWerkgebiedEntityPK that = (LocatieWerkgebiedEntityPK) o;

        return locatie == that.locatie && werkgebied == that.werkgebied;
    }

    @Override
    public int hashCode() {
        int result = locatie;
        result = 31 * result + werkgebied;
        return result;
    }
}

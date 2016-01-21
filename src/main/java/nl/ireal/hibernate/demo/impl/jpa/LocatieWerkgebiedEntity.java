package nl.ireal.hibernate.demo.impl.jpa;

import nl.ireal.hibernate.demo.model.H2goLocatieWerkgebied;

class LocatieWerkgebiedEntity implements H2goLocatieWerkgebied {
    private int locatie;
    private int werkgebied;
    private boolean isDefault;

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

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocatieWerkgebiedEntity that = (LocatieWerkgebiedEntity) o;

        return locatie == that.locatie && werkgebied == that.werkgebied;
    }

    @Override
    public int hashCode() {
        int result = locatie;
        result = 31 * result + werkgebied;
        return result;
    }
}

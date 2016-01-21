package nl.ireal.hibernate.demo.impl.jdbc;

import nl.ireal.hibernate.demo.model.H2goLocatieWerkgebied;

class LocatieWerkgebied implements H2goLocatieWerkgebied {

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
}

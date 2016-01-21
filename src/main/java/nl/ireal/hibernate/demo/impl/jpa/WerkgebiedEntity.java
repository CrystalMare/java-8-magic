package nl.ireal.hibernate.demo.impl.jpa;

import nl.ireal.hibernate.demo.model.H2goWerkgebied;

class WerkgebiedEntity implements H2goWerkgebied {
    private int werkgebiedid;
    private String naam;

    public int getWerkgebiedid() {
        return werkgebiedid;
    }

    public void setWerkgebiedid(int werkgebiedid) {
        this.werkgebiedid = werkgebiedid;
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

        WerkgebiedEntity that = (WerkgebiedEntity) o;

        return werkgebiedid == that.werkgebiedid && (naam != null ? naam.equals(that.naam) : that.naam == null);
    }

    @Override
    public int hashCode() {
        int result = werkgebiedid;
        result = 31 * result + (naam != null ? naam.hashCode() : 0);
        return result;
    }
}

package nl.ireal.hibernate.demo.model;

public interface H2goLocatieWerkgebied {
    int getLocatie();

    void setLocatie(int locatie);

    int getWerkgebied();

    void setWerkgebied(int werkgebied);

    boolean isDefault();

    void setDefault(boolean aDefault);
}

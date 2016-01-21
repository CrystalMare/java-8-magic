package nl.ireal.hibernate.demo.model;

import java.util.List;

public interface H2goLocatie {

    int getLocatieid();

    void setLocatieid(int locatieid);

    String getNaam();

    void setNaam(String naam);

    List<H2goLocatieWerkgebied> getWerkgebieden();

    void setWerkgebieden(List<H2goLocatieWerkgebied> werkgebieden);

    default void getDefaultWerkgebied() {
        getWerkgebieden().stream().filter(H2goLocatieWerkgebied::isDefault).findFirst().orElseGet(null);
    }
}


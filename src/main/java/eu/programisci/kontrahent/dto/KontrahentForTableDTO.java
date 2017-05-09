package eu.programisci.kontrahent.dto;

import java.util.Date;

public class KontrahentForTableDTO {

    private Long id;
    private String name;
    private String adres;
    private String nip;
    private Date creationDate;

    public KontrahentForTableDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long aId) {
        id = aId;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String aAdres) {
        adres = aAdres;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String aNip) {
        nip = aNip;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date aCreationDate) {
        creationDate = aCreationDate;
    }
}

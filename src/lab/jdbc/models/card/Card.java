package lab.jdbc.models.card;

import lab.jdbc.models.BaseEntity;

import java.io.Serializable;

public abstract class Card extends BaseEntity implements Serializable {
    private int idFlash;
    private long idCategory;
    private String name;
    private Recto recto;
    private Verso verso;
    public Card() {
    }

    public Card(int idFlash, long idCategory,String name, Recto recto, Verso verso) {
        this.idFlash = idFlash;
        this.idCategory = idCategory;
        this.name = name;
        this.recto = recto;
        this.verso = verso;
    }

    public Card(int id, int version, int idFlash, long idCategory,String name, Recto recto, Verso verso) {
        super(id, version);
        this.idFlash = idFlash;
        this.idCategory = idCategory;
        this.name = name;
        this.recto = recto;
        this.verso = verso;
    }

    public long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(long idCategory) {
        this.idCategory = idCategory;
    }

    public Recto getRecto() {
        return recto;
    }

    public void setRecto(Recto recto) {
        this.recto = recto;
    }

    public Verso getVerso() {
        return verso;
    }

    public void setVerso(Verso verso) {
        this.verso = verso;
    }

    public int getIdFlash() {
        return idFlash;
    }

    public void setIdFlash(int idFlash) {
        this.idFlash = idFlash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

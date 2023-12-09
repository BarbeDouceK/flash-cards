package lab.jdbc.models;

import java.io.Serializable;

//@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    /*
        @Id
        @GeneratedValue(strategy = IDENTIFY)
     */
    private int id;
    //@Version
    private int version;

    public BaseEntity() {
    }

    public BaseEntity(int id, int version) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}

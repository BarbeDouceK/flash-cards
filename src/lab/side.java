package lab;

public class side {
    private int idSide;

    private String content;



    // Constructeur du side
    public side() {

    }


    // Constructeur du side byId
    public side(int idSide) {
        this();
        this.idSide = idSide;
    }

    // Constructeur complet
    public side(int idSide, String content) {
        this(idSide);
        this.content = content;
    }

    // Getters and Setters
    public int getIdSide() {
        return idSide;
    }

    public void setIdSide(int idSide) {
        this.idSide = idSide;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

package lab.jdbc.models.card;

public  abstract class Side {
    private int idSide;

    private String content;
    // Constructeur du side
    public Side() {

    }
    // Constructeur complet
    public Side(int idSide, String content) {
        this.idSide = idSide;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Side{");
        sb.append("idSide=").append(idSide);
        sb.append(", content='").append(content).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

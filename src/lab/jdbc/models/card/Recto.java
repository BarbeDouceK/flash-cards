package lab.jdbc.models.card;

public class Recto extends Side {
    private final int sideNumber = 1;
    private String title;
    // Constructeurs
    public Recto(){

    }


    public Recto(int idSide, String content) {
        super(idSide, content);
    }

    public Recto(int idSide, String content, String title) {
        super(idSide, content);
        this.title = title;
    }

    public int getSideNumber() {
        return sideNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Recto{");
        sb.append("sideNumber=").append(sideNumber);
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}



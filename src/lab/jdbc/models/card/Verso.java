package lab.jdbc.models.card;
public class Verso extends Side {
    private final int sideNumber = 2;
    private String bottom;
    // Dispose aussi des attributs de son super : Side.java
    // Soit : int idSide et String content

    // Constructeurs
    public Verso(){

    }
    public Verso(int idSide, String content) {
        super(idSide, content);
    }

    public Verso(int idSide, String content, String bottom) {
        super(idSide, content);
        this.bottom = bottom;
    }

    public int getSideNumber() {
        return sideNumber;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Verso{");
        sb.append("sideNumber=").append(sideNumber);
        sb.append(", bottom='").append(bottom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

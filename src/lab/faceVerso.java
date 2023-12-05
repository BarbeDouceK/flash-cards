package lab;

public class faceVerso extends side {

    private String bottom;
    // Dispose aussi des attributs de son super : side
    // Soit int idSide et String content

    // Constructeurs
    public faceVerso (){

    }

    public faceVerso(int idSide) {
        super(idSide);
    }

    public faceVerso(int idSide, String content) {
        super(idSide, content);
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }
}

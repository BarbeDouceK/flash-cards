package lab;

public class faceRecto extends side {

    private String title;
    // Dispose aussi des attributs de son super : side
    // Soit int idSide et String content

    // Constructeurs
    public faceRecto (){

    }

    public faceRecto(int idSide) {
        super(idSide);
    }

    public faceRecto(int idSide, String content) {
        super(idSide, content);
    }
}

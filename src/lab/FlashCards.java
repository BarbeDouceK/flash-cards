package lab;

public class FlashCards {

    private int id;
    private int idCategory;

    private side recto;

    private side verso;

    public FlashCards(){

    }
    public FlashCards(int id) {
        this.id = id;
    }

    public FlashCards(int id, int idCategory) {
        this(id);
        this.idCategory = idCategory;
    }

    public FlashCards(int id, int idCategory, side recto, side verso){
        this(id,idCategory);
        this.recto = recto;
        this.verso = verso;
    }

    // GETTERS AND SETTERS should be ok

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public side getRecto() {
        return recto;
    }

    public void setRecto(side recto) {
        this.recto = recto;
    }

    public side getVerso() {
        return verso;
    }

    public void setVerso(side verso) {
        this.verso = verso;
    }
}

package lab.jdbc.models.card;

import java.io.Serializable;

public class FlashCard extends Card implements Serializable {

    public FlashCard() {
    }

    public FlashCard(int id, long idCategory,String name, Recto recto, Verso verso) {
        super(id, idCategory,name, recto, verso);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FlashCard{");
        sb.append('}');
        return sb.toString();
    }
}

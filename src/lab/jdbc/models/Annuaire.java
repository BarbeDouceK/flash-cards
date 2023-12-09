package lab.jdbc.models;

import lab.jdbc.models.card.FlashCard;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Annuaire implements Serializable {
    private String name;
    private List<FlashCard> flashCards;

    public Annuaire() {
    }

    public Annuaire(String name, List<FlashCard> flashCards) {
        this.name = name;
        this.flashCards = flashCards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FlashCard> getFlashCards() {
        return flashCards;
    }

    public void setFlashCards(List<FlashCard> flashCards) {
        this.flashCards = flashCards;
    }

    @Override
    public String toString() {
        return "Annuaire{" +
                "name='" + name + '\'' +
                ", flashCards=" + flashCards +
                '}';
    }

    public static Annuaire createAnnuaire(String name) {

        List<FlashCard> flashCards = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            flashCards.add(new FlashCard());
        }
        Annuaire annuaire = new Annuaire();
        annuaire.setName(name);
        annuaire.setFlashCards(flashCards);
        return annuaire;
    }
}

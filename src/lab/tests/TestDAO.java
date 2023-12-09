package lab.tests;

import lab.jdbc.dao.FlashCardDao;
import lab.jdbc.dao.IFlashCardDao;

public class TestDAO {
    public static void main(String[] args) {
        System.out.println("\tBienvenu.e.s dans Le Test DAO - FlashCards Memory Game");
        System.out.println("\nTest de la création de la TABLE flashcards dans la BDD flashcard");
        IFlashCardDao flashCardDao = new FlashCardDao();
        // Après avoir instancié un nouvel objet FlashCardDao je vais créer la table dans la BDD
        flashCardDao.createTable();
        System.out.println("Retour après création de table" + flashCardDao);
    }
}

package lab.jdbc.dao;

import lab.jdbc.models.card.FlashCard;

import java.util.List;

public interface IFlashCardDao {
    //CRUD
    void createTable();
    boolean create(FlashCard flashCard);
    FlashCard findById(int id);
    List<FlashCard> findAll();
    boolean update(FlashCard flashCard);
    boolean delete(int id);

}

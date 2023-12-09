package lab.jdbc.dao;


import lab.jdbc.DbConnection;
import lab.jdbc.models.card.FlashCard;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class FlashCardDao implements IFlashCardDao {
    @Override
    public void createTable() {
        try (Statement statement = DbConnection.getInstance().createStatement()){
            String sql  = "CREATE TABLE IF NOT EXISTS flashcards(id INT(20) NOT NULL AUTO_INCREMENT, version INT(10), idflash INT(10), idcategorie INT(10), name VARCHAR(20), recto INT(10), verso INT(10), PRIMARY KEY ( id ))";
            statement.execute(sql);
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    @Override
    public boolean create(FlashCard flashCard) {
        return false;
    }

    @Override
    public FlashCard findById(int id) {
        return null;
    }

    @Override
    public List<FlashCard> findAll() {
        return null;
    }

    @Override
    public boolean update(FlashCard flashCard) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}

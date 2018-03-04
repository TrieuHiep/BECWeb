package dao.cloth;

import model.itemspkg.bookpkg.Book;
import model.itemspkg.clothespkg.Clothes;

import java.util.List;

public interface ClothDAO {
    List<Clothes> getAllCloth();
}

package com.trainibit.labs.bookfinder.service;
import com.trainibit.labs.bookfinder.model.Book;
import java.util.List;

public interface BookService {
    List<Book> findAll();

    //Metodo para buscar libro * ID
    Book getById(int id);

    //Metodo para guardar
    Book save(Book book);
}

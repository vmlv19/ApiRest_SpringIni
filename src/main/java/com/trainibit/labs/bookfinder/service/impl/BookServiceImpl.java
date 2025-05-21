package com.trainibit.labs.bookfinder.service.impl;

import com.trainibit.labs.bookfinder.model.Book;
import com.trainibit.labs.bookfinder.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {

    // Lista mutable que almacena los libros iniciales
    private List<Book> books = new ArrayList<>(List.of(
            new Book(1, "El quijote", "Miguel Cervantes"),
            new Book(2, "Cien años Soledad", "Garcia Márquez"),
            new Book(3, "Rayuela", "Julio Cortázar"),
            new Book(4, "Oliver Twist", "Charles Dickens")
    ));

    @Override
    public List<Book> findAll() {
        return books; // Retorna todos los libros
    }

    @Override
    public Book getById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book; // Encontró el libro, retorna
            }
        }
        return null; // No encontrado
    }

    @Override
    public Book save(Book book) {
        books.add(book); // Agrega el libro a la lista mutable
        return book;     // Retorna el libro agregado
    }
}

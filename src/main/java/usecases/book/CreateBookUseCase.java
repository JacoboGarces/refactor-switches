package usecases.book;


import models.Book;
import usecases.interfaces.IUseCase;

public class CreateBookUseCase implements IUseCase<Book> {
    @Override
    public Book execute(Book value) {
        return value;
    }

    @Override
    public Book execute() {
        return null;
    }
}

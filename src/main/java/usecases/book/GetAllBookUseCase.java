package usecases.book;

import models.Book;
import usecases.interfaces.IUseCase;

import java.util.Arrays;
import java.util.List;

public class GetAllBookUseCase implements IUseCase<List<Book>> {
    @Override
    public List<Book> execute(List<Book> value) {
        return null;
    }

    @Override
    public List<Book> execute() {
        return Arrays.asList(
                new Book("Example1", "Example", "Example", 0, 0, 0, 0),
                new Book("Example2", "Example", "Example", 0, 0, 0, 0),
                new Book("Example3", "Example", "Example", 0, 0, 0, 0)
        );
    }
}

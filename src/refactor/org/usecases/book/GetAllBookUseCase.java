package refactor.org.usecases.book;

import refactor.org.models.Book;
import refactor.org.usecases.interfaces.IUseCase;

import java.util.List;

public class GetAllBookUseCase implements IUseCase<List<Book>> {
    @Override
    public List<Book> execute(List<Book> value) {
        return null;
    }

    @Override
    public List<Book> execute() {
        return null;
    }
}

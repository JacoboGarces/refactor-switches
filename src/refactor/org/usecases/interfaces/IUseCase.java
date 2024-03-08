package refactor.org.usecases.interfaces;

public interface IUseCase<T> {
    T execute(T value);
    T execute();
}

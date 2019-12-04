package geometry.com.epam.observer;

public interface Observer<T> {
    void handleEvent(T item);
}

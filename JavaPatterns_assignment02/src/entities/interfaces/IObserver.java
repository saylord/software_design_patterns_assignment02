package entities.interfaces;

import java.util.List;

public interface IObserver {
    void update(List<String> notifications);
}

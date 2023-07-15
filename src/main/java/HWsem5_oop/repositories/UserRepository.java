package HWsem5_oop.repositories;

import HWsem5_oop.models.Student;
import HWsem5_oop.models.User;

import java.util.List;

public interface UserRepository <T extends User> {
    void create(T user);

    List<T> getAll();

    int remove(String fullName);

    List<T> getAllByGroupTitle(String groupTitle);
}

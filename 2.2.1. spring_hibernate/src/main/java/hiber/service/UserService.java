package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    User add(User user);
    List<User> listUsers();
    User getUserCar(String model, int series);
}

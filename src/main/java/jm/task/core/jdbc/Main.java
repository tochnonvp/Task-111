package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Алексей", "Карабань", (byte) 33);
        userService.saveUser("Дима", "петров", (byte) 54);
        userService.removeUserById(1);
        userService.saveUser("Женя", "Мышкин", (byte) 12);
        userService.saveUser("Костя", "Кышкин", (byte) 76);

        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

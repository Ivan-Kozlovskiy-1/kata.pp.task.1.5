package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.dropUsersTable();
        userService.createUsersTable();

        userService.saveUser("AAA", "A1", (byte) 1);
        userService.saveUser("AAB", "B1", (byte) 11);
        userService.saveUser("AAC", "C1", (byte) 111);
        userService.saveUser("AAV", "V1", (byte) 2);
//      userService.removeUserById(2);
        System.out.print(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();



    }
}

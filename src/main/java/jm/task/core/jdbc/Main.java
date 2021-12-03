package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService usi = new UserServiceImpl();
        usi.createUsersTable();
        usi.saveUser("Rich", "Bat", (byte) 21);
        usi.saveUser("Atok", "Klubok", (byte) 120);
        usi.saveUser("Komok", "Semli", (byte) 18);
        usi.saveUser("Anton", "Kelev", (byte) 35);
        List<User> list = usi.getAllUsers();
        for(User u : list) {
            System.out.println(u);
        }
        usi.cleanUsersTable();
        usi.dropUsersTable();

    }
}
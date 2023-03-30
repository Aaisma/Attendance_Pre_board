package org.example;

import org.example.models.Attendance;
import org.example.models.Class;
import org.example.models.User;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Connection connection = DBUtils.connect();

        String class_name;
        String username;
        String password;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Username: ");
        username = scanner.nextLine();
        System.out.println("Password:");
        password = scanner.nextLine();

        User user01 = new User(username, password);
        DBUtils.addUsers(user1, connection);

        List<User> userList = DBUtils.getUser(connection, "Ross Geller");
        for (User user : userList) {
            System.out.println(user.getUsername() + " " + user.getPassword());
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Class Name:");
        class_name = scanner2.nextLine();

        Class class01 = new Classes(class_name);
        DBUtils.addClass(class01, connection);

        List<Class> classList = DBUtils.getClass(connection, "Sagarmatha");
        for (Class class : classList) {
            System.out.println(class.getClassname());
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Class Id: ");
        int class_id = scanner01.nextInt();
        System.out.println("User Id:");
        int user_id = scanner01.nextInt();
        scanner01.close();


        try {
            Attendance attendance = new Attendance(classId, userId);
            DBUtils.addAttendance(attendance, connection);
                System.out.println("Successful!");
        } catch (Exception e) {
            System.out.println("Failed! " + e.getMessage());
        }
    }
}
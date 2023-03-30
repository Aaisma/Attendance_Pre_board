package org.example;

public class lending_borrowing {
    int attendance_id;
    int class_id;
    int user_id;


    public int getAttendance_id() {
        return attendance_id;
    }

    public void setAttendance_id(int attendance_id) {
        this.attendance_id = attendance_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public lending_borrowing(int attendance_id, int class_id, int user_id) {
        this.attendance_id = attendance_id;
        this.class_id = class_id;
        this.user_id = user_id;
    }
}

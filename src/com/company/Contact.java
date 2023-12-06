package com.company;

public class Contact {
    String name;
    String surname;
    String phone;
    Group group;

    public Contact(String name, String surname, String phone, Group group) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.group = group;
    }

    public String toString() {
//        return String.format("Фамилия: %s,  Имя: %s,  номер: %s, группа: %s", surname, name, phone , group);
        return name + " " + surname + " " + phone + " " + group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public Group getGroup() {
        return group;
    }
}

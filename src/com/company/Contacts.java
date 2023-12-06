package com.company;

import java.util.HashMap;
import java.util.Map;

public class Contacts {
    Map<String, Contact> contactMap;
    public Contacts() { // Создаем без вх параметров
        this.contactMap = new HashMap<>(); // Создаем пустым чтобы потом добавлять
    }
    public void addContact(String name, String surname, String phone, Group group){
        Contact contact = new Contact(name, surname, phone, group);
        contactMap.put(phone, new Contact(name, surname, phone, group));
    }
    public void removeContact(String name, String surname){
        for (Map.Entry<String, Contact> entry : contactMap.entrySet()){
            Contact contact = entry.getValue();
            if(contact.getName().equals(name) && contact.getSurname().equals(surname)){
                contactMap.remove(entry.getKey());
            }
        }
    }
    public Contact searchContact(String phone){
        if(contactMap.containsKey(phone)){
            return contactMap.get(phone);
        }
        return null; // return null - Если ключ phone отсутствует в contactMap, метод возвращает null, что означает, что контакт с указанным номером телефона не найден в коллекции.
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "contactMap=" + contactMap +
                '}';
    }
}

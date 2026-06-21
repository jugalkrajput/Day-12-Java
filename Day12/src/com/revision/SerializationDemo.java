package com.revision;

import java.io.*;

class Student implements Serializable {

	private static final long serialVersionUID = 1L;
    
    int id;
    String name;
    transient String password;  

    Student(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

public class SerializationDemo {
    
	public static void main(String[] args) {
    
		Student s1 = new Student(101, "Rahul", "secret123");
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(s1);
            System.out.println("Object serialized!");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s2 = (Student) ois.readObject();
            System.out.println("ID: " + s2.id);        
            System.out.println("Name: " + s2.name);    
            System.out.println("Password: " + s2.password); 
        } 
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
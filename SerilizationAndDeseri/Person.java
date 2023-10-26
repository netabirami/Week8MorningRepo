package SerilizationAndDeseri;

import java.io.*;
import java.time.LocalDateTime;

public class Person implements Serializable {
    private String name;
    private int age;
    private String address;
    //2nd exercise
    private transient LocalDateTime currentDateTime;
    //3rd exercise Vehicle
    private String make;
    private String model;
    private  int year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDateTime getCurrentDateTime() {
        return currentDateTime;
    }

    public void setCurrentDateTime(LocalDateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Abi");
        person.setAge(23);
        person.setAddress("123 main road");
        person.setCurrentDateTime(LocalDateTime.now());
        person.setModel("BMW");
        person.setMake("Audi X1");
        person.setYear(2021);


        try (FileOutputStream fileOutputStream = new FileOutputStream("person.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileInputStream fileInputStream = new FileInputStream("person.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Person deserializedPerson = (Person) objectInputStream.readObject();

            // Verify that the data is accurately restored
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge());
            System.out.println("Address: " + deserializedPerson.getAddress());
            System.out.println("Time: " + deserializedPerson.getCurrentDateTime());
            System.out.println("Model:"+deserializedPerson.getModel());
            System.out.println("Make:"+deserializedPerson.getMake());
            System.out.println("year:"+deserializedPerson.getYear());
        }
        catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    }





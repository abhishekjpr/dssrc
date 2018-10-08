package com.abhishek.questions.serialization;

import java.io.*;

public class UseEmployee  {

    public static void main(String[] args)
        throws Exception{
        Employee employee = new Employee();
        employee.setEmpId(1);
        employee.setEmpName("Abhishek");

        Employee.InnerEmployee ei = new Employee.InnerEmployee();
        ei.setEmpCode(111);

        File file = new File("object.txt");
        boolean created = false;
        if(!file.exists())
            created = file.createNewFile();
        if(!created){
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ei);
            System.out.println("Successfully written.");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            ei = (Employee.InnerEmployee) ois.readObject();
            System.out.println("Employee : "+ei);
        } else {
            System.out.println("Error in creating file.");
        }
    }
}

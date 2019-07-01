
package com.inverview.serialization.p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.imageio.stream.FileCacheImageOutputStream;

class Employee {

	String sname;
	String degination;
	String department;

	public Employee(String sname, String degination, String department) {
		super();
		this.sname = sname;
		this.degination = degination;
		this.department = department;
	}

	public Employee() {
		System.out.println("Hello This is my Default constructor in Employee class");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+sname+"\t"+degination+"\t"+department;
	}

}

class Address extends Employee  {

	String add1;
	String street;
    Employee employee;
    	public Address(String sname, String degination, Employee employee) {
		this.add1 = add1;
		this.street = street;
		this.employee = employee;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "" + add1 + "\t" + street;
	}

}

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello");

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("Manmohan.properties");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(new Address("Mathikare", "Yeswanthpura",new Employee("Manmohan", "SSC", "CSC")));
			objectOutputStream.flush();

			FileInputStream fileInputStream = new FileInputStream("Manmohan.properties");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Employee readObject =(Employee)objectInputStream.readObject();
			
			System.out.println("Employee class\t" +readObject);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

package hw7;

import java.io.Serializable;

public class Cat implements Serializable{
	private static final long serialVersionUID = 8815931259008764856L;
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}

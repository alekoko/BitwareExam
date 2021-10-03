package com.bitware.exam.models;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Person person = new Person("Alejandra" , 25, null , 55f, 1.59f, Person.GENDER_WOMAN);
		System.out.println(person.calculateBMI());
		System.out.println(person.isAdult());
		System.out.println(person.checkGender(Person.GENDER_WOMAN));
		System.out.println(person.generateRandomNss());

		
	}

}

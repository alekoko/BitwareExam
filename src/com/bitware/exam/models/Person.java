package com.bitware.exam.models;

import java.util.Random;

public class Person {

	public static final char GENDER_MAN = 'H';
	public static final char GENDER_WOMAN = 'M';
	static final int OVERWEIGHT = 1;
	static final int NORMALWEIGHT = 0;
	static final int UNDERWEIGHT = -1;

	private String name = "";
	private int age = 0; 
	private String nss = "";
	private char gender = GENDER_MAN;
	private float weight = 0.0f; 
	private float height = 0.0f;
	
	
	public Person(String name, int age, String nss, float weight, float height, char gender) {
		this.name = name;
		if(age >= 0) 
			this.age = age;
		this.nss = nss;
		if(weight > 0f)
			this.weight = weight;
		if(height > 0f)
			this.height = height;
		this.gender = gender;
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
		if(age >= 0)
			this.age = age;
	}
	
	public String getNss() {
		return nss;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		if(weight > 0f)
			this.weight = weight;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		if(height > 0f)
			this.height = height;
	}


	public char getGender() {
		return gender;
	}
	
	public void setGender() {
		
	}
	
	private int calculateBMIMen(){
		float bmi = weight / (height * height);
		if(bmi < 20) {
			return UNDERWEIGHT;
		}
		else if(bmi >= 20 && bmi <= 25) {
			return NORMALWEIGHT;
		}else{ // >25
			return OVERWEIGHT;
		}
	}
	
	private int calculateBMIWomen(){
		float bmi = weight / (height * height);
		if(bmi < 19) {
			return UNDERWEIGHT;
		}
		else if(bmi >= 19 && bmi <= 24) {
			return NORMALWEIGHT;
		}else{ // > 24 
			return OVERWEIGHT;
		}
	}
	
	public int calculateBMI() {
		return (gender == GENDER_MAN) ? calculateBMIMen() : calculateBMIWomen();	
	}

	public boolean isAdult() {
		return (age >= 18);
	}
	
	public boolean checkGender(char genre) {
		return (gender == genre);
	}
	
	public String generateRandomNss() {
		Random randomNss = new Random();
	
		String setOfCharacters = "ABCDFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String nss = "";
    
		for (int i = 0 ; i < 8 ; i++) {
			int randomInt = randomNss.nextInt(setOfCharacters.length());
			char randomChar = setOfCharacters.charAt(randomInt);
    	
			nss += randomChar;
        
		}
		this.nss = nss;
		return nss;
    
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", nss=" + nss + ", gender=" + gender + ", weight=" + weight
				+ ", height=" + height + "]";
	}
	
	
}

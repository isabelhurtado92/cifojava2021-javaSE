package PersonExample;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	// fields from Person Class
	public String name;
	public int age;
	public int weigth;
	public int heigth;
	public double basicSalary;
	public double yearNetSalary;
	// adding 2 new fields
	public double money;
	public int tobaccoPacket;
	public double fitnessHours;

	// Constructor from Person Class
	public Person() {
	}

	public Person(String name, int age, int weigth, int heigth, double basicSalary, double yearNetSalary) {

		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.heigth = heigth;
		this.basicSalary = basicSalary;
		this.yearNetSalary = yearNetSalary;

	}

	// New constructor
	public Person(String name, int age, double money, int tobaccoPacket) {

		this.name = name;
		this.age = age;
		this.money = money;
		this.tobaccoPacket = tobaccoPacket;

	}

	public Person(String name) { // int cigarrettesPerDay

		this.name = name;
		// this.cigarrettesPerDay = cigarrettesPerDay;
	}

	// Methods from Person Class

	public void becomeOlder() {

		this.age = age + 1;
	}

	public double yearNetSalary() {

		double yearNetSalary = 0.0;

		if (basicSalary > 0) {

			if (age <= 30) {

				double taxToDeduct6 = (basicSalary * 0.06);
				yearNetSalary = ((basicSalary - taxToDeduct6) * 14);

			} else {

				double taxToDeduct12 = (basicSalary * 0.12);
				yearNetSalary = ((basicSalary - taxToDeduct12) * 14);

			}

		} else
			System.out.println("No es pot.");

		return yearNetSalary;

	}

	public boolean isAdult() {

		if (age >= 18) {
			System.out.println("You're an adult");

			return true;
		}
		System.out.println("You're not an adult");
		return false;
	}

	public boolean tobaccoBuy(int tobaccoPacket) {
		if ((isAdult() == true) && (money >= 5 * tobaccoPacket)) {

			this.setTobaccoPacket(this.getTobaccoPacket() + tobaccoPacket);
			money = money - (5 * tobaccoPacket);
			System.out.println("You can buy tobacco and you have left " + money);
			return true;
		}
		System.out.println("You can't buy tobacco");
		return false;
	}

	public boolean isAbleToSmoke() {
		if (tobaccoPacket > 0) {
			System.out.println("Finally, you can smoke");
			tobaccoPacket--;
			return true;
		}
		System.out.println("Sorry, you can't smoke");
		return false;
	}

	public String advice (boolean isAbleTosmoke) {

		Scanner reader = new Scanner(System.in);

		if (isAbleTosmoke == true) {
			System.out.println("�How many cigarrettes per day do you smoke?");
			int answer = Integer.valueOf(reader.nextLine());

			if (answer > 25) {
				System.out.println(
						"OMG!!!!!!You might think of reducing. You're losing" + (answer * 5) + "hours of your life");
			}

			if (answer > 10) {
				System.out
						.println("�Do you ever think of quitting? You're losing" + (answer * 5) + "hours of your life");
			}

			if (answer > 5) {
				System.out.println("Not bad, but still, you're losing" + (answer * 5) + "hours of your life");
			}

			if (answer < 5) {
				System.out.println(
						"You could quit any minute. That way you wouldn't lose" + (answer * 5) + "hours of your life");
			}
		
		}
		else {

				System.out.println("Nice");
			}

		return this.getName() + " got an advice.";
	}

	
	
	// Getters and Setters and toString
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

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getTobaccoPacket() {
		return tobaccoPacket;
	}

	public void setTobaccoPacket(int tobaccoPacket) {
		this.tobaccoPacket = tobaccoPacket;
	}

	// toString
	@Override
	public String toString() {
		return "Person Fields: (name=" + name + ", age=" + age + ", weigth=" + weigth + ", heigth=" + heigth
				+ ", basicSalary=" + basicSalary + "money= " + money + "tobaccoPacket =" + tobaccoPacket + ")";
	}

}

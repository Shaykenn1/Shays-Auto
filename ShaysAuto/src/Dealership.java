package com.user;

import java.util.ArrayList;

public class Dealership {

	ArrayList<Car> carArray=new ArrayList<Car>();
	

	
public Dealership() {
	
	//create cars for dealership
			createCars();	
	
	}



public ArrayList<Car> getcarArray() {
	return carArray;
}



public void setcarArray(ArrayList<Car> carArray) {
	this.carArray = carArray;
}
//create cars and add them to array list cars
public void createCars() {
	
	Car car1=new Car("New","Dodge","Charger RT","Great Ride",2019,9000,29000,".\\images\\img1.jpg",101);
	Car car2=new Car("Used","Dodge","Challenger","Great Condition",2018,0734,18000,".\\images\\img2.jpg",102);
	Car car3=new Car("New","Dodge","Charger","Eye Catcher",2019,0004,37699,".\\images\\img3.jpg",103);
	Car car4=new Car("New","Dodge","Charger","Bad to the Bone",2019,0363,33573,".\\images\\img4.jpg",104);
	Car car5=new Car("New","Dodge","Charger","Like-New",2018,7364,25456,".\\images\\img5.jpg",105);
	Car car6=new Car("New","Dodge","Rogue","Beats by Shay",2019,00044,43634,".\\images\\img6.jpg",106);
	Car car7=new Car("Used","Dodge","Charger","Beginner Charger",2016,9354,24763,".\\images\\img7.jpg",107);
	Car car8=new Car("New","Dodge","Durango","Super Low Miles",2017,54563,20643,".\\images\\img8.jpg",108);
	Car car9=new Car("New","Dodge","Challenger","It's Lit",2018,8465,24763,".\\images\\img9.jpg",109);
	Car car10=new Car("New","Dodge","Challenger","This is a Winner",2018,04756,37563,".\\images\\img10.jpg",110);	
	
	carArray.add(car1);
	carArray.add(car2);
	carArray.add(car3);
	carArray.add(car4);
	carArray.add(car5);
	carArray.add(car6);
	carArray.add(car7);
	carArray.add(car8);
	carArray.add(car9);
	carArray.add(car10);
	//set dates
	for(Car i: carArray) {
		
		i.setInventoryDate("5/5/2018");
		
	}
	//set three cars with dates older than 120
	car1.setInventoryDate("5/1/2018");
	car5.setInventoryDate("1/3/2017");
	car7.setInventoryDate("1/1/2018");
	
	
	
}
	
}
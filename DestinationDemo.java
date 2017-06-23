package com.bell.s10;

import java.util.Arrays;
import java.util.Scanner;

public class DestinationDemo {

public static void main(String[] args) {
	System.out.println("Please enter the number of destinations");
	Scanner sc = new Scanner(System.in);
	int nDest = sc.nextInt(); // I got the number of destinations
	String[] names= new String[nDest];
	int nhtl =0;    // Counter for number of hotels in each city
	String location;   
	Destinations[] dst = new Destinations[nDest];
	//int []dst=new int[nDest];
	// Now I have to take all the details individually 
	for(int i=0;i<nDest;i++){
		System.out.println("Please enter the name of the city : ");
		names[i] = sc.next();
		System.out.println("Please enter the state of the city : ");
		location =sc.next();
		System.out.println("How many hotels do you want to enter");
		nhtl = sc.nextInt();
		String[] htls=new String[nhtl];
		double[] cost= new double[nhtl];
		int[] nDays = new int[nhtl];
		System.out.println("Please enter hotel names and their costs individually andrespectively ::");
		for(int j=0;j<nhtl;j++){
			System.out.println("Please enter hotel name:");
			htls[j] = sc.next();
			System.out.println("Please enter number of days:");
			nDays[j]=sc.nextInt();
			System.out.println("Please enter the cost in double format:");
			cost[j] = sc.nextDouble();
		}
		
		dst[i]=new Destinations(names[i],location,htls,cost,nDays);
	}
	// Destinations(String name, String location, String[] hotels, double[] cost, int[] days)
	
	
// Destinations informations
//1st Destination
/*	
String[] d1Hotels = {"Hyat","Prestige","Raheja"};
double[] d1Cost = {200.00,350.50,500.60};
int[] d1Days = {3,5,8};
Destinations hydDest = new Destinations("Hyd", "TG",d1Hotels ,d1Cost ,d1Days);
//2nd Destination
String[] d2Hotels = {"Amaravati","Sagar","Tripta"};
double[] d2Cost = {280.00,550.50,600.60};
int[] d2Days = {2,5,10};
Destinations AmarDest = new Destinations("Amaravati", "AP",d2Hotels ,d2Cost ,d2Days);
//3rd Destination
String[] d3Hotels = {"Hyatt1","ALLInONE","Extended"};
double[] d3Cost = {210.00,750.50,590.60};
int[] d3Days = {3,5,8};
Destinations goaDest = new Destinations("Goa", "MT",d3Hotels ,d3Cost ,d3Days);



// Hyd in TG and Pakage Details:
//     1. Hyat - 200 - 3 days package
//      2. Prestigate - 350.50 5 days package
 * 
 */
Destinations[] holidaySpots = new Destinations[nDest];
//holidaySpots[0] = hydDest;
//holidaySpots[1] = AmarDest;
//holidaySpots[2] = goaDest;

for(int i=0;i<nDest;i++)
{
	holidaySpots[i]= dst[i];
} 
// Let the customer enter his destination, so that we display the package avaliable.
System.out.println("Welcome to our website, Please enter your destination ?");
Scanner scan = new Scanner(System.in);
String customerDest = scan.next();
boolean found = false;
for(int i=0; i<nDest;i++){
Destinations d = holidaySpots[i];
if(customerDest.equals(d.getName())){
found  = true;
System.out.println("Good News...we found your destination with awesome package. Here are the details");
System.out.println(d.toString());
//for(String j:d.getHotels())
//System.out.println(i+"."+d.getHotels()+ "-"+ d.getPackageCost() + "-" + d.getNoOfDays());
String[] hRef = d.getHotels();
double[] pRef = d.getPackageCost();
int[] dRef = d.getNoOfDays();
int Count=0;
for(int sp=0;sp<hRef.length;sp++){
	Count=sp+1;
	System.out.println(Count+". \t"+hRef[sp]+ " - "+ pRef[sp] + " - "+dRef[sp] + " days package");
}
break;
}
}
//Hyd in TG and Pakage Details:
//1. Hyat - 200 - 3 days package
//2. Prestigate - 350.50 5 days package

if(!found){
System.out.println("Ohh...Sorry, We couldn't find your destination. Please check beck.");
}
sc.close();
scan.close();
}

}


class Destinations {
private String name;
private String location;
private String[] hotels;
private double[] packageCost;
private int[] noOfDays;
Destinations(){
}
Destinations(String name, String location, String[] hotels, double[] cost, int[] days){
this.name = name;
this.location = location;
this.hotels = hotels;
packageCost = cost;
noOfDays = days;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getLocation() {
return location;
}

public void setLocation(String location) {
this.location = location;
}

public String[] getHotels() {
return hotels;
}

public void setHotels(String[] hotels) {
this.hotels = hotels;
}

public double[] getPackageCost() {
return packageCost;
}

public void setPackageCost(double[] packageCost) {
this.packageCost = packageCost;
}

public int[] getNoOfDays() {
return noOfDays;
}

public void setNoOfDays(int[] noOfDays) {
this.noOfDays = noOfDays;
}

@Override
/*public String toString() {
return "Destinations [name=" + name + ", location=" + location
+ ", hotels=" + Arrays.toString(hotels) + ", packageCost="
+ Arrays.toString(packageCost) + ", noOfDays="
+ Arrays.toString(noOfDays) + "]";
}*/
public String toString() {
return "The city " + name + " is in " + location + "\n";
	/* + Arrays.toString(hotels)+ " " 
+ Arrays.toString(packageCost) + " "
+ Arrays.toString(noOfDays); */
}
}
//Hyd in TG and Pakage Details:
//1. Hyat - 200 - 3 days package
//2. Prestigate - 350.50 5 days package

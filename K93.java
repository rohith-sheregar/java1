package oopj;
class Car{
    private String make;
    private String model;
    private int year;
    private String color;
    Car(String mk, String md, int yr, String clr){  //constructor
        this.make=mk;
        this.model=md;
        this.year=yr;
        this.color=clr;}
    public void getCarDetails(){
        System.out.println(color+" "+make+"-"+model+" "+year);}}
public class K93{
    public static void main(String[] args){
        Car principalCar = new Car("Hyundai","i20",2022,"White");
        Car vprincipalCar = new Car("Maruti","Swift",2020, "Grey");
        System.out.println("The two cars parked in front of SMVITM are");
        principalCar.getCarDetails();
        vprincipalCar.getCarDetails();}}
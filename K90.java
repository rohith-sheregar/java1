package oopj;
class Bank2{                    // parent class
    int getInterestRate(){
    return 0;}}
class Canara extends Bank2{
    int getInterestRate(){
        return 5;}}
class SBI extends Bank2{        // child class
    int getInterestRate(){      // method overriding
        return 6;}}
class SCDCC extends Bank2{
    int getInterestRate(){
        return 8;}}
public class K90{
    public static void main(String[] args){
        Canara bank1=new Canara();    //object created
        SBI bank2 = new SBI();
        SCDCC bank3 = new SCDCC();
        System.out.println("Bank1: " + bank1.getInterestRate() + " %");
        System.out.println("Bank2: " + bank2.getInterestRate() + " %");
        System.out.println("Bank3: " + bank3.getInterestRate() + " %");}}
    
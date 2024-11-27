package pkg1;
class Outer{
    void display() {
        System.out.println("Outer class display method");}
    class Inner{
        void display() {
            System.out.println("Inner class display method");}}}

public class Lab8{
    public static void main(String[] args) {
        Outer o1=new Outer();
        o1.display();
        Outer.Inner i1=o1.new Inner();
        i1.display();}}
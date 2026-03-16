package fr.epita.geometry.datamodel;

public class Circle {

    private double radius;

    public double getPerimeter(){
        return this.radius * Math.PI * 2;
    }

    public double getArea(){
        return this.radius* this.radius * Math.PI;
    }



}

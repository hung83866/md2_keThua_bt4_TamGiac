package com.company;

public class Triangle extends Shape1 {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public void setABC(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double[] getABC(){
        double[] array = new double[3];
        array[0]= side1;
        array[1]= side2;
        array[2]= side3;
        return  array;
    }

    public double perimeter(){
        return side1+side2+side3;
    }
    public double area(){
        return Math.sqrt(this.perimeter()/2*(this.perimeter()/2 - side1)*(this.perimeter()/2 - side2)*(this.perimeter()/2 - side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color = "+super.getColor()+
                ", fills = "+super.isFills()+
                ", area = "+ this.area()+
                ", perimeter = "+this.perimeter()+
                '}';
    }
}

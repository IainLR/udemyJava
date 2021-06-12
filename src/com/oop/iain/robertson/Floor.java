package com.oop.iain.robertson;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width < 0) {
            width = 0;
        }
        if (length < 0) {
            length = 0;
        }
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }


}
// in reality would be in separate file

 class Carpet {
    private double cost;

     public Carpet(double cost) {
         if (cost < 0) {
             cost = 0;
         }
         this.cost = cost;
     }

     public double getCost() {
         return cost;
     }
 }
// in reality would be in separate file
 class CalculatorII {
    private Floor floor;
    private Carpet carpet;

     public CalculatorII(Floor floor, Carpet carpet) {
         this.floor = floor;
         this.carpet = carpet;
     }

     public double getTotalCost() {
         return (floor.getArea() * carpet.getCost());
     }
 }

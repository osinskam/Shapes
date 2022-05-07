package com.company;

public class Main {

    public static void main(String[] args) {
        Shape circle1 = new Circle("Red", true, 4 );
        System.out.println(circle1);

        Shape circle2 = new Circle("Black", false, 7);
        System.out.println(circle2);

        Rectangle rect1 = new Rectangle("Black", true, 5, 6.5);
        System.out.println(rect1);
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());

        Square sq1 = new Square("Pink", true, 10.10);
        System.out.println(sq1);
    }
}

abstract class Shape {
    String color;
    boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}



 class Circle extends Shape {
        double radius;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle (String color, boolean filled, double radius) {
            super.color=color;
            super.filled=filled;
            this.radius=radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

         @Override
         public double getArea() {
             return Math.PI * radius * radius;
         }

         @Override
         public double getPerimeter() {
             return 2 * Math.PI * radius;
         }

         @Override
         public String toString() {
             return "Circle{" +
                     "color='" + color + '\'' +
                     ", filled=" + filled +
                     ", radius=" + radius +
                     '}';
         }
     }


    class Rectangle extends Shape {
        double width;
        double height;

        public Rectangle() {

        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public Rectangle(String color, boolean filled, double width, double height) {
            super.color=color;
            super.filled=filled;
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        @Override
        public double getArea() {
            return height * width;
        }

        @Override
        public double getPerimeter() {
            return width * 2 + height * 2;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "color='" + color + '\'' +
                    ", filled=" + filled +
                    ", width=" + width +
                    ", height=" + height +
                    '}';
        }
    }

    class Square extends Rectangle {
        public Square() {
        }

        public Square(double side) {
        }

        public Square(String color, boolean filled, double side) {
        }

        public double getSide(double side) {
            return side;
        }

        public void setSide(double side) {
        }

        @Override
        public double getWidth() {
            return super.getWidth();
        }

        @Override
        public void setWidth(double width) {
            super.setWidth(width);
        }

        @Override
        public void setHeight(double height) {
            super.setHeight(height);
        }
    }


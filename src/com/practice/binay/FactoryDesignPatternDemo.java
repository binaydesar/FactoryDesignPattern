package com.practice.binay;

public class FactoryDesignPatternDemo {
	//Use the Factory to get object of concrete class by passing an information such as type.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 =shapeFactory.getShape("circle");
		shape1.draw();
		
		
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();
		
		
		

	}

}

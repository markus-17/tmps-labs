package com.mariuspurici.lab2;

import com.mariuspurici.lab2.AbstractFactory.Application;
import com.mariuspurici.lab2.AbstractFactory.MacFactory;
import com.mariuspurici.lab2.AbstractFactory.WinFactory;
import com.mariuspurici.lab2.Builder.*;
import com.mariuspurici.lab2.FactoryMethod.*;
import com.mariuspurici.lab2.Prototype.*;


public class Main {
    public static void run() {
        // Test the Singleton Pattern
        GreenLogger greenLogger = GreenLogger.getInstance();
        greenLogger.log("Testing Singleton Pattern: Hello World");

        // Test the Builder Pattern
        CarBuilder normalCarBuilder = new CarBuilder();
        Director.constructCar(normalCarBuilder);
        Car normalCar = normalCarBuilder.getProduct();
        greenLogger.log("Testing Builder Pattern: " + normalCar.toString());

        SportsCarBuilder sportsCarBuilder = new SportsCarBuilder();
        Director.constructCar(sportsCarBuilder);
        Car sportsCar = sportsCarBuilder.getProduct();
        greenLogger.log("Testing Builder Pattern: " + sportsCar.toString());

        // Test Prototype Pattern
        Rectangle rectangle = new Rectangle();
        rectangle.x = 0;
        rectangle.y = 1;
        rectangle.width = 10;
        rectangle.height = 5;
        rectangle.color = "Blue";
        greenLogger.log("Testing Prototype Pattern: " + rectangle.toString());
        Rectangle clonedRectangle = new Rectangle(rectangle);
        greenLogger.log("Testing Prototype Pattern: " + clonedRectangle.toString());

        Circle circle = new Circle();
        circle.x = 23;
        circle.y = 50;
        circle.color = "Green";
        circle.radius = 14;
        greenLogger.log("Testing Prototype Pattern: " + circle.toString());
        Circle clonedCircle = circle.clone();
        greenLogger.log("Testing Prototype Pattern: " + clonedCircle.toString());

        // Test Factory Method Pattern
        greenLogger.log("Testing Factory Method Pattern: ");
        HtmlDialog htmlDialog = new HtmlDialog();
        htmlDialog.render();
        WindowsDialog windowsDialog = new WindowsDialog();
        windowsDialog.render();

        // Test Abstract Factory
        greenLogger.log("Testing Abstract Factory Pattern: ");
        Application macApplication = new Application(new MacFactory());
        macApplication.createUI();
        macApplication.paint();

        Application winApplication = new Application(new WinFactory());
        winApplication.createUI();
        winApplication.paint();
    }
}

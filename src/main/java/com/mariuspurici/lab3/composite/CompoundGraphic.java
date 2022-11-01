package com.mariuspurici.lab3.composite;

import scala.Console;

import java.util.LinkedList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    protected List<Graphic> children;

    public CompoundGraphic() {
        this.children = new LinkedList<Graphic>();
    }

    public void add(Graphic graphic) {
        this.children.add(graphic);
    }

    @Override
    public void move(int x, int y) {
        for (Graphic child : children) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Graphic child : children) {
            child.draw();
        }
    }

    @Override
    public String toString() {
        String result = Console.BLUE() +  "CompoundGraphic(" + Console.RESET();
        for (int i = 0; i < children.size(); ++i) {
            if (i != 0) {
                result += ", ";
            }
            result += children.get(i);
        }
        result += Console.BLUE() + ")" + Console.RESET();
        return result;
    }
}
package org.javaguru.student_asserman.lesson_1.lessoncode.Fructs;

import java.awt.*;

public class Apple {
    Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    Apple(Color color) {
        this.color = color;
    }

    boolean isEven(int number){
        if (number%2 ==0){
            return true;
        }
        return false;
    }
}

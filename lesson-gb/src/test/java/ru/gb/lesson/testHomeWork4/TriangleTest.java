package ru.gb.lesson.testHomeWork4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.gb.lesson.homeWork4.TriangleSquare.SquareTriangle;


public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    // Треугольник с тремя положительными сторонами
    @Test
    void positiveTriangleTest() {
        int a = 3;
        int b = 4;
        int c = 6;
        boolean result = SquareTriangle(a, b, c);
        //Assertions.assertEquals(6, result);}
        Assertions.assertTrue(result, "The sides must be positive or triangle isn't valid");
    }

    //Треугольник с невалидными сторонами
    @Test
    void triangleIsntValidTest() {
        int a = 3;
        int b = 4;
        int c = 8;
        boolean result = SquareTriangle(a, b, c);
        //Assertions.assertEquals(6, result);}
        Assertions.assertTrue(result, "The triangle isn't valid");
    }

    //Одна сторона равна нолю
    @Test
    void oneOfSidesIsNullTest() {
        int a = 5;
        int b = 5;
        int c = 0;
        boolean result = SquareTriangle(a, b, c);
        //Assertions.assertEquals(9, result);}
        Assertions.assertTrue(result, "The one of sides is a null");
    }


    //Одна сторона отрицательная
    @Test
    void oneOfSidesIsNegativeTest() {
        int a = 6;
        int b = 5;
        int c = -1;
        boolean result = SquareTriangle(a, b, c);
        //Assertions.assertEquals(9, result);}
        Assertions.assertTrue(result, "The one of sides is a negative");
    }
    /*@DisplayName("Рассчитать периметр: египетский треугольник (3, 4, 5)")
        void egyptTriangleTest() {
        TriangleSquare triangle = new TriangleSquare(); // Arrange
        int actualResult = triangle.SquareTriangle(); // Act
        assertEquals(12, actualResult); //Assert
    }*/
}

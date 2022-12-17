package com.example.web_project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {

    @Test
    @DisplayName("Создание простого объекта Вектора, значение должно быть нулевое")
    void newVectorShowHaveZeroLength() {
        // action
        Vector2D v = new Vector2D();

        // assertion
        Assertions.assertEquals(0, v.length());
    }
}
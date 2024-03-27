package com.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateCalculatorTest {
    private DateCalculator dateCalculator;

    @BeforeEach
    void setUP(){
        dateCalculator = new DateCalculator();
    }

    @Test
    void caculateAge(){
        LocalDate birthDate = LocalDate.of(2000,12,8);
        LocalDate currentDate = LocalDate.of(2024,3,18);

        Assertions.assertEquals(1,dateCalculator.calculateAge(birthDate,currentDate));
        
    }
}

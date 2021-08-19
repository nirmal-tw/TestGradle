package com.gradle.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    @DisplayName("Should return hello world")
    public void shouldSayHelloWorld(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("Hello World", fizzBuzz.sayHelloWorld());
    }
}

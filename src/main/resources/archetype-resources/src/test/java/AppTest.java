package $package;

import static org.junit.jupiter.api.Assertions.assertEquals;

import $groupId.App;

import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    private final App app= new App();

    @Test
    void printHello() {
        assertEquals("Hello", app.sayHello());
    }
}
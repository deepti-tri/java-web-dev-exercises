package org.launchcode.java.demos.lsn5unittesting.test;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;


import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    Car test_car;

//    @Before
//    public void createCarObject() {
//
//    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,0.01);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void setGasTankLevelProperly() {
        test_car = new Car("merc","suv",10,50);
        assertEquals(10, test_car.getGasTankLevel(), 0.01);
    }


    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        test_car = new Car("merc","suv",10,50);
        test_car.drive(100);
        assertEquals(8,test_car.getGasTankLevel(),0.01);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterDrivingPastRange() {
        test_car = new Car("merc","suv",10,50);
        test_car.drive(501);
        assertEquals(0,test_car.getGasTankLevel(), 0.01);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testOverfill() {
        test_car = new Car("merc","suv",10,50);
        test_car.addGas(2);
        fail("not allowed");
    }


}

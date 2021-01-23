package com.tts.main.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentFactoryTest {

    @Test
    void test() {
        Department actual = DepartmentFactory.createDepartment(DepartmentName.SALES); // add managerName:"Bob"
        assertEquals( "Sales", actual.getName());
        // System.out.println(actual.getManager());
    }

}
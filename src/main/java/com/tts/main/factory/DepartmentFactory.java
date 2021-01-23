package com.tts.main.factory;


public class DepartmentFactory {

    // this is a static method that we can directly call
    // and it accepts and enum of type DepartmentName
    public static Department createDepartment(DepartmentName name) {
                                             // or (DepartmentName name, String managerName);

        // we need to define and initialize a Department instance
        Department department = null;

        // this switch statement takes care of our factory logic
        switch (name) {
            case SALES: department = new Department( "Sales", "Bob"); // or (name: "sales", managerName)
                break;
            case FINANCE: department = new Department( "Finance", "Jenny");
                break;
            case SERVICE: department = new Department( "Service", "Angie");
            default:
                System.out.println("invalid");
                break;
        }
        
        return department;

    }

}

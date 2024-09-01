package com.Array;

public class array1 {

    public static class Employee {
        private int eid;
        private String eName;

        public Employee(int eid, String eName) {
            this.eid = eid;
            this.eName = eName;
        }

        @Override
        public String toString() {
            return "Employee ID: " + eid + ", Employee Name: " + eName;
        }
    }

    public static void main(String[] args) {
        Object i[] = new Object[5];
        i[0] = new Employee(101, "Ram");
        i[1] = new Employee(102, "Shyam");

        int arr[] = new int[5];
        arr[0] = 101;
        arr[1] = 102;
        arr[2] = 103; // Corrected this line to use an integer literal

        // Printing the Employee objects stored in the Object array
        System.out.println(i[0]);
        System.out.println(i[1]);
    }
}

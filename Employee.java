package com.Array;

public class Employee {

    int eid;
    String eName;

    public Employee(int eid, String eName) {
        this.eid = eid;
        this.eName = eName;
    }

    @SuppressWarnings("removal")
    public static void main(String[] args) {
        // Object type array
        Employee e[] = new Employee[5];
        e[0] = new Employee(101, "Ram");
        e[1] = new Employee(102, "shyam");
        e[2] = new Employee(103, "sun");
        e[3] = new Employee(104, "milie");
        e[4] = new Employee(105, "ina");
        System.out.println("employee information");
      //  for (String Employees : Employees) {//this is for each loop
            //char[] Employee;
			//System.out.println(Employee);
			for (Employee emp:e) { 
		        System.out.println("Employee id:"+emp.eid +",Employee Name:"+emp.eName);
		    }
      //  System.out.print(e[1].eid);
        //System.out.print(" ");
        //System.out.println(e[1].eName);

        Integer[] i = new Integer[5];
        i[0] = new Integer(10);
        i[1] = new Integer(20);
        i[2] = new Integer(30);
        i[3] = new Integer(40);
        i[4] = new Integer(50);
        for (Integer integer : i) { 
            System.out.println(integer); 
	    }
       // System.out.println(i[0]);

        //we declare and initialize the students array here in the main method
        String[] students = new String[5];
        students[0] = "Alee";
        students[1] = "jim";
        students[2] = "chan";
        students[3] = "joon";
        students[4] = "dk";

        System.out.println("students name");
        for (String student:students) {//this is for each loop
            System.out.println(student);
            
            String[] strings = new String[5];
            strings[0] = "this";
            strings[1] = "is ";
            strings[2] = "string";
            strings[3] = "array";
            strings[4] = "programm";

            System.out.println("All strings:");
            for (int a = 0; a < strings.length; a++) {
                System.out.println("String at index " + a + ": " + strings[a]);
            }
   
        }
    }
}

package src;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Java program to demonstrate how to sort List in Java 8
 * using lambda expression,
 * method reference, and static utility method added on Comparator interface*
 * comparing() and thenComparing()
 * @author Javin Paul
 *
 */
public class SortArray{
    public static void main(String[] args) {

        // Initializing List for our example
        List empList = Arrays.asList(new Employee(101, "Jack", 22),
                new Employee(201, "Abhay", 23),
                new Employee(301,"Tom", 24),
                new Employee(401, "Jack", 52));
        System.out.println("Printing List of employees using Java 8 forEach and method reference");
                empList.forEach(System.out::println);

        //Example 1 - Sorting without lambda expressions, like prior Java 8

//        Collections.sort(empList, new Comparator(){
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//
//            public int compare(Employee e1, Employee e2) {
//                return e1.getId() - e2.getId();
//            }
//
//        });

        //Printing sorted list of objects using forEach method
//        System.out.println("Sorted List of Objects by id : ");
//        System.out.println(empList.get(0));



        //Example 2 - Sorting List with lambda expressions in Java 8
        // This time sorting employees based on their name

        Collections.sort(empList, (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("Sorted List of Employees by name : ");
        System.out.println(empList);



        //Example 3 - improved use of lambdas, using type inference
        // Sorting employee objects by their age

//        Collections.sort(empList, (Employee e1, Employee e2) -> e1.getAge() - e2.getAge());
//        System.out.println("Employee object sorted by their age");
//        System.out.println(empList.get(0));



        // Example 4 - Sorting List in Java 8 using lambdas and static
        // method reference
        // Sorting List of employee by their name, age

//        Collections.sort(empList, Employee::compareByNameAndAge);
//        System.out.println("Sorting employees by name and age");
//        empList.forEach(System.out::println);



        //Example 5 - Sorting List using Comaprator's comparing() method

//        Collections.sort(empList, Comparator.comparing(Employee::getName));
//        System.out.println("Employee sorted by name using comparing() method of Comparator");
//                System.out.println(empList.get(0));


        //Example 6 - Sorting List in reverse Order - Java 8 lambdas example

//        Comparator java8Cmp = (e1, e2) -> e1.getId() - e2.getId();
//        Collections.sort(empList, java8Cmp.reversed());
//        System.out.println("Sorting employees in reverse order of id");
//        empList.forEach(System.out::println);


        //Example 7 - Sorting list of objects based on multiple conditions

//        Collections.sort(empList, (Employee e1, Employee e2) -> {
//                    if (e1.getName().equals(e2.getName())) {
//                        return e1.getAge() - e2.getAge();
//                    }else{
//                        return e1.getName().compareTo(e2.getName());
//                    }
//                });


        //Example 8 - Java 8 example of chaining Comparator for sorting
        //on multiple case
        // first comparing Age,  using theComparing() method of Comparator

//        Comparator byName = (e1, e2) -> e1.getName().compareTo(e2.getName());
//        Comparator byAge  = (e1, e2) -> e1.getAge() - e2.getAge();
//        Collections.sort(empList, byAge.thenComparing(byName).reversed());
//        System.out.println("Sorting empoyess on multple conditions, by age then name");
//                empList.forEach(System.out::println);


        //Example 9 - How to sort List in Java 8 using static method reference


        //Example 10 - Sorting list using parallel Stream Java 8

    }


}




/*
 * Our simple Java POJO class for this example
 */
class Employee{
    private int id;
    private String name;
    private int age;
    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return String.format("Id: %d, Name: %s, Age: %d", id, name, age);
    }

    public static int compareByNameAndAge(Employee emp1, Employee emp2){
        if(emp1.getName().equals(emp2.getName())){
            return emp1.getAge() - emp2.getAge();
        }
        return emp1.getName().compareTo(emp2.getName());
    }
}



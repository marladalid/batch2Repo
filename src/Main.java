import classes.Customer;
import classes.Employee;
import classes.MyMethod;
import classes.Person;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /*System.out.println("Hello World!");
        System.out.println("This is my first program!");

        System.out.println();//This is how to go to next line.

        *//**This is where the variables are declared**//*

        byte byteVariable = 127;
        short mediumRangeDecimalVariable = 32767;
        int decimalVariableUpTo = 232222222;
        long largeDecimalVariableUpFrom = 1827319827;
        long largeDecimalVariableUpTo = 1283018301222222222L;
        float numberWithDecimalPlaces = 8.67f;
        double veryLargeNumberWithDecimalPlaces = 81231.6123137d;
        boolean isTrueOrFalse = true;
        char singleCharacter = '\u0041';
        String name = "MARWAN";


        System.out.println("byteVariable = " + byteVariable);
        System.out.println("mediumRangeDecimalVariable = " + mediumRangeDecimalVariable);
        System.out.println("decimalVariableUpTo = " + decimalVariableUpTo);
        System.out.println("largeDecimalVariableUpFrom = " + largeDecimalVariableUpFrom);
        System.out.println("largeDecimalVariableUpTo = " + largeDecimalVariableUpTo);
        System.out.println("numberWithDecimalPlaces = " + numberWithDecimalPlaces);
        System.out.println("veryLargeNumberWithDecimalPlaces = " + veryLargeNumberWithDecimalPlaces);
        System.out.println("isTrueOrFalse = " + isTrueOrFalse);
        System.out.println("singleCharacter = " + singleCharacter);
        System.out.println();//This is how to go to next line.
        System.out.println("My name is " + name);
        System.out.println("And here are his grades");

        System.out.println();//This is how to go to next line.

        int grades[] = new int[5];
        grades[0] = 98;
        grades[1] = 97;
        grades[2] = 96;
        grades[3] = 95;
        grades[4] = 94;

        System.out.println("Math = " + grades[0]);
        System.out.println("English = " + grades[1]);
        System.out.println("Science = " + grades[2]);
        System.out.println("BCD = " + grades[3]);
        System.out.println("Health = " + grades[4]);

        System.out.println();//This is how to go to next line.

        String errorMessages[] = new String[3];
        errorMessages[0] = "Error 404 Page Not Found";
        errorMessages[1] = "Can't Reach DNS";
        errorMessages[2] = "No Domain Name";

        System.out.println("Error 1 = " + errorMessages[0]);
        System.out.println("Error 2 = " + errorMessages[1]);
        System.out.println("Error 3 = " + errorMessages[2]);

        System.out.println();//This is how to go to next line.
        System.out.println("= PERSON =");
        System.out.println();//This is how to go to next line.
        Person studentObject = new Person("Sad");
        studentObject.setName("Marwan Adalid");
        studentObject.setAge(23);
        studentObject.setEmail("dalidzmzmarl8@gmail.com");
        studentObject.setGender(true);
        studentObject.setHeight(156.5f);
        studentObject.setWeight(60.5f);

//        studentObject.getName();
//        studentObject.getAge();
//        studentObject.getEmail();
//        studentObject.isGender();
//        studentObject.getHeight();
//        studentObject.getWeight();

        System.out.println("Name : " + studentObject.getName());
        System.out.println("Age : " + studentObject.getAge());
        System.out.println("Email : " + studentObject.getEmail());
        if (studentObject.isGender() == true){
            System.out.println("Gender : Male");
        }
        else {
            System.out.println("Gender : Female");
        }
//        System.out.println("Gender : " + studentObject.isGender());
        System.out.println("Height : " + studentObject.getHeight() + "cm");
        System.out.println("Weight : " + studentObject.getWeight() + "kg");

        System.out.println();//This is how to go to next line.
        System.out.println("= EMPLOYEE =");
        System.out.println();//This is how to go to next line.

        Employee empInfo = new Employee();
        empInfo.setName("Mar Lomel Adalid");
        empInfo.setEmail("punkgoesrock@gmail.com");
        empInfo.setEmpid(6038);
        empInfo.setDepartment("Engineering Department");
        empInfo.setSss(672791);
        empInfo.setPagibig(126371263);

        *//*empInfo.getName();
        empInfo.getEmpid();
        empInfo.getEmpid();
        empInfo.getDepartment();
        empInfo.getSss();
        empInfo.getPagibig();*//*

        System.out.println("Name : " + empInfo.getName());
        System.out.println("ID Number : " + empInfo.getEmpid());
        System.out.println("Email Address : " + empInfo.getEmail());
        System.out.println("Department : " + empInfo.getDepartment());
        System.out.println("SSS : " + empInfo.getSss());
        System.out.println("PAG-IBIG Number : " + empInfo.getPagibig());

        System.out.println();//This is how to go to next line.
        System.out.println("= CUSTOMER =");
        System.out.println();//This is how to go to next line.

        Customer cusInfo = new Customer();
        cusInfo.setName("Marwan");
        cusInfo.setCustomerID(1263182736);
        cusInfo.setMemberLevel("Premium");
        cusInfo.setCreditCard(7381273);

//        cusInfo.getName();
//        cusInfo.getCustomerID();
//        cusInfo.getMemberLevel();
//        cusInfo.getCreditCard();

        System.out.println("Customer Name : " +  cusInfo.getName());
        System.out.println("Customer ID : " +  cusInfo.getCustomerID());
        System.out.println("Customer Level : " +  cusInfo.getMemberLevel());
        System.out.println("Customer Credit Card : " +  cusInfo.getCreditCard());

        System.out.println();//This is how to go to next line.
        System.out.println("= INTRODUCE YOURSELF =");
        System.out.println();//This is how to go to next line.

        System.out.println("Customer : Hi! I am " + cusInfo.introduceYourself());
        System.out.println("Employee : Hi! I am " + empInfo.introduceYourself());
        System.out.println("Person   : Hi! I am " + studentObject.introduceYourself());

        System.out.println();
        System.out.println("Hi! I am " + studentObject.introduceYourself("Budoy.") + " I have a " + cusInfo.introduceYourself(cusInfo.getMemberLevel() + " Membership and came from ",empInfo.getDepartment()) + ".");

        System.out.println();//This is how to go to next line.
        System.out.println("= CONDITIONS =");
        System.out.println();//This is how to go to next line.

        int num = 3;

        if (num < 3){
            System.out.println("Number " + num + " is less than 3");
        } else if(num == 3){
            System.out.println("Number " + num + " is is equal to " + num);
        }
        else {
            System.out.println("Number " + num + " is greater than 3");
        }

        System.out.println();//This is how to go to next line.
        System.out.println("= CONDITIONS EXERCISE =");
        System.out.println();//This is how to go to next line.

        int day = 1; // 1-Monday 2-Tuesday 3-Wednesday 4-Thursday 5-Friday 6 && 7 -
        int tStudents = 20; //input how many students
        int cStudents = 16;

        if (day == 1){
            System.out.println("TODAY IS MONDAY");
            if (cStudents <= 15){
                System.out.println("Current Subject is MATH and Teacher 1 has a total of " + cStudents);
            }
            else {
                System.out.println("Current Subject is MATH and Teacher 1 has a total of " + cStudents + " and is greater than " + tStudents);
            }
        }
        else if (day == 2){
            System.out.println("TODAY IS TUESDAY");
            if (cStudents == tStudents){
                System.out.println("Current Subject is SCIENCE and Teacher 3 has a total of " + cStudents);
            }
            else {
                System.out.println("Current Subject is SCIENCE and Teacher 3 has a total of " + cStudents + " and is less than " + tStudents);
            }
        }
        else if (day == 3){
            System.out.println("TODAY IS WEDNESDAY");
            if (cStudents == tStudents){
                System.out.println("Current Subject is ENGLISH and Teacher 2 has a total of " + cStudents);
            }
            else if(cStudents<=tStudents){
                System.out.println("Current Subject is ENGLISH and Teacher 2 has a total of " + cStudents + " and is less than " + tStudents);
            }
            else {
                System.out.println("Current Subject is ENGLISH and Teacher 2 has a total of " + cStudents + " and is less than " + tStudents);
            }
        }
        else if (day == 4){
            System.out.println("TODAY IS THURSDAY");
            if (cStudents == tStudents){
                System.out.println("Current Subject is OBJECT ORIENTED PROGRAMMING and Teacher 4 has a total of " + cStudents);
            }
            else {
                System.out.println("Current Subject is OBJECT ORIENTED PROGRAMMING and Teacher 4 has a total of " + cStudents + " and is less than " + tStudents);
            }
        }
        else if (day == 5){
            System.out.println("TODAY IS FRIDAY");
            if (cStudents == tStudents){
                System.out.println("Current Subject is SERVER MAINTENANCE and Teacher 5 has a total of " + cStudents);
            }
            else {
                System.out.println("Current Subject is SERVER MAINTENANCE and Teacher 5 has a total of " + cStudents + " and is less than " + tStudents);
            }
        }
        else{
            System.out.println("TODAY IS WEEKEND");
        }*/

        /*boolean day = true; //weekend-false weekday-true
        boolean holiday = true;

        if (day == true && holiday == true || day == false){
            System.out.println("Today is Vacation Day!");
        }
        else {
            System.out.println("Today is Not Vacation Day!");
        }*/

        /*boolean student = false; //true-regular false-irregular
        boolean working = true; //true-working false-notWorking

        if (student == true){
            if (working == false){
                System.out.println("REGULAR");
                System.out.println("The student can get 7");
            }
            else {
                System.out.println("REGULAR + WORKING");
                System.out.println("The student can get 6");
            }
        }
        else {
            if (working == true){
                System.out.println("IRREGULAR + WORKING");
                System.out.println("The student can get 6");
            }
            else {
                System.out.println("IRREGULAR");
                System.out.println("The student can get 5");
            }
        }*/

        /*boolean student = false;
        boolean working = true;
        MyMethod methods = new MyMethod();

        System.out.println("The student can get " + methods.getNumSubjects(student,working) + " Subjects.");*/
//        MyMethod.loop(1,9);

        /*String myFriends[] = new String[5];
        myFriends[0] = "Mar";
        myFriends[1] = "Mark";
        myFriends[2] = "Wayne";
        myFriends[3] = "Fred";
        myFriends[4] = "Gart";

        for (int i=0;i<5;i++){
            System.out.println("Friend " + (i+1) + " = "+ myFriends[i]);
        }*/

        int i = 5;
        Random random = new Random();
        boolean type = random.nextBoolean();

        if (type){
            System.out.println(MyMethod.getFriends(i) + MyMethod.getRelation(i) + MyMethod.getFriends2(i));
        }
        else {
            System.out.println(MyMethod.getFriends2(i) + MyMethod.getRelation(i) + MyMethod.getFriends(i));
        }

        System.out.println();//This is how to go to next line.


        //This is a comment

        /*This is looooooong
        Long comment*/

    }

}


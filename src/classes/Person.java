package classes;

/**
 * Created by JPMPC-B208 on 11/10/2016.
 */
public class Person {
    public String name;
    public boolean gender; //Male = true  / Female = false
    public int age;
    public float height; //centimeters
    public float weight; //kilograms
    public String email;

    Person(){

    }
    public Person(String e){

    }
//    These are method
    public String introduceYourself() {
        return this.name;
    }

    public String introduceYourself(String eName){
        return eName;
    }

    public String introduceYourself(String eMemLevel, String eDepartment){
    return eMemLevel + eDepartment;
    }
//    These are setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

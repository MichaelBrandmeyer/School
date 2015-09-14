
package school;
import java.util.ArrayList;

public class School {

    public static void main(String[] args) {
        
        Person Jill =
        Person.addPerson("Jill",Person.Gender.Female,115);
        Person jeff =
        Person.addPerson("Jeff",Person.Gender.Male,140);
        Person bob =
        Person.addPerson("Bob",Person.Gender.Male,149);
        Person jake =
        Person.addPerson("Jake",Person.Gender.Male,154);
        System.out.println(jeff.getWeight());
        Person.printNames();
        
        Person.printNames(Person.Gender.Male);
        
        System.out.println(jeff);


        
        
        
    }
}

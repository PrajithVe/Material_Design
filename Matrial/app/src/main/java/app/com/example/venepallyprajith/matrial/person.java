package app.com.example.venepallyprajith.matrial;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Venepally Prajith on 16-11-2015.
 */
class Person {
    String name;
    String age;
    int photoId;

    Person(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }


private List<Person> persons;

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Ganesh", "23 years old", R.drawable.ic_profile));
        persons.add(new Person("Suresh", "25 years old", R.drawable.ic_profile));
        persons.add(new Person("Ramesh", "35 years old", R.drawable.ic_profile));
    }
}

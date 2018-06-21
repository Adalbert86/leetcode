import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * MaxNumPeopleAlive
 */
public class MaxNumPeopleAlive {

    public static class Person {

        public int yearBorn;
        public int yearDeath;

        public Person(int yb, int yd) {

            this.yearBorn = yb;
            this.yearDeath = yd;
        }

    }

    public int findYearMostPeopleAlive(List<Person> people) {

        int maxYear = Integer.MIN_VALUE;
        int minYear = Integer.MAX_VALUE;

        // find boundaries
        for (Person p : people) {

            if (p.yearBorn < minYear)
                minYear = p.yearBorn;
            
            if (p.yearDeath > maxYear) 
                maxYear = p.yearDeath;
        }

        //

        int maxPeopleAlive = -1;
        int maxPeopleAliveYear = -1;

        for(int y = minYear; y <= maxYear; y++) {

            int peopleAlive = 0;
            for (Person p : people) {

                if (p.yearBorn >= y && p.yearDeath <= y)
                    peopleAlive++;
            }

            if (peopleAlive > maxPeopleAlive) {

                maxPeopleAlive = peopleAlive;
                maxPeopleAliveYear = y;
            }  
        }

        return maxPeopleAliveYear;
    }



    public static void main(String[] args) {
         
        MaxNumPeopleAlive app = new MaxNumPeopleAlive();

        Person p1 = new Person(1900, 2000);
        Person p2 = new Person(1901, 1980);
        Person p3 = new Person(1920, 1950);
        Person p4 = new Person(1945, 1960);
        Person p5 = new Person(1944, 1950);
        Person p6 = new Person(1943, 1949);
        Person p7 = new Person(1980, 2002);

        List<Person> people = new ArrayList<Person>();
        people.addAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7));

        System.out.println(app.findYearMostPeopleAlive(people));


    }






}



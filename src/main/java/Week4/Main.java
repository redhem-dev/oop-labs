package Week4;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*public static void printDepartment(List<Person> people){
        for (int i =0; i<people.size(); i++){
            System.out.println(people.get(i));
        }

    }*/
    /*public static void main(String[] args) {
        Person pekka = new Person("Pekka mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15");
        System.out.println(pekka);
        System.out.println(esko);

    }*/
    /*public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 0400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits " + olli.credits());


    }*/
    /*public static void main(String[] args) {

        Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( pekka );
        System.out.println( esko );


        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            olli.study();
        }
        System.out.println( olli );
    }*/
    /*public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add(new Student("Olli", "Ida Albergintie Street 1 0400 Helsinki"));
        printDepartment(people);
    }*/
    /*public static void main(String[] args) {
        Circle krug = new Circle("Red", FillType.NOT_FILLED, 5);
        Rectangle pravougaonik = new Rectangle("Blue", FillType.NOT_FILLED, 2, 2);

        krug.displayInfo();
        pravougaonik.displayInfo();
    }*/
    public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 0400 Helsinki");

        olli.addGrade(5);
        olli.addGrade(8);
        olli.addGrade(12);

        olli.displayGrades();

    }
}


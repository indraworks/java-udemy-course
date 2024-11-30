package _04_a_OOPInheritance_Challenge;

public class _11_MainRecordCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRecord newcar1 = new CarRecord("TOyota",1994);
		System.out.println(newcar1.toString());
		//record bersifat imutable kalau mau ganti caranya adalah :
		//yg buat record baru misa updateNewCar1 misal ganti tahu jadi 2000 
		//harus instance record baru ini namanya kita copykan 
		CarRecord updatenewcar1 = new CarRecord(newcar1.merk(),2000);
		System.out.println(updatenewcar1.toString());

	}

}

/*
Pelajaran tentang Record beda dgn Pojo:
2. Record (Plain Data Carrier)
Introduced in Java 14 (Preview) and finalized in Java 16, records are a concise way to create immutable data carriers.
When you declare a record, Java automatically generates:
A constructor.
Getter methods (named after the fields).
toString, equals, and hashCode methods.
You do not need to declare fields explicitly or write boilerplate code.
Example of a Record:
public record Person(String name, int age) {
    // No need to declare fields explicitly
    // No need for getters, constructor, or toString
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person.toString()); // Output: Person[name=Alice, age=30]
    }
}

kalau mau cnahge data record tidak bias langsung karena harus buat record yg baru kita mengenalnya dengan istilah copy 
data dari yg lama :
2. What if You Need to Change the Parameters in a Record?
Records are immutable by design. If you need to change one or more fields, you need to create a new record instance with the modified values. This is called data copying.

Example: Changing a Field in a Record (By Creating a New Instance)
public record Person(String name, int age) {}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // Change the "age" by creating a new record
        Person updatedPerson = new Person(person.name(), 35); // Using the original name
        System.out.println(updatedPerson); // Output: Person[name=Alice, age=35]
    }
}


*/
package forTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {


        Person person1 = new Person(1, "Ivan");
        Person person12 = new Person(2, "Petro");

        try

        {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person1);
            oos.writeObject(person12);

            oos.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}



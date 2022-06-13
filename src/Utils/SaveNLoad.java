package Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveNLoad {

    public static void Save(Object obj,String filename){
        try {
            // We create an ObjectOutputStream pointed at the file we want to save
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            try {
                // We then write the object to disk
                oos.writeObject(obj);
            } finally {
                // Always close the stream after
                oos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object Load(Object obj,String filename){
        Object uncasted = null;

        try {
            // Loading works the same way, we create an ObjectInputStream pointed at a file
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            try {
                // We try to uncast this to an object
                uncasted = ois.readObject();
            } catch (ClassNotFoundException e) {
                // This only happens if we fail to load it
                e.printStackTrace();
            } finally {
                // Always close the stream
                ois.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return obj;
    }

}

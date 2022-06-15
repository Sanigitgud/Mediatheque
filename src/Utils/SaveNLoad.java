package Utils;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import Format.Support;

public class SaveNLoad {
   
    public void save(ArrayList<Support> supports) throws IOException {
        
        FileOutputStream fos = new FileOutputStream("bdd.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.writeObject(supports);
        encoder.close();
        fos.close();
        System.out.println("Saved !");
    }

    public ArrayList<Support> load() throws IOException {
        FileInputStream fis = new FileInputStream("bdd.xml");
        XMLDecoder decoder = new XMLDecoder(fis);
        ArrayList<Support> supports = (ArrayList<Support>) decoder.readObject();
        decoder.close();
        fis.close();

return supports;
    }

}

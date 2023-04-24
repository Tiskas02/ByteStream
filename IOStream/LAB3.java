package IOStream;

import java.io.*;
import java.util.logging.Logger;
import java.util.logging.Level;



public class LAB3 {
    public static void main(String[] args) {
        try{
        FileOutputStream file = new FileOutputStream("data.dat");//write in file data.dat
        DataOutputStream output = new DataOutputStream(file);
        output.writeUTF("jim Henry");
        output.writeInt(30);
        output.writeDouble(65.5);
        output.writeChar('A');
        output.close();
    }  catch (FileNotFoundException ex) {
        Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE,null,ex);
    }catch (IOException ex) {
        Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE,null,ex);
    }
    try{
        FileInputStream file = new FileInputStream("data.dat");//read from file data.dat
        DataInputStream input = new DataInputStream(file);
        System.out.println( input.readUTF());
        System.out.println( input.readInt());
        System.out.println( input.readDouble());
        System.out.println( input.readChar());
    } catch (FileNotFoundException ex) {
        Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE,null,ex);
    }catch (IOException ex) {
        Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE,null,ex);
    }
    
    }

    
    
}

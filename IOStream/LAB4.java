package IOStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.*;
import java.util.logging.Logger;
import java.util.logging.Level;
public class LAB4 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            BufferedOutputStream output = new BufferedOutputStream(file);
            String s = "Hello World!";
            byte[] b = s.getBytes(); //write just by time  
            output.write(b);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE,null,ex);
        }catch (IOException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE,null,ex);
        }
        try {
            FileInputStream file = new FileInputStream("data.dat");
            BufferedInputStream input = new BufferedInputStream(file);//read from file input stream save in buffer to read once
            int ch;
            while ((ch = input.read())!= -1){
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE,null,ex);
        }catch (IOException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
}

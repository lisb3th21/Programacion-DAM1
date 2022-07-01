package com.streams;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;



//FileWriter escritura=new FileWriter("C:/Users/lisb3/Documents/DAM1/Programacion-DAM1/java/streams/resulttttttt.txt");


public class Imagen {
    


     public static byte[] method(File file)
        throws IOException
    {
  
        // Creating an object of FileInputStream to
        // read from a file
        FileInputStream fl = new FileInputStream(file);
  
        // Now creating byte array of same length as file
        byte[] arr = new byte[(int)file.length()];
  
        // Reading file content to byte array
        // using standard read() method
        fl.read(arr);
  
        // lastly closing an instance of file input stream
        // to avoid memory leakage
        fl.close();
  
        // Returning above byte array
        return arr;
    }
  
    // Method 2
    // Main driver method
    public static void main(String[] args)
        throws IOException
    {
  
        // Creating an object of File class and
        // providing local directory path of a file
        File path = new File("C:/Users/lisb3/Documents/DAM1/Programacion-DAM1/java/streams/prueba.txt");
  
        // Calling the Method1 in main() to
        // convert file to byte array
        byte[] array = method(path);
  
        // Printing the byte array
        System.out.print(Arrays.toString(array));

        ByteArrayInputStream input_stream= new ByteArrayInputStream(array);
        BufferedImage final_buffered_image = ImageIO.read(input_stream);
        ImageIO.write(final_buffered_image , "png", new File("C:/Users/lisb3/Documents/DAM1/Programacion-DAM1/java/streams/peliculas.png") );
        
        System.out.println("image created success");
    }

}

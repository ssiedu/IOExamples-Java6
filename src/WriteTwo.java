
import java.io.FileOutputStream;


public class WriteTwo {
    public static void main(String[] args) throws Exception {

        FileOutputStream fos=new FileOutputStream("d:/io/demo.txt");
        
        String s="this data we are writing to a file using java code";
        
        byte b[]=s.getBytes();
        
        //fos.write(b); //write the entire byte array
        
        fos.write(b,0,20); //10 onwards , 15 bytes
        
        
        fos.close();
        
        System.out.println("DATA STORED");
       
        
    }
}


import java.io.FileOutputStream;

public class WriteOne {

    public static void main(String[] args) throws Exception {

       // FileOutputStream fos = new FileOutputStream("d:/io/info.txt");
       
FileOutputStream fos = new FileOutputStream("d:/io/info.txt", true);
       
        fos.write(65);
        fos.write(66);
        fos.write(67);
        fos.write(68);

        //fos.write(97);
        //fos.write(98);
        //fos.write(99);
        //fos.write(100);
        //fos.write(101);

        fos.close();
        System.out.println("Data Stored");

    }
}

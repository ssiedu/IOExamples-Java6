
import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputDemo {
    public static void main(String args[]) throws Exception {
        
        FileInputStream fis=new FileInputStream("d:/io/emp.txt");
        DataInputStream dis=new DataInputStream(fis);
        int v1=dis.readInt();
        double v2=dis.readDouble();
        boolean v3=dis.readBoolean();
        System.out.println("Ecode   : "+v1);
        System.out.println("Salary  : "+v2);
        System.out.println("Married : "+v3);
        
        dis.close();
        fis.close();
        
        
    }
}
/*
    DataInputStream
    -----------------

    byte readByte()
    short readShort()
    int readInt()
    long readLong()
    float readFloat()
    double readDouble()
    boolean readBoolean()
    
*/

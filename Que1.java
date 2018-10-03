import java.util.*;
import java.io.*;
class Que1 
{
    public static void main(String[] args)
    {	
        int n;
    	try{
    	    FileInputStream f1 =new FileInputStream("a.txt");
    	    FileOutputStream f2 =new FileOutputStream("ab.txt");

    	    byte[] a = new byte[10];
            n=f1.read(a);
    	    while (n!=-1){
    	    	f2.write(a,0,n);
                n=f1.read(a);
    	    }
    	    //Closing the input/output file streams
    	    f1.close();
    	    f2.close();
    	    System.out.println("File copied successfully!!");
    	   }
           catch(IOException ioe){
    		ioe.printStackTrace();
           }
    }
}
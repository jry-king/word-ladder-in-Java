package group;
import java.io.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class Wordladder
{
    public int initiate(List<String> d) throws IOException
    {
        System.out.println("Dictionary file name:");
        String filename,s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        filename = br.readLine();
        InputStream fis = new FileInputStream(filename);
        //if(!fis)
        //s = fis.read()
        return 1;
    }
    List<String> dict = new ArrayList<String>();
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

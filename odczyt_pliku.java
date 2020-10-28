import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        try
        {
            FileReader plik = new FileReader(new File("c:\\1.TXT"));
            int bufor;
            while((bufor = plik.read()) != -1)
            {
                System.out.print((char)bufor);
            }
        }
        catch (IOException ex)
        {
            System.out.println("zepsulo sie");
        }
    }
}

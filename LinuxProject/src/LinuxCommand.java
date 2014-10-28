import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class LinuxCommand {

 
  public void cdCommand() throws IOException, InterruptedException
  {
    try
    {
        //String lscmd = "ls *.c";
        Process p=Runtime.getRuntime().exec("/home/gkarp/git/LinuxProject/LinuxProject/first");
        p.waitFor();
        BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line=reader.readLine();
        while(line!=null)
        {
            System.out.println(line);
            line=reader.readLine();
        }
    }
    catch(IOException e1) {
        System.out.println("Pblm found1.");
    }
    catch(InterruptedException e2) {
        System.out.println("Pblm found2.");
    }

    System.out.println("finished.");
  }
}

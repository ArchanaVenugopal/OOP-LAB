import java.io.*;
public class DisplayFile
{
    public static void main(String args[])throws IOException,FileNotFoundException
    {
        int i;
        File f1=new File("C:\\Users\\ATHIRA\\IdeaProjects\\AthiraProject1\\src\\input.txt");
        FileInputStream in=new FileInputStream(f1);
        do
        {
            i=in.read();
            if(i!=-1)
            {
                System.out.println((char)i);
            }
        }
        while(i!=-1);
        in.close();
    }
}
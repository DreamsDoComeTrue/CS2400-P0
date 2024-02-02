//Natalie Duong
//CS2400
//project 0
//2/2/24

import java.io.IOException;

public class TaskC 
{
    public static void main(String[] args) throws IOException
    {
        int x = 5;
        while (x >= 0)
        {
            String cheer = "";
            for(int i = 0; i < x; i++)
            {
                cheer += "\\o/";
            }
            System.out.println(cheer);
            x--;
        }
    }
}

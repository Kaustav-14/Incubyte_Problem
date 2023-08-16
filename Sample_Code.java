public class Sample_Code
{
    int int_pos[]=new int[3];
    String int_dir;
    public Sample_Code(int input_pos[], String input_dir)
    {
        for(int i=0;i<3;i++)
        int_pos[i]=input_pos[i];
        int_dir=input_dir;
    }
    public int[] moveforward()
    {
        if(int_dir=="N")
        int_pos[1]++;
        else if(int_dir=="S")
        int_pos[1]--;
        else if(int_dir=="E")
        int_pos[0]++;
        else if(int_dir=="W")
        int_pos[0]--;
        else if(int_dir=="U")
        int_pos[2]++;
        else
        int_pos[2]--;
        return int_pos;
    }
    public int[] movebackward()
    {
        if(int_dir=="N")
        int_pos[1]--;
        else if(int_dir=="S")
        int_pos[1]++;
        else if(int_dir=="E")
        int_pos[0]--;
        else if(int_dir=="W")
        int_pos[0]++;
        else if(int_dir=="U")
        int_pos[2]--;
        else
        int_pos[2]++;
        return int_pos;
    }
    public String turnright()
    {
        if(int_dir=="N")
        int_dir="E";
        else if(int_dir=="E")
        int_dir="S";
        else if(int_dir=="S")
        int_dir="W";
        else
        int_dir="N";
        return int_dir;
    }
    public String turnleft()
    {
        if(int_dir=="W")
        int_dir="S";
        else if(int_dir=="S")
        int_dir="E";
        else if(int_dir=="E")
        int_dir="N";
        else
        int_dir="W";
        return int_dir;
    }
    public String upward()
    {
        int_dir="U";
        return int_dir;
    }
    public String downward()
    {
        int_dir="D";
        return int_dir;
    }
    public int[] sample_position(char commands[])
    {
        for(int i=0;i<commands.length;i++)
        {
            switch(commands[i])
            {
                case 'f':moveforward();break;
                case 'b':movebackward();break;
                case 'l':turnleft();break;
                case 'r':turnright();break;
                case 'u':upward();break;
                default:downward();
            }
        }
         return int_pos;
    }
    public String sample_direction()
    {
        return int_dir;
    }
public static void main(String args[])
{
   
}
}
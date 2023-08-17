import java.util.Scanner; 
public class Sample_Code
{
    String actual_dir;
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
        if(int_dir.equals("N"))
        int_pos[1]++;
        else if(int_dir.equals("E"))
        int_pos[0]++;
        else if(int_dir.equals("U"))
        int_pos[2]++;
        else if(int_dir.equals("S"))
        int_pos[1]--;
        else if(int_dir.equals("W"))
        int_pos[2]--;
        else
        int_pos[0]--;
        return int_pos;
    }
    public int[] movebackward()
    {
        if(int_dir.equals("N"))
        int_pos[1]--;
        else if(int_dir.equals("S"))
        int_pos[1]++;
        else if(int_dir.equals("E"))
        int_pos[0]--;
        else if(int_dir.equals("W"))
        int_pos[0]++;
        else if(int_dir.equals("U"))
        int_pos[2]--;
        else
        int_pos[2]++;
        return int_pos;
    }
    public String turnright()
    {
        if(int_dir.equals("N"))
        int_dir="E";
        else if(int_dir.equals("E"))
        int_dir="S";
        else if(int_dir.equals("S"))
        int_dir="W";
        else
        int_dir="N";
        return int_dir;
    }
    public String turnleft()
    {
        if(int_dir.equals("W"))
        int_dir="S";
        else if(int_dir.equals("S"))
        int_dir="E";
        else if(int_dir.equals("E"))
        int_dir="N";
        else
        int_dir="W";
        return int_dir;
    }
    public String upward()
    {
        actual_dir=int_dir;
        int_dir="U";
        return int_dir;
    }
    public String downward()
    {
        actual_dir=int_dir;
        int_dir="D";
        return int_dir;
    }
    public int[] sample_position(char commands[])
    {
        for(int i=0;i<commands.length;i++)
        {
            switch(commands[i])
            {
                case 'f':int_pos=moveforward();
                         break;
                case 'b':int_pos=movebackward();break;
                case 'l':if(int_dir=="U"||int_dir=="D")
                         int_dir=actual_dir;
                         int_dir=turnleft();
                         break;
                case 'r':if(int_dir=="U"||int_dir=="D")
                         int_dir=actual_dir;
                         int_dir=turnright();
                         break;
                case 'u':int_dir=upward();break;
                default:int_dir=downward();
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
        Scanner s=new Scanner(System.in);
        System.out.println("Enter initial direction");
        String int_dir=s.nextLine();
        int int_pos[]=new int[3];
        System.out.println("Enter initial x, y and z co-ordinates");
        int_pos[0]=s.nextInt();
        int_pos[1]=s.nextInt();
        int_pos[2]=s.nextInt();
        Sample_Code obj=new Sample_Code(int_pos, int_dir);
        System.out.println("Enter no.of commands");
        int n=s.nextInt();
        char commands[]=new char[n];
        for(int i=0;i<n;i++)
        commands[i]=s.next().charAt(0);
        int result_pos[]=obj.sample_position(commands);
        String result_dir=obj.sample_direction();
        System.out.println("Final Position: {"+result_pos[0]+","+result_pos[1]+","+result_pos[2]+"}");
        System.out.println("Final Direction: "+result_dir);
    }
}
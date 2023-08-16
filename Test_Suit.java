import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Test_Suit
{
    int input[]={0,0,0};
    @Test
    void testmoveforward()
    {
        Sample_Code sc=new Sample_Code(input,"N");
        assertArrayEquals(new int[]{0,1,0}, sc.moveforward());

    }
    @Test
    void testmovebackward()
    {
        Sample_Code sc=new Sample_Code(input, "N");
        assertArrayEquals(new int[]{0,-1,0}, sc.movebackward()); 
    }
    @Test
    void testturnright()
    {
        Sample_Code sc=new Sample_Code(input, "W");
        assertEquals("N", sc.turnright());
         
    }
    @Test
    void testturnleft()
    {
        Sample_Code sc=new Sample_Code(input, "N");
        assertEquals("W", sc.turnleft());

    }
    @Test
    void testupward()
    {
        assertEquals("U", new Sample_Code(input, "N").upward());
    }
    @Test
    void testdownward()
    {
       assertEquals("D", new Sample_Code(input, "N").downward());  
    }
    @Test
    void sample_pos_test()
    {
        char sample[]={'f','r','u','b','l'};
        Sample_Code sc=new Sample_Code(input, "N");
        assertArrayEquals(new int[]{0,1,-1}, sc.sample_position(sample));
    }
    @Test
    void sample_dir_test()
    {
       char sample[]={'f','r','u','b','l'};
        Sample_Code sc=new Sample_Code(input, "N");
        int ouput[]=sc.sample_position(sample);
        assertEquals("N",sc.sample_direction()); 
    }
}

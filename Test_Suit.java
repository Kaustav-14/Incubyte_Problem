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
        Sample_Code sc=new Sample_Code(input, "W");
        assertEquals("S", sc.turnleft());

    }

}

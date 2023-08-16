import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Test_Suit
{
    int input[]={0,0,0};
    @Test
    void testmoveforward()
    {
        Sample_Code sc=new Sample_Code(input,"Up");
        assertArrayEquals(new int[]{0,0,1}, sc.moveforward());

    }
    @Test
    void testmovebackward()
    {
        Sample_Code sc=new Sample_Code(input, "Down");
        assertArrayEquals(new int[]{0,0,1}, sc.movebackward()); 
    }

}

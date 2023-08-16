import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Test_Suit
{
    @Test
    void testmoveforward()
    {
        int input[]={0,0,0};
        Sample_Code sc=new Sample_Code(input,"S");
        assertArrayEquals(new int[]{0,-1,0}, sc.moveforward());
    }

}

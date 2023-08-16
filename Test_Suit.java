import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Test_Suit
{
    @Test
    void testmoveforward()
    {
        int input[]={0,0,0};
        Sample_Code sc=new Sample_Code(input,"Up");
        assertArrayEquals(new int[]{0,0,1}, sc.moveforward());

    }

}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Test_Suit
{
    @Test
    void testmoveforward()
    {
        int input[]={0,0,0};
        Sample_Code sc=new Sample_Code(input,"E");
        assertArrayEquals(new int[]{1,0,0}, sc.moveforward());

    }

}

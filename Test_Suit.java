import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Test_Suit
{
    @Test
    void testmoveforward()
    {
        Sample_Code sc=new Sample_Code();
        int init_pos[]={0,0,0};
        String init_dir="N";
        assertArrayEquals(new int[]{0,1,0}, sc.moveforward(init_pos,init_dir));
    }

}

import Ceaser.Decrypt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DecryptTest {
    @Test
    public  void  decrypt_notNull_Exception(){
        Decrypt decrypt = new Decrypt("ABCD",3);
        assertNotNull(decrypt);
    }

}

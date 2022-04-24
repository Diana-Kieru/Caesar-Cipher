import Ceaser.Decrypt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EncryptTest {
    @Test
    public  void  decrypt_notNull_Exception(){
        Decrypt decrypt = new Decrypt("ABCD",3);
        assertNotNull(decrypt);
    }
}

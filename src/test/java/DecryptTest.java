import Ceaser.Decrypt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DecryptTest {
    @Test
    public  void  decrypt_notNull_Exception(){
        Decrypt decrypt = new Decrypt("ABCD",3);
        assertNotNull(decrypt);
    }
    @Test
    public  void  decrypt_onlyString_Exception(){
        Decrypt decrypt = new Decrypt("BC",1);
        decrypt.getDecrypted();
        assertTrue(decrypt.getDecrypted() instanceof String );
    }

}

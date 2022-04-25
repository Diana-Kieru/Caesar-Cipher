import Ceaser.Decrypt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    @Test
    public  void decrypt_encryptedText_string() throws Exception {
        Decrypt decrypt = new Decrypt("BC",1);
        decrypt.Decode();
        String actual = decrypt.getDecrypted();
        String expected = "AB";

        assertEquals(expected,actual);

    }

}

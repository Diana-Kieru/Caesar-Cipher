import Ceaser.Encrypt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EncryptTest {
    @Test
    public  void encrypt_onlyString_exception() throws Exception {
        //arrange
        Encrypt encrypt = new Encrypt();

        //act
        String actual = encrypt.encoding("1",1);

        //assert
        assertTrue(actual instanceof String);

    }
    @Test
    public  void  encrypt_notNull_Exception() throws Exception {
        Encrypt encrypt = new Encrypt();
        String  actual = encrypt.encoding("AB",1);
        assertNotNull(actual);
    }

}

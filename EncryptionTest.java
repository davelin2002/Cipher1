

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
/**
 * The test class EncryptionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EncryptionTest
{
   public static void main(String[] args)
    {
        String test= "This is our test Message"; 
        
        System.out.println("below is the original message");
        System.out.println(test);
        System.out.println();
        
        System.out.println("Below is the encrypted message");
        String encrypted= Encryption.encrypt(1,test);
        System.out.println(encrypted);
        System.out.println();
        
        System.out.println("Below is the decrypted message");
        System.out.println(Encryption.decrypt(1,encrypted));
        System.out.println();
        
        System.out.println("Below is my encrypted message");
        String encrypted1= Encryption.encrypt2(1,test);
        System.out.println(encrypted1);
        System.out.println();
        
        System.out.println("Below is my decrypted message");
        System.out.println(Encryption.decrypt2(1,encrypted1));
        System.out.println();
        
    }
}

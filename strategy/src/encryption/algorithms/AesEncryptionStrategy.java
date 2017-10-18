package encryption.algorithms;

import encryption.EncryptionStrategy;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Arrays;

// implementing our Strategy (Encryption Strategy)
public class AesEncryptionStrategy implements EncryptionStrategy{


    @Override
    public void encryptData(String plaintext) {
        System.out.println("Encryption algorithm: AES");

        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);

            SecretKey secretKey = keyGenerator.generateKey();
            byte[] plainTextByteArray = plaintext.getBytes("UTF8");

            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] cipherText = cipher.doFinal(plainTextByteArray);

            System.out.println("Input: " + plaintext);
            System.out.println("Output: " + Arrays.toString(cipherText));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

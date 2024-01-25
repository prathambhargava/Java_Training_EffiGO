import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
 
public class encrydecry  {
    public static void main(String[] args)
    {
 
        try {
            KeyGenerator keygen= KeyGenerator.getInstance("DES");
            SecretKey myKey = keygen.generateKey();
            Cipher dCipher;
            dCipher = Cipher.getInstance("DES");

            byte[] text = "Hello Buddy".getBytes("UTF8");
            //ENCRY
            dCipher.init(Cipher.ENCRYPT_MODE, myKey);
            byte[] textEncrypted = dCipher.doFinal(text);
            String s = new String(textEncrypted);
            System.out.println(s);

            //DECRY

            dCipher.init(Cipher.DECRYPT_MODE, myKey);
            byte[] textDecrypted = dCipher.doFinal(textEncrypted);
            s = new String(textDecrypted);
            System.out.println(s);
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
}


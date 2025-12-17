package aciccone.demo;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.util.Base64;

public class SecretGenerator {
public static void main (String []args){
    byte[]key= Keys.secretKeyFor(SignatureAlgorithm.HS256).getEncoded();
    String secret = Base64.getEncoder().encodeToString(key);
    System.out.println("Segreto generato");
    System.out.println(secret);
}

}

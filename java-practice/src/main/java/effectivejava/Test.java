package effectivejava;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Test {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		for(int i=0;i<500;i++){
			System.out.println(i/100);
		}
	}

}

package L17_2;

import java.io.IOException;
import java.io.OutputStream;

public class Wertebereich {
	
	OutputStream os;
	
	public void werteBereicheControl(byte[] bArr, int off, int len){
		
		if(off<0 || len<0) {
			throw new RuntimeException("Negative Werte");
		}
		
			
	}

}

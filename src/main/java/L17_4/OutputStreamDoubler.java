package L17_4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamDoubler {
	private OutputStream os1;
	private OutputStream os2;
	private InputStream is;
	private boolean eins = false;
	private boolean zwei = false;
	
	
	public OutputStream getOs1() {
		return os1;
	}

	public OutputStream getOs2() {
		return os2;
	}

	public InputStream getIs() {
		return is;
	}

	public void setIs(InputStream is) {
		this.is = is;
	}

	public boolean isEins() {
		return eins;
	}


	public boolean isZwei() {
		return zwei;
	}

	public OutputStreamDoubler(OutputStream eins, OutputStream zwei) {
		this.os1=eins;
		this.os2=zwei;
	}
	
	public void close()  throws IOException{
		//äußeres try
		try {
			
			os1.close();
			eins=true;	
			try {
				os2.close();
				zwei=true;
				} 
			catch (Exception e) {
					throw new IOException("Stream zwei kann nicht geschlossen werden");
				}
			}
		//äußeres catch
			catch (Exception e) {
				try {
					os2.close();
					zwei=true;
								
				} catch (Exception e2) {
					throw new IOException("Stream eins und zwei können nicht geschlossen werden");
				}
			throw new IOException("Stream eins kann nicht geschlossen werden");
		}
	}
	
	public void write(int b) throws IOException{
		try {
			if(os1==null) {
				throw new IOException("Stream ist null");
			}
			os1.write(b);
					try {
						if(os2==null) {
							throw new IOException("Stream ist null");
						}
						os2.write(b);
					} catch (IOException e) {
//						e.printStackTrace();
						System.out.println("Stream zwei: [erster Catch] "+e.getMessage());
					}
		} catch (IOException e) {
			System.out.println("Stream eins: "+e.getMessage());
			
					try {
						if(os2==null) {
							throw new IOException("Stream ist null");
						}
						os2.write(b);
					} 
					catch (IOException e2) {
						System.out.println("Stream zwei: [zweiter catch] "+e.getMessage());
					}
		}
	}
	
	
}
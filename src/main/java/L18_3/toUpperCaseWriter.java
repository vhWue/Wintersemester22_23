package L18_3;

import java.io.IOException;
import java.io.Writer;

public class toUpperCaseWriter extends Decorator{

	toUpperCaseWriter(Writer writer) {
		super(writer);
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		for(int i = off; i<off+len;i++) {
			write(cbuf[i]);
		}
		
	}
	
	public void write(char c) throws IOException{
		writer.write(Character.toUpperCase(c));
	}

	@Override
	public void flush() throws IOException {
		writer.flush();
		
	}

	@Override
	public void close() throws IOException {
		writer.close();
	}

}

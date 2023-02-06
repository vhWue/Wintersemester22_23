package L18_3;

import java.io.IOException;
import java.io.Writer;

public class RemoveUmlauteWriter extends Decorator{

	RemoveUmlauteWriter(Writer writer) {
		super(writer);
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		for(int i = off;i<off+len;i++) {
			writeTest(cbuf[i]);
		}
		
		
	}
	public void writeTest(char c) throws IOException {
		if(c=='ä' || c=='Ä') {
			writer.write('a');
			writer.write('e');
		}
		else if(c=='ö'|| c=='Ö') {
			writer.write('o');
			writer.write('e');
		}
		else if(c=='ü'|| c=='Ü') {
			writer.write('u');
			writer.write('e');
		}
		else {
			writer.write(c);
		}
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

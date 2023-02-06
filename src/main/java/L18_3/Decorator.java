package L18_3;

import java.io.IOException;
import java.io.Writer;

public abstract class Decorator  extends Writer{

	Writer writer;
	
	Decorator(Writer writer){
		this.writer=writer;
	}
	
	@Override
	public abstract void write(char[] cbuf, int off, int len) throws IOException;
	@Override
	public abstract void flush() throws IOException; 
	@Override
	public abstract void close() throws IOException ;

}

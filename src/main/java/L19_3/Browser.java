package L19_3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Browser {
	private String url;
	public Browser(String url) {
		this.url = url;
	}
	
	public Optional<URL> back() {
		try {	
			return /*Math.random() < 0.5 ?*/ Optional.of(new URL(url)) /*: Optional.empty()*/;
			
		} catch (MalformedURLException e) {
			return Optional.empty();
		}
	}
	
	public String retrieveStrSite(Optional<URL> back) {
		return back.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("Normal back");
		Browser browser = new Browser("http://google.de");
		Optional<URL> back = browser.back();
		if(back.isPresent()) {
			browser.retrieveStrSite(back);
			System.out.println(browser.retrieveStrSite(back));
			System.out.println(back.get());
		}
	}

}

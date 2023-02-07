package Versuche;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Download {

    static void Bufferedcopy(InputStream is, OutputStream os) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(os);
        int n;
        while((n= is.read())!=-1){
            os.write(n);
        }
        is.close();
        os.close();
    }

    public static void downloadImage(String newUrl, String destinationFile) throws FileNotFoundException, IOException{
        HttpURLConnection connection = null;
        URL url = new URL(newUrl);
        connection = (HttpURLConnection) url.openConnection();
        try(FileOutputStream fos = new FileOutputStream(destinationFile);
            InputStream is = connection.getInputStream()){

            Bufferedcopy(is,fos);
        }
        finally {
            if(connection!=null) connection.disconnect();
        }
    }


}

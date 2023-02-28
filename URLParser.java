import java.net.*;

public class URLParser {
    
    public static void main(String[] args) throws MalformedURLException {
        String urlString = "https://www.example.com:8080/path/to/file.html";
        
        URL url = new URL(urlString);
        
        String protocol = url.getProtocol();
        String fileName = url.getFile();
        String host = url.getHost();
        String path = url.getPath();
        int port = url.getPort();

        System.out.println("Protocol: " + protocol);
        System.out.println("File name: " + fileName);
        System.out.println("Host: " + host);
        System.out.println("Path: " + path);
        System.out.println("Port: " + port);
    }
}




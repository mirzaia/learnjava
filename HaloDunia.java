import java.util.Scanner;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class HaloDunia{
 public static void main(String args[]) {
  try{
   SSLSocket koneksi = (SSLSocket) ((SSLSocketFactory) SSLSocketFactory.getDefault()).createSocket("gist.githubusercontent.com", 443);
   koneksi.getOutputStream()
     .write(("GET /dawud-tan/72ec7ce5ddc3f61be5a7/raw/0d0201644e0998234ace99678c3ded6401e4e9d8/halo.json HTTP/1.1\r\n"
       +"Host: gist.githubusercontent.com\r\n"
       +"Connection: close\r\n\r\n").getBytes());
   System.out.println(new Scanner(koneksi.getInputStream()).useDelimiter("\\A").next().split("\r\n\r\n")[1]);
   koneksi.close();
  }catch(Exception e){
  }
 }
}
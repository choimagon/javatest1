
import java.lang.String;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println("------------------start----------------------\n");
        String URL = "https://weather.naver.com/today/03127250?cpName=KMA";
        Document doc = Jsoup.connect(URL).get();

        Elements elem = doc.select(".current");
        System.out.println(elem.text());
        System.out.println("\n------------------End----------------------");
        //두번째
    }
}
import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.select.Selector;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.List;

public class JsoupTest {


    public static void main(String[] args) throws IOException, URISyntaxException, XpathSyntaxErrorException {
        String path=JsoupTest.class.getClassLoader().getResource("demo2.xml").toURI().getPath();
        Document document = Jsoup.parse(new File(path), "gbk");
       /* Element element = document.getElementById("1");
        System.out.println(element.getElementsByTag("age").html());*/
        /*Document document2 = Jsoup.parse(new URL("https://www.cnblogs.com/jiarui-zjb/p/6239166.html"), 10000);
        Element e = document2.getElementById("ad_text_under_commentbox");
        System.out.println(SQLOutput.class);*/
        /*Elements ee = document.select("#1 name");
        System.out.println(ee.text());*/
        JXDocument jxDocument=new JXDocument(document);
        List<JXNode> jxNodes = jxDocument.selN("//user[@id='1']/level");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }


    }



}

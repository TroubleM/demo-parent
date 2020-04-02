package tm;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JsoupApplication.class)
public class JsoupTest {

    @Test
    public void pachongPage() throws Exception{

        String url = "http://rskszx.czsrsj.chizhou.gov.cn/default.html";

        Document pageDoc = null;
        try {
            pageDoc = Jsoup.connect(url).userAgent("Mozilla").get();// 模拟火狐浏览器
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements frameElements = pageDoc.select("frame");

        for (Element element : frameElements){
            String secondUrl = url.replaceAll(url.substring(url.lastIndexOf("/") + 1),element.attr("src"));
            Document secondDoc = Jsoup.connect(secondUrl).userAgent("Mozilla").get();
            String scriptHtml = secondDoc.select("script").html();
            if(!StringUtils.isEmpty(scriptHtml)){
                //模拟选出以location开头的
                String thridUrl = url.replaceAll(url.substring(url.lastIndexOf("/") + 1),"index.asp?p1=p2");
                Document thridDoc = Jsoup.connect(thridUrl).userAgent("Mozilla").get();
                Elements aElements = thridDoc.select("a");
                for (Element aElement : aElements){
                    System.out.println(aElement);
                }
            }
        }
        System.out.println("1");
    }

    @Test
    public void test2(){
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.exec("print('hello')");
        PyObject pyObject = new PyObject();
    }

}

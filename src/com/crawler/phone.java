package com.crawler;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class phone {
    public static void main(String[] args) {
        try {
            // 使用 Jsoup 解析网页内容
            Document doc = Jsoup.parse(new File("/Users/zhanyou/learnspace/java-learning/src/com/crawler/phone.html"), "UTF-8");
            // 解析商品列表
            Element divElement = doc.getElementById("J_goodsList");
            Elements liElements = divElement.select("ul.gl-warp li.gl-item");
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/zhanyou/learnspace/java-learning/src/com/crawler/phone.txt"));
            for (Element liElement : liElements) {
                String productId = liElement.attr("data-sku");
                for (int i = 0; i < 100; i++) {
                    String url = "https://club.jd.com/comment/productPageComments.action?callback=fetchJSON_comment98&productId=%s&score=0&sortType=5&page=%s&pageSize=100&isShadowSku=0&fold=1";
                    CloseableHttpClient httpClient = HttpClients.createDefault();
                    HttpGet httpGet = new HttpGet(String.format(url, productId, i));
                    httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/110.0");
                    CloseableHttpResponse response = null;
                    try {
                        response = httpClient.execute(httpGet);
                        String json = EntityUtils.toString(response.getEntity());
                        //掐头去尾
                        json = json.replaceAll("\\w+\\(", "");
                        json = json.replaceAll("\\);{1}", "");
                        JSONObject object = JSONObject.parseObject(json);
                        JSONArray rawComment = JSONArray.parseArray(String.valueOf(object.get("comments")));
                        //遍历输出
                        rawComment.forEach(item -> {
                            String content = ((JSONObject) item).get("content").toString();
                            if (!content.contains("\n")) {
                                try {
                                    writer.write("productId:" + productId + "#content:" + ((JSONObject) item).get("content").toString().replaceAll("[\\uD800-\\uDFFF]", ""));
                                    writer.newLine();
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                                System.out.println("productId:" + productId + "#content:" + ((JSONObject) item).get("content").toString().replaceAll("[\\uD800-\\uDFFF]", ""));
                            }
                        });
                        httpClient.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

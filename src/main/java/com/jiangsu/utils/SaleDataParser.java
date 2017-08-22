package com.jiangsu.utils;

import com.google.common.collect.Lists;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;
import com.jiangsu.entity.Sale;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Component
public class SaleDataParser {
  private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");


  public List<Sale> parse(String html) {
    Document document = Jsoup.parse(html);

    Element dataContent = document.getElementsByClass("gridtable6").get(0);
    Elements salesDataDom = dataContent.getElementsByTag("tr");

    List<Sale> sales = Lists.newArrayList();
    for (Element e : salesDataDom) {
      sales.add(parse(e));
    }

    return sales;
  }

  private Sale parse(Element houseInfo) {
    Elements tds = houseInfo.getElementsByTag("td");

    Sale sale = new Sale();

    sale.setHouse(parseHouseName(tds.get(0)));
    sale.setPrice(parseAvgPrice(tds.get(3)));

    sale.setCreateDate(dateFormat.format(new Date()));

    return sale;
  }

  private String parseHouseName(Element e) {
    return e.text();
  }

  private int parseAvgPrice(Element e) {
    return Integer.parseInt(e.text());
  }
}

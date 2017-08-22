package com.jiangsu.crawler;

import com.jiangsu.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import com.jiangsu.utils.SaleDataParser;
import com.jiangsu.entity.Sale;

import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Component
public class Crawler {

    private static final String CRAWLER_URL = "http://www.tmsf.com/index.jsp";


    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private SaleService saleService;
    @Autowired
    private SaleDataParser saleDataParser;


    public void run() {
        //通过restTemplate获取页面的dom数据
        String html = restTemplate.getForEntity(CRAWLER_URL, String.class).getBody();
        if (StringUtils.isEmpty(html)) {
            return;
        }
        System.out.println(html);


        List<Sale> sales = saleDataParser.parse(html);
        for (Sale sale : sales) {
            System.out.println(sale);
        }

        if (CollectionUtils.isEmpty(sales)) {
            return;
        }

        saleService.save(sales);
    }

}

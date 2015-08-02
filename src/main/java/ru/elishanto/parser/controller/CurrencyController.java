package ru.elishanto.parser.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Map;

public class CurrencyController {
    public static Document HTML = null;

    public CurrencyController() {
        try {
            this.HTML = Jsoup.connect("http://www.banki.ru/products/currency/").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getCurrency(final Map<String, String> map) {
        ArrayList<Element> arr = HTML.select("a.color-text");
        for (Element el : arr) {
            int index = arr.indexOf(el);
            NumberFormat numberFormat = new DecimalFormat("#0.0000");
            map.put(el.text(), HTML.select("span.emulate-table__item__value").get(index).text());
        }
    }
}

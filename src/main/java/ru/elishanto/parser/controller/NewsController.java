package ru.elishanto.parser.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;

public class NewsController {
    public static Document HTML = null;

    public NewsController() {
        try {
            this.HTML = Jsoup.connect("https://m.news.yandex.ru/").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getNews(final ArrayList<String> arrayList) {
        for (Element el : HTML.select("a.b-titles-list__link")) {
            arrayList.add(el.text());
        }
    }
}

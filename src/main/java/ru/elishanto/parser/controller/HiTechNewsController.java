package ru.elishanto.parser.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;

public class HiTechNewsController {
    public static Document HTML = null;

    public HiTechNewsController() {
        try {
            this.HTML = Jsoup.connect("http://4pda.ru/news/").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getHiTechNews(final ArrayList<String> arrayList) {
        for (Element el : HTML.select("a[itemprop = name]")) {
            arrayList.add(el.text());
        }
    }
}

package ru.elishanto.parser.model;

import org.jsoup.nodes.Document;
import ru.elishanto.parser.controller.CurrencyController;
import ru.elishanto.parser.controller.HiTechNewsController;
import ru.elishanto.parser.controller.NewsController;
import ru.elishanto.parser.view.ConsoleView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Data {
    //Controllers
    public static final NewsController newsController = new NewsController();
    public static final CurrencyController currencyController = new CurrencyController();
    public static final HiTechNewsController hiTechNewsController = new HiTechNewsController();
    //View
    public static final ConsoleView consoleView = new ConsoleView();
    //Collections
    public static final Map<String, String> currency = new TreeMap<String, String>(Collections.reverseOrder());
    public static final ArrayList<String> news = new ArrayList<String>();
    public static final ArrayList<String> hiTechNews = new ArrayList<String>();
    //other
    public static Document HTML = null;
}

package ru.elishanto.parser;

import ru.elishanto.parser.controller.CurrencyController;
import ru.elishanto.parser.controller.HiTechNewsController;
import ru.elishanto.parser.controller.NewsController;
import ru.elishanto.parser.model.Data;

public class Main {
    public static void main(String[] args) {
        //main loop
        while (true) {
            final int what = Data.consoleView.task();
            switch (what) {
                case 1:
                    Data.HTML = NewsController.HTML;
                    Data.consoleView.setNews(Data.news);
                    Data.newsController.getNews(Data.news);
                    break;
                case 2:
                    Data.HTML = CurrencyController.HTML;
                    Data.consoleView.setCurrency(Data.currency);
                    Data.currencyController.getCurrency(Data.currency);
                    break;
                case 3:
                    Data.HTML = HiTechNewsController.HTML;
                    Data.consoleView.setHiTechNews(Data.hiTechNews);
                    Data.hiTechNewsController.getHiTechNews(Data.hiTechNews);
                default:
                    break;
            }
            Data.consoleView.show(what);
        }
    }
}

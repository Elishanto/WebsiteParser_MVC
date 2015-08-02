package ru.elishanto.parser;

import ru.elishanto.parser.model.Data;

public class Main {
    public static void main(String[] args) {
        final Data data = new Data();

        //main loop
        while (true) {
            final int what = data.consoleView.task();
            switch (what) {
                //news case
                case 1:
                    data.HTML = data.newsController.HTML;
                    data.consoleView.setNews(data.news);
                    data.newsController.getNews(data.news);
                    break;
                case 2:
                    data.HTML = data.currencyController.HTML;
                    data.consoleView.setCurrency(data.currency);
                    data.currencyController.getCurrency(data.currency);
                    break;
                case 3:
                    data.HTML = data.hiTechNewsController.HTML;
                    data.consoleView.setHiTechNews(data.hiTechNews);
                    data.hiTechNewsController.getHiTechNews(data.hiTechNews);
                default:
                    break;
            }
            data.consoleView.show(what);
        }
    }
}

package ru.elishanto.parser.view;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class ConsoleView {
    public int task() {
        System.out.println("1. Новости");
        System.out.println("2. Курсы валют");
        System.out.println("3. HiTech новости");
        System.out.print("Введите цифру: ");
        final int what = new Scanner(System.in).nextInt();
        return what;
    }

    ArrayList<String> news;
    Map<String, String> currency;
    ArrayList<String> hiTechNews;

    public void show(final int code) {
        System.out.println("===================");
        if (code == 1) {
            for (String one : news) {
                System.out.println(one);
            }
            System.out.println("===================");
        }
        if (code == 2) {
            for (Map.Entry pair : currency.entrySet()) {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }
            System.out.println("===================");
        }
        if (code == 3) {
            for (String one : hiTechNews) {
                System.out.println(one);
            }
            System.out.println("===================");
        }
        System.out.println();
    }

    public void setNews(ArrayList<String> news) {
        this.news = news;
    }

    public void setCurrency(Map<String, String> currency) {
        this.currency = currency;
    }

    public void setHiTechNews(ArrayList<String> hiTechNews) {
        this.hiTechNews = hiTechNews;
    }
}

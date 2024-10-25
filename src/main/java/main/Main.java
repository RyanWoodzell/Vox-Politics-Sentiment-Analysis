package org.example;

import org.example.data.NLP;

import java.io.IOException;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scraper scraper = new Scraper();
        //scraper.scrapeProductPage();
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Provide a url");
        String url = sc.nextLine();*/
        scraper.parseUrls();
        scraper.parseArticles();
        ArrayList<String> texts = scraper.getTexts();
        ArrayList<String> titles = scraper.getTitles();
       // for (int i = 0; i < texts.size(); i++) {
            //System.out.println(titles.get(i));
            //System.out.println(texts.get(i));
        //}
        for(int i = 1; i < texts.size()+1; i++){
            System.out.println(i + ". " + titles.get(i-1));
        }
       //NLP nlp = new NLP();
       //nlp.sentimentAnalysis(texts);




        //System.out.println(scraper.getTitle());
    }
}
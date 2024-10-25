package main;

import java.util.ArrayList;
import java.io.IOException;

import java.util.Scanner;

public class textInterface {
    public void run() throws IOException{
        boolean runAgain = true;
        while(runAgain) {

            //import scanner to retrieve user data
            Scanner scan = new Scanner(System.in);

            //create Scraper class to retrieve articles from Vox
            Scraper scraper = new Scraper();

            //create NLP class to run natural language processing on the text
            NLP nlp = new NLP();

            //retrieve the Urls from the politics page on Vox
            scraper.parseUrls();

            //scrape each url found using recursion
            scraper.parseArticles();

            //import texts and titles
            ArrayList<String> texts = scraper.getTexts();
            ArrayList<String> titles = scraper.getTitles();

            //User interface
            System.out.println("Welcome to Woody's Vox Scraper! Below are the possible political articles we can analyze.");
            System.out.println("-----------------------------------------------------------------------------------------");

            //print out each text and corresponding number
            for (int i = 1; i < texts.size(); i++) {
                System.out.println(i + ". " + titles.get(i - 1));
            }

            //ask which article the user would like to analyze
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("Enter the number of the article you would like to analyze: ");

            //get selection
            int selection = scan.nextInt();
            nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));

            System.out.println("\nWould you like to continue analyzing? Y/N");
            String answer = scan.next();
            if (answer.equalsIgnoreCase("n")) {
                runAgain = false;
            }
        }
        System.out.println("Thank you for using my Web Scraper!");
    }
}

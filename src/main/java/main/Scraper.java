package main;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Scraper {


    //temp fields to add to ArrayLists
    String text;
    String pageTitle;

    // HashSet used to track visited Urls
    public Set<String> visitedUrls = new HashSet<>();

    //ArrayList fields that contain gathered data
    ArrayList<String> urls = new ArrayList<>();
    ArrayList<String> titles = new ArrayList<>();
    ArrayList<String> texts = new ArrayList<>();

    //Main scraping method
    public  void scrape(String url) throws IOException {

        //ensure url has not been previously visited
        if(visitedUrls.contains(url)) {
            return;//already visited
        }

        //Add url to list of previously scraped Url
        visitedUrls.add(url);

        //connect jsoup to specified url
        Document document = Jsoup.connect(url).get();

        //head element to retrieve title
        Element head = document.head();

        //body element to retrieve paragraph element
        Element body = document.body();

        //get the title from the header
        Elements title = head.getElementsByTag("title");

        //necessary to prevent repetition of titles
        boolean firstTitle = true;

        //add the title of the article to list of titles
        for (Element element : title) {
            titles.add(element.text());
            break;
        }

        //get paragraph elements in the body
        Elements paragraphs = body.getElementsByTag("p");

        //used to prevent null read for first paragraph
        boolean firstLine = true;

        //create string text and add to ArrayList of texts
        for (Element paragraph : paragraphs) {
            if(firstLine) {
                text = paragraph.text() + " ";
                firstLine = false;
            }else{
                text = text + paragraph.text() + " ";
                //System.out.println(paragraph.text());
            }
        }
        //Vox places this in p in each article. Would be in every article if not removed.
        text = text.replace("The US presidential campaign is in its final weeks and we’re dedicated to helping you understand the stakes. In this election cycle, it’s more important than ever to provide context beyond the headlines. But in-depth reporting is costly, so to continue this vital work, we have an ambitious goal to add 5,000 new members. We rely on readers like you to fund our journalism. Will you support our work and become a Vox Member today?", "");
        text = text.replace("© 2024 Vox Media, LLC. All Rights Reserved ", "");

        //add text to arraylist of texts
        texts.add(text);
    }

    //Gather the most recent articles on Vox
    public void parseUrls() throws IOException {

        //connect to main site
        Document doc = Jsoup.connect("https://www.vox.com/politics").get();

        // Select all anchor tags with href attribute and class
        Elements links = doc.select("a[href].qcd9z1");

        //System.out.println(link.attr("abs:href")); // Print absolute URLs
        Element body = doc.body();

        //necessary to prevent link repetion
        boolean firstLink = true;

        //add every link on the new articles part of vox politics.
        for (Element link : links) {

            //prevent repetition of the same link
            if(firstLink) {
                firstLink = false;
                continue;
            }

            //gather links
            urls.add(link.absUrl("href"));
        }
    }

    //parse every url scraped by parseUrls()
    public void parseArticles() throws IOException {
        for (String Url : urls) {
            scrape(Url);
        }
    }

    //getter methods

    //get text from specified number article
    public String getText(){
        return text;
    }
    //get title of specified number title
    public String getTitle(){
        return pageTitle;
    }
    //get list of titles
    public ArrayList<String> getTitles(){
        return titles;
    }
    //get list of texts
    public ArrayList<String> getTexts(){
        return texts;
    }
    //getter method for list of urls
    public ArrayList<String> getUrls() {
        return(urls);
    }
}
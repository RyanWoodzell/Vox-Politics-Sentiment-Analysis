package main;

import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.util.CoreMap;
import java.util.*;


public class NLP {

    //Main sentiment Analysis method

    public void sentimentAnalysis(String text, String title) {

        // Create a pipeline with sentiment analysis
        ArrayList<String> sentiments = new ArrayList<>();
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit, parse, sentiment");
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);


        // Annotate the text
        Annotation document = new Annotation(text);
        pipeline.annotate(document);

        // Extract sentiments
        for (CoreMap sentence : document.get(CoreAnnotations.SentencesAnnotation.class)) {
            String sentiment = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
            //System.out.println(sentiment);
            sentiments.add(sentiment);
        }

        //Calculate overall sentiment of the article
        int positiveCount = 0;
        int negativeCount = 0;
        int neutralCount = 0;
        for (String sentiment : sentiments) {
            if (sentiment.equals("Positive")) {
                positiveCount++;
            } else if (sentiment.equals("Negative")) {
                negativeCount++;
            } else if (sentiment.equals("Neutral")) {
                neutralCount++;
            }
        }

        //Printing results

        //mostly neutral
        if ((neutralCount > positiveCount) && (neutralCount > negativeCount)) {
            System.out.println(title + " sentiment analysis. The article is mostly Neutral. ");
            System.out.println("Neutral sentences: " + neutralCount + " Positive sentences: " + positiveCount + " Negative sentences: " + negativeCount);
        }
        //mostly positive
        else if ((positiveCount > negativeCount) && (positiveCount > neutralCount)) {
            System.out.println(title + " sentiment analysis. The article is mostly Positive ");
            System.out.println("Positive sentences: " + positiveCount + " Negative sentences: " + negativeCount + " Neutral sentences: " + neutralCount);
        }

        //mostly negative
        else if ((negativeCount > positiveCount) && (negativeCount > neutralCount)) {
            System.out.println(title + " sentiment analysis. The article is mostly Negative. ");
            System.out.println("Negative sentences: " + negativeCount + " Neutral sentences: " + positiveCount + " Positive sentences: " + neutralCount);
        }
        //equally neutral and positive but greater than negative
        else if ((neutralCount == positiveCount) && (neutralCount > negativeCount)) {
            System.out.println("Sentiment analysis. The article is equally Neutral and Positive. ");
            System.out.println("Neutral sentences: " + neutralCount + " Positive sentences: " + positiveCount + " Negative sentences: " + negativeCount);
        }
        //equally neutral and negative but greater than positve
        else if ((neutralCount > positiveCount) && (neutralCount == negativeCount)) {
            System.out.println("Sentiment analysis. The article is equally Neutral and Negaitve. ");
            System.out.println("Neutral sentences: " + neutralCount + " Negative sentences:" + negativeCount + " Positive sentences: " + positiveCount);
        }
        //equally positive and negative but greater than neutral
        else if ((positiveCount == negativeCount) && (positiveCount > neutralCount)) {
            System.out.println("Sentiment analysis. The article is equally Positive and Negative. ");
            System.out.println(" Positive sentences: " + positiveCount + " Negative sentences:" + negativeCount + "Neutral sentences: " + neutralCount);
        }
        //equally neutral, positive, and negative but greater than negative
        else if ((negativeCount == positiveCount) && (negativeCount == neutralCount)) {
            System.out.println("Sentiment analysis. The article is equally Positive, Negative, and Neutral. ");
            System.out.println("Negative sentences: " + negativeCount + " Neutral sentences: " + positiveCount + " Positive sentences: " + neutralCount);
        }
    }
}







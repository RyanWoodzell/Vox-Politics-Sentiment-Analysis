package main.data;

import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.util.CoreMap;
import java.util.*;


import java.util.*;
public class NLP {

    ArrayList<String> sentiments = new ArrayList<>();
    ArrayList<String> finalSentiments = new ArrayList<>();

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

            //Calculate total sentiment.
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
            if ((neutralCount > positiveCount) && (neutralCount > negativeCount)) {
                System.out.println(title + " sentiment analysis. The article is mostly Neutral. ");
                System.out.println("Neutral sentences: " + neutralCount + " Positive sentences: " + positiveCount + " Negative sentences: " + negativeCount);
            }
            if ((positiveCount > negativeCount) && (positiveCount > neutralCount)) {
                System.out.println(title + " sentiment analysis. The article is mostly Positive ");
                System.out.println("Positive sentences: " + positiveCount + " Negative sentences: " + negativeCount + " Neutral sentences: " + neutralCount);
            }
            if ((negativeCount > positiveCount) && (negativeCount > neutralCount)) {
                System.out.println(title + " sentiment analysis. The article is mostly Negative. ");
                System.out.println("Negative sentences: " + negativeCount + " Neutral sentences: " + positiveCount + " Positive sentences: " + neutralCount);
            }

    }
    public void processSelection(int selection, List<String> texts, List<String> titles, NLP nlp) {
        switch (selection) {
            case 1:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 2:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 3:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 4:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 5:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 6:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 7:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 8:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 9:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 10:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 11:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 12:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 13:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 14:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 15:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 16:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 17:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 18:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 19:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 20:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 21:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 22:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 23:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 24:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 25:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 26:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 27:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 28:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 29:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 30:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 31:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 32:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 33:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 34:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 35:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 36:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 37:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 38:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 39:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 40:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 41:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 42:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 43:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 44:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 45:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            case 46:
                nlp.sentimentAnalysis(texts.get(selection - 1), titles.get(selection - 1));
                break;
            default:
                System.out.println("Selection out of range. Please select a value between 1 and 46.");
                break;
        }
    }
}






        // set up pipeline properties
       /* Properties props = new Properties();
        // set the list of annotators to run
        props.setProperty("annotators", "tokenize,ssplit,pos,lemma,ner,parse,depparse,coref,kbp,quote");
        // set a property for an annotator, in this case the coref annotator is being set to use the neural algorithm
        props.setProperty("coref.algorithm", "neural");
        // build pipeline
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
        // create a document object
        CoreDocument document = new CoreDocument(text);
        // annnotate the document
        pipeline.annotate(document);
        // examples

        // 10th token of the document
        CoreLabel token = document.tokens().get(9);
        System.out.println("Example: token");
        System.out.println(token);
        System.out.println();

        // text of the first sentence
        String sentenceText = document.sentences().get(0).text();
        System.out.println("Example: sentence");
        System.out.println(sentenceText);
        System.out.println();

        // second sentence
        CoreSentence sentence = document.sentences().get(1);

        // list of the part-of-speech tags for the second sentence
        List<String> posTags = sentence.posTags();
        System.out.println("Example: pos tags");
        System.out.println(posTags);
        System.out.println();

        // list of the ner tags for the second sentence
        List<String> nerTags = sentence.nerTags();
        System.out.println("Example: ner tags");
        System.out.println(nerTags);
        System.out.println();

        // constituency parse for the second sentence
        Tree constituencyParse = sentence.constituencyParse();
        System.out.println("Example: constituency parse");
        System.out.println(constituencyParse);
        System.out.println();

        // dependency parse for the second sentence
        SemanticGraph dependencyParse = sentence.dependencyParse();
        System.out.println("Example: dependency parse");
        System.out.println(dependencyParse);
        System.out.println();

        // kbp relations found in fifth sentence
        List<RelationTriple> relations =
                document.sentences().get(4).relations();
        System.out.println("Example: relation");
        System.out.println(relations.get(0));
        System.out.println();

        // entity mentions in the second sentence
        List<CoreEntityMention> entityMentions = sentence.entityMentions();
        System.out.println("Example: entity mentions");
        System.out.println(entityMentions);
        System.out.println();

        // coreference between entity mentions
        CoreEntityMention originalEntityMention = document.sentences().get(3).entityMentions().get(1);
        System.out.println("Example: original entity mention");
        System.out.println(originalEntityMention);
        System.out.println("Example: canonical entity mention");
        System.out.println(originalEntityMention.canonicalEntityMention().get());
        System.out.println();

        // get document wide coref info
        Map<Integer, CorefChain> corefChains = document.corefChains();
        System.out.println("Example: coref chains for document");
        System.out.println(corefChains);
        System.out.println();

        // get quotes in document
        List<CoreQuote> quotes = document.quotes();
        CoreQuote quote = quotes.get(0);
        System.out.println("Example: quote");
        System.out.println(quote);
        System.out.println();

        // original speaker of quote
        // note that quote.speaker() returns an Optional
        System.out.println("Example: original speaker of quote");
        System.out.println(quote.speaker().get());
        System.out.println();

        // canonical speaker of quote
        System.out.println("Example: canonical speaker of quote");
        System.out.println(quote.canonicalSpeaker().get());
        System.out.println();*/






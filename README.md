# Sentiment Analysis of Vox Political Articles

## A fully functional web-scraping and NLP fundamentals project written in java

This project employs jsoup API to scrape all links from the most recent Vox Political articles. It then offers each article title to the user, and allows the user to select a chosen article. After the article is selected, the project employs the Stanford CoreNLP API to determine the sentiments of each sentence, creating a sentiment judgement for the chosen article.

Example Run: The program is run, and demonstrates all articles on the Vox Politics page to the User. 

![Woody's Vox Scraper](https://github.com/user-attachments/assets/464520df-ee43-4f2c-a299-7510aa1f8959)

The user then selects and article, it is then parsed and a sentiment judgement is created using nlp.sentimentAnalysis(). 

The output is then given to the user. 

![Screenshot 2024-10-25 121521](https://github.com/user-attachments/assets/a90b9ad3-2753-4f84-98d0-aedfa61f91a7)

## Lessons Learned:


  -  In making this project, I learned a lot about using different API's in java. Previously, I had a hard time importing open source code into my projects, and using it in said project. This project was a great introduction to using other open-sourced tools.
  -  This was my first time working with Stanford CoreNLP, and my first introduction to Natural Language Processing. This field is a newfound fascination of mine. I am extremely interested in learning more about machine learning and the capabilities of NLP.
  -  This was also my first time using the Jsoup API. Jsoup is a webscraper, and I had to learn to understand its innerworkings. Web Scraping is also a new field to me, and I am excited to experiment and test out the capabilities of Jsoup.

## How to Run my Project

1. Download project files
2. Initialize both Stanford CoreNLP and Jsoup through either Maven Project, or import the JAR files as libraries in your code editor.
   - Stanford CoreNLP: https://stanfordnlp.github.io/CoreNLP/download.html
   - Jsoup: https://jsoup.org/download
4. Run the main file!

## The Future!

To further develop this project, I am beginning a stanford machine learning class, to work towards machine learning with NLP. This will vastly expand my horizons with Stanford CoreNLP. Another goal of mine is to increase the efficiency of the program. It works well, but not very fast. I am currently researching possible opportunities to make the program as efficient as possible.  

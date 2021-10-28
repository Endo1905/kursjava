package pl.teslachorzow.apierwszyprogram;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class Main03 {
    public static void main(String[] args) {
        ChuckNorrisQuotes jokes = new ChuckNorrisQuotes();
        System.out.println(jokes.getRandomQuote());
        System.out.println(jokes.getRandomQuote());
        System.out.println(jokes.getRandomQuote());
    }
}

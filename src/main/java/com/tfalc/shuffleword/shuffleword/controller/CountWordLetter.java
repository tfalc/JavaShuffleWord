package com.tfalc.shuffleword.shuffleword.controller;

import java.util.ArrayList;
import java.util.List;

public class CountWordLetter {
    /*
    Start a list to receive the words letter count
    @param Word or Phrase
    @method iterate each word from a list to find it's length and save it to a list.
     */
    List<String> CountWordsLetter = new ArrayList<>();
    int countChar;
    for (String wordLetter : CountWordsLetter){
        countChar = wordLetter.length();
        CountWordsLetter.add(String.valueOf(countChar));
    }

}

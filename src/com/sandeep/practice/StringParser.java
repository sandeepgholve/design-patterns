package com.sandeep.practice;

import java.util.StringTokenizer;

/**
 * Created by sgholve on 12/3/14.
 */
public class StringParser {
    public static void main(String[] args) {
        String[] messages = {
            "[110002],pserver202: 41;42;44;45;46: Text"
        };

        for (String message : messages) {
            StringTokenizer tokenizer = new StringTokenizer(message, ":");
            System.out.println(tokenizer.countTokens());

            System.out.println(tokenizer.nextToken());
            System.out.println(tokenizer.nextToken().trim());
            System.out.println(tokenizer.nextToken());
            /*
            while (tokenizer.hasMoreTokens()) {
                System.out.println(tokenizer.nextToken());
            }
            */

            System.out.println(message);
            System.out.println(tokenizer.countTokens());
        }

    }
}

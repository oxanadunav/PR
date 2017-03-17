package com.oxana;

import org.apache.commons.lang.StringUtils;

/**
 * Levenstein distance
 *
 */
public class App 
{
    public static void main(String[] args) {
        System.out.println("Hello World Maven Project!");
        int distance = StringUtils.getLevenshteinDistance("Hello", "Hello World");
        System.out.println("The Levenshtein distance is " +  distance);
    }
}

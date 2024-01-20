package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    // получить слово зная начало и конец строки
        // начинается с А занкансивается на С
        Pattern p1 = Pattern.compile("^a.*c$");
        Matcher m1 = p1.matcher("abc");
        while (m1.find()){
            System.out.println(m1.start() +" "+ m1.group()+" ");
        }
    }
}

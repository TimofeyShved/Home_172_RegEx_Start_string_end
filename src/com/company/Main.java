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

        // принимаем только цифры
        Pattern p2 = Pattern.compile("^\\d+$");
        Matcher m2 = p2.matcher("875");
        while (m2.find()){
            System.out.println(m2.start() +" "+ m2.group()+" ");
        }
        // "\\d+"  можно использовать, но тогда он будет находить все цифры даже в словах ab4c

    }
}

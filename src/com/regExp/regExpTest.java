package com.regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExpTest {
    public static void main(String[] args) {
        String content = "abc ab";
        String regExp = "ab\\b";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到："+matcher.group(0));
            System.out.println(matcher.group(1));
        }
    }
}

package com.cairone.tallertechnologies;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LookAndSayChallange {

    public String lookAndSay(int n) {
        if (n <= 0) return "";
        if (n == 1) return "1";

        String current = "1";

        for (int i = 2; i <= n; i++) {
            current = nextElement(current);
        }

        return current;
    }

    public String nextElement(String current) {

        char[] chars = current.toCharArray();
        int count = 0;
        int p = chars[0] - '0';

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            int currNum = chars[i] - '0';
            if (currNum == p) {
                count++;
            } else {
                sb.append(count);
                sb.append(p);

                p = currNum;
                count = 1;
            }
        }

        sb.append(count);
        sb.append(p);

        return sb.toString();
    }

}

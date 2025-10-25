package com.training.training.collection;

public class Hash {
    public static void main(String[] args) {
        System.out.println(simpleHash("ABC"));
        System.out.println(simpleHash("CBA"));
        System.out.println(simpleHash("BAC"));
    }
    public static int simpleHash(String key)
    {
        int sum=0;
        for(char c : key.toCharArray())
        {
            sum+=(int)c;
        }
         return sum%10;
    }
}

package com.company.strings;

public class ReverseString {

    public String reverse(String input){

        char[] ip = input.toCharArray();
        for(int i = 0; i<ip.length/2; i++)
        {
            char temp = ip[i];
            ip[i] = ip[ip.length-1-i];
            ip[ip.length-1-i] = temp;
        }
        return String.valueOf(ip);
    }
}

package com.Bridgelabs;

public class MixedString {
    public static void main(String[] args)
    {
        String data="AnuRoopLOhithkumar @123";
        StringBuffer sr=new StringBuffer(data);
        sr.reverse();
        char[] charArray=data.toCharArray();
        int upper=0;
        int lower=0;
        int digit=0;
        int others=0;

        int totalChars=data.length();
        for(int i=0;i<data.length();i++){
            if (Character.isUpperCase(charArray[i])){
                upper++;
            }
            else if(Character.isLowerCase(charArray[i])){
                lower++;
            }else if(Character.isDigit(charArray[i])){
                digit++;
            }else{
                others++;
            }
        }
        System.out.println("The string is: " +data);
        System.out.println();
        System.out.println("The reverse string is: " +sr);
        System.out.println("Total length of the string: "+totalChars);
        System.out.println("Upper case: "+upper);
        System.out.println("Lower case: "+lower);
        System.out.println("Digits: "+digit);
        System.out.println("Others: "+others);
    }
}

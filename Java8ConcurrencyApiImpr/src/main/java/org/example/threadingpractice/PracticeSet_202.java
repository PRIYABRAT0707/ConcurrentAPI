package org.example.thradingpractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeSet_202 {

    public int[] getAllElements() throws PracticeSet_201{
        int [] hee=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of element you want to enter which must not be grater than 5 or equal to 5");
        int n;
        n=sc.nextInt();
        if(n>5){
            throw new PracticeSet_201("you have entered more than holding capacity");

        }
        else{
           for(int i=0;i<=n;i++){
               System.out.println("enter number");
               int m=sc.nextInt();
               hee[i]=m;
           }
        }

        return hee;
    }

    public String filteredString(String test){
        String haa=null;
        Pattern pat=Pattern.compile("x{2}",Pattern.CASE_INSENSITIVE);
        Matcher mat=pat.matcher(test);
        haa=mat.replaceAll("zz");

        return haa;
    }



    public static void main(String[] args) {
        PracticeSet_202 kk=new PracticeSet_202();
        try {
            int [] jj=kk.getAllElements();
            for(int j:jj) {
                System.out.println(j);
            }   }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        String jj=kk.filteredString("gggjjashisxxuuoa");
        System.out.println(jj);

    }
}

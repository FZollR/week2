package org.example.hello_world;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.print("Szia, légyszíves add meg a neved!");
        String str= sc.nextLine();
        System.out.println("Válassz nyelvet!");
        String str2= sc.nextLine();

        if(str.length()==0)
            System.out.println("Nem adtad meg a neved :(");
        else if (str2.length()==0)
            System.out.println("Szia, "+ str + "!");
        else if (str2.equals("hu"))
            System.out.println("Szia, "+ str + "!");
        else if (str2.equals("en"))
            System.out.println("Hello, "+ str + "!");
        else if (str2.equals("haw"))
            System.out.println("Aloha, "+ str + "!");
        else System.out.println("Ismeretlen nyelv!");

    }
}

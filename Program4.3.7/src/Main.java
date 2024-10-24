//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.io.*;
import  java.util.*;


public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text =scanner.nextLine();
    double sum = 0;

    String[] words = text.split("\\s+");
    for (String word : words){
        try {
            double number = Double.parseDouble(word);
            sum += number;
        }catch (NumberFormatException e){

        }
    }
        System.out.printf("%.6f", sum);
    }

    }

package org.example.Ex20;
import org.example.Dentest.Invoice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("D://Test/file.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            ArrayList<String> string1 = new ArrayList<> () ;
            ArrayList<String> string2 = new ArrayList<> () ;

            while (line != null) {
                //System.out.println(line);
                string1.add(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
            Scanner in = new Scanner(System.in);

            while(in.hasNextLine()){
                String word = in.nextLine();
                if (word.isEmpty()) break;
                string2.add(word);
            }
            int t=0;
            for(int i=0; i<string2.size();i++){

                for(int j=0; j<string1.size();j++){
                    if(string1.get(j).equals(string2.get(i))){
                        
                        t=1;
                        break;
                    }
                }
                if(t==0)
                    System.out.println(string2.get(i));
                t=0;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try(FileReader fr = new FileReader("test.txt"); FileWriter fw = new FileWriter("output.txt")){
            int z;
            String txt = "";
            while((z = fr.read()) != -1){
                txt += (char)z;
            }

            String slc = txt.replaceAll("\\//.+", "");
            String mlc = slc.replaceAll("/\\*(?s).*?\\*/", "");

            fw.write(mlc);
            fw.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
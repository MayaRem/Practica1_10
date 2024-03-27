/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individual3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**E
 *
 * @author Z-V
 */
public class FileReverse {

    public static boolean chekWorkDirectory(String path){
        File workDir = new File(path);
        if (workDir.exists()){
            return true;
        }else{
            return workDir.mkdir();
        }
    }
    
    private static String takeReverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void reverseStringToFile(String path){
        File file = new File(path);
        try{
           BufferedReader reader = new BufferedReader(new FileReader(file));
           BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Remizova\\text2.txt"));
           String str;
           while ((str=reader.readLine())!=null){
               writer.write(takeReverse(str)+"\n");
           }
           reader.close();
           writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
        
    
}

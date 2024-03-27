/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.individual3;
import java.util.Scanner;
/**
 *
 * @author Z-V
 */
public class Individual3 {

    public static void main(String[] args) {
        System.out.println("Ремизова Майя. Рибо-02-22. Вариант 2.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите путь текстового файла");
        String path =scan.nextLine();
        //файл находится на диске С, в папке Remizova и называется text1
        boolean isExisWorkDir = FileReverse.chekWorkDirectory(path);
    
        if (isExisWorkDir){ 
            FileReverse.reverseStringToFile(path);
        }
    
    }
    
}

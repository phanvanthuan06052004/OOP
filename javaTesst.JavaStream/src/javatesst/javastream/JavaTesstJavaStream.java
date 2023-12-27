/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatesst.javastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ACER
 */
public class JavaTesstJavaStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grape", "kiwi");
        List<String> result = words.stream()
                .filter(word -> word.length() > 2)
                .collect(Collectors.toList());
        System.out.println(result);
// Kết quả: ["banana"]

    }

}

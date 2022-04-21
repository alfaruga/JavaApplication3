/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author alfar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try ( Scanner scanner = new Scanner(Paths.get("elements_info.txt"))) {
            while (scanner.hasNextLine()) {

                String row = scanner.nextLine();
                if (row.replaceAll("[^\\x00-\\x7F]", "").isEmpty()) {
                    continue;
                }
                String[] pieces = row.split("=");


                
                for (int i = 0; i < pieces.length; i++) {

                    if (pieces[i].contains("id")) {
                        
                        System.out.println("id: " + StringUtils.substringBetween(pieces[i+1], "\""));
                    }
                    if (pieces[i].contains("class")) {
                        System.out.println("class: " + StringUtils.substringBetween(pieces[i+1], "\""));
                    }
                    if (pieces[i].contains("title")) {
                        System.out.println("name: " + StringUtils.substringBetween(pieces[i+1], "\""));
                    }
                    if (pieces[i].contains("ec")) {
                        System.out.println("electron config: " + StringUtils.substringBetween(pieces[i+1], "\""));
                    }
                    if (pieces[i].contains("atomicnumber")) {
                        System.out.println("Number: " + StringUtils.substringBetween(pieces[i+1], "\""));
                    }
                    if (pieces[i].contains("ram")) {
                        System.out.println("atomic mass: " + StringUtils.substringBetween(pieces[i+1], "\""));
                    }
                    if (pieces[i].contains("symbolimagename")) {
                        System.out.println("Symbol: " + StringUtils.substringBetween(pieces[i+1], "\""));
                    }
                    if (pieces[i].contains("density")) {
                        System.out.println("density: " + StringUtils.substringBetween(pieces[i+1], "\""));
                    }
                    if (pieces[i].contains("mp")) {
                        System.out.println("melting point: " + StringUtils.substringBetween(pieces[i+1], "\""));
                    }
                    if (pieces[i].contains("bp")) {
                        System.out.println("boiling point: " + StringUtils.substringBetween(pieces[i+1], "\""));
                    }
                    if (pieces[i].contains("fie")) {
                        System.out.println("first ionization energy: " + StringUtils.substringBetween(pieces[i+1], "\""));
                    }
                }


                /*id (element#) ; class(group , period, type); title(name); 
                    ec(electron configuration ); atomicnumber (atomic #); 
                    ram(atmoic mass); symbolimagename(symbol); density(density);
                    mp (melting point); bp (boiling point);
                    fie(first ionization energy)
                    
                 */
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }

    }

}

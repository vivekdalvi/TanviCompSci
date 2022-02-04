package semester1;

/*
 * StudentTestScores.java
 * by W P Osborne
 * 12/11/19
 * Period 2
 */

import java.util.Scanner;
import java.io.*;
public class StudentTestScores {
    public static void main(String[] args)
            throws FileNotFoundException{
        File f = new File("c:\\text\\Scores.txt");
        if(!f.exists()){
            System.out.println("File not found.");
        } else {
            Scanner fileReader = new Scanner(f);
            int numberOfRecords = 0;
            double totalStudentScores = 0.0;
            while(fileReader.hasNextLine()){
                numberOfRecords++;
                String line = fileReader.nextLine();
                totalStudentScores += processRecord(line);
            }
            if(numberOfRecords > 0){
                System.out.println("Average score for category: " +
                        totalStudentScores / numberOfRecords);
            }
            fileReader.close();
        }
    }
    
    public static double processRecord(String line){
        Scanner lineReader = new Scanner(line);
        String familyName = lineReader.next();
        String firstName = lineReader.next();
        String studentID = lineReader.next();
        int numberOfTests = 0;
        double totalTestScores = 0.0;
        while(lineReader.hasNext()){
            numberOfTests++;
            totalTestScores += lineReader.nextDouble();
        }
        System.out.println("Student " + firstName + " "  +
                familyName + " ID " + studentID + 
                " has " + numberOfTests + " test scores.");
        if(numberOfTests > 0){
            String str = String.format("Average score is: %.2f",
                    totalTestScores / numberOfTests);
            System.out.println(str);
        }
        lineReader.close();
        System.out.println();
        return totalTestScores / numberOfTests;
    }
   
}

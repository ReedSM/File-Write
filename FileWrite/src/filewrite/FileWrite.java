/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewrite;

import java.util.Scanner;
import java.io.*;           
public class FileWrite {

    
    public static void main(String[] args) throws IOException {     //objects of the IO class cn throw exception
        String filename;                                            //write data to file
        String friendName;
        int numFriends;
        
        Scanner kb = new Scanner(System.in);
        System.out.print("How many friends do you have? ");
        numFriends = kb.nextInt();
        
        kb.nextLine();
        System.out.print("Enter file name: ");
        filename = kb.nextLine();
        
        PrintWriter outputFile = new PrintWriter(filename); //filename references the file. can write data to the file
        
        for(int i = 1; i <= numFriends; i++ ){
            System.out.print("Enter the name of friend " + i + ": ");
            friendName = kb.nextLine();     //when name is entered it is written to the file
            outputFile.println(friendName);
        }
            outputFile.close();
            System.out.println("Data written to the file.");
    }
    
}

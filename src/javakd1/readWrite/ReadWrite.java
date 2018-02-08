/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javakd1.readWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javakd1.model.Candidate;

/**
 *
 * @author Richs
 */
public class ReadWrite {
     private static final String FILENAME = "file.txt";
    
    public static void saveCandidates(ArrayList<Candidate> cand, String user) throws IOException{
                BufferedWriter bw = null;
		FileWriter fw = null;

                fw = new FileWriter(FILENAME);  
                bw = new BufferedWriter(fw);
                bw.write(cand + " " + user);//content to write to file
                System.out.println("Done");
                if (bw != null) //if variable not found close
                    bw.close();
                if (fw != null) //if file not found close
                    fw.close();
    }
    public static ArrayList<Candidate> readCandidates(String filename){
        File file = new File(filename);
	FileInputStream fin = null;

	try {
            fin = new FileInputStream(file);

            System.out.println("Total file size to read (in bytes) : " + fin.available());

            int content;
            while ((content = fin.read()) != -1) {
				// convert to char and display it
            System.out.print((char) content);
            }

	} catch (IOException e) {
            e.printStackTrace();
	}
        return null;
    }
    public static void writeLog(String msg){
    
        Logger logger = Logger.getLogger("MyLog");  
        FileHandler fh;  

        try {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:/Users/Richs/Desktop/MyLogFile.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");    
            fh.setFormatter(formatter); 
            logger.info(msg);
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    } 
}

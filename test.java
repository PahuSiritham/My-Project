import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class test {

	  public static void main(String[] args) throws IOException, InterruptedException {
		  
		  
			  Scanner inFile = new Scanner(new File("C:\\Project_Callcost\\promotion1.log"));

			
			    while (inFile.hasNext()) {

			    	
			      String take = inFile.next();
	
		 String[] parts = take.split("\\|");
		 
	      String array = parts[3];
		
		  System.out.println(parts[3]);
			     
			         
			     String[] startTime = parts[1].split("\n");
				 String[] endTime = parts[2].split("\n");
				 SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
				 Date date1=format.parse(startTime);
				 Date date2=format.parse(endTime);
				 long difference =date2.getTime()-date1.getTime();
				 long callTiming = ((difference/1000)/60);
				 
				 if(callTiming  == 1)
				 {
				  System.out.println( "call cost = 3 bath");
				 }
				  else
				  {
				  long callTime = callTiming - 1;
				  long callCost = callTime * 1 +3;
				  System.out.println("Callcost ="+callCost);
				 }
			   
			   
			    }
		


	}
}




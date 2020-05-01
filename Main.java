package Vitya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String nextLine = null;
	Scanner scan = null;
	
	List<Example> list=new ArrayList<>();
	
	try {
	    scan = new Scanner(new File("c:\\Users\\Danik\\git\\Sobes\\Prob\\src\\Vitya\\Example.txt"));
		//scan.useDelimiter(";");

	    //System.out.println(scan.delimiter());
	    while (scan.hasNext()) {
		nextLine = scan.nextLine();
		String[] s=nextLine.split(";");
		
		   if(s[0].equals("Exam")) {
		       list.add(new Exam(s[1],s[2],s[3],Integer.parseInt(s[4]),Integer.parseInt(s[5]),Integer.parseInt(s[6])));
		   }else if(s[0].equals("ExamTest")){
		       list.add(new ExamTest(s[1],s[2],s[3],Double.parseDouble(s[4]),Boolean.parseBoolean(s[5]),Double.parseDouble(s[6])));
		   }else if(s[0].equals("Test")){
		       list.add(new Test(s[1],s[2],s[3],Boolean.parseBoolean(s[4]),Boolean.parseBoolean(s[5])));
		   }
		
	    }
	   
	     
	} catch (FileNotFoundException e) {

	    // e.printStackTrace();
	} finally {
	    scan.close();
	}

	for(Example e:list) {
	    e.getOK();
	}
	
		  list.sort((a,b)->a.isPassed().compareTo(b.isPassed()));	
		  Collections.reverse(list);
		  System.out.println(list);

    }

}

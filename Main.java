package Vitya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
		
	Scanner scan = null;
	
	//обьявляем список участников
	List<Examination> listOfParticipant=new ArrayList<>();
	
	
	if(args.length!=0) {
	
	try {
	    
	 	//загружаем файл для чтения 	   
	    scan = new Scanner(new File(args[0]));
	    	    
		//читаем файл в цикле по строчно и инициализируем список участников	    	    
	    while (scan.hasNext()) {
		 String nextLine = scan.nextLine();
						 
		String[] s=nextLine.split(";");
		
		   if(s[0].equals("Exams")) {
		       listOfParticipant.add(new Exams(s[1],s[2],s[3],Integer.parseInt(s[4]),Integer.parseInt(s[5]),Integer.parseInt(s[6])));
		   }else if(s[0].equals("ExamTest")){
		       listOfParticipant.add(new ExamTest(s[1],s[2],s[3],Double.parseDouble(s[4]),Boolean.parseBoolean(s[5]),Double.parseDouble(s[6])));
		   }else if(s[0].equals("Tests")){
		       listOfParticipant.add(new Tests(s[1],s[2],s[3],Boolean.parseBoolean(s[4]),Boolean.parseBoolean(s[5])));
		   }
		
	    }
	    
	} catch (FileNotFoundException e) {
         System.out.println(e);
	    
	} finally {
	    if(scan!=null) scan.close();
	    else return;
	}
	
	//подчситываем результат контрольных мероприятий
	for(Examination exam:listOfParticipant) {
	    exam.calculateTheResult();
	}
	
	//сортируем список по результам
	listOfParticipant.sort((a,b)->a.isPassed().compareTo(b.isPassed()));	
		  Collections.reverse(listOfParticipant);
		  System.out.println(listOfParticipant);
	
	}else {
	    System.out.println("Укажите файл для чтения.");
	}
	
	
		  
    }

}

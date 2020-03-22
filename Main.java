package Vitya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String s = null;
	Scanner scan = null;
	try {
	    scan = new Scanner(new File("d:\\Coding\\Java\\epam tasks\\Example.txt")).useDelimiter(";");

	    System.out.println(scan.delimiter());
	    while (scan.hasNext()) {
		System.out.println(s = scan.next());

	    }

	} catch (FileNotFoundException e) {

	    // e.printStackTrace();
	} finally {
	    scan.close();
	}

//		List<Example> list=new ArrayList<>();
//		list.add(new Exam("Vasya","Biolog","Chemical",6,5));
//		list.add(new Exam("Masha","Biolog","Chemical",8,8));
//		list.add(new ExamTest("Petya","Phisic","Geo",3.2,false));
//		list.add(new ExamTest("Katya","Phisic","Geo",6.7,true));
//		list.add(new Test("Tanya","Lang","Mat",true,true));
//		list.add(new Test("Sasha","Lang","Mat",true,false));
//		
//		System.out.println(list);
//		 ((Exam)list.get(0)).getOK(11);
//		 ((ExamTest) list.get(2)).getOK(11);
//		 ((Test)list.get(4)).getOK();
//		 
//		  list.sort((a,b)->a.isPassed().compareTo(b.isPassed()));	
//		  Collections.reverse(list);
//		  System.out.println(list);

    }

}

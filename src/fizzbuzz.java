
import java.util.ArrayList;
import java.io.*;


public class fizzbuzz {
	private int start=1;
	private int end=100;
	private String outstr=" ";
	private int act_num=1;
	private ArrayList<String> result = new ArrayList<String>(end-start);
	
	/**Constructor */
	public fizzbuzz(){
	}
	
/**Setting start and end numbers*/
	public void setStart(int newStart){
		start=newStart;
	}
	
	public void setEnd (int newEnd){
		end=newEnd;
	}
	
	/**Defines the outstring (outstr) - (if the actual number can be divided by 3 outstr 
	  equals to "fizz" if it can be divided by 5 its value is "buzz" if it can be divided
	  by both of these numbers it equals to "fizzbuzz". In other cases its value is the 
	  number in string type). These values are added to the result list.*/
	
	private void procNum(){
		if (act_num%15==0){
			//System.out.println(fizz+buzz);
			outstr="fizzbuzz";
		}
		else if (act_num%3==0){
			//System.out.println(fizz);
			outstr="fizz";

		}
		else if (act_num%5==0){
			//System.out.println(buzz);
			outstr="buzz";
		}
		else{ //System.out.println(act_num);
		//String act_str=Integer.toString(act_num);
		outstr=Integer.toString(act_num);}
		result.add(outstr);
	}
	
	/**Looping over the interval between start and end numbers and calls another method (procNum) */
	public void loopOver(){
		for (int i=start; i<=end; i++){
			act_num=i;
			procNum();
		}
	}

	/** This method writes out the elements of result list to the standard output.*/
public void PrintToStdOut(){
	for (String val:result){
		System.out.println(val);
	}
	
}
/** Writes out the results to an html file*/
public void PrintToHTML(){
	try {
	    BufferedWriter out = new BufferedWriter(new FileWriter("test.html"));
	    out.write("<!DOCTYPE html>\n<html>\n<head>\n<title>FizzBuzz</title>");
	    for (String val:result){
	    	out.write("<p>"+val+" </p>");
	    }
	    out.write("</body>\n</html>");
	                                             
	    out.close();
	}
	catch (IOException e)
	{
	    System.out.println("Exception ");

	}
	
	
}
}

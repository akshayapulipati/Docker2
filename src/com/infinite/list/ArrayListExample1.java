package com.infinite.list;
import java.util.*;
public class ArrayListExample1 {
	public static void main(String args[]){ 
		String[] fruits=new String[3];
		fruits[0]="mango";
		fruits[1]="apple";
		fruits[2]="banana";
		System.out.println(fruits);
		
		  ArrayList<String> list=new ArrayList<String>();   
		      list.add("Mango");   
		      list.add("Apple");    
		      list.add("Banana");    
		      list.add("Grapes");
		      list.add("Grapes");//duplicates are allowed here
		      list.add(null);//null insertion
		      System.out.println(list);  
		 }  

}



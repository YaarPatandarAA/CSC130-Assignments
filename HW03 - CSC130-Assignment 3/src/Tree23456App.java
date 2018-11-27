// File: Tree23456App.java
// Name: Amarjit Singh
// Date: 5/14/2016
// Course: CSC 130
// Desc: Tree234 Program Main File

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tree23456App
   {
   public static void main(String[] args) throws IOException
      {
      long value;
      Tree23456 theTree = new Tree23456();
/*
      theTree.insert(10);
      theTree.insert(40);
      theTree.insert(60);
      theTree.insert(30);
      theTree.insert(70);*/
      
      for(int i = 1; i < 999; i++){
    	  theTree.insert(i);
      }

      while(true)
         {
         System.out.print("Enter first letter of ");
         System.out.print("show, insert, find, minimum, or quit: ");
         char choice = getChar();
         switch(choice)
            {
            case 'q':
            	System.exit(0);
            	break;
            case 's':
            	theTree.displayTree();
            	break;
            case 'm':
            	System.out.println("Minimum value is " + theTree.minValue());
            	break;
            case 'i':
            	System.out.print("Enter value to insert: ");
            	value = getInt();
            	theTree.insert(value);
            	break;
            case 'f':
            	System.out.print("Enter value to find: ");
            	value = getInt();
            	int found = theTree.find(value);
            	if(found != -1)
            		System.out.println("Found "+value);
            	else
            		System.out.println("Could not find "+value);
            	break;
            default:
            	System.out.print("Invalid entry\n");
            }  // end switch
         }  // end while
      }  // end main()
//--------------------------------------------------------------
   public static String getString() throws IOException
      {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
      }
//--------------------------------------------------------------
   public static char getChar() throws IOException
      {
      String s = getString();
      return s.charAt(0);
      }

//-------------------------------------------------------------
   public static int getInt() throws IOException
      {
      String s = getString();
      return Integer.parseInt(s);
      }
//-------------------------------------------------------------
   }  // end class Tree234App
////////////////////////////////////////////////////////////////
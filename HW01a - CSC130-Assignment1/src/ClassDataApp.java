// classDataArray.java
// data items as class objects
// to run this program: C>java ClassDataApp
////////////////////////////////////////////////////////////////
class ClassDataApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;             // array size
      ClassDataArray arr;            // reference to array
      arr = new ClassDataArray(maxSize);  // create the array
                                     // insert 10 items
      arr.insert("Evans", "Patty", 24);
      arr.insert("Smith", "Lorraine", 37);
      arr.insert("Yee", "Tom", 43);
      arr.insert("Adams", "Henry", 63);
      arr.insert("Hashimoto", "Sato", 21);
      arr.insert("Stimson", "Henry", 29);
      arr.insert("Velasquez", "Jose", 72);
      arr.insert("Lamarque", "Henry", 54);
      arr.insert("Vang", "Minh", 22);
      arr.insert("Creswell", "Lucinda", 18); 
      
      arr.sort();				//sort by last name
      arr.displayA();                // display items
//////////////////////////////////////////////////////////////////////////
      
////////////////////////////////Searches for a string////////////////////
      /*String searchKey = "Stimson";  // search for item
      Person found;
      found=arr.find(searchKey);
      if(found != null)
         {
         System.out.print("Found ");
         found.displayPerson();
         }
      else
         System.out.println("Can't find " + searchKey);*/
      
/////////////////////////////////////////////////////////////////////////
      
///////////////////////////////deletes items/////////////////////////////
      /*System.out.println("Deleting Smith, Yee, and Creswell");
      arr.delete("Smith");           // delete 3 items
      arr.delete("Yee");
      arr.delete("Creswell");*/
      
/////////////////////////////////////////////////////////////////////////

      //arr.displayA();                // display items again
      }  // end main()
   }  // end class ClassDataApp



/*

for(int j = 0; j < names.length; j++){	
	for (int i = j + 1 ; i < names.length; i++){
		if(names[i][0].compareTo(names[j][0])<0){
			
         String[] temp = names[j];
         names[j]= names[i]; 
         names[i]=temp;
		}
	}
}

*/
// File: DataItem.java
// Name: Amarjit Singh
// Date: 5/14/2016
// Course: CSC 130
// Desc: Data Item Class File

////////////////////////////////////////////////////////////////
class DataItem
   {
   public long dData;          // one data item
//--------------------------------------------------------------
   public DataItem(long dd)    // constructor
      { dData = dd; }
//--------------------------------------------------------------
   public void displayItem()   // display item, format "/27"
      { System.out.print("/"+dData); }
//--------------------------------------------------------------
   }  // end class DataItem
////////////////////////////////////////////////////////////////
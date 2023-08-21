import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDateTime;
import java.util.*;


public class Main{


    static void myFunc(){
        System.out.println("Sample Function Excecuted");
    }
    //Syntax
    public static void main(String[] args) {
        System.out.println("Hello Java");

        int a = 3;
        double b = 3.4;
        String name = "Hello";
        //Loops

        for(int i = 0 ; i<10;i++){
            System.out.print(i + " ");
        }
        System.out.println("");
      while(a > 0){
        System.out.print(a + " ");

        a--;
      }

      //Sample Function Called
      myFunc();
    //Arrays
    int[] myArr = {1,2,3,4};
    // System.out.println( myArr);

    // Java Math

    int n = Math.min(3,4);

      System.out.println( n);

      //JAva I/O

      Scanner myScanner = new Scanner(System.in);
      int userInput = myScanner.nextInt();
      System.out.println(userInput);

      //If-else
      if(userInput > 5){System.out.println("Number greater than 5");}else{
        System.out.println("Number lesser than 5");
      }

      //Java Date and Time 
      LocalDateTime myObj = LocalDateTime.now();
      System.out.println(myObj);

      //Arraylist

      ArrayList<Integer> arr = new ArrayList<Integer>();
      arr.add(5);
      arr.add(6);
     System.out.println( arr.get(0));
      arr.set(1, 8);
      arr.remove(0);

      //HashMap(Not Working)

      HashSet<Integer> set = new HashSet<Integer>();
      set.add(3);
      if(set.contains(3)){System.out.println("Set has 3");}

      //Wrapper Class
      //Use Primitives as Objects and Providing extra functions which can be used in the class

      Integer m = 4;
      String myStr = m.toString();
      System.out.println(myStr);

      //Exception Handling
       try{
        int [] newArr = {1,2,3};
        System.out.println(newArr[10]);
    }catch(Exception e){
        System.out.println("Something went wrong");
    }finally{
        System.out.println("Try catch finished");
    }

    //Lambda Function
    arr.add(10);
    arr.add(11);
    arr.add(12);
    arr.add(13);
    arr.add(14);
    arr.add(15);
    arr.forEach( (k)->{System.out.println(k);} ); //Lambda expression is like JS Arrow Functions

    //File Handling
   
    try{
     File myFile = new File("filename.txt");
    if(myFile.createNewFile()){
        System.out.println("File Created");
    }else{
        System.out.println("File Already Exists");
    }
    }catch(IOException e){
       System.out.println("Error Occoured");
        e.printStackTrace();
    }
    //Writing to a file
    try{
    FileWriter myFileWriter = new FileWriter("filename.txt");
    myFileWriter.write("File written from Java");
    myFileWriter.close();
    System.out.println("Wrote to the file successfully");

    }catch(IOException e){
        System.out.println("Error Occured");
        e.printStackTrace();
    }

    }


   
}
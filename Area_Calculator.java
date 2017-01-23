// Janelynn Camingue
// 1/23/17
// This program lets the user choose to calculate the area of various shapes, like a square, rectangle, triangle,
// and trapezoid.

import java.util.Scanner;

class Area_Calculator{
   
   public static void main(String[] args){
      int user_input, area, base, height, base1, base2, base_total;
	 
      Scanner sc = new Scanner(System.in);
      // "Welcome" message
	  System.out.println(" ");
      System.out.println("Welcome to the area calculator!");
	  
	  // prints out the instructions
      System.out.println("Type 1 to calculate for SQUARE");
	  System.out.println("Type 2 to calculate for RECTANGLE");
	  System.out.println("Type 3 to calculate for TRIANGLE");
	  System.out.println("Type 4 to calculate for TRAPEZOID");
	  System.out.println("Then press ENTER");
	
      // Reads what the user input
      user_input = sc.nextInt();
	  
	  
	  // if the user wants to calculate the area for a SQUARE
      if (user_input==1) {
          System.out.println("The base is: ");
		  base=sc.nextInt();
		  System.out.println("The height is: ");
		  height=sc.nextInt();
		  area=base*height;
		  System.out.println("The area of the square is "+area+".");
		  
	   // area of a rectangle
      }else if (user_input==2) {
          System.out.println("The base is: ");
		  base=sc.nextInt();
		  System.out.println("The height is: ");
		  height=sc.nextInt();
		  area=base*height;
		  System.out.println("The area of the rectangle is "+area+".");
	   // area of a triangle
	  }else if(user_input==3){
          System.out.println("The base is: ");
		  base=sc.nextInt();
		  System.out.println("The height is: ");
		  height=sc.nextInt();
		  area=(base*height)/2;
		  System.out.println("The area of the triangle is "+area+".");
        // area of a rhombus	 
      }else if( user_input==4){
		  System.out.println("The first base is: ");
		  base1=sc.nextInt();
		  System.out.println("The second base is: ");
		  base2=sc.nextInt();
		  System.out.println("The height is: ");
		  height=sc.nextInt();
		  base_total=base1+base2;
		  area=(base_total*height)/2;
		  System.out.println("The area of the trapezoid is "+area+".");
	  }

}
}


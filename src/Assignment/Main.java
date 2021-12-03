package Assignment;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

      Interface obj=(leftborder, rightborder) ->{
          long result=leftborder;
          for (long i=leftborder+1;i<=rightborder;i++)
          {
              result=result*i;
          }
          return result;
      };








      Scanner sc=new Scanner(System.in);

      System.out.println("Enter left Border value  :");
      long leftborder=sc.nextLong();
      System.out.println("Enter right Border value  :");
      long rightborder=sc.nextLong();

      System.out.println(obj.calculate(leftborder,rightborder));

    }







}

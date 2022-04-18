import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main( String [] args) { 
        Scanner input = new Scanner(System.in);
      CartTotal addcart = new CartTotal();
        ShoppingList myList = new ShoppingList();
        int userOpt = 0;
        while (userOpt != 4) {
            System.out.println("");
            System.out.println("----- Welcome to My Shopping List------");
            System.out.println("(1) Please add an item to the list. ");
            System.out.println("(2) Display list and total number of items. ");
            System.out.println("(3) Add Cart total. ");
          System.out.println("(4) Exit ");
          try{
            userOpt = input.nextInt();  

            switch (userOpt) {
              case 1: {
            myList.addItem();

            }

              case 2: {
            myList.displayItem();
            }
              case 3:{
        addcart.input();
       addcart.multiply();
      addcart.result();
                
              }
            }
          }catch(Exception e){
            
              System.out.println("Input not recognized. Please select an option.");
              break;
          }
        }
    }
      }

             //case 3:{

        //st.input();
       //st.add();
      // st.result();
    
              
            
          //}catch(Exception e){
            
             // System.out.println("Input not recognized. Please select an option.");
           // break;
              
        //  }
      //  }
      
          






// * 4 Pillars of OOP
// * Must create and use at least 3 Constructors
// * Must have at least 4 methods
// * Must include a section to get responses from User
// * Must contain a switch statement
// * Must handle at least 1 exception
// * Project must include at least 3 Classes
// * Use one of the Collections structures.
// * Use a loop to traverse through your Collection structure that you chose and modify,// * organize, or return values from the iteration. 
// * ex. Sort my structure, Search, find and return object

//inheritance, **abstraction, **constructor
//create new instance of main class 
//add additional function that will create summation of add list total
//
class CartTotal extends ListAddition {

  

  void input() {
     System.out.println("Enter item quantity ");
    a = enternum.nextDouble();
    
  
       System.out.println("Enter item price ");
        
       b = enternum.nextDouble();
    }


   void multiply() {
       s = a * b;
    }

    void result() {
        System.out.println("Your cart total is: " + "$ "+ s);
       System.out.println("");
    }
}

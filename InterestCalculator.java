InterestCalculator.java
Import java.util.Scanner;
Public class InterstCalculator {
   Public static void main(String[] args) {
        Double price;
        //Scanner object is used to get the inputs entered by the user
        Scanner sc = new Scanner(System.in);
        System.out.print(“Enter Price of the sales Item:$”)
        Price = sc.nextDouble();

        double newPrice = calTax(price);
        System.out.printIn(“The New Price after applying tax@7% is: $” + newPrice);
 }
  Private static double calTax(double price) {
         Double newPrice = price + (price*0.07);
          return newPrice;
  }
}

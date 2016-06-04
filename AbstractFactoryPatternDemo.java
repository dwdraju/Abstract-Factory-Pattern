import java.io.*;
class AbstractFactoryPatternDemo
  {

    public static void main(String args[])throws IOException
    {

      //Take input: Bank name, type of loan, interest rate and time.
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

      System.out.print("Name of Bank: nabil, prabhu?: ");
      String bankName=br.readLine();


      System.out.print("\n");

      System.out.print("What type of loan: home or bussiness?: ");
      String loanName=br.readLine();

      //Get Bank Factory
      AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");


      Bank b=bankFactory.getBank(bankName);

      System.out.print("\n");      
      System.out.print("Interest rate for "+b.getBankName()+ ": ");

      double rate=Double.parseDouble(br.readLine());


      System.out.print("\n");
      System.out.print("Loan amount: ");

      double loanAmount=Double.parseDouble(br.readLine());



      System.out.print("\n");
      System.out.print("Number of years: ");

      int years=Integer.parseInt(br.readLine());


      System.out.print("\n");
      System.out.println("The loan from "+ b.getBankName());


      AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");

      Loan l=loanFactory.getLoan(loanName);

      l.getInterestRate(rate);
      l.calculateLoanPayment(loanAmount,years);

    }
  }
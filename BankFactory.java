class BankFactory extends AbstractFactory
{
   //@override
    public Bank getBank(String bank){
      if(bank == null){
       return null;
     }

     if(bank.equalsIgnoreCase("NABIL")){
       return new NABIL();
     } else if(bank.equalsIgnoreCase("PRABHU")){
       return new PRABHU();
     }
     return null;
   }

  //@Override

   public Loan getLoan(String loan) {
    return null;
  }

}
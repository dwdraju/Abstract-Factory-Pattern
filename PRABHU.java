//PRABHU concrete class implementing Bank interface
class PRABHU implements Bank
{

  private final String BNAME;

  public PRABHU()
  {
    BNAME="PRABHU BANK";
  }

    //  @override
  public String getBankName()
  {
    return BNAME;

  }

}
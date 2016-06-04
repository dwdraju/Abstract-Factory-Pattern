//NABIL concrete class implementing Bank interface
class NABIL implements Bank
{

  private final String BNAME;

  public NABIL()
  {
    BNAME="NABIL BANK";
  }

    //  @override
  public String getBankName()
  {
    return BNAME;

  }

}
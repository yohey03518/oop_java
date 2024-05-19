package Inheritance.BusinessSample;

public class LinePay implements Payment {
  public String GetPaymentUrl(Company myCompany) {
    return "https://line.com/" + myCompany.GetCompanyId();
  }
  public boolean IsAvailable() {
    return true;
  }
}

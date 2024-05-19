import Inheritance.BusinessSample.Payment;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class Visa implements Payment {
  public String GetPaymentUrl(Company myCompany) {
    return "https://visa.com/" + myCompany.GetCompanyId();
  }

  public boolean IsAvailable() {
    URL url = (new URI("https://visa.com/ping")).toURL();
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");

    int responseCode = connection.getResponseCode();
    return responseCode == 200;
  }
}

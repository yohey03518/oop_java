package Encapsulation.BusinessSample;

public class SmsOtp extends BaseOtp {
  protected int GetMaxSendTimes() {
    return 3;
  }

  protected int GetMaxTryTimes() {
    return 3;
  }
}

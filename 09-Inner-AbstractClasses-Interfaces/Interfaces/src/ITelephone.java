public interface ITelephone {
  void powerOn();

  void dial(int phoneNumber);

  void answer();

  public boolean callPhone(int phoneNumber);

  public boolean isRinging();

}

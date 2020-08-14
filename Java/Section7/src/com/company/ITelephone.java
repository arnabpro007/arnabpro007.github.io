public interface ITelephone {
    public void PowerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();

}

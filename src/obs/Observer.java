package obs;

public interface Observer {
    public void areaClear(boolean areaClear);
    public void getMsg(String msg);
    public void setPosition(int position);
    public void getPrivateMsg(String defence, String msg);
}

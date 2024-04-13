// explaning private        
public class lec102{
    public static void main(String args[]){
        bankAccount myAcc = new bankAccount();
        myAcc.userName = "Achintya Gupta";
        myAcc.password = "abcdefghi";
    }
}

class bankAccount{
    public String userName;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
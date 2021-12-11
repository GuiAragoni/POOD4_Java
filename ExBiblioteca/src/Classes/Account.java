package Classes;

public class Account {
    private String emailAddress;
    private int ID;
    private String passowrd;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }
    
    
    public boolean validateLogin(int userID, String password){
        if(userID==this.ID && password==this.passowrd){
            return true;
        }else{
            return false;
        }
    }

}

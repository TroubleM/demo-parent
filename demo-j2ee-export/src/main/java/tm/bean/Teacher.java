package tm.bean;

public class Teacher extends Student{

    private String idCard;

    public String getIdCard() {
        super.testProtected();
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}

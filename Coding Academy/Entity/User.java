package Entity;
public class User {
    private String idUser;
    private int bank;
    private int eMoney;
    private String bayar;

    public User setIdUser(String idUser){
        this.idUser = idUser;
        return this;
    }
    public String getIdUser(){
        return this.idUser;
    }

    public int getBank() {
    return bank;
    }
    public User setBank(int uang) {
    this.bank = uang;
    return this;
    }


    public int getEmoney(){
        return eMoney;
    }
    public User setEmoney(int eMoney) {
        this.eMoney = eMoney;
        return this;
    }


    public String bayar(){
        return bayar;
    }
    public void setbayar(String bayar){
        this.bayar = bayar;
    }



}

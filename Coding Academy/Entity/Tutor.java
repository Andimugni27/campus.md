package Entity;
public class Tutor extends User{
    private String idTutor;
    private String name;

    public Tutor setIdTutor(String idTutor){
        this.idTutor = idTutor;
        return this;
    }
    public String getIdTutor(){
        return this.idTutor;
    }
    
    public User setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }
}

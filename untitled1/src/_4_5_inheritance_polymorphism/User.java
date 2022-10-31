package _4_5_inheritance_polymorphism;

public class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;
    static int count = 1;
    public User(){}

    public User(String login, String password, String name, String surname){
        this.id = count;
        count++;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(String surname){
        return surname;
    }
    public void setSurname(){
        this.surname = surname;
    }
    @Override
    public String toString(){
        return id + " " + login + " " + password + " " + name + " " + surname;
    }

    public void getData(){
        System.out.println(toString());
    }
}
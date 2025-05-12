package Product;

public class User {
    private String name ;
    private Long mobileNum;
    public User(String name, Long mobileNum){
        this.name = name ;
        this.mobileNum = mobileNum;
    }

    public void setName(String name){
        this.name = name ;
    }
    public void setMobileNum(Long mobileNum){
        this.mobileNum = mobileNum;
    }
    public String getName(){
        return this.name;
    }
    public long getMobileNum(){
        return this.mobileNum;
    }
}

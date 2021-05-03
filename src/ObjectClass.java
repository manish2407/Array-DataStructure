public class ObjectClass {
    private String FirstName;
    private String LastName;
    private int age;
    public ObjectClass(String Fname,String Lname, int Age){
        FirstName = Fname;
        LastName = Lname;
        age = Age;
    }
    public void display(){
        System.out.println("Firstname is "+FirstName+" and lastname is "+LastName+" and age is"+age);
    }
    public String getLastName(){
        return  LastName;
    }
}

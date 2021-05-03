public class ObjectClassApp {
    public static void main(String[] args) {
        int max = 5;
        ObjectClassArray a = new ObjectClassArray(max);
        a.insert("Manish","Sharma", 20);
        a.insert("Prankit","agarwal", 21);
        a.insert("Rahul","Saxena", 22);
        a.insert("Aman","Garg", 23);
        a.insert("Rajnish","Tiwari", 24);
        a.display();
    }
}

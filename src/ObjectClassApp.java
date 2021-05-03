public class ObjectClassApp {
    public static void main(String[] args) {
        int max = 10;
        ObjectClassArray a = new ObjectClassArray(max);
        a.insert("Manish","Sharma", 20);
        a.insert("Prankit","agarwal", 21);
        a.insert("Rahul","Saxena", 22);
        a.insert("Aman","Garg", 23);
        a.insert("gagan","kaushik", 24);
        a.insert("honey","rawat", 25);
        a.insert("Akash","Chaudhary", 26);
        a.insert("Anamika","Singh", 27);
        a.insert("Gauri","Sharma", 28);
        a.insert("Monty","Chaudhary", 29);
        a.display();
        a.search("Garg");
        a.display();

    }
}

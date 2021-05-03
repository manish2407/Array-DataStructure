public class ObjectClassArray {
    private ObjectClass[] arr;                  //reference to array
    private int Nelements;
    public ObjectClassArray(int size){
        arr = new ObjectClass[size];
        Nelements =0;
    }
    public void insert(String First, String Last, int age1){
        arr[Nelements] = new ObjectClass(First, Last,age1);
        Nelements++;
    }
    public  void search(String searchname){
        int j;
        for (j = 0; j < Nelements ; j++) {
            arr[j].getLastName().equals("Tiwari");
            System.out.println("Object found at "+j+" position");
        }
        if(j==Nelements){
            System.out.println("Object is not present in array");
        }

    }
    public void display(){
        for (int i = 0; i < Nelements ; i++) {
            arr[i].display();
        }
    }
}

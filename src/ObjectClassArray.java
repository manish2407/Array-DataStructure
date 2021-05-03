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
    public void display(){
        for (int i = 0; i < Nelements ; i++) {
            arr[i].display();

        }
    }
}
